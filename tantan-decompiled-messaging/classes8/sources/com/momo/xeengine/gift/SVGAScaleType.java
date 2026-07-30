package com.momo.xeengine.gift;

import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum SVGAScaleType {
    NONE(0),
    FILL(1),
    ASPECT_FIT(2),
    ASPECT_FILL(3),
    AUTO(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE),
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
