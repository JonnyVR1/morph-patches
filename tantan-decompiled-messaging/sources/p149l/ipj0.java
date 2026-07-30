package p149l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ipj0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f114302a = Logger.getLogger(ipj0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f114303b = m137495F();

    /* JADX INFO: renamed from: c */
    public static final Class<?> f114304c = wn0.m204553b();

    /* JADX INFO: renamed from: d */
    public static final boolean f114305d = m137526o(Long.TYPE);

    /* JADX INFO: renamed from: e */
    public static final boolean f114306e = m137526o(Integer.TYPE);

    /* JADX INFO: renamed from: f */
    public static final AbstractC17604e f114307f = m137493D();

    /* JADX INFO: renamed from: g */
    public static final boolean f114308g = m137511V();

    /* JADX INFO: renamed from: h */
    public static final boolean f114309h = m137510U();

    /* JADX INFO: renamed from: i */
    public static final long f114310i;

    /* JADX INFO: renamed from: j */
    public static final long f114311j;

    /* JADX INFO: renamed from: k */
    public static final long f114312k;

    /* JADX INFO: renamed from: l */
    public static final long f114313l;

    /* JADX INFO: renamed from: m */
    public static final long f114314m;

    /* JADX INFO: renamed from: n */
    public static final long f114315n;

    /* JADX INFO: renamed from: o */
    public static final long f114316o;

    /* JADX INFO: renamed from: p */
    public static final long f114317p;

    /* JADX INFO: renamed from: q */
    public static final long f114318q;

    /* JADX INFO: renamed from: r */
    public static final long f114319r;

    /* JADX INFO: renamed from: s */
    public static final long f114320s;

    /* JADX INFO: renamed from: t */
    public static final long f114321t;

    /* JADX INFO: renamed from: u */
    public static final long f114322u;

    /* JADX INFO: renamed from: v */
    public static final long f114323v;

    /* JADX INFO: renamed from: w */
    public static final int f114324w;

    /* JADX INFO: renamed from: x */
    public static final boolean f114325x;

    /* JADX INFO: renamed from: l.ipj0$a */
    public static class C17600a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: l.ipj0$b */
    public static final class C17601b extends AbstractC17604e {
        public C17601b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: c */
        public void mo137539c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: d */
        public boolean mo137540d(Object obj, long j) {
            return ipj0.f114325x ? ipj0.m137530s(obj, j) : ipj0.m137531t(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: e */
        public byte mo137541e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: f */
        public byte mo137542f(Object obj, long j) {
            return ipj0.f114325x ? ipj0.m137534w(obj, j) : ipj0.m137535x(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: g */
        public double mo137543g(Object obj, long j) {
            return Double.longBitsToDouble(m137553k(obj, j));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: h */
        public float mo137544h(Object obj, long j) {
            return Float.intBitsToFloat(m137552i(obj, j));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: j */
        public long mo137545j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: n */
        public void mo137546n(Object obj, long j, boolean z) {
            if (ipj0.f114325x) {
                ipj0.m137500K(obj, j, z);
            } else {
                ipj0.m137501L(obj, j, z);
            }
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: o */
        public void mo137547o(Object obj, long j, byte b) {
            if (ipj0.f114325x) {
                ipj0.m137503N(obj, j, b);
            } else {
                ipj0.m137504O(obj, j, b);
            }
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: p */
        public void mo137548p(Object obj, long j, double d) {
            m137557s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: q */
        public void mo137549q(Object obj, long j, float f) {
            m137556r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: renamed from: l.ipj0$c */
    public static final class C17602c extends AbstractC17604e {
        public C17602c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: c */
        public void mo137539c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: d */
        public boolean mo137540d(Object obj, long j) {
            return ipj0.f114325x ? ipj0.m137530s(obj, j) : ipj0.m137531t(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: e */
        public byte mo137541e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: f */
        public byte mo137542f(Object obj, long j) {
            return ipj0.f114325x ? ipj0.m137534w(obj, j) : ipj0.m137535x(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: g */
        public double mo137543g(Object obj, long j) {
            return Double.longBitsToDouble(m137553k(obj, j));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: h */
        public float mo137544h(Object obj, long j) {
            return Float.intBitsToFloat(m137552i(obj, j));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: j */
        public long mo137545j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: n */
        public void mo137546n(Object obj, long j, boolean z) {
            if (ipj0.f114325x) {
                ipj0.m137500K(obj, j, z);
            } else {
                ipj0.m137501L(obj, j, z);
            }
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: o */
        public void mo137547o(Object obj, long j, byte b) {
            if (ipj0.f114325x) {
                ipj0.m137503N(obj, j, b);
            } else {
                ipj0.m137504O(obj, j, b);
            }
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: p */
        public void mo137548p(Object obj, long j, double d) {
            m137557s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: q */
        public void mo137549q(Object obj, long j, float f) {
            m137556r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: renamed from: l.ipj0$d */
    public static final class C17603d extends AbstractC17604e {
        public C17603d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: c */
        public void mo137539c(long j, byte[] bArr, long j2, long j3) {
            this.f114326a.copyMemory((Object) null, j, bArr, ipj0.f114310i + j2, j3);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: d */
        public boolean mo137540d(Object obj, long j) {
            return this.f114326a.getBoolean(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: e */
        public byte mo137541e(long j) {
            return this.f114326a.getByte(j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: f */
        public byte mo137542f(Object obj, long j) {
            return this.f114326a.getByte(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: g */
        public double mo137543g(Object obj, long j) {
            return this.f114326a.getDouble(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: h */
        public float mo137544h(Object obj, long j) {
            return this.f114326a.getFloat(obj, j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: j */
        public long mo137545j(long j) {
            return this.f114326a.getLong(j);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: n */
        public void mo137546n(Object obj, long j, boolean z) {
            this.f114326a.putBoolean(obj, j, z);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: o */
        public void mo137547o(Object obj, long j, byte b) {
            this.f114326a.putByte(obj, j, b);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: p */
        public void mo137548p(Object obj, long j, double d) {
            this.f114326a.putDouble(obj, j, d);
        }

        @Override // p149l.ipj0.AbstractC17604e
        /* JADX INFO: renamed from: q */
        public void mo137549q(Object obj, long j, float f) {
            this.f114326a.putFloat(obj, j, f);
        }
    }

    /* JADX INFO: renamed from: l.ipj0$e */
    public static abstract class AbstractC17604e {

        /* JADX INFO: renamed from: a */
        public Unsafe f114326a;

        public AbstractC17604e(Unsafe unsafe) {
            this.f114326a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m137550a(Class<?> cls) {
            return this.f114326a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m137551b(Class<?> cls) {
            return this.f114326a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo137539c(long j, byte[] bArr, long j2, long j3);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo137540d(Object obj, long j);

        /* JADX INFO: renamed from: e */
        public abstract byte mo137541e(long j);

        /* JADX INFO: renamed from: f */
        public abstract byte mo137542f(Object obj, long j);

        /* JADX INFO: renamed from: g */
        public abstract double mo137543g(Object obj, long j);

        /* JADX INFO: renamed from: h */
        public abstract float mo137544h(Object obj, long j);

        /* JADX INFO: renamed from: i */
        public final int m137552i(Object obj, long j) {
            return this.f114326a.getInt(obj, j);
        }

        /* JADX INFO: renamed from: j */
        public abstract long mo137545j(long j);

        /* JADX INFO: renamed from: k */
        public final long m137553k(Object obj, long j) {
            return this.f114326a.getLong(obj, j);
        }

        /* JADX INFO: renamed from: l */
        public final Object m137554l(Object obj, long j) {
            return this.f114326a.getObject(obj, j);
        }

        /* JADX INFO: renamed from: m */
        public final long m137555m(Field field) {
            return this.f114326a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo137546n(Object obj, long j, boolean z);

        /* JADX INFO: renamed from: o */
        public abstract void mo137547o(Object obj, long j, byte b);

        /* JADX INFO: renamed from: p */
        public abstract void mo137548p(Object obj, long j, double d);

        /* JADX INFO: renamed from: q */
        public abstract void mo137549q(Object obj, long j, float f);

        /* JADX INFO: renamed from: r */
        public final void m137556r(Object obj, long j, int i) {
            this.f114326a.putInt(obj, j, i);
        }

        /* JADX INFO: renamed from: s */
        public final void m137557s(Object obj, long j, long j2) {
            this.f114326a.putLong(obj, j, j2);
        }

        /* JADX INFO: renamed from: t */
        public final void m137558t(Object obj, long j, Object obj2) {
            this.f114326a.putObject(obj, j, obj2);
        }
    }

    static {
        long jM137522k = m137522k(byte[].class);
        f114310i = jM137522k;
        f114311j = m137522k(boolean[].class);
        f114312k = m137523l(boolean[].class);
        f114313l = m137522k(int[].class);
        f114314m = m137523l(int[].class);
        f114315n = m137522k(long[].class);
        f114316o = m137523l(long[].class);
        f114317p = m137522k(float[].class);
        f114318q = m137523l(float[].class);
        f114319r = m137522k(double[].class);
        f114320s = m137523l(double[].class);
        f114321t = m137522k(Object[].class);
        f114322u = m137523l(Object[].class);
        f114323v = m137528q(m137524m());
        f114324w = (int) (jM137522k & 7);
        f114325x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static int m137490A(Object obj, long j) {
        return f114307f.m137552i(obj, j);
    }

    /* JADX INFO: renamed from: B */
    public static long m137491B(long j) {
        return f114307f.mo137545j(j);
    }

    /* JADX INFO: renamed from: C */
    public static long m137492C(Object obj, long j) {
        return f114307f.m137553k(obj, j);
    }

    /* JADX INFO: renamed from: D */
    public static AbstractC17604e m137493D() {
        Unsafe unsafe = f114303b;
        if (unsafe == null) {
            return null;
        }
        if (!wn0.m204554c()) {
            return new C17603d(unsafe);
        }
        if (f114305d) {
            return new C17602c(unsafe);
        }
        if (f114306e) {
            return new C17601b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static Object m137494E(Object obj, long j) {
        return f114307f.m137554l(obj, j);
    }

    /* JADX INFO: renamed from: F */
    public static Unsafe m137495F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C17600a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m137496G() {
        return f114309h;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m137497H() {
        return f114308g;
    }

    /* JADX INFO: renamed from: I */
    public static long m137498I(Field field) {
        return f114307f.m137555m(field);
    }

    /* JADX INFO: renamed from: J */
    public static void m137499J(Object obj, long j, boolean z) {
        f114307f.mo137546n(obj, j, z);
    }

    /* JADX INFO: renamed from: K */
    public static void m137500K(Object obj, long j, boolean z) {
        m137503N(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: L */
    public static void m137501L(Object obj, long j, boolean z) {
        m137504O(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: M */
    public static void m137502M(byte[] bArr, long j, byte b) {
        f114307f.mo137547o(bArr, f114310i + j, b);
    }

    /* JADX INFO: renamed from: N */
    public static void m137503N(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM137490A = m137490A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m137507R(obj, j2, ((255 & b) << i) | (iM137490A & (~(255 << i))));
    }

    /* JADX INFO: renamed from: O */
    public static void m137504O(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m137507R(obj, j2, ((255 & b) << i) | (m137490A(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: P */
    public static void m137505P(Object obj, long j, double d) {
        f114307f.mo137548p(obj, j, d);
    }

    /* JADX INFO: renamed from: Q */
    public static void m137506Q(Object obj, long j, float f) {
        f114307f.mo137549q(obj, j, f);
    }

    /* JADX INFO: renamed from: R */
    public static void m137507R(Object obj, long j, int i) {
        f114307f.m137556r(obj, j, i);
    }

    /* JADX INFO: renamed from: S */
    public static void m137508S(Object obj, long j, long j2) {
        f114307f.m137557s(obj, j, j2);
    }

    /* JADX INFO: renamed from: T */
    public static void m137509T(Object obj, long j, Object obj2) {
        f114307f.m137558t(obj, j, obj2);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m137510U() {
        Unsafe unsafe = f114303b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (wn0.m204554c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f114302a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* JADX INFO: renamed from: V */
    public static boolean m137511V() {
        Unsafe unsafe = f114303b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m137524m() == null) {
                return false;
            }
            if (wn0.m204554c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f114302a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m137520i(ByteBuffer byteBuffer) {
        return f114307f.m137553k(byteBuffer, f114323v);
    }

    /* JADX INFO: renamed from: j */
    public static <T> T m137521j(Class<T> cls) {
        try {
            return (T) f114303b.allocateInstance(cls);
        } catch (InstantiationException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m137522k(Class<?> cls) {
        if (f114309h) {
            return f114307f.m137550a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m137523l(Class<?> cls) {
        if (f114309h) {
            return f114307f.m137551b(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static Field m137524m() {
        Field fieldM137527p;
        if (wn0.m204554c() && (fieldM137527p = m137527p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM137527p;
        }
        Field fieldM137527p2 = m137527p(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM137527p2 == null || fieldM137527p2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM137527p2;
    }

    /* JADX INFO: renamed from: n */
    public static void m137525n(long j, byte[] bArr, long j2, long j3) {
        f114307f.mo137539c(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m137526o(Class<?> cls) {
        if (!wn0.m204554c()) {
            return false;
        }
        try {
            Class<?> cls2 = f114304c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Field m137527p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static long m137528q(Field field) {
        AbstractC17604e abstractC17604e;
        if (field == null || (abstractC17604e = f114307f) == null) {
            return -1L;
        }
        return abstractC17604e.m137555m(field);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m137529r(Object obj, long j) {
        return f114307f.mo137540d(obj, j);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m137530s(Object obj, long j) {
        return m137534w(obj, j) != 0;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m137531t(Object obj, long j) {
        return m137535x(obj, j) != 0;
    }

    /* JADX INFO: renamed from: u */
    public static byte m137532u(long j) {
        return f114307f.mo137541e(j);
    }

    /* JADX INFO: renamed from: v */
    public static byte m137533v(byte[] bArr, long j) {
        return f114307f.mo137542f(bArr, f114310i + j);
    }

    /* JADX INFO: renamed from: w */
    public static byte m137534w(Object obj, long j) {
        return (byte) ((m137490A(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: x */
    public static byte m137535x(Object obj, long j) {
        return (byte) ((m137490A(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: y */
    public static double m137536y(Object obj, long j) {
        return f114307f.mo137543g(obj, j);
    }

    /* JADX INFO: renamed from: z */
    public static float m137537z(Object obj, long j) {
        return f114307f.mo137544h(obj, j);
    }
}
