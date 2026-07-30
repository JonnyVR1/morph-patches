package p003l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jo9 {

    /* JADX INFO: renamed from: a */
    public static final char[] f5354a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f5355b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m7438a(byte[] bArr) {
        return m7439b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m7439b(byte[] bArr, boolean z) {
        return m7440c(bArr, z ? f5354a : f5355b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m7440c(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b & 240) >>> 4];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: d */
    public static String m7441d(byte[] bArr) {
        return new String(m7438a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m7442e(String str) {
        return TextUtils.isEmpty(str) ? "" : m7441d(m7443f(str.getBytes()));
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m7443f(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return null;
        }
    }
}
