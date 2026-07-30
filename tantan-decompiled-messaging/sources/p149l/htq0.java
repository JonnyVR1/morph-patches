package p149l;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class htq0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f109434a = "&quot;".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f109435b = "&apos;".toCharArray();

    /* JADX INFO: renamed from: c */
    private static final char[] f109436c = "&amp;".toCharArray();

    /* JADX INFO: renamed from: d */
    private static final char[] f109437d = "&lt;".toCharArray();

    /* JADX INFO: renamed from: e */
    private static final char[] f109438e = "&gt;".toCharArray();

    /* JADX INFO: renamed from: f */
    private static Random f109439f = new Random();

    /* JADX INFO: renamed from: g */
    private static char[] f109440g = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: a */
    public static String m132932a(int i) {
        if (i < 1) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f109440g[f109439f.nextInt(71)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m132933b(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        StringBuilder sb = new StringBuilder((int) (((double) length) * 1.3d));
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = charArray[i];
            if (c <= '>') {
                if (c == '<') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f109437d);
                } else if (c == '>') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f109438e);
                } else if (c == '&') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    int i3 = i + 5;
                    if (length <= i3 || charArray[i + 1] != '#' || !Character.isDigit(charArray[i + 2]) || !Character.isDigit(charArray[i + 3]) || !Character.isDigit(charArray[i + 4]) || charArray[i3] != ';') {
                        i2 = i + 1;
                        sb.append(f109436c);
                    }
                } else if (c == '\"') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f109434a);
                } else if (c == '\'') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f109435b);
                }
            }
            i++;
        }
        if (i2 == 0) {
            return str;
        }
        if (i > i2) {
            sb.append(charArray, i2, i - i2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final String m132934c(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(charArray.length);
        sb.append(charArray, 0, iIndexOf);
        sb.append(charArray2);
        int i = iIndexOf + length;
        while (true) {
            int iIndexOf2 = str.indexOf(str2, i);
            if (iIndexOf2 <= 0) {
                sb.append(charArray, i, charArray.length - i);
                return sb.toString();
            }
            sb.append(charArray, i, iIndexOf2 - i);
            sb.append(charArray2);
            i = iIndexOf2 + length;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m132935d(byte[] bArr) {
        return String.valueOf(jkq0.m141911e(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static final String m132936e(String str) {
        return m132934c(m132934c(m132934c(m132934c(m132934c(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }
}
