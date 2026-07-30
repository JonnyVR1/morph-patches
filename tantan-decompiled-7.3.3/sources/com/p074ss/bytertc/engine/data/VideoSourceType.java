package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public enum VideoSourceType {
    VIDEO_SOURCE_TYPE_EXTERNAL(0),
    VIDEO_SOURCE_TYPE_INTERNAL(1),
    VIDEO_SOURCE_TYPE_ENCODED_WITH_SIMULCAST(2),
    VIDEO_SOURCE_TYPE_ENCODED_WITHOUT_SIMULCAST(3);

    private int value;

    VideoSourceType(int i) {
        this.value = i;
    }

    public static VideoSourceType fromId(int i) {
        for (VideoSourceType videoSourceType : values()) {
            if (videoSourceType.value() == i) {
                return videoSourceType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
