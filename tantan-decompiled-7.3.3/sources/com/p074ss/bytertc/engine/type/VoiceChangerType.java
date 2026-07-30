package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum VoiceChangerType {
    VOICE_CHANGER_ORIGINAL(0),
    VOICE_CHANGER_GIANT(1),
    VOICE_CHANGER_CHIPMUNK(2),
    VOICE_CHANGER_MINIONST(3),
    VOICE_CHANGER_VIBRATO(4),
    VOICE_CHANGER_ROBOT(5),
    VOICE_CHANGER_EXTRA_TERRESTRIAL(6),
    VOICE_CHANGER_BARITONE(7),
    VOICE_CHANGER_BATTERY_DRAIN(8),
    VOICE_CHANGER_Devil(9),
    VOICE_CHANGER_LITTLE_FOX(10),
    VOICE_CHANGER_MEGAPHONE(11),
    VOICE_CHANGER_Mic(12),
    VOICE_CHANGER_SPACE_ROBOT(13),
    VOICE_CHANGER_SQUIRREL(14),
    VOICE_CHANGER_SWEET_GIRL(15),
    VOICE_CHANGER_MR_MYSTERY(16),
    VOICE_CHANGER_GIANTESS(17),
    VOICE_CHANGER_GIANT_V2(18);

    private final int value;

    VoiceChangerType(int i) {
        this.value = i;
    }

    public static VoiceChangerType fromId(int i) {
        for (VoiceChangerType voiceChangerType : values()) {
            if (voiceChangerType.value() == i) {
                return voiceChangerType;
            }
        }
        return VOICE_CHANGER_ORIGINAL;
    }

    public int value() {
        return this.value;
    }
}
