package com.alibaba.sdk.android.oss.common.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    private static final int BUFFER_SIZE = 4096;

    public static byte[] readStreamAsBytesArray(InputStream inputStream, int i) throws IOException {
        int i2;
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            long j2 = i;
            if (j >= j2 || (i2 = inputStream.read(bArr, 0, Math.min(2048, (int) (j2 - j)))) <= -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
        byteArrayOutputStream.flush();
        safeClose(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String readStreamAsString(InputStream inputStream, String str) throws Throwable {
        if (inputStream == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[4096];
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                try {
                    int i = bufferedReader2.read(cArr);
                    if (i <= 0) {
                        String string = stringWriter.toString();
                        safeClose(inputStream);
                        bufferedReader2.close();
                        stringWriter.close();
                        return string;
                    }
                    stringWriter.write(cArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    safeClose(inputStream);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    stringWriter.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void safeClose(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readStreamAsBytesArray(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i > -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                safeClose(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
