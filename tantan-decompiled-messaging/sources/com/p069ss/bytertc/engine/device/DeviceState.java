package com.p069ss.bytertc.engine.device;

/* JADX INFO: loaded from: classes13.dex */
public enum DeviceState {
    INIT(0),
    START(1),
    STOP(2),
    REMOVE(3);

    int type;

    DeviceState(int i) {
        this.type = i;
    }

    public static DeviceState fromId(int i) {
        for (DeviceState deviceState : values()) {
            if (deviceState.getId() == i) {
                return deviceState;
            }
        }
        return null;
    }

    public int getId() {
        return this.type;
    }
}
