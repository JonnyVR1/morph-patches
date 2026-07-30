package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class btp0 {
    /* JADX INFO: renamed from: a */
    public static String m106375a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: b */
    public static void m106376b(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (i < j) {
            bArr[i] = (byte) (bArr2[(int) (j2 % ((long) length))] ^ bArr[i]);
            i++;
            j2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m106377c(int i) {
        String strM106375a = m106375a(i);
        if (strM106375a == null) {
            return;
        }
        wg3.m206174a(strM106375a);
    }
}
