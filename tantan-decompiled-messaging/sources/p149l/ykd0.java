package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class ykd0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f198744a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    private static final char[] f198745b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static char[] m215121a(byte[] bArr) {
        return m215122b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static char[] m215122b(byte[] bArr, boolean z) {
        return m215123c(bArr, z ? f198744a : f198745b);
    }

    /* JADX INFO: renamed from: c */
    public static char[] m215123c(byte[] bArr, char[] cArr) {
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
    public static String m215124d(byte[] bArr) {
        return new String(m215121a(bArr));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0021: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:34), block:B:9:0x0021 */
    /* JADX INFO: renamed from: e */
    public static String m215125e(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    byte[] bArr = new byte[10240];
                    for (int i = fileInputStream.read(bArr, 0, 10240); i > -1; i = fileInputStream.read(bArr, 0, 10240)) {
                        messageDigest.update(bArr, 0, i);
                    }
                    String strM215124d = m215124d(messageDigest.digest());
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    return strM215124d;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
    }
}
