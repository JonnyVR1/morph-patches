package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum AnsMode {
    ANS_MODE_DISABLE(0),
    ANS_MODE_LOW(1),
    ANS_MODE_MEDIUM(2),
    ANS_MODE_HIGH(3),
    ANS_MODE_AUTOMATIC(4);

    private final int value;

    AnsMode(int i) {
        this.value = i;
    }

    public static AnsMode fromId(int i) {
        for (AnsMode ansMode : values()) {
            if (ansMode.value() == i) {
                return ansMode;
            }
        }
        return ANS_MODE_AUTOMATIC;
    }

    public int value() {
        return this.value;
    }
}
