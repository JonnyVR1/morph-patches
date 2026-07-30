package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
