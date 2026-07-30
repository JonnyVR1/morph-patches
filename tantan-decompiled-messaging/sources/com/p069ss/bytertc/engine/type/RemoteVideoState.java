package com.p069ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum RemoteVideoState {
    REMOTE_VIDEO_STATE_STOPPED(0),
    REMOTE_VIDEO_STATE_STARTING(1),
    REMOTE_VIDEO_STATE_DECODING(2),
    REMOTE_VIDEO_STATE_FROZEN(3),
    REMOTE_VIDEO_STATE_FAILED(4);

    private int value;

    RemoteVideoState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RemoteVideoState fromId(int i) {
        for (RemoteVideoState remoteVideoState : values()) {
            if (remoteVideoState.value() == i) {
                return remoteVideoState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
