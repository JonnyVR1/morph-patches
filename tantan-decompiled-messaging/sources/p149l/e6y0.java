package p149l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class e6y0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f89653a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f89654b;

    /* JADX INFO: renamed from: c */
    public static final boolean f89655c;

    /* JADX INFO: renamed from: d */
    public static final boolean f89656d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC16552b f89657e;

    /* JADX INFO: renamed from: f */
    public static final boolean f89658f;

    /* JADX INFO: renamed from: g */
    public static final boolean f89659g;

    /* JADX INFO: renamed from: h */
    public static final long f89660h;

    /* JADX INFO: renamed from: i */
    public static final boolean f89661i;

    /* JADX INFO: renamed from: l.e6y0$a */
    public static final class C16551a extends AbstractC16552b {
        public C16551a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: a */
        public final double mo115154a(Object obj, long j) {
            return Double.longBitsToDouble(m115166m(obj, j));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: b */
        public final void mo115155b(Object obj, long j, byte b) {
            if (e6y0.f89661i) {
                e6y0.m115148u(obj, j, b);
            } else {
                e6y0.m115152y(obj, j, b);
            }
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: c */
        public final void mo115156c(Object obj, long j, double d) {
            m115162f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: d */
        public final void mo115157d(Object obj, long j, float f) {
            m115161e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: g */
        public final void mo115158g(Object obj, long j, boolean z) {
            if (e6y0.f89661i) {
                e6y0.m115138k(obj, j, z);
            } else {
                e6y0.m115145r(obj, j, z);
            }
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: i */
        public final float mo115159i(Object obj, long j) {
            return Float.intBitsToFloat(m115165l(obj, j));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: k */
        public final boolean mo115160k(Object obj, long j) {
            return e6y0.f89661i ? e6y0.m115125D(obj, j) : e6y0.m115126E(obj, j);
        }
    }

    /* JADX INFO: renamed from: l.e6y0$b */
    public static abstract class AbstractC16552b {

        /* JADX INFO: renamed from: a */
        public Unsafe f89662a;

        public AbstractC16552b(Unsafe unsafe) {
            this.f89662a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public abstract double mo115154a(Object obj, long j);

        /* JADX INFO: renamed from: b */
        public abstract void mo115155b(Object obj, long j, byte b);

        /* JADX INFO: renamed from: c */
        public abstract void mo115156c(Object obj, long j, double d);

        /* JADX INFO: renamed from: d */
        public abstract void mo115157d(Object obj, long j, float f);

        /* JADX INFO: renamed from: e */
        public final void m115161e(Object obj, long j, int i) {
            this.f89662a.putInt(obj, j, i);
        }

        /* JADX INFO: renamed from: f */
        public final void m115162f(Object obj, long j, long j2) {
            this.f89662a.putLong(obj, j, j2);
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo115158g(Object obj, long j, boolean z);

        /* JADX INFO: renamed from: h */
        public final boolean m115163h() {
            Unsafe unsafe = this.f89662a;
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
                return true;
            } catch (Throwable th) {
                e6y0.m115139l(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: i */
        public abstract float mo115159i(Object obj, long j);

        /* JADX INFO: renamed from: j */
        public final boolean m115164j() {
            Unsafe unsafe = this.f89662a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return e6y0.m115124C() != null;
            } catch (Throwable th) {
                e6y0.m115139l(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: k */
        public abstract boolean mo115160k(Object obj, long j);

        /* JADX INFO: renamed from: l */
        public final int m115165l(Object obj, long j) {
            return this.f89662a.getInt(obj, j);
        }

        /* JADX INFO: renamed from: m */
        public final long m115166m(Object obj, long j) {
            return this.f89662a.getLong(obj, j);
        }
    }

    /* JADX INFO: renamed from: l.e6y0$c */
    public static final class C16553c extends AbstractC16552b {
        public C16553c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: a */
        public final double mo115154a(Object obj, long j) {
            return Double.longBitsToDouble(m115166m(obj, j));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: b */
        public final void mo115155b(Object obj, long j, byte b) {
            if (e6y0.f89661i) {
                e6y0.m115148u(obj, j, b);
            } else {
                e6y0.m115152y(obj, j, b);
            }
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: c */
        public final void mo115156c(Object obj, long j, double d) {
            m115162f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: d */
        public final void mo115157d(Object obj, long j, float f) {
            m115161e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: g */
        public final void mo115158g(Object obj, long j, boolean z) {
            if (e6y0.f89661i) {
                e6y0.m115138k(obj, j, z);
            } else {
                e6y0.m115145r(obj, j, z);
            }
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: i */
        public final float mo115159i(Object obj, long j) {
            return Float.intBitsToFloat(m115165l(obj, j));
        }

        @Override // p149l.e6y0.AbstractC16552b
        /* JADX INFO: renamed from: k */
        public final boolean mo115160k(Object obj, long j) {
            return e6y0.f89661i ? e6y0.m115125D(obj, j) : e6y0.m115126E(obj, j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    static {
        AbstractC16552b c16551a;
        Unsafe unsafeM115143p = m115143p();
        f89653a = unsafeM115143p;
        f89654b = ulx0.m194272a();
        boolean zM115122A = m115122A(Long.TYPE);
        f89655c = zM115122A;
        boolean zM115122A2 = m115122A(Integer.TYPE);
        f89656d = zM115122A2;
        if (unsafeM115143p == null) {
            c16551a = null;
        } else if (zM115122A) {
            c16551a = new C16553c(unsafeM115143p);
        } else if (zM115122A2) {
            c16551a = new C16551a(unsafeM115143p);
        } else {
            c16551a = null;
        }
        f89657e = c16551a;
        f89658f = c16551a == null ? false : c16551a.m115164j();
        f89659g = c16551a == null ? false : c16551a.m115163h();
        f89660h = m115142o(byte[].class);
        m115142o(boolean[].class);
        m115146s(boolean[].class);
        m115142o(int[].class);
        m115146s(int[].class);
        m115142o(long[].class);
        m115146s(long[].class);
        m115142o(float[].class);
        m115146s(float[].class);
        m115142o(double[].class);
        m115146s(double[].class);
        m115142o(Object[].class);
        m115146s(Object[].class);
        Field fieldM115124C = m115124C();
        if (fieldM115124C != null && c16551a != null) {
            c16551a.f89662a.objectFieldOffset(fieldM115124C);
        }
        f89661i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m115122A(Class<?> cls) {
        try {
            Class<?> cls2 = f89654b;
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

    /* JADX INFO: renamed from: B */
    public static Object m115123B(Object obj, long j) {
        return f89657e.f89662a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: C */
    public static Field m115124C() {
        Field fieldM115131d = m115131d(Buffer.class, "effectiveDirectAddress");
        if (fieldM115131d != null) {
            return fieldM115131d;
        }
        Field fieldM115131d2 = m115131d(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM115131d2 == null || fieldM115131d2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM115131d2;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m115125D(Object obj, long j) {
        return ((byte) (m115147t(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m115126E(Object obj, long j) {
        return ((byte) (m115147t(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m115127F(Object obj, long j) {
        return f89657e.mo115160k(obj, j);
    }

    /* JADX INFO: renamed from: a */
    public static double m115128a(Object obj, long j) {
        return f89657e.mo115154a(obj, j);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m115129b(Class<T> cls) {
        try {
            return (T) f89653a.allocateInstance(cls);
        } catch (InstantiationException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m115131d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m115133f(Object obj, long j, double d) {
        f89657e.mo115156c(obj, j, d);
    }

    /* JADX INFO: renamed from: g */
    public static void m115134g(Object obj, long j, float f) {
        f89657e.mo115157d(obj, j, f);
    }

    /* JADX INFO: renamed from: h */
    public static void m115135h(Object obj, long j, int i) {
        f89657e.m115161e(obj, j, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m115136i(Object obj, long j, long j2) {
        f89657e.m115162f(obj, j, j2);
    }

    /* JADX INFO: renamed from: j */
    public static void m115137j(Object obj, long j, Object obj2) {
        f89657e.f89662a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m115138k(Object obj, long j, boolean z) {
        m115148u(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m115139l(Throwable th) {
        Logger.getLogger(e6y0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    /* JADX INFO: renamed from: m */
    public static void m115140m(byte[] bArr, long j, byte b) {
        f89657e.mo115155b(bArr, f89660h + j, b);
    }

    /* JADX INFO: renamed from: n */
    public static float m115141n(Object obj, long j) {
        return f89657e.mo115159i(obj, j);
    }

    /* JADX INFO: renamed from: o */
    public static int m115142o(Class<?> cls) {
        if (f89659g) {
            return f89657e.f89662a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static Unsafe m115143p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j6y0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m115145r(Object obj, long j, boolean z) {
        m115152y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: s */
    public static int m115146s(Class<?> cls) {
        if (f89659g) {
            return f89657e.f89662a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public static int m115147t(Object obj, long j) {
        return f89657e.m115165l(obj, j);
    }

    /* JADX INFO: renamed from: u */
    public static void m115148u(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM115147t = m115147t(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m115135h(obj, j2, ((255 & b) << i) | (iM115147t & (~(255 << i))));
    }

    /* JADX INFO: renamed from: v */
    public static void m115149v(Object obj, long j, boolean z) {
        f89657e.mo115158g(obj, j, z);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m115150w() {
        return f89659g;
    }

    /* JADX INFO: renamed from: x */
    public static long m115151x(Object obj, long j) {
        return f89657e.m115166m(obj, j);
    }

    /* JADX INFO: renamed from: y */
    public static void m115152y(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m115135h(obj, j2, ((255 & b) << i) | (m115147t(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m115153z() {
        return f89658f;
    }
}
