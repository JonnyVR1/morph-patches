package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum DataMessageSourceType {
    DATA_MESSAGE_SOURCE_TYPE_DEFAULT(0),
    DATA_MESSAGE_SOURCE_TYPE_SYSTEM(1);

    private int value;

    DataMessageSourceType(int i) {
        this.value = i;
    }

    public static DataMessageSourceType fromId(int i) {
        for (DataMessageSourceType dataMessageSourceType : values()) {
            if (dataMessageSourceType.value() == i) {
                return dataMessageSourceType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
