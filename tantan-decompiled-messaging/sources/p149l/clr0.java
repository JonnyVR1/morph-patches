package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class clr0 {
    /* JADX INFO: renamed from: a */
    public static int m107578a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static long m107579b(v6w0 v6w0Var, int i, int i2) {
        v6w0Var.m197262k(i);
        if (v6w0Var.m197268q() < 5) {
            return -9223372036854775807L;
        }
        int iM197273v = v6w0Var.m197273v();
        if ((8388608 & iM197273v) != 0 || ((iM197273v >> 8) & 8191) != i2 || (iM197273v & 32) == 0 || v6w0Var.m197238B() < 7 || v6w0Var.m197268q() < 7 || (v6w0Var.m197238B() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        v6w0Var.m197258g(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
    }
}
