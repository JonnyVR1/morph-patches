package com.immomo.momomediaext.utils;

/* JADX INFO: loaded from: classes7.dex */
public enum MMLiveChorusRoomState {
    MMLiveChorusRoomStateFailed(0),
    MMLiveChorusRoomStateConnected(1);

    private int value;

    MMLiveChorusRoomState(int i) {
        this.value = i;
    }

    public static MMLiveChorusRoomState fromId(int i) {
        for (MMLiveChorusRoomState mMLiveChorusRoomState : values()) {
            if (mMLiveChorusRoomState.value() == i) {
                return mMLiveChorusRoomState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
