package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum FirstFrameSendState {
    FIRST_FRAME_SEND_STATE_SENDING(0),
    FIRST_FRAME_SEND_STATE_SENT(1),
    FIRST_FRAME_SEND_STAT_END(2);

    private int state;

    FirstFrameSendState(int i) {
        this.state = i;
    }

    public static FirstFrameSendState fromId(int i) {
        for (FirstFrameSendState firstFrameSendState : values()) {
            if (firstFrameSendState.value() == i) {
                return firstFrameSendState;
            }
        }
        return FIRST_FRAME_SEND_STATE_SENDING;
    }

    public int value() {
        return this.state;
    }
}
