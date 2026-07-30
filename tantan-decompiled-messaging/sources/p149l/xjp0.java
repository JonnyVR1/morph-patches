package p149l;

/* JADX INFO: loaded from: classes8.dex */
public class xjp0 {
    /* JADX INFO: renamed from: a */
    public static String m209732a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: b */
    public static void m209733b(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (i < j) {
            bArr[i] = (byte) (bArr2[(int) (j2 % ((long) length))] ^ bArr[i]);
            i++;
            j2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m209734c(int i) {
        String strM209732a = m209732a(i);
        if (strM209732a == null) {
            return;
        }
        ig3.m135964a(strM209732a);
    }
}
