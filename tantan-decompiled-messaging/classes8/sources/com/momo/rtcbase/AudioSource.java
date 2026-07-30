package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
