package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gbj0 {
    /* JADX INFO: renamed from: a */
    public static int m125142a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m125143b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static long m125144c(d860 d860Var, int i, int i2) {
        d860Var.m110292U(i);
        if (d860Var.m110295a() < 5) {
            return -9223372036854775807L;
        }
        int iM110311q = d860Var.m110311q();
        if ((8388608 & iM110311q) != 0 || ((2096896 & iM110311q) >> 8) != i2 || (iM110311q & 32) == 0 || d860Var.m110279H() < 7 || d860Var.m110295a() < 7 || (d860Var.m110279H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        d860Var.m110306l(bArr, 0, 6);
        return m125145d(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static long m125145d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
