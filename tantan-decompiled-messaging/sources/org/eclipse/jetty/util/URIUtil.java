package org.eclipse.jetty.util;

import java.io.UnsupportedEncodingException;
import p149l.phg0;

/* JADX INFO: loaded from: classes3.dex */
public class URIUtil implements Cloneable {
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String HTTPS_COLON = "https:";
    public static final String HTTP_COLON = "http:";
    public static final String SLASH = "/";
    public static final String __CHARSET = System.getProperty("org.eclipse.jetty.util.URI.charset", "UTF-8");

    private URIUtil() {
    }

    public static String addPaths(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(63);
        }
        if (iIndexOf == 0) {
            return str2.concat(str);
        }
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 2);
        sb.append(str);
        int i = iIndexOf - 1;
        if (sb.charAt(i) == '/') {
            if (str2.startsWith("/")) {
                sb.deleteCharAt(i);
                sb.insert(i, str2);
            } else {
                sb.insert(iIndexOf, str2);
            }
        } else if (str2.startsWith("/")) {
            sb.insert(iIndexOf, str2);
        } else {
            sb.insert(iIndexOf, '/');
            sb.insert(iIndexOf + 1, str2);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0136  */
    /* JADX WARN: Code duplicated, block: B:115:0x0139  */
    /* JADX WARN: Code duplicated, block: B:118:0x013f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072 A[PHI: r8 r10
      0x0072: PHI (r8v5 int) = (r8v2 int), (r8v7 int), (r8v8 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r10v18 int) = (r10v11 int), (r10v22 int), (r10v25 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    public static String canonicalPath(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(47, length);
        while (length > 0) {
            int i2 = length - iLastIndexOf;
            if (i2 == 2) {
                if (str.charAt(iLastIndexOf + 1) == '.') {
                    break;
                }
                int i3 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i3;
            } else {
                if (i2 == 3 && str.charAt(iLastIndexOf + 1) == '.' && str.charAt(iLastIndexOf + 2) == '.') {
                    break;
                }
                int i4 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i4;
            }
        }
        if (iLastIndexOf >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (length > 0) {
            int i8 = length - iLastIndexOf;
            if (i8 == 2) {
                int i9 = iLastIndexOf + 1;
                if (sb.charAt(i9) == '.') {
                    if (iLastIndexOf >= 0 || sb.length() <= 2 || sb.charAt(1) != '/' || sb.charAt(2) != '/') {
                        if (i6 < 0) {
                            i6 = length;
                        }
                        if (iLastIndexOf < 0 || (iLastIndexOf == 0 && sb.charAt(iLastIndexOf) == '/')) {
                            if (i6 < sb.length() && sb.charAt(i6) == '/') {
                                i6++;
                            }
                            i7 = i9;
                        } else {
                            i7 = length == sb.length() ? i9 : iLastIndexOf;
                            i = iLastIndexOf - 1;
                            while (i >= 0 && sb.charAt(i) != '/') {
                                i--;
                            }
                        }
                    }
                    int i10 = iLastIndexOf;
                    iLastIndexOf = i;
                    length = i10;
                } else if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i7 > 0 && i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                        i7 = -1;
                    } else {
                        i6 = -1;
                        i7 = -1;
                    }
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                    i--;
                }
                int i11 = iLastIndexOf;
                iLastIndexOf = i;
                length = i11;
            } else if (i8 != 3) {
                if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0 && i7 >= 0 && i6 >= i7) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                        i7 = -1;
                    } else {
                        i6 = -1;
                        i7 = -1;
                    }
                }
                i = iLastIndexOf - 1;
                while (i >= 0 && sb.charAt(i) != '/') {
                    i--;
                }
                int i12 = iLastIndexOf;
                iLastIndexOf = i;
                length = i12;
            } else if (sb.charAt(iLastIndexOf + 1) == '.' && sb.charAt(iLastIndexOf + 2) == '.') {
                if (i6 < 0) {
                    i6 = length;
                }
                i5++;
                int i13 = iLastIndexOf - 1;
                while (i13 >= 0 && sb.charAt(i13) != '/') {
                    i13--;
                }
                i7 = iLastIndexOf;
                iLastIndexOf = i13;
                length = i7;
            } else {
                if (i5 > 0 && (i5 = i5 - 1) == 0) {
                    i7 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i7 > 0 && i6 == sb.length() && sb.charAt(i6 - 1) == '.') {
                        i7++;
                    }
                }
                if (i5 <= 0) {
                    sb.delete(i7, i6);
                    if (i5 > 0) {
                        i6 = length;
                        i7 = -1;
                    } else {
                        i6 = -1;
                        i7 = -1;
                    }
                }
                i = iLastIndexOf - 1;
                while (i >= 0) {
                    i--;
                }
                int i14 = iLastIndexOf;
                iLastIndexOf = i;
                length = i14;
            }
        }
        if (i5 > 0) {
            return null;
        }
        if (i6 >= 0) {
            sb.delete(i7, i6);
        }
        return sb.toString();
    }

    public static String compactPath(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                i2++;
                if (i2 == 2) {
                    break;
                }
            } else {
                if (cCharAt == '?') {
                    return str;
                }
                i2 = 0;
            }
            i++;
        }
        if (i2 >= 2) {
            StringBuffer stringBuffer = new StringBuffer(str.length());
            stringBuffer.append((CharSequence) str, 0, i);
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '/') {
                    int i3 = i2 + 1;
                    if (i2 == 0) {
                        stringBuffer.append(cCharAt2);
                    }
                    i2 = i3;
                } else {
                    if (cCharAt2 == '?') {
                        stringBuffer.append((CharSequence) str, i, length);
                        break;
                    }
                    stringBuffer.append(cCharAt2);
                    i2 = 0;
                }
                i++;
            }
            return stringBuffer.toString();
        }
        return str;
    }

    public static String decodePath(String str) {
        String str2;
        String str3;
        int i;
        char[] cArr = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = null;
        int length2 = 0;
        int i2 = 0;
        int length3 = 0;
        while (true) {
            if (length2 < length) {
                char cCharAt = str.charAt(length2);
                if (cCharAt == '%' && (i = length2 + 2) < length) {
                    if (cArr == null) {
                        cArr = new char[length];
                        bArr = new byte[length];
                        str.getChars(0, length2, cArr, 0);
                    }
                    bArr[i2] = (byte) (TypeUtil.parseInt(str, length2 + 1, 2, 16) & 255);
                    i2++;
                    length2 = i;
                } else if (cCharAt == ';') {
                    if (cArr == null) {
                        cArr = new char[length];
                        str.getChars(0, length2, cArr, 0);
                        break;
                    }
                } else if (bArr == null) {
                    length3++;
                } else {
                    if (i2 > 0) {
                        try {
                            str3 = new String(bArr, 0, i2, __CHARSET);
                        } catch (UnsupportedEncodingException unused) {
                            str3 = new String(bArr, 0, i2);
                        }
                        str3.getChars(0, str3.length(), cArr, length3);
                        length3 += str3.length();
                        i2 = 0;
                    }
                    cArr[length3] = cCharAt;
                    length3++;
                }
                length2++;
            }
            length2 = length3;
            break;
        }
        if (cArr == null) {
            return str;
        }
        if (i2 > 0) {
            try {
                str2 = new String(bArr, 0, i2, __CHARSET);
            } catch (UnsupportedEncodingException unused2) {
                str2 = new String(bArr, 0, i2);
            }
            str2.getChars(0, str2.length(), cArr, length2);
            length2 += str2.length();
        }
        return new String(cArr, 0, length2);
    }

    public static StringBuilder encodePath(StringBuilder sb, String str) {
        StringBuilder sb2;
        byte[] bytes;
        int i = 0;
        byte[] bArr = null;
        if (sb == null) {
            int i2 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == ' ' || cCharAt == '%' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '#' || cCharAt == ';' || cCharAt == '<' || cCharAt == '>' || cCharAt == '?') {
                        sb2 = new StringBuilder(str.length() * 2);
                    } else {
                        if (cCharAt > 127) {
                            try {
                                bytes = str.getBytes(__CHARSET);
                                sb2 = new StringBuilder(str.length() * 2);
                                break;
                            } catch (UnsupportedEncodingException e) {
                                phg0.m168968a(e);
                                return null;
                            }
                        }
                        i2++;
                    }
                } else {
                    sb2 = sb;
                }
                bytes = null;
                break;
            }
            if (sb2 == null) {
                return null;
            }
            bArr = bytes;
        } else {
            sb2 = sb;
        }
        synchronized (sb2) {
            try {
                if (bArr != null) {
                    while (i < bArr.length) {
                        byte b = bArr[i];
                        if (b == 32) {
                            sb2.append("%20");
                        } else if (b == 37) {
                            sb2.append("%25");
                        } else if (b == 39) {
                            sb2.append("%27");
                        } else if (b == 34) {
                            sb2.append("%22");
                        } else if (b == 35) {
                            sb2.append("%23");
                        } else if (b == 59) {
                            sb2.append("%3B");
                        } else if (b == 60) {
                            sb2.append("%3C");
                        } else if (b == 62) {
                            sb2.append("%3E");
                        } else if (b == 63) {
                            sb2.append("%3F");
                        } else if (b < 0) {
                            sb2.append('%');
                            TypeUtil.toHex(b, sb2);
                        } else {
                            sb2.append((char) b);
                        }
                        i++;
                    }
                } else {
                    while (i < str.length()) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 == ' ') {
                            sb2.append("%20");
                        } else if (cCharAt2 == '%') {
                            sb2.append("%25");
                        } else if (cCharAt2 == '\'') {
                            sb2.append("%27");
                        } else if (cCharAt2 == '\"') {
                            sb2.append("%22");
                        } else if (cCharAt2 == '#') {
                            sb2.append("%23");
                        } else if (cCharAt2 == ';') {
                            sb2.append("%3B");
                        } else if (cCharAt2 == '<') {
                            sb2.append("%3C");
                        } else if (cCharAt2 == '>') {
                            sb2.append("%3E");
                        } else if (cCharAt2 != '?') {
                            sb2.append(cCharAt2);
                        } else {
                            sb2.append("%3F");
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb2;
    }

    public static StringBuilder encodeString(StringBuilder sb, String str, String str2) {
        if (sb == null) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '%' || str2.indexOf(cCharAt) >= 0) {
                    sb = new StringBuilder(str.length() << 1);
                    break;
                }
            }
            if (sb == null) {
                return null;
            }
        }
        synchronized (sb) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                try {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 == '%' || str2.indexOf(cCharAt2) >= 0) {
                        sb.append('%');
                        StringUtil.append(sb, (byte) (cCharAt2 & 255), 16);
                    } else {
                        sb.append(cCharAt2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sb;
    }

    public static boolean hasScheme(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ':') {
                return true;
            }
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i <= 0 || !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '+' || cCharAt == '-')))) {
                break;
            }
        }
        return false;
    }

    public static String parentPath(String str) {
        int iLastIndexOf;
        if (str == null || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47, str.length() - 2)) < 0) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    public static String decodePath(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2 = null;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i4 + i;
            byte b = bArr[i6];
            if (b == 37 && (i3 = i4 + 2) < i2) {
                b = (byte) (TypeUtil.parseInt(bArr, i6 + 1, 2, 16) & 255);
                i4 = i3;
            } else {
                if (b == 59) {
                    i2 = i4;
                    break;
                }
                if (bArr2 == null) {
                    i5++;
                }
                i4++;
            }
            if (bArr2 == null) {
                bArr2 = new byte[i2];
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr2[i7] = bArr[i7 + i];
                }
            }
            bArr2[i5] = b;
            i5++;
            i4++;
        }
        if (bArr2 == null) {
            return StringUtil.toString(bArr, i, i2, __CHARSET);
        }
        return StringUtil.toString(bArr2, 0, i5, __CHARSET);
    }

    public static String encodePath(String str) {
        StringBuilder sbEncodePath;
        return (str == null || str.length() == 0 || (sbEncodePath = encodePath(null, str)) == null) ? str : sbEncodePath.toString();
    }
}
