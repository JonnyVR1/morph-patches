package p153l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public final class fr3 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f100393a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static byte[] m126862a() {
        SoftReference<byte[]> softReference = f100393a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m126863b(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrM126862a = m126862a();
        if (bArrM126862a != null && !m126864c(iMax, bArrM126862a.length)) {
            return bArrM126862a;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            m126865d(bArr);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m126864c(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* JADX INFO: renamed from: d */
    public static void m126865d(byte[] bArr) {
        f100393a.set(new SoftReference<>(bArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m126866e(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (outputStream instanceof FileOutputStream) {
                ((FileOutputStream) outputStream).getChannel().write(byteBuffer);
            } else {
                byte[] bArrM126863b = m126863b(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrM126863b.length);
                    byteBuffer.get(bArrM126863b, 0, iMin);
                    outputStream.write(bArrM126863b, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }
}
