package p153l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class niw {

    /* JADX INFO: renamed from: a */
    public static final char[] f142173a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final char[] f142174b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c */
    public static final char[] f142175c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m163311a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: b */
    public static String m163312b(String str) {
        if (str == null) {
            return null;
        }
        return m163313c(str.getBytes());
    }

    /* JADX INFO: renamed from: c */
    public static String m163313c(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return "";
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < bArrDigest.length; i++) {
            int i2 = bArrDigest[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (i2 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i2));
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0036: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:55), block:B:19:0x0036 */
    /* JADX INFO: renamed from: d */
    public static String m163314d(File file) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        if (file == null || !file.exists() || file.length() == 0 || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr, 0, 1024);
                        if (i == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        CrashHelper.m82479c(e);
                        ua5.m195158b(fileInputStream);
                        return null;
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        CrashHelper.m82479c(e);
                        ua5.m195158b(fileInputStream);
                        return null;
                    }
                }
                ua5.m195158b(fileInputStream);
                if (messageDigest == null) {
                    return null;
                }
                return m163317g(messageDigest.digest());
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                ua5.m195158b(closeable2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            ua5.m195158b(closeable2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m163315e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m163311a(messageDigest.digest(), f142175c);
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m163316f(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m163311a(messageDigest.digest(), z ? f142174b : f142175c);
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m82479c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m163317g(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f142173a;
            sb.append(cArr[(b & 240) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
