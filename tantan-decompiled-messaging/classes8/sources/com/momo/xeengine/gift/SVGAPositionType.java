package com.momo.xeengine.gift;

import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum SVGAPositionType {
    TOP(0),
    BOTTOM(1),
    CENTER(2),
    AUTO(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);

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
