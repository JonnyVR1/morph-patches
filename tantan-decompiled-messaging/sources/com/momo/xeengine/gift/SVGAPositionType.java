package com.momo.xeengine.gift;

/* JADX INFO: loaded from: classes8.dex */
public enum SVGAPositionType {
    TOP(0),
    BOTTOM(1),
    CENTER(2),
    AUTO(1000);

    private final int value;

    SVGAPositionType(int i) {
        this.value = i;
    }

    public static SVGAPositionType fromValue(int i) {
        for (SVGAPositionType sVGAPositionType : values()) {
            if (sVGAPositionType.value == i) {
                return sVGAPositionType;
            }
        }
        return CENTER;
    }

    public int getValue() {
        return this.value;
    }
}
