package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public final class d3l {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static byte[] m109931a(String str, String str2) {
        return m109932b(str, str2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static byte[] m109932b(String str, String str2, @Nullable String str3) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            if (!TextUtils.isEmpty(str3)) {
                messageDigest.update(str3.getBytes());
            }
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static byte[] m109933c(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m109934d(String str, String str2, String str3, String str4, String str5) {
        try {
            byte[] bArrM109932b = m109932b(str4 + str + str2 + str3, "SHA-256", str5);
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            byte[] bytes = sb.reverse().toString().getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length + bArrM109932b.length];
            System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            System.arraycopy(bArrM109932b, 0, bArr, bytes.length, bArrM109932b.length);
            return le2.m149477c(m109933c(bArr, "SHA-1"), 2);
        } catch (UnsupportedEncodingException | NullPointerException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }
}
