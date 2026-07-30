package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public final class bht0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @GuardedBy("DeviceId.class")
    public static String f76815a;

    /* JADX INFO: renamed from: a */
    public static synchronized String m104368a(Context context) {
        try {
            if (f76815a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || ert0.m122288a(true)) {
                    string = "emulator";
                }
                f76815a = m104369b(string);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f76815a;
    }

    /* JADX INFO: renamed from: b */
    public static String m104369b(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
