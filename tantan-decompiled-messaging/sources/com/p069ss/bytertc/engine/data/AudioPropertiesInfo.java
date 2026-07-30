package com.p069ss.bytertc.engine.data;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes13.dex */
public class AudioPropertiesInfo {
    private static final int SPECTRUM_SIZE = 257;
    public int linearVolume;
    public int nonlinearVolume;
    public float[] spectrum;
    public int vad;
    public double voicePitch;

    public AudioPropertiesInfo(int i, int i2, float[] fArr, int i3) {
        float[] fArr2 = new float[SPECTRUM_SIZE];
        this.spectrum = fArr2;
        this.voicePitch = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.linearVolume = i;
        this.nonlinearVolume = i2;
        System.arraycopy(fArr, 0, fArr2, 0, SPECTRUM_SIZE);
        this.vad = i3;
    }

    public String toString() {
        return "AudioPropertiesInfo{linearVolume='" + this.linearVolume + "'nonlinearVolume='" + this.nonlinearVolume + "'voicePitch='" + this.voicePitch + "'}";
    }
}
