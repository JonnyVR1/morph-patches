package p149l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public final class d0f {

    /* JADX INFO: renamed from: a */
    private static final char[] f83178a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    private static String m109477a(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return "";
        }
        char[] cArr = new char[length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f83178a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m109478b(byte[] bArr) {
        return m109481e(bArr, "MD5");
    }

    /* JADX INFO: renamed from: c */
    public static String m109479c(String str) {
        return (str == null || str.length() == 0) ? "" : m109480d(str.getBytes());
    }

    /* JADX INFO: renamed from: d */
    public static String m109480d(byte[] bArr) {
        return m109477a(m109478b(bArr));
    }

    /* JADX INFO: renamed from: e */
    private static byte[] m109481e(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
