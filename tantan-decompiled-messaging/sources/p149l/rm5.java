package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class rm5 {
    /* JADX INFO: renamed from: a */
    public static Object m179957a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            of80.m164058a(52, "must be power of 2 between 2^1 and 2^30: ", i);
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: b */
    public static int m179958b(int i, int i2) {
        return i & (~i2);
    }

    /* JADX INFO: renamed from: c */
    public static int m179959c(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m179960d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: e */
    public static int m179961e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: renamed from: f */
    public static int m179962f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM151974d = lwk.m151974d(obj);
        int i2 = iM151974d & i;
        int iM179964h = m179964h(obj3, i2);
        if (iM179964h == 0) {
            return -1;
        }
        int iM179958b = m179958b(iM151974d, i);
        int i3 = -1;
        while (true) {
            int i4 = iM179964h - 1;
            int i5 = iArr[i4];
            if (m179958b(i5, i) == iM179958b && v050.m196470a(obj, objArr[i4]) && (objArr2 == null || v050.m196470a(obj2, objArr2[i4]))) {
                int iM179959c = m179959c(i5, i);
                if (i3 == -1) {
                    m179965i(obj3, i2, iM179959c);
                    return i4;
                }
                iArr[i3] = m179960d(iArr[i3], iM179959c, i);
                return i4;
            }
            int iM179959c2 = m179959c(i5, i);
            if (iM179959c2 == 0) {
                return -1;
            }
            i3 = i4;
            iM179964h = iM179959c2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m179963g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m179964h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: i */
    public static void m179965i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m179966j(int i) {
        return Math.max(4, lwk.m151971a(i + 1, 1.0d));
    }
}
