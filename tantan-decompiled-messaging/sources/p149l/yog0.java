package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public abstract class yog0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f199291a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final char[] f199292b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    /* JADX WARN: Code duplicated, block: B:28:0x003d A[Catch: IOException -> 0x002a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x002a, blocks: (B:10:0x0026, B:28:0x003d), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m215498a(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrDigest = null;
        bArrDigest = null;
        bArrDigest = null;
        FileInputStream fileInputStream2 = null;
        bArrDigest = null;
        try {
            if (file != null) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("MD5"));
                        while (digestInputStream.read(new byte[262144]) > 0) {
                        }
                        bArrDigest = digestInputStream.getMessageDigest().digest();
                        fileInputStream.close();
                    } catch (IOException e) {
                        e = e;
                        try {
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return m215500c(bArrDigest, true);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return m215500c(bArrDigest, true);
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream = null;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return m215500c(bArrDigest, true);
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    fileInputStream = null;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return m215500c(bArrDigest, true);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        return m215500c(bArrDigest, true);
    }

    /* JADX INFO: renamed from: b */
    public static String m215499b(String str) {
        try {
            return m215500c(MessageDigest.getInstance("md5").digest(str.getBytes()), false);
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m215500c(byte[] bArr, boolean z) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z ? f199291a : f199292b;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
