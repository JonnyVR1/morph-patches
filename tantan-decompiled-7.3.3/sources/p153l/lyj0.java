package p153l;

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
public final class lyj0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f134084a = Logger.getLogger(lyj0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f134085b = m156300F();

    /* JADX INFO: renamed from: c */
    public static final Class<?> f134086c = sn0.m186856b();

    /* JADX INFO: renamed from: d */
    public static final boolean f134087d = m156331o(Long.TYPE);

    /* JADX INFO: renamed from: e */
    public static final boolean f134088e = m156331o(Integer.TYPE);

    /* JADX INFO: renamed from: f */
    public static final AbstractC18505e f134089f = m156298D();

    /* JADX INFO: renamed from: g */
    public static final boolean f134090g = m156316V();

    /* JADX INFO: renamed from: h */
    public static final boolean f134091h = m156315U();

    /* JADX INFO: renamed from: i */
    public static final long f134092i;

    /* JADX INFO: renamed from: j */
    public static final long f134093j;

    /* JADX INFO: renamed from: k */
    public static final long f134094k;

    /* JADX INFO: renamed from: l */
    public static final long f134095l;

    /* JADX INFO: renamed from: m */
    public static final long f134096m;

    /* JADX INFO: renamed from: n */
    public static final long f134097n;

    /* JADX INFO: renamed from: o */
    public static final long f134098o;

    /* JADX INFO: renamed from: p */
    public static final long f134099p;

    /* JADX INFO: renamed from: q */
    public static final long f134100q;

    /* JADX INFO: renamed from: r */
    public static final long f134101r;

    /* JADX INFO: renamed from: s */
    public static final long f134102s;

    /* JADX INFO: renamed from: t */
    public static final long f134103t;

    /* JADX INFO: renamed from: u */
    public static final long f134104u;

    /* JADX INFO: renamed from: v */
    public static final long f134105v;

    /* JADX INFO: renamed from: w */
    public static final int f134106w;

    /* JADX INFO: renamed from: x */
    public static final boolean f134107x;

    /* JADX INFO: renamed from: l.lyj0$a */
    public static class C18501a implements PrivilegedExceptionAction<Unsafe> {
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

    /* JADX INFO: renamed from: l.lyj0$b */
    public static final class C18502b extends AbstractC18505e {
        public C18502b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: c */
        public void mo156344c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: d */
        public boolean mo156345d(Object obj, long j) {
            return lyj0.f134107x ? lyj0.m156335s(obj, j) : lyj0.m156336t(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: e */
        public byte mo156346e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: f */
        public byte mo156347f(Object obj, long j) {
            return lyj0.f134107x ? lyj0.m156339w(obj, j) : lyj0.m156340x(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: g */
        public double mo156348g(Object obj, long j) {
            return Double.longBitsToDouble(m156358k(obj, j));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: h */
        public float mo156349h(Object obj, long j) {
            return Float.intBitsToFloat(m156357i(obj, j));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: j */
        public long mo156350j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: n */
        public void mo156351n(Object obj, long j, boolean z) {
            if (lyj0.f134107x) {
                lyj0.m156305K(obj, j, z);
            } else {
                lyj0.m156306L(obj, j, z);
            }
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: o */
        public void mo156352o(Object obj, long j, byte b) {
            if (lyj0.f134107x) {
                lyj0.m156308N(obj, j, b);
            } else {
                lyj0.m156309O(obj, j, b);
            }
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: p */
        public void mo156353p(Object obj, long j, double d) {
            m156362s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: q */
        public void mo156354q(Object obj, long j, float f) {
            m156361r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: renamed from: l.lyj0$c */
    public static final class C18503c extends AbstractC18505e {
        public C18503c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: c */
        public void mo156344c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: d */
        public boolean mo156345d(Object obj, long j) {
            return lyj0.f134107x ? lyj0.m156335s(obj, j) : lyj0.m156336t(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: e */
        public byte mo156346e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: f */
        public byte mo156347f(Object obj, long j) {
            return lyj0.f134107x ? lyj0.m156339w(obj, j) : lyj0.m156340x(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: g */
        public double mo156348g(Object obj, long j) {
            return Double.longBitsToDouble(m156358k(obj, j));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: h */
        public float mo156349h(Object obj, long j) {
            return Float.intBitsToFloat(m156357i(obj, j));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: j */
        public long mo156350j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: n */
        public void mo156351n(Object obj, long j, boolean z) {
            if (lyj0.f134107x) {
                lyj0.m156305K(obj, j, z);
            } else {
                lyj0.m156306L(obj, j, z);
            }
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: o */
        public void mo156352o(Object obj, long j, byte b) {
            if (lyj0.f134107x) {
                lyj0.m156308N(obj, j, b);
            } else {
                lyj0.m156309O(obj, j, b);
            }
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: p */
        public void mo156353p(Object obj, long j, double d) {
            m156362s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: q */
        public void mo156354q(Object obj, long j, float f) {
            m156361r(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: renamed from: l.lyj0$d */
    public static final class C18504d extends AbstractC18505e {
        public C18504d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: c */
        public void mo156344c(long j, byte[] bArr, long j2, long j3) {
            this.f134108a.copyMemory((Object) null, j, bArr, lyj0.f134092i + j2, j3);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: d */
        public boolean mo156345d(Object obj, long j) {
            return this.f134108a.getBoolean(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: e */
        public byte mo156346e(long j) {
            return this.f134108a.getByte(j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: f */
        public byte mo156347f(Object obj, long j) {
            return this.f134108a.getByte(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: g */
        public double mo156348g(Object obj, long j) {
            return this.f134108a.getDouble(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: h */
        public float mo156349h(Object obj, long j) {
            return this.f134108a.getFloat(obj, j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: j */
        public long mo156350j(long j) {
            return this.f134108a.getLong(j);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: n */
        public void mo156351n(Object obj, long j, boolean z) {
            this.f134108a.putBoolean(obj, j, z);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: o */
        public void mo156352o(Object obj, long j, byte b) {
            this.f134108a.putByte(obj, j, b);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: p */
        public void mo156353p(Object obj, long j, double d) {
            this.f134108a.putDouble(obj, j, d);
        }

        @Override // p153l.lyj0.AbstractC18505e
        /* JADX INFO: renamed from: q */
        public void mo156354q(Object obj, long j, float f) {
            this.f134108a.putFloat(obj, j, f);
        }
    }

    /* JADX INFO: renamed from: l.lyj0$e */
    public static abstract class AbstractC18505e {

        /* JADX INFO: renamed from: a */
        public Unsafe f134108a;

        public AbstractC18505e(Unsafe unsafe) {
            this.f134108a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m156355a(Class<?> cls) {
            return this.f134108a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m156356b(Class<?> cls) {
            return this.f134108a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo156344c(long j, byte[] bArr, long j2, long j3);

        /* JADX INFO: renamed from: d */
        public abstract boolean mo156345d(Object obj, long j);

        /* JADX INFO: renamed from: e */
        public abstract byte mo156346e(long j);

        /* JADX INFO: renamed from: f */
        public abstract byte mo156347f(Object obj, long j);

        /* JADX INFO: renamed from: g */
        public abstract double mo156348g(Object obj, long j);

        /* JADX INFO: renamed from: h */
        public abstract float mo156349h(Object obj, long j);

        /* JADX INFO: renamed from: i */
        public final int m156357i(Object obj, long j) {
            return this.f134108a.getInt(obj, j);
        }

        /* JADX INFO: renamed from: j */
        public abstract long mo156350j(long j);

        /* JADX INFO: renamed from: k */
        public final long m156358k(Object obj, long j) {
            return this.f134108a.getLong(obj, j);
        }

        /* JADX INFO: renamed from: l */
        public final Object m156359l(Object obj, long j) {
            return this.f134108a.getObject(obj, j);
        }

        /* JADX INFO: renamed from: m */
        public final long m156360m(Field field) {
            return this.f134108a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo156351n(Object obj, long j, boolean z);

        /* JADX INFO: renamed from: o */
        public abstract void mo156352o(Object obj, long j, byte b);

        /* JADX INFO: renamed from: p */
        public abstract void mo156353p(Object obj, long j, double d);

        /* JADX INFO: renamed from: q */
        public abstract void mo156354q(Object obj, long j, float f);

        /* JADX INFO: renamed from: r */
        public final void m156361r(Object obj, long j, int i) {
            this.f134108a.putInt(obj, j, i);
        }

        /* JADX INFO: renamed from: s */
        public final void m156362s(Object obj, long j, long j2) {
            this.f134108a.putLong(obj, j, j2);
        }

        /* JADX INFO: renamed from: t */
        public final void m156363t(Object obj, long j, Object obj2) {
            this.f134108a.putObject(obj, j, obj2);
        }
    }

    static {
        long jM156327k = m156327k(byte[].class);
        f134092i = jM156327k;
        f134093j = m156327k(boolean[].class);
        f134094k = m156328l(boolean[].class);
        f134095l = m156327k(int[].class);
        f134096m = m156328l(int[].class);
        f134097n = m156327k(long[].class);
        f134098o = m156328l(long[].class);
        f134099p = m156327k(float[].class);
        f134100q = m156328l(float[].class);
        f134101r = m156327k(double[].class);
        f134102s = m156328l(double[].class);
        f134103t = m156327k(Object[].class);
        f134104u = m156328l(Object[].class);
        f134105v = m156333q(m156329m());
        f134106w = (int) (jM156327k & 7);
        f134107x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static int m156295A(Object obj, long j) {
        return f134089f.m156357i(obj, j);
    }

    /* JADX INFO: renamed from: B */
    public static long m156296B(long j) {
        return f134089f.mo156350j(j);
    }

    /* JADX INFO: renamed from: C */
    public static long m156297C(Object obj, long j) {
        return f134089f.m156358k(obj, j);
    }

    /* JADX INFO: renamed from: D */
    public static AbstractC18505e m156298D() {
        Unsafe unsafe = f134085b;
        if (unsafe == null) {
            return null;
        }
        if (!sn0.m186857c()) {
            return new C18504d(unsafe);
        }
        if (f134087d) {
            return new C18503c(unsafe);
        }
        if (f134088e) {
            return new C18502b(unsafe);
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static Object m156299E(Object obj, long j) {
        return f134089f.m156359l(obj, j);
    }

    /* JADX INFO: renamed from: F */
    public static Unsafe m156300F() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C18501a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m156301G() {
        return f134091h;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m156302H() {
        return f134090g;
    }

    /* JADX INFO: renamed from: I */
    public static long m156303I(Field field) {
        return f134089f.m156360m(field);
    }

    /* JADX INFO: renamed from: J */
    public static void m156304J(Object obj, long j, boolean z) {
        f134089f.mo156351n(obj, j, z);
    }

    /* JADX INFO: renamed from: K */
    public static void m156305K(Object obj, long j, boolean z) {
        m156308N(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: L */
    public static void m156306L(Object obj, long j, boolean z) {
        m156309O(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: M */
    public static void m156307M(byte[] bArr, long j, byte b) {
        f134089f.mo156352o(bArr, f134092i + j, b);
    }

    /* JADX INFO: renamed from: N */
    public static void m156308N(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM156295A = m156295A(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m156312R(obj, j2, ((255 & b) << i) | (iM156295A & (~(255 << i))));
    }

    /* JADX INFO: renamed from: O */
    public static void m156309O(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m156312R(obj, j2, ((255 & b) << i) | (m156295A(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: P */
    public static void m156310P(Object obj, long j, double d) {
        f134089f.mo156353p(obj, j, d);
    }

    /* JADX INFO: renamed from: Q */
    public static void m156311Q(Object obj, long j, float f) {
        f134089f.mo156354q(obj, j, f);
    }

    /* JADX INFO: renamed from: R */
    public static void m156312R(Object obj, long j, int i) {
        f134089f.m156361r(obj, j, i);
    }

    /* JADX INFO: renamed from: S */
    public static void m156313S(Object obj, long j, long j2) {
        f134089f.m156362s(obj, j, j2);
    }

    /* JADX INFO: renamed from: T */
    public static void m156314T(Object obj, long j, Object obj2) {
        f134089f.m156363t(obj, j, obj2);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m156315U() {
        Unsafe unsafe = f134085b;
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
            if (sn0.m186857c()) {
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
            f134084a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* JADX INFO: renamed from: V */
    public static boolean m156316V() {
        Unsafe unsafe = f134085b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m156329m() == null) {
                return false;
            }
            if (sn0.m186857c()) {
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
            f134084a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m156325i(ByteBuffer byteBuffer) {
        return f134089f.m156358k(byteBuffer, f134105v);
    }

    /* JADX INFO: renamed from: j */
    public static <T> T m156326j(Class<T> cls) {
        try {
            return (T) f134085b.allocateInstance(cls);
        } catch (InstantiationException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m156327k(Class<?> cls) {
        if (f134091h) {
            return f134089f.m156355a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m156328l(Class<?> cls) {
        if (f134091h) {
            return f134089f.m156356b(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public static Field m156329m() {
        Field fieldM156332p;
        if (sn0.m186857c() && (fieldM156332p = m156332p(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM156332p;
        }
        Field fieldM156332p2 = m156332p(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM156332p2 == null || fieldM156332p2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM156332p2;
    }

    /* JADX INFO: renamed from: n */
    public static void m156330n(long j, byte[] bArr, long j2, long j3) {
        f134089f.mo156344c(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m156331o(Class<?> cls) {
        if (!sn0.m186857c()) {
            return false;
        }
        try {
            Class<?> cls2 = f134086c;
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
    public static Field m156332p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static long m156333q(Field field) {
        AbstractC18505e abstractC18505e;
        if (field == null || (abstractC18505e = f134089f) == null) {
            return -1L;
        }
        return abstractC18505e.m156360m(field);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m156334r(Object obj, long j) {
        return f134089f.mo156345d(obj, j);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m156335s(Object obj, long j) {
        return m156339w(obj, j) != 0;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m156336t(Object obj, long j) {
        return m156340x(obj, j) != 0;
    }

    /* JADX INFO: renamed from: u */
    public static byte m156337u(long j) {
        return f134089f.mo156346e(j);
    }

    /* JADX INFO: renamed from: v */
    public static byte m156338v(byte[] bArr, long j) {
        return f134089f.mo156347f(bArr, f134092i + j);
    }

    /* JADX INFO: renamed from: w */
    public static byte m156339w(Object obj, long j) {
        return (byte) ((m156295A(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: x */
    public static byte m156340x(Object obj, long j) {
        return (byte) ((m156295A(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: y */
    public static double m156341y(Object obj, long j) {
        return f134089f.mo156348g(obj, j);
    }

    /* JADX INFO: renamed from: z */
    public static float m156342z(Object obj, long j) {
        return f134089f.mo156349h(obj, j);
    }
}
