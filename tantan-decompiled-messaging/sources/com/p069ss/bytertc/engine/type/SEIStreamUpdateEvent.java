package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum SEIStreamUpdateEvent {
    STREAM_ADD(0),
    STREAM_REMOVE(1);

    int value;

    SEIStreamUpdateEvent(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
