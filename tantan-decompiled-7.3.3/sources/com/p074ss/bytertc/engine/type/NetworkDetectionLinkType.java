package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum NetworkDetectionLinkType {
    UP(0),
    DOWN(1);

    int value;

    NetworkDetectionLinkType(int i) {
        this.value = i;
    }

    public static NetworkDetectionLinkType fromId(int i) {
        for (NetworkDetectionLinkType networkDetectionLinkType : values()) {
            if (networkDetectionLinkType.value() == i) {
                return networkDetectionLinkType;
            }
        }
        return UP;
    }

    public int value() {
        return this.value;
    }
}
