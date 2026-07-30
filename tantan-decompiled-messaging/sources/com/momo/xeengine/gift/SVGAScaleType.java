package com.momo.xeengine.gift;

/* JADX INFO: loaded from: classes8.dex */
public enum SVGAScaleType {
    NONE(0),
    FILL(1),
    ASPECT_FIT(2),
    ASPECT_FILL(3),
    AUTO(1000),
    WIDTH(1001);

    private final int value;

    SVGAScaleType(int i) {
        this.value = i;
    }

    public static SVGAScaleType fromValue(int i) {
        for (SVGAScaleType sVGAScaleType : values()) {
            if (sVGAScaleType.value == i) {
                return sVGAScaleType;
            }
        }
        return NONE;
    }

    public int getValue() {
        return this.value;
    }
}
