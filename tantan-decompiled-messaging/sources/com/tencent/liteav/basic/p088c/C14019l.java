package com.tencent.liteav.basic.p088c;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14019l {

    /* JADX INFO: renamed from: a */
    public static final float[] f58229a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f58230b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f58231c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f58232d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    public static final float[] f58233e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f58234a;

        static {
            int[] iArr = new int[EnumC14018k.values().length];
            f58234a = iArr;
            try {
                iArr[EnumC14018k.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58234a[EnumC14018k.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58234a[EnumC14018k.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58234a[EnumC14018k.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float[] m82837a(EnumC14018k enumC14018k, boolean z, boolean z2) {
        float[] fArr;
        int i = AnonymousClass1.f58234a[enumC14018k.ordinal()];
        if (i == 1) {
            fArr = (float[]) f58230b.clone();
        } else if (i != 2) {
            fArr = i != 3 ? (float[]) f58229a.clone() : (float[]) f58232d.clone();
        } else {
            fArr = (float[]) f58231c.clone();
        }
        if (z) {
            fArr = new float[]{m82836a(fArr[0]), fArr[1], m82836a(fArr[2]), fArr[3], m82836a(fArr[4]), fArr[5], m82836a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], m82836a(fArr[1]), fArr[2], m82836a(fArr[3]), fArr[4], m82836a(fArr[5]), fArr[6], m82836a(fArr[7])} : fArr;
    }

    /* JADX INFO: renamed from: a */
    private static float m82836a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }
}
