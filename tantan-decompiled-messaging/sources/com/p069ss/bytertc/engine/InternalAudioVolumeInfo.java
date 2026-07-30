package com.p069ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class InternalAudioVolumeInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public int smoothVolume;
    public String uid;

    public InternalAudioVolumeInfo(String str, int i, int i2) {
        this.uid = str;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
    }

    @CalledByNative
    private static InternalAudioVolumeInfo create(String str, int i, int i2) {
        return new InternalAudioVolumeInfo(str, i, i2);
    }
}
