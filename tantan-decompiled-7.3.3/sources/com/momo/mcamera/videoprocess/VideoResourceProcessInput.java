package com.momo.mcamera.videoprocess;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.core.glcore.util.FileUtil;
import com.google.android.exoplayer2.PlaybackException;
import com.momo.mcamera.videoencoder.ProcessParam;
import com.momo.mcamera.videoencoder.ProcessSurface;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import p153l.gfj;
import p153l.qmq0;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(14)
public class VideoResourceProcessInput extends gfj implements SurfaceTexture.OnFrameAvailableListener {
    private static final String LOG_TAG = "VideoResourceProcessInput";
    private static final String UNIFORM_CAM_MATRIX = "u_Matrix";
    private MediaCodec.BufferInfo currentBufferInfo;
    private volatile boolean isProcess;
    private volatile int mFinishFrameIndex;
    private volatile int mFrameIndex;
    private int matrixHandle;
    private SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    VideoThread player;
    private VideoProcessListener processListener;
    private ProcessParam processParam;
    private ProcessSurface processSurface;
    Surface surface;
    private String videoPath;
    private SurfaceTexture videoTex;
    private GLSurfaceView view;
    qmq0 yuvFileEndpoint;
    private float[] matrix = new float[16];
    private volatile long mCurTimestamp = -100;
    private volatile boolean recordVideo = true;
    private int frameSize = 0;
    private long renderTime = 0;
    private int mFrameRate = -1;
    int addIndex = 0;
    private boolean startWhenReady = false;
    private boolean ready = false;

    public class VideoThread extends Thread {
        private MediaCodec decoder;
        private MediaExtractor extractor;

