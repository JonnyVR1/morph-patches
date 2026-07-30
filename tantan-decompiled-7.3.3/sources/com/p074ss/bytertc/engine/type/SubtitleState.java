package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum SubtitleState {
    SUBTITLE_STATE_STARTED(0),
    SUBTITLE_STATE_STOPED(1),
    SUBTITLE_STATE_ERROR(2);

    private int value;

    SubtitleState(int i) {
        this.value = i;
    }

    public static SubtitleState fromId(int i) {
        for (SubtitleState subtitleState : values()) {
            if (subtitleState.value() == i) {
                return subtitleState;
            }
        }
        return SUBTITLE_STATE_ERROR;
    }

    public int value() {
        return this.value;
    }
}
