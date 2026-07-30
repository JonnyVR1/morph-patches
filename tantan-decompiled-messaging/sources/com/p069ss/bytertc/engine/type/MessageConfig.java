package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum MessageConfig {
    RELIABLE_ORDERED(0),
    UNRELIABLE_ORDERED(1),
    UNRELIABLE_UNORDERED(2);

    int value;

    MessageConfig(int i) {
        this.value = i;
    }

    public static MessageConfig fromId(int i) {
        for (MessageConfig messageConfig : values()) {
            if (messageConfig.value() == i) {
                return messageConfig;
            }
        }
        return RELIABLE_ORDERED;
    }

    public int value() {
        return this.value;
    }
}
