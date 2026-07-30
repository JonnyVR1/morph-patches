package com.cosmos.photon.push.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    public static void closeAllQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeAllQuietly(closeable);
    }

    public static byte[] toByteArray(URL url) throws Exception {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        try {
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            inputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
            }
        }
    }

    public static String toString(InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                inputStream.close();
                return new String(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
