package com.immomo.momomediaext.utils;

/* JADX INFO: loaded from: classes7.dex */
public enum MMLiveChorusPlayerState {
    STOPPED(0),
    PLAYING(1),
    PAUSED(2),
    ERROR(3),
    PLAY_COMPLETED(4),
    OPEN_COMPLETED(5),
    PLAY_FAILED(6);

    private int value;

    MMLiveChorusPlayerState(int i) {
        this.value = i;
    }

    public static MMLiveChorusPlayerState fromId(int i) {
        for (MMLiveChorusPlayerState mMLiveChorusPlayerState : values()) {
            if (mMLiveChorusPlayerState.value() == i) {
                return mMLiveChorusPlayerState;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
