package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum RoomState {
    JOIN_SUCCESS(0),
    JOIN_FAILED(1),
    LEFT(2);

    private int value;

    RoomState(int i) {
        this.value = i;
    }

    public static RoomState valueOf(int i) {
        if (i == 0) {
            return JOIN_SUCCESS;
        }
        if (i == 1) {
            return JOIN_FAILED;
        }
        if (i != 2) {
            return null;
        }
        return LEFT;
    }

    public int value() {
        return this.value;
    }
}
