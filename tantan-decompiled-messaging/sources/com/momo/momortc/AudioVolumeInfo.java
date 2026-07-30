package com.momo.momortc;

import com.momo.rtcbase.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class AudioVolumeInfo {
    public long uid;
    public int volume;

    @CalledByNative
    public AudioVolumeInfo() {
    }

    @CalledByNative
    public void setUid(long j) {
        this.uid = j;
    }

    @CalledByNative
    public void setVolume(int i) {
        this.volume = i;
    }
}
