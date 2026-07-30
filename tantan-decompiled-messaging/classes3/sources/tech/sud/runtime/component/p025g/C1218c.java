package tech.sud.runtime.component.p025g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1218c {

    /* JADX INFO: renamed from: a */
    private static int f11382a = 4096;

    /* JADX INFO: renamed from: b */
    private static int f11383b = -1;

    /* JADX INFO: renamed from: a */
    public static long m10298a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            int i = f11383b;
            int i2 = inputStream.read(bArr);
            if (i == i2) {
                return j;
            }
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m10300b(InputStream inputStream, OutputStream outputStream) {
        return m10298a(inputStream, outputStream, new byte[f11382a]);
    }

    /* JADX INFO: renamed from: a */
    public static int m10297a(InputStream inputStream, OutputStream outputStream) {
        long jM10300b = m10300b(inputStream, outputStream);
        if (jM10300b > 2147483647L) {
            return -1;
        }
        return (int) jM10300b;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m10299a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m10297a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
