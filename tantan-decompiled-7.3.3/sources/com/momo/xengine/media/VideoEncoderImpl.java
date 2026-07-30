package com.momo.xengine.media;

import android.util.Size;
import com.momo.xengine.media.types.PixelFormat;
import com.momo.xengine.media.types.VideoFrame;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class VideoEncoderImpl implements IVideoEncoder {
    private long pointer = 0;
    private EncodeConfig encodeConfig = null;
    private EncodeTimestampCalculator calculator = new EncodeTimestampCalculator();

    private native boolean nativeAppendAudioSamples(long j, byte[] bArr, int i, long j2);

    private native boolean nativeAppendVideoFrame(long j, byte[] bArr, int i, boolean z, long j2, int i2, int i3, float f);

    private native long nativeInit(String str, int i, int i2, int i3, float f, float f2, long j, int i4, int i5, int i6, int i7);

    private native void nativeRelease(long j);

    private native boolean nativeStart(long j);

    private native void nativeStop(long j);

    @Override // com.momo.xengine.media.IVideoEncoder
    public boolean appendAudioSamples(@NotNull AudioSamples audioSamples) throws Throwable {
        synchronized (this) {
            try {
                try {
                    if (this.pointer == 0 || audioSamples.getData() == null) {
                        return false;
                    }
                    return nativeAppendAudioSamples(this.pointer, audioSamples.getData(), audioSamples.getSamples(), audioSamples.getTimestamp());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // com.momo.xengine.media.IVideoEncoder
    public boolean appendVideoFrame(@NotNull VideoFrame videoFrame) throws Throwable {
        Throwable th;
        EncodeConfig encodeConfig;
        synchronized (this) {
            try {
                try {
                    if (this.pointer == 0 || videoFrame.getData() == null || (encodeConfig = this.encodeConfig) == null || encodeConfig.getSize().getWidth() == 0 || this.encodeConfig.getSize().getHeight() == 0 || videoFrame.getFormat() == PixelFormat.VIDEO_FORMAT_NONE) {
                        return false;
                    }
                    if (!this.calculator.isInit()) {
                        try {
                            this.calculator.init(videoFrame.getTimestamp());
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (!this.calculator.isInit()) {
                        return false;
                    }
                    videoFrame.setTimestamp(this.calculator.calculateTimestamp(videoFrame.getTimestamp(), videoFrame.getSpeed()));
                    return nativeAppendVideoFrame(this.pointer, videoFrame.getData(), videoFrame.getLineSize(), videoFrame.isFlipY(), videoFrame.getTimestamp(), videoFrame.getFormat().getValue(), this.encodeConfig.getSize().getHeight(), videoFrame.getSpeed());
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    @Override // com.momo.xengine.media.IVideoEncoder
    public void init(@NotNull EncodeConfig encodeConfig) {
        synchronized (this) {
            Size size = encodeConfig.getSize();
            this.encodeConfig = encodeConfig;
            this.pointer = nativeInit(encodeConfig.getPath(), size.getWidth(), size.getHeight(), encodeConfig.getFrameRate(), encodeConfig.getRotation(), encodeConfig.getSpeed(), encodeConfig.getBitrate(), encodeConfig.getAudioFormat().getValue(), encodeConfig.getAudioBitrate(), encodeConfig.getAudioChannels().getValue(), encodeConfig.getAudioSamplesRate());
        }
    }

    @Override // com.momo.xengine.media.IVideoEncoder
    public void release() {
        synchronized (this) {
            try {
                long j = this.pointer;
                if (j != 0) {
                    nativeRelease(j);
                    this.pointer = 0L;
                }
                this.calculator.release();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.xengine.media.IVideoEncoder
    public boolean start() {
        synchronized (this) {
            try {
                long j = this.pointer;
                if (j == 0) {
                    return false;
                }
                return nativeStart(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.xengine.media.IVideoEncoder
    public boolean stop() {
        synchronized (this) {
            try {
                long j = this.pointer;
                if (j == 0) {
                    return false;
                }
                nativeStop(j);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
