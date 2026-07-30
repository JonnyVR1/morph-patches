package com.core.glcore.config;

import p153l.pmd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public enum Rotation {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    /* JADX INFO: renamed from: com.core.glcore.config.Rotation$a */
    public static /* synthetic */ class C1402a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5769a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f5769a = iArr;
            try {
                iArr[Rotation.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5769a[Rotation.ROTATION_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5769a[Rotation.ROTATION_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5769a[Rotation.ROTATION_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static Rotation fromInt(int i) {
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
        int i = C1402a.f5769a[ordinal()];
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
