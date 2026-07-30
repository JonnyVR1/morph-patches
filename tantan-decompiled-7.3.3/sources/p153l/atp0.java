package p153l;

import okio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public final class atp0 {
    /* JADX INFO: renamed from: a */
    public static String m100224a(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        }
        if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    /* JADX INFO: renamed from: b */
    public static void m100225b(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (unsafeCursor.next() != -1);
    }

    /* JADX INFO: renamed from: c */
    public static void m100226c(int i) {
        String strM100224a = m100224a(i);
        if (strM100224a == null) {
            return;
        }
        wg3.m206174a(strM100224a);
    }
}
