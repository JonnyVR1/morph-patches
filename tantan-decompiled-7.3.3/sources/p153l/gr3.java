package p153l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class gr3 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f105998a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f105999b;

    /* JADX INFO: renamed from: c */
    public static final long f106000c;

    static {
        Class<?> clsM131528e = m131528e("java.io.FileOutputStream");
        f105999b = clsM131528e;
        f106000c = m131525b(clsM131528e);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m131524a() {
        SoftReference<byte[]> softReference = f105998a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static long m131525b(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (lyj0.m156301G()) {
                return lyj0.m156303I(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m131526c(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrM131524a = m131524a();
        if (bArrM131524a != null && !m131527d(iMax, bArrM131524a.length)) {
            return bArrM131524a;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            m131529f(bArr);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m131527d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* JADX INFO: renamed from: e */
    public static Class<?> m131528e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m131529f(byte[] bArr) {
        f105998a.set(new SoftReference<>(bArr));
    }

    /* JADX INFO: renamed from: g */
    public static void m131530g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m131531h(byteBuffer, outputStream)) {
                byte[] bArrM131526c = m131526c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrM131526c.length);
                    byteBuffer.get(bArrM131526c, 0, iMin);
                    outputStream.write(bArrM131526c, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m131531h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f106000c;
        if (j < 0 || !f105999b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) lyj0.m156299E(outputStream, j);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
