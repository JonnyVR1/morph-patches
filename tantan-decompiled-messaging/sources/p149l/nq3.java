package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class nq3 {

    /* JADX INFO: renamed from: a */
    public static final OutputStream f140027a = new C18748a();

    /* JADX INFO: renamed from: a */
    public static long m160554a(InputStream inputStream, OutputStream outputStream) throws IOException {
        sf80.m183894p(inputStream);
        sf80.m183894p(outputStream);
        byte[] bArrM160555b = m160555b();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrM160555b);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrM160555b, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m160555b() {
        return new byte[8192];
    }

    /* JADX INFO: renamed from: l.nq3$a */
    public class C18748a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            sf80.m183894p(bArr);
            sf80.m183899u(i, i2 + i, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            sf80.m183894p(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }
}
