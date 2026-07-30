package p007l;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xjp0 {
    /* JADX INFO: renamed from: a */
    public static String m11836a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: b */
    public static void m11837b(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (i < j) {
            bArr[i] = (byte) (bArr2[(int) (j2 % ((long) length))] ^ bArr[i]);
            i++;
            j2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11838c(int i) {
        String strM11836a = m11836a(i);
        if (strM11836a == null) {
            return;
        }
        ig3.a(strM11836a);
    }
}
