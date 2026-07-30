package com.immomo.momomediaext;

/* JADX INFO: loaded from: classes7.dex */
public enum MomoMediaConstants$MMLiveAudioEffectPreset {
    MMLiveAudioEffectPresetOff(0),
    MMLiveAudioEffectPresetRoomAcousticsKTV(1),
    MMLiveAudioEffectPresetRoomAcousVocalConcer(2),
    MMLiveAudioEffectPresetRoomAcousStudio(3),
    MMLiveAudioEffectPresetRoomAcousPhonograph(4),
    MMLiveAudioEffectPresetRoomAcousVirtualStereo(5),
    MMLiveAudioEffectPresetRoomAcousSpatial(6),
    MMLiveAudioEffectPresetRoomAcousEthereal(7),
    MMLiveAudioEffectPresetRoomAcous3DVoice(8),
    MMLiveAudioEffectPresetRoomAcousVirtualSurroundSound(9),
    MMLiveAudioEffectPresetRoomAcousVirtualEcho(10),
    MMLiveAudioEffectPresetVoiceChangerEffectUncle(11),
    MMLiveAudioEffectPresetVoiceChangerEffectOldMan(12),
    MMLiveAudioEffectPresetVoiceChangerEffectBoy(13),
    MMLiveAudioEffectPresetVoiceChangerEffectSister(14),
    MMLiveAudioEffectPresetVoiceChangerEffectGirl(15),
    MMLiveAudioEffectPresetVoiceChangerEffectPigKin(16),
    MMLiveAudioEffectPresetVoiceChangerEffectHulk(17),
    MMLiveAudioEffectPresetStyleTransformationRnb(18),
    MMLiveAudioEffectPresetStyleTransformationPopular(19),
    MMLiveAudioEffectPresetPitchCorrection(20);

    private final int value;

    MomoMediaConstants$MMLiveAudioEffectPreset(int i) {
        this.value = i;
    }

    public static MomoMediaConstants$MMLiveAudioEffectPreset fromValue(int i) {
        for (MomoMediaConstants$MMLiveAudioEffectPreset momoMediaConstants$MMLiveAudioEffectPreset : values()) {
            if (momoMediaConstants$MMLiveAudioEffectPreset.getValue() == i) {
                return momoMediaConstants$MMLiveAudioEffectPreset;
            }
        }
        return MMLiveAudioEffectPresetOff;
    }

    public int getValue() {
        return this.value;
    }
}
