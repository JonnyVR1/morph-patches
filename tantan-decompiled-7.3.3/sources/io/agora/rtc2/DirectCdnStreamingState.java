package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public enum DirectCdnStreamingState {
    IDLE(0),
    RUNNING(1),
    STOPPED(2),
    FAILED(3),
    RECOVERING(4);

    private int value;

    DirectCdnStreamingState(int i) {
        this.value = i;
    }

    @CalledByNative
    public static DirectCdnStreamingState fromInt(int i) {
        for (DirectCdnStreamingState directCdnStreamingState : values()) {
            if (directCdnStreamingState.getValue() == i) {
                return directCdnStreamingState;
            }
        }
        return FAILED;
    }

    public int getValue() {
        return this.value;
    }
}
