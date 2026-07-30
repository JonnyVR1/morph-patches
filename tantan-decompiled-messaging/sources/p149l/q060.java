package p149l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class q060 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f152015a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, r060.f157140b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = r060.f157140b;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f152015a[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m172290a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: b */
    public static int m172291b(int[] iArr) {
        int iM141165d = jex.m141165d(iArr);
        float[] fArr = new float[8];
        if (iM141165d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / iM141165d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f152015a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = r060.f157140b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m172292c(int[] iArr) {
        int iM172290a = m172290a(iArr);
        if (r060.m177331a(iM172290a) == -1) {
            return -1;
        }
        return iM172290a;
    }

    /* JADX INFO: renamed from: d */
    public static int m172293d(int[] iArr) {
        int iM172292c = m172292c(m172294e(iArr));
        return iM172292c != -1 ? iM172292c : m172291b(iArr);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m172294e(int[] iArr) {
        float fM141165d = jex.m141165d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (fM141165d / 34.0f) + ((i3 * fM141165d) / 17.0f);
            int i4 = iArr[i2];
            if (i + i4 <= f) {
                i += i4;
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
