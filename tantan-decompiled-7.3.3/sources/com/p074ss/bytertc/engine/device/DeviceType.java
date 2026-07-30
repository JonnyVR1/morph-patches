package com.p074ss.bytertc.engine.device;

/* JADX INFO: loaded from: classes11.dex */
public enum DeviceType {
    MICROPHONE(0),
    SPEAKER(1),
    CAMERA(2);

    int type;

    DeviceType(int i) {
        this.type = i;
    }

    public static DeviceType fromId(int i) {
        for (DeviceType deviceType : values()) {
            if (deviceType.getId() == i) {
                return deviceType;
            }
        }
        return null;
    }

    public int getId() {
        return this.type;
    }
}
