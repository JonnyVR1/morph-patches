package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class mr3 {

    /* JADX INFO: renamed from: a */
    public static final OutputStream f138296a = new C18683a();

    /* JADX INFO: renamed from: a */
    public static long m159619a(InputStream inputStream, OutputStream outputStream) throws IOException {
        xn80.m212111p(inputStream);
        xn80.m212111p(outputStream);
        byte[] bArrM159620b = m159620b();
        long j = 0;
        while (true) {
            int i = inputStream.read(bArrM159620b);
            if (i == -1) {
                return j;
            }
            outputStream.write(bArrM159620b, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m159620b() {
        return new byte[8192];
    }

    /* JADX INFO: renamed from: l.mr3$a */
    public class C18683a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            xn80.m212111p(bArr);
            xn80.m212116u(i, i2 + i, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            xn80.m212111p(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }
}
