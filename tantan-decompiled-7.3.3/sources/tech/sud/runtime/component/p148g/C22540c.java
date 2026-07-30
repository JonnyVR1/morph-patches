package tech.sud.runtime.component.p148g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.c */
/* JADX INFO: loaded from: classes3.dex */
class C22540c {

    /* JADX INFO: renamed from: a */
    private static int f208679a = 4096;

    /* JADX INFO: renamed from: b */
    private static int f208680b = -1;

    /* JADX INFO: renamed from: a */
    public static long m223073a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            int i = f208680b;
            int i2 = inputStream.read(bArr);
            if (i == i2) {
                return j;
            }
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m223075b(InputStream inputStream, OutputStream outputStream) {
        return m223073a(inputStream, outputStream, new byte[f208679a]);
    }

    /* JADX INFO: renamed from: a */
    public static int m223072a(InputStream inputStream, OutputStream outputStream) {
        long jM223075b = m223075b(inputStream, outputStream);
        if (jM223075b > 2147483647L) {
            return -1;
        }
        return (int) jM223075b;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m223074a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m223072a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
