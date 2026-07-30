package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceEqualizationConfig {
    public VoiceEqualizationBandFrequency frequency;
    public int gain;

    public VoiceEqualizationConfig(VoiceEqualizationBandFrequency voiceEqualizationBandFrequency, int i) {
        this.frequency = voiceEqualizationBandFrequency;
        this.gain = i;
    }

    public String toString() {
        return "the frequency: " + this.frequency + ", the gain: " + this.gain;
    }
}
