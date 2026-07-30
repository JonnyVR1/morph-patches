package p153l;

import android.os.Looper;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes6.dex */
public final class e4s0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f92144a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: a */
    public static long m119477a(double d, int i, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    /* JADX INFO: renamed from: b */
    public static String m119478b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            char[] cArr2 = f92144a;
            int i2 = i + i;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m119479c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m119480d(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m119481e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m119482f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            wg3.m206174a("String must be of even-length");
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
