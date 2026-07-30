package com.tencent.liteav.basic.p093c;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14182l {

    /* JADX INFO: renamed from: a */
    public static final float[] f59077a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f59078b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f59079c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f59080d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e */
    public static final float[] f59081e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: com.tencent.liteav.basic.c.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f59082a;

        static {
            int[] iArr = new int[EnumC14181k.values().length];
            f59082a = iArr;
            try {
                iArr[EnumC14181k.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59082a[EnumC14181k.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59082a[EnumC14181k.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59082a[EnumC14181k.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float[] m84020a(EnumC14181k enumC14181k, boolean z, boolean z2) {
        float[] fArr;
        int i = AnonymousClass1.f59082a[enumC14181k.ordinal()];
        if (i == 1) {
            fArr = (float[]) f59078b.clone();
        } else if (i != 2) {
            fArr = i != 3 ? (float[]) f59077a.clone() : (float[]) f59080d.clone();
        } else {
            fArr = (float[]) f59079c.clone();
        }
        if (z) {
            fArr = new float[]{m84019a(fArr[0]), fArr[1], m84019a(fArr[2]), fArr[3], m84019a(fArr[4]), fArr[5], m84019a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], m84019a(fArr[1]), fArr[2], m84019a(fArr[3]), fArr[4], m84019a(fArr[5]), fArr[6], m84019a(fArr[7])} : fArr;
    }

    /* JADX INFO: renamed from: a */
    private static float m84019a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }
}
