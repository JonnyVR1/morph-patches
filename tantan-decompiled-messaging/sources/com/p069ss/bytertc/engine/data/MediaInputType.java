package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public enum MediaInputType {
    MEDIA_INPUT_TYPE_EXTERNAL(0),
    MEDIA_INPUT_TYPE_INTERNAL(1);

    private int value;

    MediaInputType(int i) {
        this.value = i;
    }

    public static MediaInputType fromId(int i) {
        for (MediaInputType mediaInputType : values()) {
            if (mediaInputType.value() == i) {
                return mediaInputType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
