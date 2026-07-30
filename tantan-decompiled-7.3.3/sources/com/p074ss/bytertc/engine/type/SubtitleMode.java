package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum SubtitleMode {
    SUBTITLE_MODE_RECOGINTE(0),
    SUBTITLE_MODE_TRANSLATION(1);

    private int value;

    SubtitleMode(int i) {
        this.value = i;
    }

    public static SubtitleMode fromId(int i) {
        for (SubtitleMode subtitleMode : values()) {
            if (subtitleMode.value() == i) {
                return subtitleMode;
            }
        }
        return SUBTITLE_MODE_RECOGINTE;
    }

    public int value() {
        return this.value;
    }
}
