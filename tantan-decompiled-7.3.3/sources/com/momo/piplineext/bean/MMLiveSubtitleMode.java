package com.momo.piplineext.bean;

/* JADX INFO: loaded from: classes8.dex */
public enum MMLiveSubtitleMode {
    SUBTITLE_MODE_RECOGNITION(0),
    SUBTITLE_MODE_TRANSLATION(1);

    private int value;

    MMLiveSubtitleMode(int i) {
        this.value = i;
    }

    public static MMLiveSubtitleMode fromId(int i) {
        for (MMLiveSubtitleMode mMLiveSubtitleMode : values()) {
            if (mMLiveSubtitleMode.value() == i) {
                return mMLiveSubtitleMode;
            }
        }
        return SUBTITLE_MODE_RECOGNITION;
    }

    public int value() {
        return this.value;
    }
}
