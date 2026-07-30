package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class kiw {

    /* JADX INFO: renamed from: a */
    public static char[] f127048a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<MessageDigest> f127049b = new C18172a();

    /* JADX INFO: renamed from: l.kiw$a */
    public class C18172a extends ThreadLocal<MessageDigest> {
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
    public static void m149976a(byte b, StringBuffer stringBuffer) {
        char[] cArr = f127048a;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    /* JADX INFO: renamed from: b */
    public static String m149977b(byte[] bArr) {
        return m149978c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static String m149978c(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            m149976a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m149979d(File file) throws Throwable {
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
                        m1m.m156698a(fileInputStream);
                        return null;
                    } catch (NoSuchAlgorithmException unused2) {
                        m1m.m156698a(fileInputStream);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        m1m.m156698a(fileInputStream2);
                        throw th;
                    }
                }
                m1m.m156698a(fileInputStream);
                if (messageDigest == null) {
                    return null;
                }
                return m149981f(messageDigest.digest());
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
    public static String m149980e(String str) {
        return m149981f(str.getBytes());
    }

    /* JADX INFO: renamed from: f */
    public static String m149981f(byte[] bArr) {
        MessageDigest messageDigest = f127049b.get();
        if (messageDigest != null) {
            return m149977b(messageDigest.digest(bArr));
        }
        return null;
    }
}
