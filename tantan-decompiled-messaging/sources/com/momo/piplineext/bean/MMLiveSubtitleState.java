package com.momo.piplineext.bean;

/* JADX INFO: loaded from: classes7.dex */
public enum MMLiveSubtitleState {
    SUBTITLE_STATE_STARTED(0),
    SUBTITLE_STATE_STOPED(1),
    SUBTITLE_STATE_ERROR(2);

    private int value;

    MMLiveSubtitleState(int i) {
        this.value = i;
    }

    public static MMLiveSubtitleState fromId(int i) {
        for (MMLiveSubtitleState mMLiveSubtitleState : values()) {
            if (mMLiveSubtitleState.value() == i) {
                return mMLiveSubtitleState;
            }
        }
        return SUBTITLE_STATE_ERROR;
    }

    public int value() {
        return this.value;
    }
}
