package p149l;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public class rtv {
    /* JADX INFO: renamed from: a */
    public static String m180834a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append(Integer.toHexString(b));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m180835b() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[50];
        byte[] bArr2 = new byte[24];
        byte[] bArr3 = new byte[24];
        secureRandom.nextBytes(bArr2);
        secureRandom.nextBytes(bArr3);
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr2[i] & 15);
            bArr3[i] = (byte) (bArr3[i] & 15);
        }
        System.arraycopy(bArr2, 0, bArr, 0, 24);
        System.arraycopy(bArr3, 0, bArr, 26, 24);
        m180837d(bArr2);
        m180837d(bArr3);
        byte bM180836c = m180836c(bArr2);
        byte bM180836c2 = m180836c(bArr3);
        bArr[24] = bM180836c;
        bArr[25] = bM180836c2;
        return m180834a(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte m180836c(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        byte b2 = (byte) (10 - ((byte) (i % 10)));
        if (b2 == 10) {
            return (byte) 0;
        }
        return b2;
    }

    /* JADX INFO: renamed from: d */
    public static void m180837d(byte[] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            bArr[i] = (byte) (bArr[i] * 2);
            while (true) {
                byte b = bArr[i];
                if (b >= 10) {
                    bArr[i] = (byte) ((b % 10) + ((b / 10) % 10));
                }
            }
        }
    }
}
