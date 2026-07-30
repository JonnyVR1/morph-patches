package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioFormat;
import com.momo.xengine.media.types.AudioFrame;
import com.momo.xengine.media.utils.RingBuffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class SoundTouchImpl implements ISoundTouch {
    private static final int DEFAULT_SIZE = 8192;
    private AudioFormat audioFormat;
    private long pointer;
    private final RingBuffer cache = new RingBuffer(102);
    private byte[] receiveBuffer = new byte[DEFAULT_SIZE];

    public SoundTouchImpl() {
        synchronized (this) {
            this.pointer = nativeCreate();
        }
    }

    private native void nativeClear(long j);

    private native long nativeCreate();

    private native void nativeFlush(long j);

    private native void nativePutSamples(long j, byte[] bArr, int i);

    private native long nativeReceiveSamples(long j, byte[] bArr, int i);

    private native void nativeRelease(long j);

    private native void nativeSetChannels(long j, int i);

    private native void nativeSetPitchSemiTones(long j, int i);

    private native void nativeSetRate(long j, double d);

    private native void nativeSetSampleFormat(long j, int i);

    private native void nativeSetSampleRate(long j, long j2);

    private native void nativeSetSetting(long j, int i, int i2);

    private native void nativeSetSpeed(long j, double d);

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void clear() {
        long j = this.pointer;
        if (j != 0) {
            nativeClear(j);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void flush() {
        long j = this.pointer;
        if (j != 0) {
            nativeFlush(j);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void init(@NotNull AudioFormat audioFormat) {
        synchronized (this) {
            long j = this.pointer;
            if (j == 0) {
                return;
            }
            if (this.audioFormat != null) {
                return;
            }
            this.audioFormat = audioFormat;
            nativeSetSampleFormat(j, audioFormat.getSampleFormat().getValue());
            nativeSetChannels(this.pointer, audioFormat.getChannelLayout().getValue());
            nativeSetSampleRate(this.pointer, audioFormat.getSampleRate());
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void putSamples(@NotNull byte[] bArr, int i) {
        long j = this.pointer;
        if (j != 0) {
            nativePutSamples(j, bArr, i);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized AudioFrame receiveSamples(int i) {
        try {
            if (this.pointer == 0) {
                return null;
            }
            AudioFormat audioFormat = this.audioFormat;
            if (audioFormat == null) {
                return null;
            }
            int samplesSize = audioFormat.getSamplesSize(i);
            if (this.receiveBuffer.length < samplesSize) {
                this.receiveBuffer = new byte[samplesSize];
            }
            int iNativeReceiveSamples = (int) nativeReceiveSamples(this.pointer, this.receiveBuffer, i);
            if (iNativeReceiveSamples > 0) {
                this.cache.write(this.receiveBuffer, 0, this.audioFormat.getSamplesSize(iNativeReceiveSamples));
            }
            if (this.cache.readable() < samplesSize) {
                return null;
            }
            byte[] bArr = new byte[samplesSize];
            this.cache.read(bArr);
            AudioFrame audioFrame = new AudioFrame();
            audioFrame.setData(bArr);
            audioFrame.setSamples(i);
            audioFrame.setSampleFormat(this.audioFormat.getSampleFormat());
            audioFrame.setChannelLayout(this.audioFormat.getChannelLayout());
            audioFrame.setSamplesRate(this.audioFormat.getSampleRate());
            return audioFrame;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void release() {
        long j = this.pointer;
        if (j != 0) {
            nativeRelease(j);
            this.pointer = 0L;
            this.audioFormat = null;
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void setPitchSemiTones(int i) {
        long j = this.pointer;
        if (j != 0) {
            nativeSetPitchSemiTones(j, i);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void setRate(double d) {
        long j = this.pointer;
        if (j != 0) {
            nativeSetRate(j, d);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void setSetting(int i, int i2) {
        long j = this.pointer;
        if (j != 0) {
            nativeSetSetting(j, i, i2);
        }
    }

    @Override // com.momo.xengine.media.ISoundTouch
    public synchronized void setSpeed(double d) {
        long j = this.pointer;
        if (j != 0) {
            nativeSetSpeed(j, d);
        }
    }
}
