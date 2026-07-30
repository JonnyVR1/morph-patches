package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kkj0 {
    /* JADX INFO: renamed from: a */
    public static int m150105a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m150106b(byte[] bArr, int i, int i2, int i3) {
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
    public static long m150107c(ig60 ig60Var, int i, int i2) {
        ig60Var.m139808U(i);
        if (ig60Var.m139811a() < 5) {
            return -9223372036854775807L;
        }
        int iM139827q = ig60Var.m139827q();
        if ((8388608 & iM139827q) != 0 || ((2096896 & iM139827q) >> 8) != i2 || (iM139827q & 32) == 0 || ig60Var.m139795H() < 7 || ig60Var.m139811a() < 7 || (ig60Var.m139795H() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        ig60Var.m139822l(bArr, 0, 6);
        return m150108d(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static long m150108d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
