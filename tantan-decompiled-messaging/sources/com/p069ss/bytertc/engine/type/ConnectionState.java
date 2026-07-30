package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum ConnectionState {
    CONNECTION_STATE_DISCONNECTED(1),
    CONNECTION_STATE_CONNECTING(2),
    CONNECTION_STATE_CONNECTED(3),
    CONNECTION_STATE_RECONNECTING(4),
    CONNECTION_STATE_RECONNECTED(5),
    CONNECTION_STATE_LOST(6),
    CONNECTION_STATE_FAILED(7);

    private int value;

    ConnectionState(int i) {
        this.value = i;
    }

    public static ConnectionState fromId(int i) {
        for (ConnectionState connectionState : values()) {
            if (connectionState.getValue() == i) {
                return connectionState;
            }
        }
        return CONNECTION_STATE_DISCONNECTED;
    }

    public int getValue() {
        return this.value;
    }
}
