package p153l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class xeg0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f193933a = new byte[4096];

    /* JADX INFO: renamed from: a */
    public static int m210676a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 < 0 || i < 0 || i2 + i > bArr.length) {
            onl.m168333a();
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
    public static long m210677b(InputStream inputStream, long j) throws IOException {
        int iM210676a;
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip == 0) {
                break;
            }
            j2 -= jSkip;
        }
        while (j2 > 0 && (iM210676a = m210676a(inputStream, f193933a, 0, (int) Math.min(j2, 4096L))) >= 1) {
            j2 -= (long) iM210676a;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: c */
    public static void m210678c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m210679d(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
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
        vg3.m201207a();
    }
}
