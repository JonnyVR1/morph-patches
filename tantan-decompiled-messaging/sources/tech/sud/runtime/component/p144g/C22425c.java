package tech.sud.runtime.component.p144g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.c */
/* JADX INFO: loaded from: classes3.dex */
class C22425c {

    /* JADX INFO: renamed from: a */
    private static int f207757a = 4096;

    /* JADX INFO: renamed from: b */
    private static int f207758b = -1;

    /* JADX INFO: renamed from: a */
    public static long m221827a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            int i = f207758b;
            int i2 = inputStream.read(bArr);
            if (i == i2) {
                return j;
            }
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m221829b(InputStream inputStream, OutputStream outputStream) {
        return m221827a(inputStream, outputStream, new byte[f207757a]);
    }

    /* JADX INFO: renamed from: a */
    public static int m221826a(InputStream inputStream, OutputStream outputStream) {
        long jM221829b = m221829b(inputStream, outputStream);
        if (jM221829b > 2147483647L) {
            return -1;
        }
        return (int) jM221829b;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m221828a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m221826a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
