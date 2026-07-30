package com.alibaba.sdk.android.oss.common.utils;

import android.util.Base64;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.ByteString;
import p153l.azk0;

/* JADX INFO: loaded from: classes.dex */
public class BinaryUtil {
    public static String calculateBase64Md5(byte[] bArr) {
        return toBase64String(calculateMd5(bArr));
    }

    public static byte[] calculateMd5(String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[10240];
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i);
            }
        } catch (NoSuchAlgorithmException unused) {
            azk0.m101074a("MD5 algorithm not found.");
            return null;
        }
    }

    public static String calculateMd5Str(byte[] bArr) {
        return getMd5StrFromBytes(calculateMd5(bArr));
    }

    public static byte[] calculateSha256(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            azk0.m101074a("SHA-256 algorithm not found.");
            return null;
        }
    }

    private static String convertHashToString(byte[] bArr) {
        String strConcat = "";
        for (byte b : bArr) {
            strConcat = strConcat.concat(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return strConcat.toLowerCase();
    }

    public static String fileToSHA1(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                }
                String strConvertHashToString = convertHashToString(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strConvertHashToString;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused4) {
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

    public static byte[] fromBase64String(String str) {
        return Base64.decode(str, 0);
    }

    public static String getMd5StrFromBytes(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static String toBase64String(byte[] bArr) {
        return new String(Base64.encode(bArr, 0)).trim();
    }

    public static String toHex(byte[] bArr) {
        return ByteString.m222317of(bArr).hex();
    }

    public static String calculateBase64Md5(String str) throws IOException {
        return toBase64String(calculateMd5(str));
    }

    public static String calculateMd5Str(String str) throws IOException {
        return getMd5StrFromBytes(calculateMd5(str));
    }

    public static String calculateBase64Md5(FileDescriptor fileDescriptor) throws IOException {
        return toBase64String(calculateMd5(fileDescriptor));
    }

    public static String calculateMd5Str(FileDescriptor fileDescriptor) throws IOException {
        return getMd5StrFromBytes(calculateMd5(fileDescriptor));
    }

    public static byte[] calculateMd5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            azk0.m101074a("MD5 algorithm not found.");
            return null;
        }
    }

    public static byte[] calculateMd5(FileDescriptor fileDescriptor) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[10240];
            FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    fileInputStream.close();
                    return messageDigest.digest();
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            azk0.m101074a("MD5 algorithm not found.");
            return null;
        }
    }

    public static String fileToSHA1(FileDescriptor fileDescriptor) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
            try {
                byte[] bArr = new byte[1024];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                }
                String strConvertHashToString = convertHashToString(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strConvertHashToString;
            } catch (Exception unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused4) {
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
