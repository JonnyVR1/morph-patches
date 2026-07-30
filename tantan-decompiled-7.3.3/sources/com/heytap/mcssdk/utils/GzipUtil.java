package com.heytap.mcssdk.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class GzipUtil {
    private static final int IO_BUF_SIZE = 1024;

    /* JADX WARN: Code duplicated, block: B:36:0x0062 A[Catch: IOException -> 0x0066, TryCatch #3 {IOException -> 0x0066, blocks: (B:34:0x005d, B:36:0x0062, B:39:0x0068), top: B:46:0x005d }] */
    public static byte[] compress(String str) throws Throwable {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        IOException e;
        if (str == null || str.length() == 0) {
            return "".getBytes();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        OutputStream outputStream = null;
        try {
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = byteArrayInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            gZIPOutputStream.write(bArr, 0, i);
                            gZIPOutputStream.flush();
                        }
                        byteArrayInputStream.close();
                        gZIPOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.m18544e(e);
                        byteArrayInputStream.close();
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        byteArrayInputStream.close();
                        if (0 != 0) {
                            outputStream.close();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                gZIPOutputStream = null;
                e = e4;
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream.close();
                if (0 != 0) {
                    outputStream.close();
                }
                byteArrayOutputStream.close();
                throw th;
            }
            byteArrayOutputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String uncompress(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        IOException e;
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = gZIPInputStream.read(bArr2);
                            if (i <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                            byteArrayOutputStream.flush();
                        }
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        LogUtil.m18544e(e);
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                gZIPInputStream = null;
                e = e4;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                throw th;
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
