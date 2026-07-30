package com.momo.xengine.media;

import com.momo.xengine.media.types.AudioFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
final class AudioProcessorImpl implements IAudioProcessor {
    private AudioFormat audioFormat;
    long pointer;
    private final List<AudioTrack> trackList = new ArrayList();

    public AudioProcessorImpl() {
        synchronized (this) {
            this.pointer = nativeCreate();
        }
    }

    private native boolean nativeApply(long j, List<AudioTrack> list);

    private native long nativeCreate();

    private native void nativeInit(long j, int i, int i2, int i3);

    private native long nativeNext(long j, byte[] bArr, int i);

    private native void nativeRelease(long j);

    private native void nativeSeek(long j, long j2);

    @Override // com.momo.xengine.media.IAudioProcessor
    public synchronized boolean apply() {
        boolean zNativeApply;
        synchronized (this) {
            try {
                long j = this.pointer;
                zNativeApply = j != 0 ? nativeApply(j, this.trackList) : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNativeApply;
        return zNativeApply;
    }

    @Override // com.momo.xengine.media.IAudioProcessor
    public List<AudioTrack> getTracks() {
        return this.trackList;
    }

    @Override // com.momo.xengine.media.IAudioProcessor
    public synchronized void init(AudioFormat audioFormat) throws Throwable {
        AudioProcessorImpl audioProcessorImpl;
        try {
            try {
                try {
                    synchronized (this) {
                        try {
                            long j = this.pointer;
                            if (j != 0) {
                                this.audioFormat = audioFormat;
                                audioProcessorImpl = this;
                                audioProcessorImpl.nativeInit(j, audioFormat.getChannelLayout().getValue(), audioFormat.getSampleFormat().getValue(), audioFormat.getSampleRate());
                            } else {
                                audioProcessorImpl = this;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.momo.xengine.media.IAudioProcessor
    public long next(byte[] bArr) {
        long jNativeNext;
        if (bArr == null || bArr.length == 0) {
            return 0L;
        }
        int length = (bArr.length / this.audioFormat.getSampleFormat().getSampleBit()) / this.audioFormat.getChannelLayout().getChannelNum();
        synchronized (this) {
            try {
                long j = this.pointer;
                jNativeNext = j != 0 ? nativeNext(j, bArr, length) : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jNativeNext;
    }

    @Override // com.momo.xengine.media.IAudioProcessor
    public synchronized void release() {
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

    @Override // com.momo.xengine.media.IAudioProcessor
    public synchronized void seek(long j) {
        synchronized (this) {
            try {
                long j2 = this.pointer;
                if (j2 != 0) {
                    nativeSeek(j2, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
