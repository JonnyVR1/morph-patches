package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum RemoteUserPriority {
    REMOTE_USER_PRIORITY_LOW(0),
    REMOTE_USER_PRIORITY_MEDIUM(100),
    REMOTE_USER_PRIORITY_HIGH(200);

    private int value;

    RemoteUserPriority(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
