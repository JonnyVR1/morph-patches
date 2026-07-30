package com.p069ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes13.dex */
public enum RemoteVideoSinkPosition {
    AFTER_DECODER(0),
    AFTER_POST_PROCESS(1);

    private int value;

    RemoteVideoSinkPosition(int i) {
        this.value = i;
    }

    public static RemoteVideoSinkPosition convertFromInt(int i) {
        return values()[i];
    }

    public int getValue() {
        return this.value;
    }
}
