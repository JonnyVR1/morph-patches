package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes13.dex */
public class v0t {

    /* JADX INFO: renamed from: a */
    public static final char[] f179140a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f179141b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m196507a(byte[] bArr) {
        return m196508b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m196508b(byte[] bArr, boolean z) {
        return m196509c(bArr, z ? f179140a : f179141b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m196509c(byte[] bArr, char[] cArr) {
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
    public static String m196510d(byte[] bArr) {
        return new String(m196507a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m196511e(String str) {
        return TextUtils.isEmpty(str) ? "" : m196510d(m196512f(str.getBytes()));
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m196512f(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }
}
