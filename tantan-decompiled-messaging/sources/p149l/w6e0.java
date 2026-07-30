package p149l;

import android.text.TextUtils;
import com.immomo.mmutil.log.Log4Android;
import immomo.com.mklibrary.core.safety.MKUrlNotSafeException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/* JADX INFO: loaded from: classes2.dex */
public class w6e0 {
    /* JADX INFO: renamed from: a */
    private static String m201809a(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static void m201810b(String str) throws MKUrlNotSafeException {
        p2m p2mVarM184294n;
        if (!m201811c() || TextUtils.isEmpty(str) || (p2mVarM184294n = shw.m184294n()) == null || p2mVarM184294n.mo110236h(shw.m184286f(str))) {
            return;
        }
        throw new MKUrlNotSafeException(str + " not in whitelist");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m201811c() {
        p2m p2mVarM184294n = shw.m184294n();
        return p2mVarM184294n != null && p2mVarM184294n.mo110231c();
    }

    /* JADX INFO: renamed from: d */
    public static String m201812d(File file, int i) throws IOException, OutOfMemoryError {
        if (file == null || !file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    byte[] bArr = new byte[i];
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            String strM201809a = m201809a(messageDigest.digest());
                            fileInputStream.close();
                            return strM201809a;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                } catch (NoSuchAlgorithmException e) {
                    Log4Android.m18417f().m18422e(e);
                    fileInputStream.close();
                    return null;
                }
            } catch (OutOfMemoryError e2) {
                Log4Android.m18417f().m18422e(e2);
                throw e2;
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }
}
