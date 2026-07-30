package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum VideoRangeType {
    VIDEO_RANGE_DEFAULT(0),
    VIDEO_RANGE_PARTIAL(1),
    VIDEO_RANGE_FULL(2);

    private final int value;

    VideoRangeType(int i) {
        this.value = i;
    }

    public static VideoRangeType getVideoRange(int i) {
        if (i != 1) {
            return i != 2 ? VIDEO_RANGE_DEFAULT : VIDEO_RANGE_FULL;
        }
        return VIDEO_RANGE_PARTIAL;
    }

    public int getValue() {
        return this.value;
    }
}
