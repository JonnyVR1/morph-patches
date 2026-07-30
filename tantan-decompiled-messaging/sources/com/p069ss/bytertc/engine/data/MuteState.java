package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum MuteState {
    MUTE_STATE_OFF(0),
    MUTE_STATE_ON(1);

    private int value;

    MuteState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static MuteState fromId(int i) {
        for (MuteState muteState : values()) {
            if (muteState.value() == i) {
                return muteState;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == MUTE_STATE_ON ? "kMuteStateOn" : "kMuteStateOff";
    }

    public int value() {
        return this.value;
    }
}