        public VideoThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @TargetApi(18)
        public void run() {
            boolean z;
            int iDequeueInputBuffer;
            if (VideoResourceProcessInput.this.processListener != null) {
                VideoResourceProcessInput.this.processListener.onStart();
            }
            this.extractor = new MediaExtractor();
            try {
                FileUtil.exist(VideoResourceProcessInput.this.videoPath);
                this.extractor.setDataSource(VideoResourceProcessInput.this.videoPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < this.extractor.getTrackCount(); i++) {
                MediaFormat trackFormat = this.extractor.getTrackFormat(i);
                String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                if (string.startsWith("video/")) {
                    this.extractor.selectTrack(i);
                    try {
                        this.decoder = MediaCodec.createDecoderByType(string);
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    this.decoder.configure(trackFormat, VideoResourceProcessInput.this.surface, (MediaCrypto) null, 0);
                    break;
                }
            }
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec == null) {
                return;
            }
            mediaCodec.start();
            ByteBuffer[] inputBuffers = this.decoder.getInputBuffers();
            this.decoder.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            System.currentTimeMillis();
            System.currentTimeMillis();
            boolean z2 = false;
            while (!Thread.interrupted()) {
                if (z2 || (iDequeueInputBuffer = this.decoder.dequeueInputBuffer(10000L)) < 0) {
                    z = z2;
                } else {
                    int sampleData = this.extractor.readSampleData(inputBuffers[iDequeueInputBuffer], 0);
                    MediaCodec mediaCodec2 = this.decoder;
                    if (sampleData < 0) {
                        mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        z = true;
                    } else {
                        mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.extractor.getSampleTime(), 0);
                        this.extractor.advance();
                        z = z2;
                    }
                }
                int iDequeueOutputBuffer = this.decoder.dequeueOutputBuffer(bufferInfo, 10000L);
                if (iDequeueOutputBuffer == -3) {
                    this.decoder.getOutputBuffers();
                } else if (iDequeueOutputBuffer != -2 && iDequeueOutputBuffer != -1) {
                    long j = bufferInfo.presentationTimeUs;
                    if (j >= 0) {
                        VideoResourceProcessInput.this.currentBufferInfo = bufferInfo;
                        long j2 = bufferInfo.presentationTimeUs;
                        long j3 = VideoResourceProcessInput.this.mCurTimestamp;
                        VideoResourceProcessInput videoResourceProcessInput = VideoResourceProcessInput.this;
                        if (j2 <= j3) {
                            videoResourceProcessInput.currentBufferInfo = null;
                        } else {
                            videoResourceProcessInput.mCurTimestamp = bufferInfo.presentationTimeUs;
                            if (VideoResourceProcessInput.this.currentBufferInfo.presentationTimeUs > 0) {
                                VideoResourceProcessInput.this.isProcess = true;
                                VideoResourceProcessInput.access$508(VideoResourceProcessInput.this);
                                if (VideoResourceProcessInput.this.processListener != null) {
                                    VideoResourceProcessInput.this.processListener.onProcessProgress(VideoResourceProcessInput.this.mCurTimestamp / VideoResourceProcessInput.this.processParam.getVideoDuration());
                                }
                                VideoResourceProcessInput.this.processSurface.isRenderDrawing.set(true);
                                this.decoder.releaseOutputBuffer(iDequeueOutputBuffer, true);
                                if (VideoResourceProcessInput.this.renderTime == 0) {
                                    VideoResourceProcessInput videoResourceProcessInput2 = VideoResourceProcessInput.this;
                                    videoResourceProcessInput2.renderTime = videoResourceProcessInput2.mCurTimestamp;
                                }
                                int i2 = VideoResourceProcessInput.this.mFrameRate;
                                VideoResourceProcessInput videoResourceProcessInput3 = VideoResourceProcessInput.this;
                                if (i2 > 0) {
                                    long j4 = videoResourceProcessInput3.mCurTimestamp - VideoResourceProcessInput.this.renderTime;
                                    long j5 = PlaybackException.CUSTOM_ERROR_CODE_BASE / VideoResourceProcessInput.this.mFrameRate;
                                    VideoResourceProcessInput videoResourceProcessInput4 = VideoResourceProcessInput.this;
                                    if (j4 < j5) {
                                        videoResourceProcessInput4.processSurface.shouldDrop.set(true);
                                    } else {
                                        videoResourceProcessInput4.renderTime = videoResourceProcessInput4.mCurTimestamp;
                                        VideoResourceProcessInput.this.processSurface.shouldDrop.set(false);
                                    }
                                } else {
                                    videoResourceProcessInput3.processSurface.shouldDrop.set(false);
                                }
                                for (int i3 = 0; VideoResourceProcessInput.this.processSurface.isRenderDrawing.get() && i3 < 20; i3++) {
                                    try {
                                        Thread.sleep(10L);
                                    } catch (InterruptedException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                            }
                        }
                    } else if (j < 0) {
                        VideoResourceProcessInput.this.currentBufferInfo = null;
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    break;
                } else {
                    z2 = z;
                }
            }
            VideoResourceProcessInput.this.frameSize = 0;
            this.decoder.stop();
            this.decoder.release();
            this.extractor.release();
            if (VideoResourceProcessInput.this.processListener != null) {
                VideoResourceProcessInput.this.processListener.onProcessFinish(null);
            }
        }
    }

    public VideoResourceProcessInput(ProcessParam processParam, ProcessSurface processSurface) {
        this.processParam = processParam;
        this.videoPath = processParam.getVideoPath();
        this.processSurface = processSurface;
        setRenderSize(processParam.getOutPutWidth(), processParam.getOutPutHeight());
    }

    public static /* synthetic */ int access$508(VideoResourceProcessInput videoResourceProcessInput) {
        int i = videoResourceProcessInput.mFrameIndex;
        videoResourceProcessInput.mFrameIndex = i + 1;
        return i;
    }

    private void bindTexture() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.texture_in);
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
        this.recordVideo = false;
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        this.videoTex.updateTexImage();
        super.drawFrame();
    }

    public MediaCodec.BufferInfo getCurrentBuffer() {
        return this.currentBufferInfo;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main() {\n   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n}\n";
    }

    public Surface getSurface() {
        return this.surface;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.videoTex;
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.matrixHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_CAM_MATRIX);
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        this.ready = false;
        super.initWithGLContext();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.texture_in = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.texture_in);
        this.videoTex = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.surface = new Surface(this.videoTex);
        this.ready = true;
    }

    public boolean isPlaying() {
        return true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        markAsDirty();
        GLSurfaceView gLSurfaceView = this.view;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.onFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        bindTexture();
        GLES20.glUniform1i(this.textureHandle, 0);
        this.videoTex.getTransformMatrix(this.matrix);
        GLES20.glUniformMatrix4fv(this.matrixHandle, 1, false, this.matrix, 0);
    }

    public void setFrameRate(int i) {
        this.mFrameRate = i;
    }

    public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        this.onFrameAvailableListener = onFrameAvailableListener;
    }

    public void setProcessListener(VideoProcessListener videoProcessListener) {
        this.processListener = videoProcessListener;
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }

    public void startVideoDecode() {
        new VideoThread().start();
    }

    public void startWhenReady() {
        if (this.ready) {
            this.player.start();
        } else {
            this.startWhenReady = true;
        }
    }

    public void stop() {
        VideoThread videoThread = this.player;
        if (videoThread != null) {
            videoThread.stop();
        }
    }
}
