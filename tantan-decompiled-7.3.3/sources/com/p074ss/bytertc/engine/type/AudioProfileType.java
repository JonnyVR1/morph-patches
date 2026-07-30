package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioProfileType {
    AUDIO_PROFILE_DEFAULT(0),
    AUDIO_PROFILE_FLUENT(1),
    AUDIO_PROFILE_STANDARD(2),
    AUDIO_PROFILE_HD(3),
    AUDIO_PROFILE_STANDARD_STEREO(4),
    AUDIO_PROFILE_HD_MONO(5);

    private final int value;

    AudioProfileType(int i) {
        this.value = i;
    }

    public static AudioProfileType fromId(int i) {
        for (AudioProfileType audioProfileType : values()) {
            if (audioProfileType.value() == i) {
                return audioProfileType;
            }
        }
        return AUDIO_PROFILE_DEFAULT;
    }

    public int value() {
        return this.value;
    }
}
