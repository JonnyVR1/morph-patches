package com.momo.xengine.media.types;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum ColorSpace {
    VIDEO_CS_DEFAULT(0),
    VIDEO_CS_601(1),
    VIDEO_CS_709(2),
    VIDEO_CS_SRGB(3),
    VIDEO_CS_2100_PQ(4),
    VIDEO_CS_2100_HLG(5);

    private final int value;

    ColorSpace(int i) {
        this.value = i;
    }

    public static ColorSpace valueOf(int i) {
        if (i == 1) {
            return VIDEO_CS_601;
        }
        if (i == 2) {
            return VIDEO_CS_709;
        }
        if (i == 3) {
            return VIDEO_CS_SRGB;
        }
        if (i != 4) {
            return i != 5 ? VIDEO_CS_DEFAULT : VIDEO_CS_2100_HLG;
        }
        return VIDEO_CS_2100_PQ;
    }

    public int getValue() {
        return this.value;
    }
}
