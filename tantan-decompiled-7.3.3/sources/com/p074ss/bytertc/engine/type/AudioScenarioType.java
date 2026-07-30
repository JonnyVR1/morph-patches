package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum AudioScenarioType {
    DEFAULT(0),
    CHATROOM(1),
    GAMESTREAMING(2),
    CHORUS(3),
    EDUCATION(4),
    AICLIENT(5);

    private final int value;

    AudioScenarioType(int i) {
        this.value = i;
    }

    public static AudioScenarioType fromId(int i) {
        for (AudioScenarioType audioScenarioType : values()) {
            if (audioScenarioType.value() == i) {
                return audioScenarioType;
            }
        }
        return DEFAULT;
    }

    public int value() {
        return this.value;
    }
}
