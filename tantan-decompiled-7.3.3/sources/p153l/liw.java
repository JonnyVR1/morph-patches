package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class liw {

    /* JADX INFO: renamed from: a */
    private static final char[] f132266a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    private static final char[] f132267b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m154416a(byte[] bArr) {
        return m154417b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m154417b(byte[] bArr, boolean z) {
        return m154418c(bArr, z ? f132266a : f132267b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m154418c(byte[] bArr, char[] cArr) {
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
    public static String m154419d(byte[] bArr) {
        return new String(m154416a(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static String m154420e(File file) throws Throwable {
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
                String strM154419d = m154419d(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return strM154419d;
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
}
