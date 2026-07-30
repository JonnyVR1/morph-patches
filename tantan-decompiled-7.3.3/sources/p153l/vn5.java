package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class vn5 {
    /* JADX INFO: renamed from: a */
    public static Object m201915a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            tn80.m191877a(52, "must be power of 2 between 2^1 and 2^30: ", i);
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: b */
    public static int m201916b(int i, int i2) {
        return i & (~i2);
    }

    /* JADX INFO: renamed from: c */
    public static int m201917c(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m201918d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m201919e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m201920f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM107166d = bzk.m107166d(obj);
        int i2 = iM107166d & i;
        int iM201922h = m201922h(obj3, i2);
        if (iM201922h == 0) {
            return -1;
        }
        int iM201916b = m201916b(iM107166d, i);
        int i3 = -1;
        while (true) {
            int i4 = iM201922h - 1;
            int i5 = iArr[i4];
            if (m201916b(i5, i) == iM201916b && k950.m148863a(obj, objArr[i4]) && (objArr2 == null || k950.m148863a(obj2, objArr2[i4]))) {
                int iM201917c = m201917c(i5, i);
                if (i3 == -1) {
                    m201923i(obj3, i2, iM201917c);
                    return i4;
                }
                iArr[i3] = m201918d(iArr[i3], iM201917c, i);
                return i4;
            }
            int iM201917c2 = m201917c(i5, i);
            if (iM201917c2 == 0) {
                return -1;
            }
            i3 = i4;
            iM201922h = iM201917c2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m201921g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m201922h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: i */
    public static void m201923i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m201924j(int i) {
        return Math.max(4, bzk.m107163a(i + 1, 1.0d));
    }
}
