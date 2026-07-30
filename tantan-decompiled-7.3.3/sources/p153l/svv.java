package p153l;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public class svv {
    /* JADX INFO: renamed from: a */
    public static String m188227a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append(Integer.toHexString(b));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m188228b() {
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
        m188230d(bArr2);
        m188230d(bArr3);
        byte bM188229c = m188229c(bArr2);
        byte bM188229c2 = m188229c(bArr3);
        bArr[24] = bM188229c;
        bArr[25] = bM188229c2;
        return m188227a(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte m188229c(byte[] bArr) {
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
    public static void m188230d(byte[] bArr) {
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
