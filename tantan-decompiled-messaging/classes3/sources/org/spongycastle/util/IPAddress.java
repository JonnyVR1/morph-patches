package org.spongycastle.util;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IPAddress {
    private static boolean isMaskValue(String str, int i) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 >= 0 && i2 <= i;
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        String strConcat = str.concat(".");
        int i = 0;
        int i2 = 0;
        while (i < strConcat.length() && (iIndexOf = strConcat.indexOf(46, i)) > i) {
            if (i2 == 4) {
                return false;
            }
            try {
                int i3 = Integer.parseInt(strConcat.substring(i, iIndexOf));
                if (i3 < 0 || i3 > 255) {
                    return false;
                }
                i = iIndexOf + 1;
                i2++;
            } catch (NumberFormatException unused) {
            }
        }
        return i2 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        String strSubstring = str.substring(iIndexOf + 1);
        return iIndexOf > 0 && isValidIPv4(str.substring(0, iIndexOf)) && (isValidIPv4(strSubstring) || isMaskValue(strSubstring, 32));
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        String strConcat = str.concat(":");
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < strConcat.length() && (iIndexOf = strConcat.indexOf(58, i)) >= i) {
            if (i2 == 8) {
                return false;
            }
            if (i != iIndexOf) {
                String strSubstring = strConcat.substring(i, iIndexOf);
                if (iIndexOf != strConcat.length() - 1 || strSubstring.indexOf(46) <= 0) {
                    try {
                        int i3 = Integer.parseInt(strConcat.substring(i, iIndexOf), 16);
                        if (i3 < 0 || i3 > 65535) {
                            return false;
                        }
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    if (!isValidIPv4(strSubstring)) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (iIndexOf != 1 && iIndexOf != strConcat.length() - 1 && z) {
                    return false;
                }
                z = true;
            }
            i = iIndexOf + 1;
            i2++;
        }
        return i2 == 8 || z;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        String strSubstring = str.substring(iIndexOf + 1);
        return iIndexOf > 0 && isValidIPv6(str.substring(0, iIndexOf)) && (isValidIPv6(strSubstring) || isMaskValue(strSubstring, 128));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
