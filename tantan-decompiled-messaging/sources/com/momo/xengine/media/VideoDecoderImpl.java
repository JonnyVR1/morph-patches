package com.momo.xengine.media;

import android.text.TextUtils;
import com.momo.xengine.media.types.PixelFormat;
import com.momo.xengine.media.types.VideoFrame;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class VideoDecoderImpl implements IVideoDecoder {
    private long pointer = 0;
    private final VideoFrame sourceVideo = new VideoFrame();

    private static boolean isFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private native boolean nativeGetVideoFrameAt(long j, VideoFrame videoFrame, long j2, int i);

    private native boolean nativeGetVideoFrameInMicrosecond(long j, VideoFrame videoFrame, long j2);

    private native long nativeInit(String str, int i);

    private native void nativeRelease(long j);

    @Override // com.momo.xengine.media.IVideoDecoder
    public VideoFrame getFrameAt(long j, int i) throws Throwable {
        Throwable th;
        synchronized (this) {
            try {
                try {
                    long j2 = this.pointer;
                    if (j2 != 0) {
                        if (!nativeGetVideoFrameAt(j2, this.sourceVideo, j, i)) {
                            return null;
                        }
                        return this.sourceVideo;
                    }
                    try {
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }

    @Override // com.momo.xengine.media.IVideoDecoder
    public VideoFrame getFrameInMicrosecond(long j) throws Throwable {
        Throwable th;
        synchronized (this) {
            try {
                try {
                    long j2 = this.pointer;
                    if (j2 != 0) {
                        if (!nativeGetVideoFrameInMicrosecond(j2, this.sourceVideo, j)) {
                            return null;
                        }
                        return this.sourceVideo;
                    }
                    try {
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            throw th;
        }
    }

    @Override // com.momo.xengine.media.IVideoDecoder
    public void init(@NotNull DecodeConfig decodeConfig) {
        if (isFileExists(decodeConfig.getPath())) {
            synchronized (this) {
                try {
                    if (this.pointer != 0) {
                        return;
                    }
                    if (decodeConfig.getScale_format() == PixelFormat.VIDEO_FORMAT_RGBA || decodeConfig.getScale_format() == PixelFormat.VIDEO_FORMAT_BGRA) {
                        this.sourceVideo.setData(new byte[decodeConfig.getWidth() * decodeConfig.getHeight() * 4]);
                    } else {
                        if (decodeConfig.getScale_format() != PixelFormat.VIDEO_FORMAT_I420 && decodeConfig.getScale_format() != PixelFormat.VIDEO_FORMAT_NV12 && decodeConfig.getScale_format() != PixelFormat.VIDEO_FORMAT_NV21) {
                            this.pointer = 0L;
                            return;
                        }
                        this.sourceVideo.setData(new byte[((decodeConfig.getWidth() * decodeConfig.getHeight()) * 3) / 2]);
                    }
                    this.pointer = nativeInit(decodeConfig.getPath(), decodeConfig.getScale_format().getValue());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.momo.xengine.media.IVideoDecoder
    public void release() {
        synchronized (this) {
            try {
                long j = this.pointer;
                if (j != 0) {
                    nativeRelease(j);
                    this.pointer = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
