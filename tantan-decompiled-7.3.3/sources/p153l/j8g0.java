package p153l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class j8g0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f118778a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f118779b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f118780c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f118781d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f118782e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a */
    public static boolean m143831a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m143832b(CharSequence charSequence) {
        return !m143831a(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static String m143833c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }
}
