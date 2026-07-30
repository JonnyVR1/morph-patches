package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum VoiceEqualizationBandFrequency {
    VOICE_EQUALIZATION_BAND_FREQUENCY_31(0),
    VOICE_EQUALIZATION_BAND_FREQUENCY_62(1),
    VOICE_EQUALIZATION_BAND_FREQUENCY_125(2),
    VOICE_EQUALIZATION_BAND_FREQUENCY_250(3),
    VOICE_EQUALIZATION_BAND_FREQUENCY_500(4),
    VOICE_EQUALIZATION_BAND_FREQUENCY_1K(5),
    VOICE_EQUALIZATION_BAND_FREQUENCY_2K(6),
    VOICE_EQUALIZATION_BAND_FREQUENCY_4K(7),
    VOICE_EQUALIZATION_BAND_FREQUENCY_8K(8),
    VOICE_EQUALIZATION_BAND_FREQUENCY_16K(9);

    private final int value;

    VoiceEqualizationBandFrequency(int i) {
        this.value = i;
    }

    public static VoiceEqualizationBandFrequency fromId(int i) {
        for (VoiceEqualizationBandFrequency voiceEqualizationBandFrequency : values()) {
            if (voiceEqualizationBandFrequency.value() == i) {
                return voiceEqualizationBandFrequency;
            }
        }
        return VOICE_EQUALIZATION_BAND_FREQUENCY_16K;
    }

    public int value() {
        return this.value;
    }
}
