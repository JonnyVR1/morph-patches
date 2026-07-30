package p014rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class UnsafeAccess {
    private static final boolean DISABLED_BY_USER;
    public static final Unsafe UNSAFE;

    static {
        DISABLED_BY_USER = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        UNSAFE = unsafe;
    }

    private UnsafeAccess() {
        throw new IllegalStateException("No instances!");
    }

    public static long addressOf(Class<?> cls, String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }

    public static boolean compareAndSwapInt(Object obj, long j, int i, int i2) {
        return UNSAFE.compareAndSwapInt(obj, j, i, i2);
    }

    public static int getAndAddInt(Object obj, long j, int i) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j);
            Object obj2 = obj;
            long j2 = j;
            if (unsafe.compareAndSwapInt(obj2, j2, intVolatile, intVolatile + i)) {
                return intVolatile;
            }
            obj = obj2;
            j = j2;
        }
    }

    public static int getAndIncrementInt(Object obj, long j) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j);
            Object obj2 = obj;
            long j2 = j;
            if (unsafe.compareAndSwapInt(obj2, j2, intVolatile, intVolatile + 1)) {
                return intVolatile;
            }
            obj = obj2;
            j = j2;
        }
    }

    public static int getAndSetInt(Object obj, long j, int i) {
        while (true) {
            Unsafe unsafe = UNSAFE;
            int intVolatile = unsafe.getIntVolatile(obj, j);
            Object obj2 = obj;
            long j2 = j;
            int i2 = i;
            if (unsafe.compareAndSwapInt(obj2, j2, intVolatile, i2)) {
                return intVolatile;
            }
            obj = obj2;
            j = j2;
            i = i2;
        }
    }

    public static boolean isUnsafeAvailable() {
        return (UNSAFE == null || DISABLED_BY_USER) ? false : true;
    }
}
