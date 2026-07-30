package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes13.dex */
public class mgw {

    /* JADX INFO: renamed from: a */
    public static char[] f133740a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<MessageDigest> f133741b = new C18457a();

    /* JADX INFO: renamed from: l.mgw$a */
    public class C18457a extends ThreadLocal<MessageDigest> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m154576a(byte b, StringBuffer stringBuffer) {
        char[] cArr = f133740a;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    /* JADX INFO: renamed from: b */
    public static String m154577b(byte[] bArr) {
        return m154578c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static String m154578c(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            m154576a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m154579d(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file != null && file.exists() && file.length() != 0 && file.isFile()) {
            byte[] bArr = new byte[1024];
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
                    } catch (IOException unused) {
                        ryl.m181666a(fileInputStream);
                        return null;
                    } catch (NoSuchAlgorithmException unused2) {
                        ryl.m181666a(fileInputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        ryl.m181666a(fileInputStream2);
                        throw th;
                    }
                }
                ryl.m181666a(fileInputStream);
                if (messageDigest == null) {
                    return null;
                }
                return m154581f(messageDigest.digest());
            } catch (IOException unused3) {
                fileInputStream = null;
            } catch (NoSuchAlgorithmException unused4) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m154580e(String str) {
        return m154581f(str.getBytes());
    }

    /* JADX INFO: renamed from: f */
    public static String m154581f(byte[] bArr) {
        MessageDigest messageDigest = f133741b.get();
        if (messageDigest != null) {
            return m154577b(messageDigest.digest(bArr));
        }
        return null;
    }
}
