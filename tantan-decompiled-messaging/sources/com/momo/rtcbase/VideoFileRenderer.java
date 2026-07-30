package com.momo.rtcbase;

import android.os.Handler;
import android.os.HandlerThread;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.rtcbase.VideoFileRenderer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.codec.CharEncoding;
import p149l.ig3;
import p149l.pkq0;

/* JADX INFO: loaded from: classes8.dex */
public class VideoFileRenderer implements VideoSink {
    private static final String TAG = "VideoFileRenderer";
    private EglBase eglBase;
    private final HandlerThread fileThread;
    private final Handler fileThreadHandler;
    private int frameCount;
    private final int outputFileHeight;
    private final String outputFileName;
    private final int outputFileWidth;
    private final ByteBuffer outputFrameBuffer;
    private final int outputFrameSize;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final FileOutputStream videoOutFile;
    private YuvConverter yuvConverter;

    public VideoFileRenderer(String str, int i, int i2, final EglBase.Context context) throws IOException {
        if (i % 2 == 1 || i2 % 2 == 1) {
            ig3.m135964a("Does not support uneven width or height");
            throw null;
        }
        this.outputFileName = str;
        this.outputFileWidth = i;
        this.outputFileHeight = i2;
        int i3 = ((i * i2) * 3) / 2;
        this.outputFrameSize = i3;
        this.outputFrameBuffer = ByteBuffer.allocateDirect(i3);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        this.videoOutFile = fileOutputStream;
        fileOutputStream.write(("YUV4MPEG2 C420 W" + i + " H" + i2 + " Ip F30:1 A1:1\n").getBytes(Charset.forName(CharEncoding.US_ASCII)));
        HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.renderThreadHandler = handler;
        HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererFileThread");
        this.fileThread = handlerThread2;
        handlerThread2.start();
        this.fileThreadHandler = new Handler(handlerThread2.getLooper());
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.momo.rtcbase.VideoFileRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                VideoFileRenderer.this.eglBase = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
                VideoFileRenderer.this.eglBase.createDummyPbufferSurface();
                VideoFileRenderer.this.eglBase.makeCurrent();
                VideoFileRenderer.this.yuvConverter = new YuvConverter();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20218a(VideoFileRenderer videoFileRenderer) {
        videoFileRenderer.getClass();
        try {
            videoFileRenderer.videoOutFile.close();
            Logging.m20197d(TAG, "Video written to disk as " + videoFileRenderer.outputFileName + ". The number of frames is " + videoFileRenderer.frameCount + " and the dimensions of the frames are " + videoFileRenderer.outputFileWidth + BaseSei.f13930X + videoFileRenderer.outputFileHeight + "");
            videoFileRenderer.fileThread.quit();
        } catch (IOException e) {
            pkq0.m170054a("Error closing output file", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20220c(VideoFileRenderer videoFileRenderer, VideoFrame.I420Buffer i420Buffer, VideoFrame videoFrame) {
        videoFileRenderer.getClass();
        YuvHelper.I420Rotate(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), videoFileRenderer.outputFrameBuffer, i420Buffer.getWidth(), i420Buffer.getHeight(), videoFrame.getRotation());
        i420Buffer.release();
        try {
            videoFileRenderer.videoOutFile.write("FRAME\n".getBytes(Charset.forName(CharEncoding.US_ASCII)));
            videoFileRenderer.videoOutFile.write(videoFileRenderer.outputFrameBuffer.array(), videoFileRenderer.outputFrameBuffer.arrayOffset(), videoFileRenderer.outputFrameSize);
            videoFileRenderer.frameCount++;
        } catch (IOException e) {
            pkq0.m170054a("Error writing video to disk", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20221d(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.yuvConverter.release();
        videoFileRenderer.eglBase.release();
        videoFileRenderer.renderThread.quit();
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread(final VideoFrame videoFrame) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int i = videoFrame.getRotation() % 180 == 0 ? this.outputFileWidth : this.outputFileHeight;
        int i2 = videoFrame.getRotation() % 180 == 0 ? this.outputFileHeight : this.outputFileWidth;
        float width = buffer.getWidth() / buffer.getHeight();
        float f = i / i2;
        int width2 = buffer.getWidth();
        int height = buffer.getHeight();
        if (f > width) {
            height = (int) (height * (width / f));
        } else {
            width2 = (int) (width2 * (f / width));
        }
        VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale((buffer.getWidth() - width2) / 2, (buffer.getHeight() - height) / 2, width2, height, i, i2);
        videoFrame.release();
        final VideoFrame.I420Buffer i420 = bufferCropAndScale.toI420();
        bufferCropAndScale.release();
        this.fileThreadHandler.post(new Runnable() { // from class: l.v4l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.m20220c(this.f179938a, i420, videoFrame);
            }
        });
    }

    @Override // com.momo.rtcbase.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        this.renderThreadHandler.post(new Runnable() { // from class: l.u4l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174607a.renderFrameOnRenderThread(videoFrame);
            }
        });
    }

    public void release() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.renderThreadHandler.post(new Runnable() { // from class: l.w4l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.m20221d(this.f184571a, countDownLatch);
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        this.fileThreadHandler.post(new Runnable() { // from class: l.x4l0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.m20218a(this.f191040a);
            }
        });
        try {
            this.fileThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logging.m20199e(TAG, "Interrupted while waiting for the write to disk to complete.", e);
        }
    }
}
