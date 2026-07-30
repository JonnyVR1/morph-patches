package p153l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final class kyj0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f129322a = m151989j();

    /* JADX INFO: renamed from: b */
    public static final boolean f129323b = m151994o();

    /* JADX INFO: renamed from: c */
    public static final boolean f129324c = m151993n();

    /* JADX INFO: renamed from: d */
    public static final long f129325d = m151981b();

    /* JADX INFO: renamed from: e */
    public static final long f129326e = m151983d(m151982c(Buffer.class, PlaceTypes.ADDRESS));

    /* JADX INFO: renamed from: l.kyj0$a */
    public static class C18305a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m151980a(ByteBuffer byteBuffer) {
        return f129322a.getLong(byteBuffer, f129326e);
    }

    /* JADX INFO: renamed from: b */
    public static int m151981b() {
        if (f129324c) {
            return f129322a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static Field m151982c(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m151983d(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f129322a) == null) {
            return -1L;
        }
        return unsafe.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: e */
    public static long m151984e() {
        return f129325d;
    }

    /* JADX INFO: renamed from: f */
    public static byte m151985f(long j) {
        return f129322a.getByte(j);
    }

    /* JADX INFO: renamed from: g */
    public static byte m151986g(byte[] bArr, long j) {
        return f129322a.getByte(bArr, j);
    }

    /* JADX INFO: renamed from: h */
    public static long m151987h(long j) {
        return f129322a.getLong(j);
    }

    /* JADX INFO: renamed from: i */
    public static long m151988i(byte[] bArr, long j) {
        return f129322a.getLong(bArr, j);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m151989j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C18305a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m151990k() {
        return f129324c;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m151991l() {
        return f129323b;
    }

    /* JADX INFO: renamed from: m */
    public static void m151992m(byte[] bArr, long j, byte b) {
        f129322a.putByte(bArr, j, b);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m151993n() {
        Unsafe unsafe = f129322a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("arrayBaseOffset", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m151994o() {
        Unsafe unsafe = f129322a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
