package p153l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes9.dex */
public class r01 {

    /* JADX INFO: renamed from: a */
    public static final int[] f160565a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f160566b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f160567c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static int m179191a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m179192b(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m179193c(int[] iArr, int i, int i2, int i3) {
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[m179192b(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public static <T> T[] m179194d(T[] tArr, int i, int i2, T t) {
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i - i2);
            tArr[i2] = t;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), m179192b(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        System.arraycopy(tArr, i2, tArr2, i2 + 1, tArr.length - i2);
        return tArr2;
    }
}
