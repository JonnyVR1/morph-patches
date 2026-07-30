package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum RoomEvent {
    USER_NOTIFY_STOP(WarningCode.WARNING_CODE_RECEIVE_USER_NOTIFY_STOP),
    FORBIDDEN(-2012);

    private int value;

    RoomEvent(int i) {
        this.value = i;
    }

    public static RoomEvent valueOf(int i) {
        if (i == -2013) {
            return USER_NOTIFY_STOP;
        }
        if (i != -2012) {
            return null;
        }
        return FORBIDDEN;
    }

    public int value() {
        return this.value;
    }
}
