package p149l;

import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes13.dex */
public class ogw {

    /* JADX INFO: renamed from: a */
    public static final char[] f143923a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final char[] f143924b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c */
    public static final char[] f143925c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m164280a(byte[] bArr, char[] cArr) {
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
    public static String m164281b(String str) {
        if (str == null) {
            return null;
        }
        return m164282c(str.getBytes());
    }

    /* JADX INFO: renamed from: c */
    public static String m164282c(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
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
    public static String m164283d(File file) throws Throwable {
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
                        CrashHelper.m81296c(e);
                        t95.m187604b(fileInputStream);
                        return null;
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        CrashHelper.m81296c(e);
                        t95.m187604b(fileInputStream);
                        return null;
                    }
                }
                t95.m187604b(fileInputStream);
                if (messageDigest == null) {
                    return null;
                }
                return m164286g(messageDigest.digest());
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                t95.m187604b(closeable2);
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
            t95.m187604b(closeable2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m164284e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m164280a(messageDigest.digest(), f143925c);
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m164285f(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m164280a(messageDigest.digest(), z ? f143924b : f143925c);
        } catch (NoSuchAlgorithmException e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m164286g(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f143923a;
            sb.append(cArr[(b & 240) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
