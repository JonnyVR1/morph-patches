package com.momo.piplineext.tencent;

import l.ned0;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public enum BaseGPUFilter$Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    public static BaseGPUFilter$Rotation fromInt(int i) {
        if (i == 0) {
            return NORMAL;
        }
        if (i == 90) {
            return ROTATION_90;
        }
        if (i == 180) {
            return ROTATION_180;
        }
        if (i == 270) {
            return ROTATION_270;
        }
        if (i == 360) {
            return NORMAL;
        }
        ned0.a(i);
        return null;
    }

    public int asInt() {
        int i = C0011a.f187a[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 90;
        }
        if (i == 3) {
            return 180;
        }
        if (i == 4) {
            return 270;
        }
        qkq0.a("Unknown Rotation!");
        return 0;
    }
}
