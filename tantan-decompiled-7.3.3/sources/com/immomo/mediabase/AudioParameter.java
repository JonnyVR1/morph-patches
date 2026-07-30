package com.immomo.mediabase;

/* JADX INFO: loaded from: classes7.dex */
public class AudioParameter {
    private int numChannels;
    private int sampleBits;
    private int samplingRate;

    public AudioParameter() {
        reset();
    }

    public void copyOf(AudioParameter audioParameter) {
        if (audioParameter != null) {
            this.numChannels = audioParameter.numChannels;
            this.samplingRate = audioParameter.samplingRate;
            this.sampleBits = audioParameter.sampleBits;
        }
    }

    public int getNumChannels() {
        return this.numChannels;
    }

    public int getSampleBits() {
        return this.sampleBits;
    }

    public int getSamplingRate() {
        return this.samplingRate;
    }

    public boolean isEqual(AudioParameter audioParameter) {
        return audioParameter != null && audioParameter.getNumChannels() == this.numChannels && audioParameter.getSamplingRate() == this.samplingRate && audioParameter.getSampleBits() == this.sampleBits;
    }

    public void reset() {
        this.numChannels = 0;
        this.samplingRate = 0;
        this.sampleBits = 16;
    }

    public void setNumChannels(int i) {
        this.numChannels = i;
    }

    public void setSampleBits(int i) {
        this.sampleBits = i;
    }

    public void setSamplingRate(int i) {
        this.samplingRate = i;
    }
}
