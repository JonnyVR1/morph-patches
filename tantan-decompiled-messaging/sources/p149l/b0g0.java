package p149l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class b0g0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f72434a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f72435b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f72436c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f72437d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f72438e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: a */
    public static boolean m99768a(CharSequence charSequence, CharSequence charSequence2) {
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
    public static boolean m99769b(CharSequence charSequence) {
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
    public static boolean m99770c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99771d(CharSequence charSequence) {
        return !m99769b(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99772e(CharSequence charSequence) {
        return !m99770c(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static String m99773f(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return m99774g(objArr, str, "", 0, objArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static String m99774g(Object[] objArr, String str, String str2, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        Object obj = objArr[i];
        StringBuilder sb = new StringBuilder(i3 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (objArr[i4] != null) {
                if (i4 > i) {
                    sb.append(str);
                }
                sb.append(str2);
                sb.append(objArr[i4]);
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m99775h(String str) {
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

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static boolean m99776i(CharSequence charSequence) {
        return !m99770c(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public static String m99777j(String str, String str2, String str3, int i) {
        int i2;
        if (m99770c(str) || m99770c(str2) || str3 == null || i == 0) {
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

    /* JADX INFO: renamed from: k */
    public static String[] m99778k(String str, String str2) {
        if (m99770c(str)) {
            return null;
        }
        return str.split(str2);
    }
}
