package p149l;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class gq3 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SoftReference<byte[]>> f103874a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final Class<?> f103875b;

    /* JADX INFO: renamed from: c */
    public static final long f103876c;

    static {
        Class<?> clsM127511e = m127511e("java.io.FileOutputStream");
        f103875b = clsM127511e;
        f103876c = m127508b(clsM127511e);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m127507a() {
        SoftReference<byte[]> softReference = f103874a.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: b */
    public static long m127508b(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (ipj0.m137496G()) {
                return ipj0.m137498I(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m127509c(int i) {
        int iMax = Math.max(i, 1024);
        byte[] bArrM127507a = m127507a();
        if (bArrM127507a != null && !m127510d(iMax, bArrM127507a.length)) {
            return bArrM127507a;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            m127512f(bArr);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m127510d(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * 0.5f;
    }

    /* JADX INFO: renamed from: e */
    public static Class<?> m127511e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m127512f(byte[] bArr) {
        f103874a.set(new SoftReference<>(bArr));
    }

    /* JADX INFO: renamed from: g */
    public static void m127513g(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!m127514h(byteBuffer, outputStream)) {
                byte[] bArrM127509c = m127509c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrM127509c.length);
                    byteBuffer.get(bArrM127509c, 0, iMin);
                    outputStream.write(bArrM127509c, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m127514h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j = f103876c;
        if (j < 0 || !f103875b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) ipj0.m137494E(outputStream, j);
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
