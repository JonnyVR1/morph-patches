package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes10.dex */
public final class t5l {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static byte[] m189403a(String str, String str2) {
        return m189404b(str, str2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static byte[] m189404b(String str, String str2, @Nullable String str3) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            if (!TextUtils.isEmpty(str3)) {
                messageDigest.update(str3.getBytes());
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static byte[] m189405c(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m189406d(String str, String str2, String str3, String str4, String str5) {
        try {
            byte[] bArrM189404b = m189404b(str4 + str + str2 + str3, "SHA-256", str5);
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            byte[] bytes = sb.reverse().toString().getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length + bArrM189404b.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(bArrM189404b, 0, bArr, bytes.length, bArrM189404b.length);
            return te2.m190678c(m189405c(bArr, "SHA-1"), 2);
        } catch (UnsupportedEncodingException | NullPointerException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
