package p009l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import l.le2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class d3l {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static byte[] m13000a(String str, String str2) {
        return m13001b(str, str2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static byte[] m13001b(String str, String str2, @Nullable String str3) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            if (!TextUtils.isEmpty(str3)) {
                messageDigest.update(str3.getBytes());
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static byte[] m13002c(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m13003d(String str, String str2, String str3, String str4, String str5) {
        try {
            byte[] bArrM13001b = m13001b(str4 + str + str2 + str3, "SHA-256", str5);
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            byte[] bytes = sb.reverse().toString().getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length + bArrM13001b.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(bArrM13001b, 0, bArr, bytes.length, bArrM13001b.length);
            return le2.c(m13002c(bArr, "SHA-1"), 2);
        } catch (UnsupportedEncodingException | NullPointerException e) {
            CrashHelper.c(e);
            return null;
        }
    }
}
