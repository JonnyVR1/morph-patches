package com.momo.piplineext.tencent;

import p153l.pmd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes8.dex */
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
        pmd0.m172931a(i);
        return null;
    }

    public int asInt() {
        int i = C4250a.f15207a[ordinal()];
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
        wtq0.m207906a("Unknown Rotation!");
        return 0;
    }
}
