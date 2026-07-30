package p149l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final class hpj0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f108931a = m132351j();

    /* JADX INFO: renamed from: b */
    public static final boolean f108932b = m132356o();

    /* JADX INFO: renamed from: c */
    public static final boolean f108933c = m132355n();

    /* JADX INFO: renamed from: d */
    public static final long f108934d = m132343b();

    /* JADX INFO: renamed from: e */
    public static final long f108935e = m132345d(m132344c(Buffer.class, PlaceTypes.ADDRESS));

    /* JADX INFO: renamed from: l.hpj0$a */
    public static class C17368a implements PrivilegedExceptionAction<Unsafe> {
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
    public static long m132342a(ByteBuffer byteBuffer) {
        return f108931a.getLong(byteBuffer, f108935e);
    }

    /* JADX INFO: renamed from: b */
    public static int m132343b() {
        if (f108933c) {
            return f108931a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static Field m132344c(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m132345d(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f108931a) == null) {
            return -1L;
        }
        return unsafe.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: e */
    public static long m132346e() {
        return f108934d;
    }

    /* JADX INFO: renamed from: f */
    public static byte m132347f(long j) {
        return f108931a.getByte(j);
    }

    /* JADX INFO: renamed from: g */
    public static byte m132348g(byte[] bArr, long j) {
        return f108931a.getByte(bArr, j);
    }

    /* JADX INFO: renamed from: h */
    public static long m132349h(long j) {
        return f108931a.getLong(j);
    }

    /* JADX INFO: renamed from: i */
    public static long m132350i(byte[] bArr, long j) {
        return f108931a.getLong(bArr, j);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m132351j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C17368a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m132352k() {
        return f108933c;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m132353l() {
        return f108932b;
    }

    /* JADX INFO: renamed from: m */
    public static void m132354m(byte[] bArr, long j, byte b) {
        f108931a.putByte(bArr, j, b);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m132355n() {
        Unsafe unsafe = f108931a;
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
    public static boolean m132356o() {
        Unsafe unsafe = f108931a;
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
