package com.tantanapp.media.ttmediautils.common;

import com.tantanapp.media.ttmediautils.log.SLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes12.dex */
public class MD5Utils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static String byteArrayToHex(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
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

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                SLog.printStackTrace(e);
            }
        }
    }

    public static String digest(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            SLog.printStackTrace(e);
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

    public static String digest2(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i += 2;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (NoSuchAlgorithmException e) {
            SLog.printStackTrace(e);
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0024: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:37), block:B:13:0x0024 */
    public static String getFileMD5(File file) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        if (!file.isFile()) {
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
                        SLog.printStackTrace(e);
                        closeQuietly(fileInputStream);
                        return null;
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        SLog.printStackTrace(e);
                        closeQuietly(fileInputStream);
                        return null;
                    }
                }
                closeQuietly(fileInputStream);
                if (messageDigest == null) {
                    return null;
                }
                return toHexString(messageDigest.digest());
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                closeQuietly(closeable2);
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
            closeQuietly(closeable2);
            throw th;
        }
    }

    public static String getStringMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return byteArrayToHex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            SLog.printStackTrace(e);
            return str;
        }
    }

    public static final String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(b & 240) >> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static String digest(String str) {
        if (str == null) {
            return null;
        }
        return digest(str.getBytes());
    }
}
