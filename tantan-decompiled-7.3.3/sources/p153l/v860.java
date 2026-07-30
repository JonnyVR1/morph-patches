package p153l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class v860 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f182852a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, w860.f187831b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = w860.f187831b;
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
                f182852a[i2][7 - i5] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m200291a(int[] iArr) {
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
    public static int m200292b(int[] iArr) {
        int iM140046d = ihx.m140046d(iArr);
        float[] fArr = new float[8];
        if (iM140046d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / iM140046d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f182852a;
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
                i2 = w860.f187831b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m200293c(int[] iArr) {
        int iM200291a = m200291a(iArr);
        if (w860.m205399a(iM200291a) == -1) {
            return -1;
        }
        return iM200291a;
    }

    /* JADX INFO: renamed from: d */
    public static int m200294d(int[] iArr) {
        int iM200293c = m200293c(m200295e(iArr));
        return iM200293c != -1 ? iM200293c : m200292b(iArr);
    }

    /* JADX INFO: renamed from: e */
    public static int[] m200295e(int[] iArr) {
        float fM140046d = ihx.m140046d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            float f = (fM140046d / 34.0f) + ((i3 * fM140046d) / 17.0f);
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
