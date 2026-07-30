package p149l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class fq3 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f98760a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static byte[] m122685a() {
        SoftReference<byte[]> softReference = f98760a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m122686b(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrM122685a = m122685a();
        if (bArrM122685a != null && !m122687c(iMax, bArrM122685a.length)) {
            return bArrM122685a;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            m122688d(bArr);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m122687c(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* JADX INFO: renamed from: d */
    public static void m122688d(byte[] bArr) {
        f98760a.set(new SoftReference<>(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m122689e(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (outputStream instanceof FileOutputStream) {
                ((FileOutputStream) outputStream).getChannel().write(byteBuffer);
            } else {
                byte[] bArrM122686b = m122686b(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrM122686b.length);
                    byteBuffer.get(bArrM122686b, 0, iMin);
                    outputStream.write(bArrM122686b, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }
}
