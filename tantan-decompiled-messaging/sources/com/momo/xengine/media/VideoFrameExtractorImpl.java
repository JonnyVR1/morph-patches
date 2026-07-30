package com.momo.xengine.media;

import android.graphics.Bitmap;
import android.util.Size;
import com.momo.xengine.media.types.VideoFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
class VideoFrameExtractorImpl implements IVideoFrameExtractor {
    private long pointer;
    private Size videoSize;
    private final VideoFrame videoFrame = new VideoFrame();
    private final Frame frame = new Frame();
    private final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    public static class Frame {
        int[] colors;
        int height;
        int lineSize;
        int width;

        private Frame() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20351a(VideoFrameExtractorImpl videoFrameExtractorImpl, List list, IVideoFrameExtractor.ExtractorFramesCallback extractorFramesCallback) {
        if (videoFrameExtractorImpl.pointer == 0 || videoFrameExtractorImpl.frame.colors.length < videoFrameExtractorImpl.videoSize.getWidth() * videoFrameExtractorImpl.videoSize.getHeight()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoFrameExtractorImpl videoFrameExtractorImpl2 = videoFrameExtractorImpl;
            if (videoFrameExtractorImpl2.nativeGetFrameAt(videoFrameExtractorImpl.pointer, ((Long) it.next()).longValue(), videoFrameExtractorImpl.frame)) {
                Frame frame = videoFrameExtractorImpl2.frame;
                arrayList.add(Bitmap.createBitmap(frame.colors, 0, frame.lineSize, frame.width, frame.height, Bitmap.Config.ARGB_8888));
            }
            videoFrameExtractorImpl = videoFrameExtractorImpl2;
        }
        extractorFramesCallback.onResult(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20352b(VideoFrameExtractorImpl videoFrameExtractorImpl, Size size) {
        long j = videoFrameExtractorImpl.pointer;
        if (j != 0) {
            videoFrameExtractorImpl.nativeSetFrameSize(j, size.getWidth(), size.getHeight());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20353c(VideoFrameExtractorImpl videoFrameExtractorImpl, IVideoFrameExtractor.ExtractorFrameCallback extractorFrameCallback, long j) {
        if (videoFrameExtractorImpl.pointer == 0 || videoFrameExtractorImpl.videoFrame.getData().length < videoFrameExtractorImpl.videoSize.getWidth() * videoFrameExtractorImpl.videoSize.getHeight() * 4) {
            extractorFrameCallback.onResult(null);
        } else if (videoFrameExtractorImpl.nativeGetFrameRGBAt(videoFrameExtractorImpl.pointer, j, videoFrameExtractorImpl.videoFrame)) {
            extractorFrameCallback.onResult(videoFrameExtractorImpl.videoFrame.getData());
        } else {
            extractorFrameCallback.onResult(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20354d(VideoFrameExtractorImpl videoFrameExtractorImpl) {
        videoFrameExtractorImpl.nativeRelease(videoFrameExtractorImpl.pointer);
        videoFrameExtractorImpl.pointer = 0L;
    }

    private native boolean nativeGetFrameAt(long j, long j2, @NotNull Frame frame);

    private native boolean nativeGetFrameRGBAt(long j, long j2, @NotNull VideoFrame videoFrame);

    private native int nativeGetVideoHeight(long j);

    private native int nativeGetVideoWidth(long j);

    private native long nativeInit(@NotNull String str, double d, int i, int i2);

    private native void nativeRelease(long j);

    private native void nativeSetFrameSize(long j, int i, int i2);

    @Override // com.momo.xengine.media.IVideoFrameExtractor
    public void extractorFrames(@NotNull final List<Long> list, @NotNull final IVideoFrameExtractor.ExtractorFramesCallback extractorFramesCallback) {
        this.singleThreadExecutor.execute(new Runnable() { // from class: com.momo.xengine.media.a
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractorImpl.m20351a(this.f14748a, list, extractorFramesCallback);
            }
        });
    }

    @Override // com.momo.xengine.media.IVideoFrameExtractor
    public void getFrameRGBDataAt(final long j, @NotNull final IVideoFrameExtractor.ExtractorFrameCallback extractorFrameCallback) {
        this.singleThreadExecutor.execute(new Runnable() { // from class: com.momo.xengine.media.c
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractorImpl.m20353c(this.f14753a, extractorFrameCallback, j);
            }
        });
    }

    public Size getVideoSize() {
        return this.videoSize;
    }

    @Override // com.momo.xengine.media.IVideoFrameExtractor
    public boolean init(@NotNull String str, float f, double d, int i, int i2) {
        this.pointer = nativeInit(str, d, i, i2);
        this.videoSize = new Size(i, i2);
        int i3 = i2 * i;
        this.videoFrame.setData(new byte[i3 * 4]);
        this.frame.colors = new int[i3];
        return true;
    }

    @Override // com.momo.xengine.media.IVideoFrameExtractor
    public void release() {
        this.singleThreadExecutor.execute(new Runnable() { // from class: com.momo.xengine.media.d
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractorImpl.m20354d(this.f14756a);
            }
        });
    }

    public void setFrameSize(@NotNull final Size size) {
        this.singleThreadExecutor.execute(new Runnable() { // from class: com.momo.xengine.media.b
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractorImpl.m20352b(this.f14751a, size);
            }
        });
    }
}
