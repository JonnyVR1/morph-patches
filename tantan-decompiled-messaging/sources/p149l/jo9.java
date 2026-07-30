package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public class jo9 {

    /* JADX INFO: renamed from: a */
    public static final char[] f118923a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f118924b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m142417a(byte[] bArr) {
        return m142418b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m142418b(byte[] bArr, boolean z) {
        return m142419c(bArr, z ? f118923a : f118924b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m142419c(byte[] bArr, char[] cArr) {
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
    public static String m142420d(byte[] bArr) {
        return new String(m142417a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m142421e(String str) {
        return TextUtils.isEmpty(str) ? "" : m142420d(m142422f(str.getBytes()));
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m142422f(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return null;
        }
    }
}
