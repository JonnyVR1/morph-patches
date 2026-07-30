package com.p074ss.bytertc.engine.type;

import com.p074ss.bytertc.engine.InternalAudioVolumeInfo;

/* JADX INFO: loaded from: classes11.dex */
public class AudioVolumeInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public String uid;

    public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
        this.uid = internalAudioVolumeInfo.uid;
        this.nonlinearVolume = internalAudioVolumeInfo.nonlinearVolume;
        this.linearVolume = internalAudioVolumeInfo.linearVolume;
    }

    public String toString() {
        return "AudioVolumeInfo{ user_id= '" + this.uid + "' linear_volume= '" + this.linearVolume + "' nonlinear_volume= '" + this.nonlinearVolume + "'}";
    }

    public AudioVolumeInfo(String str, int i, int i2) {
        this.uid = str;
        this.nonlinearVolume = i;
        this.linearVolume = i2;
    }
}
