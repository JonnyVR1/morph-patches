package p149l;

/* JADX INFO: loaded from: classes.dex */
public class p06 {

    /* JADX INFO: renamed from: a */
    public static final int[] f146544a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f146545b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f146546c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static int m166911a(int[] iArr, int i, int i2) {
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
    public static int m166912b(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m166913c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m166914d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static int m166915e(int i) {
        return m166914d(i * 4) / 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m166916f(int i) {
        return m166914d(i * 8) / 8;
    }
}
