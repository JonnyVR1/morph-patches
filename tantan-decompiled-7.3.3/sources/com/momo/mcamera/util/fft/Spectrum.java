package com.momo.mcamera.util.fft;

/* JADX INFO: loaded from: classes8.dex */
public class Spectrum {
    private float[] mAmplitudes;
    private int[] mFrequencies;
    private short[] mSignalSamples;

    public Spectrum(short[] sArr, float[] fArr, int[] iArr) {
        this.mSignalSamples = sArr;
        this.mAmplitudes = fArr;
        this.mFrequencies = iArr;
    }

    public float[] getAmplitudes() {
        return this.mAmplitudes;
    }

    public int[] getFrequencies() {
        return this.mFrequencies;
    }

    public short[] getSignalSamples() {
        return this.mSignalSamples;
    }

    public void setAmplitudes(float[] fArr) {
        this.mAmplitudes = fArr;
    }

    public void setFrequencies(int[] iArr) {
        this.mFrequencies = iArr;
    }

    public void setSignalSamples(short[] sArr) {
        this.mSignalSamples = sArr;
    }

    public Spectrum() {
    }
}
