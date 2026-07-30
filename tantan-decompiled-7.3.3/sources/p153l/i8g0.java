package p153l;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class i8g0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f113341a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f113342b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f113343c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f113344d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f113345e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a */
    public static boolean m138999a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            if (charSequence == charSequence2) {
                return true;
            }
            int length = charSequence.length();
            if (length == charSequence2.length()) {
                if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
                    return charSequence.equals(charSequence2);
                }
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m139000b(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m139001c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m139002d(CharSequence charSequence) {
        return !m139000b(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m139003e(CharSequence charSequence) {
        return !m139001c(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static String m139004f(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        return m139005g(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: g */
    public static String m139005g(Iterator it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next != null ? next.toString() : "";
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m139006h(String str) {
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
            Log.e("StringUtils", "", e);
            return str;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static boolean m139007i(CharSequence charSequence) {
        return !m139001c(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public static String m139008j(String str, String str2, String str3, int i) {
        int i2;
        if (m139001c(str) || m139001c(str2) || str3 == null || i == 0) {
            return str;
        }
        int i3 = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        if (i < 0) {
            i2 = 16;
        } else {
            i2 = 64;
            if (i <= 64) {
                i2 = i;
            }
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + (length2 * i2));
        while (iIndexOf != -1) {
            stringBuffer.append(str.substring(i3, iIndexOf));
            stringBuffer.append(str3);
            i3 = iIndexOf + length;
            i--;
            if (i == 0) {
                break;
            }
            iIndexOf = str.indexOf(str2, i3);
        }
        stringBuffer.append(str.substring(i3));
        return stringBuffer.toString();
    }
}
