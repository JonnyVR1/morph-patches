package p149l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p6g0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f147404a = new byte[4096];

    /* JADX INFO: renamed from: a */
    public static int m167663a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            zkl.m219192a();
            return 0;
        }
        while (i3 != i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public static long m167664b(InputStream inputStream, long j) throws IOException {
        int iM167663a;
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0 && (iM167663a = m167663a(inputStream, f147404a, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= (long) iM167663a;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: c */
    public static void m167665c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m167666d(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i = 0;
        while (i < iRemaining) {
            int i2 = readableByteChannel.read(byteBuffer);
            if (i2 <= 0) {
                break;
            } else {
                i += i2;
            }
        }
        if (i >= iRemaining) {
            return;
        }
        hg3.m130807a();
    }
}
