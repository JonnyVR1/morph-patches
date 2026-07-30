package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum VideoTrc {
    VIDEO_TRC_DEFAULT(0),
    VIDEO_TRC_SRGB(1),
    VIDEO_TRC_PQ(2),
    VIDEO_TRC_HLG(3);

    private final int value;

    VideoTrc(int i) {
        this.value = i;
    }

    public static VideoTrc getVideoTrc(int i) {
        if (i == 1) {
            return VIDEO_TRC_SRGB;
        }
        if (i != 2) {
            return i != 3 ? VIDEO_TRC_DEFAULT : VIDEO_TRC_HLG;
        }
        return VIDEO_TRC_PQ;
    }

    public int getValue() {
        return this.value;
    }
}
