package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class iur0 {
    /* JADX INFO: renamed from: a */
    public static int m142234a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static long m142235b(bgw0 bgw0Var, int i, int i2) {
        bgw0Var.m104269k(i);
        if (bgw0Var.m104275q() < 5) {
            return -9223372036854775807L;
        }
        int iM104280v = bgw0Var.m104280v();
        if ((8388608 & iM104280v) != 0 || ((iM104280v >> 8) & 8191) != i2 || (iM104280v & 32) == 0 || bgw0Var.m104245B() < 7 || bgw0Var.m104275q() < 7 || (bgw0Var.m104245B() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        bgw0Var.m104265g(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
    }
}
