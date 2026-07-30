package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class ngw {

    /* JADX INFO: renamed from: a */
    private static final char[] f138915a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    private static final char[] f138916b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m159354a(byte[] bArr) {
        return m159355b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m159355b(byte[] bArr, boolean z) {
        return m159356c(bArr, z ? f138915a : f138916b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m159356c(byte[] bArr, char[] cArr) {
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
    public static String m159357d(byte[] bArr) {
        return new String(m159354a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m159358e(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[10240];
                for (int i = fileInputStream.read(bArr, 0, 10240); i > -1; i = fileInputStream.read(bArr, 0, 10240)) {
                    messageDigest.update(bArr, 0, i);
                }
                String strM159357d = m159357d(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return strM159357d;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m159359f(String str) {
        return TextUtils.isEmpty(str) ? "" : m159357d(m159360g(str.getBytes()));
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m159360g(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
