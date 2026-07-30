package p153l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class pqk {
    /* JADX INFO: renamed from: a */
    public static int[] m173356a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m173358c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m173357b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m173358c(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t;
        return tArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m173358c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
