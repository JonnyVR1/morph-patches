package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes13.dex */
public class w2t {

    /* JADX INFO: renamed from: a */
    public static final char[] f186932a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f186933b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m204586a(byte[] bArr) {
        return m204587b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m204587b(byte[] bArr, boolean z) {
        return m204588c(bArr, z ? f186932a : f186933b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m204588c(byte[] bArr, char[] cArr) {
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
    public static String m204589d(byte[] bArr) {
        return new String(m204586a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m204590e(String str) {
        return TextUtils.isEmpty(str) ? "" : m204589d(m204591f(str.getBytes()));
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m204591f(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
