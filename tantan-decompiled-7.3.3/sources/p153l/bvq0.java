package p153l;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class bvq0 {
    /* JADX INFO: renamed from: a */
    public static String m106587a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m106588b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(m106596j(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m106589c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (i <= 0 || length < i) {
            i = length / 3;
            if (i <= 1) {
                i = 1;
            }
            if (i > 3) {
                i = 3;
            }
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (i3 % i == 0) {
                sb.append("*");
            } else {
                sb.append(str.charAt(i2));
            }
            i2 = i3;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m106590d(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return m106591e(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: e */
    public static String m106591e(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        if (next != null) {
            stringBuffer.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                stringBuffer.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                stringBuffer.append(next2);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m106592f(byte[] bArr) {
        String str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused) {
            str = "";
        }
        return str.toLowerCase();
    }

    /* JADX INFO: renamed from: g */
    public static String m106593g(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return m106594h(objArr, str, 0, objArr.length);
    }

    /* JADX INFO: renamed from: h */
    public static String m106594h(Object[] objArr, String str, int i, int i2) {
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
        StringBuffer stringBuffer = new StringBuffer(i3 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                stringBuffer.append(str);
            }
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                stringBuffer.append(obj2);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m106595i(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 0 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m106596j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m106597k(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(m106596j(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m106598l(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }
}
