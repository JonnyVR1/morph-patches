package com.alibaba.sdk.android.oss.common.utils;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import p153l.itq0;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    public static final Charset UTF8 = Charset.forName("utf-8");

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String join(String str, Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i < collection.size() - 1) {
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        String str2;
        String str3;
        int length;
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (isNullOrEmpty(str)) {
            return str;
        }
        if (length2 == 0 && length3 == 0) {
            return str;
        }
        if (length2 != length3) {
            itq0.m142074a("Search and Replace array lengths don't match: ", length2, " vs ", length3);
            return null;
        }
        boolean[] zArr = new boolean[length2];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < length2; i3++) {
            if (!zArr[i3] && !isNullOrEmpty(strArr[i3]) && strArr2[i3] != null) {
                int iIndexOf = str.indexOf(strArr[i3]);
                if (iIndexOf == -1) {
                    zArr[i3] = true;
                } else if (i == -1 || iIndexOf < i) {
                    i2 = i3;
                    i = iIndexOf;
                }
            }
        }
        if (i == -1) {
            return str;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5] != null && (str3 = strArr2[i5]) != null && (length = str3.length() - strArr[i5].length()) > 0) {
                i4 += length * 3;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + Math.min(i4, str.length() / 5));
        int length4 = 0;
        while (i != -1) {
            while (length4 < i) {
                sb.append(str.charAt(length4));
                length4++;
            }
            sb.append(strArr2[i2]);
            length4 = strArr[i2].length() + i;
            i = -1;
            i2 = -1;
            for (int i6 = 0; i6 < length2; i6++) {
                if (!zArr[i6] && (str2 = strArr[i6]) != null && !str2.isEmpty() && strArr2[i6] != null) {
                    int iIndexOf2 = str.indexOf(strArr[i6], length4);
                    if (iIndexOf2 == -1) {
                        zArr[i6] = true;
                    } else if (i == -1 || iIndexOf2 < i) {
                        i2 = i6;
                        i = iIndexOf2;
                    }
                }
            }
        }
        int length5 = str.length();
        while (length4 < length5) {
            sb.append(str.charAt(length4));
            length4++;
        }
        return sb.toString();
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String join(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i < strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
