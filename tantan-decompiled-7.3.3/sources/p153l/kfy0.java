package p153l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class kfy0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f126526a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f126527b;

    /* JADX INFO: renamed from: c */
    public static final boolean f126528c;

    /* JADX INFO: renamed from: d */
    public static final boolean f126529d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC18158b f126530e;

    /* JADX INFO: renamed from: f */
    public static final boolean f126531f;

    /* JADX INFO: renamed from: g */
    public static final boolean f126532g;

    /* JADX INFO: renamed from: h */
    public static final long f126533h;

    /* JADX INFO: renamed from: i */
    public static final boolean f126534i;

    /* JADX INFO: renamed from: l.kfy0$a */
    public static final class C18157a extends AbstractC18158b {
        public C18157a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: a */
        public final double mo149664a(Object obj, long j) {
            return Double.longBitsToDouble(m149676m(obj, j));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: b */
        public final void mo149665b(Object obj, long j, byte b) {
            if (kfy0.f126534i) {
                kfy0.m149658u(obj, j, b);
            } else {
                kfy0.m149662y(obj, j, b);
            }
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: c */
        public final void mo149666c(Object obj, long j, double d) {
            m149672f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: d */
        public final void mo149667d(Object obj, long j, float f) {
            m149671e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: g */
        public final void mo149668g(Object obj, long j, boolean z) {
            if (kfy0.f126534i) {
                kfy0.m149648k(obj, j, z);
            } else {
                kfy0.m149655r(obj, j, z);
            }
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: i */
        public final float mo149669i(Object obj, long j) {
            return Float.intBitsToFloat(m149675l(obj, j));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: k */
        public final boolean mo149670k(Object obj, long j) {
            return kfy0.f126534i ? kfy0.m149635D(obj, j) : kfy0.m149636E(obj, j);
        }
    }

    /* JADX INFO: renamed from: l.kfy0$b */
    public static abstract class AbstractC18158b {

        /* JADX INFO: renamed from: a */
        public Unsafe f126535a;

        public AbstractC18158b(Unsafe unsafe) {
            this.f126535a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public abstract double mo149664a(Object obj, long j);

        /* JADX INFO: renamed from: b */
        public abstract void mo149665b(Object obj, long j, byte b);

        /* JADX INFO: renamed from: c */
        public abstract void mo149666c(Object obj, long j, double d);

        /* JADX INFO: renamed from: d */
        public abstract void mo149667d(Object obj, long j, float f);

        /* JADX INFO: renamed from: e */
        public final void m149671e(Object obj, long j, int i) {
            this.f126535a.putInt(obj, j, i);
        }

        /* JADX INFO: renamed from: f */
        public final void m149672f(Object obj, long j, long j2) {
            this.f126535a.putLong(obj, j, j2);
        }

        /* JADX INFO: renamed from: g */
        public abstract void mo149668g(Object obj, long j, boolean z);

        /* JADX INFO: renamed from: h */
        public final boolean m149673h() {
            Unsafe unsafe = this.f126535a;
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
                kfy0.m149649l(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: i */
        public abstract float mo149669i(Object obj, long j);

        /* JADX INFO: renamed from: j */
        public final boolean m149674j() {
            Unsafe unsafe = this.f126535a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return kfy0.m149634C() != null;
            } catch (Throwable th) {
                kfy0.m149649l(th);
                return false;
            }
        }

        /* JADX INFO: renamed from: k */
        public abstract boolean mo149670k(Object obj, long j);

        /* JADX INFO: renamed from: l */
        public final int m149675l(Object obj, long j) {
            return this.f126535a.getInt(obj, j);
        }

        /* JADX INFO: renamed from: m */
        public final long m149676m(Object obj, long j) {
            return this.f126535a.getLong(obj, j);
        }
    }

    /* JADX INFO: renamed from: l.kfy0$c */
    public static final class C18159c extends AbstractC18158b {
        public C18159c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: a */
        public final double mo149664a(Object obj, long j) {
            return Double.longBitsToDouble(m149676m(obj, j));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: b */
        public final void mo149665b(Object obj, long j, byte b) {
            if (kfy0.f126534i) {
                kfy0.m149658u(obj, j, b);
            } else {
                kfy0.m149662y(obj, j, b);
            }
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: c */
        public final void mo149666c(Object obj, long j, double d) {
            m149672f(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: d */
        public final void mo149667d(Object obj, long j, float f) {
            m149671e(obj, j, Float.floatToIntBits(f));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: g */
        public final void mo149668g(Object obj, long j, boolean z) {
            if (kfy0.f126534i) {
                kfy0.m149648k(obj, j, z);
            } else {
                kfy0.m149655r(obj, j, z);
            }
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: i */
        public final float mo149669i(Object obj, long j) {
            return Float.intBitsToFloat(m149675l(obj, j));
        }

        @Override // p153l.kfy0.AbstractC18158b
        /* JADX INFO: renamed from: k */
        public final boolean mo149670k(Object obj, long j) {
            return kfy0.f126534i ? kfy0.m149635D(obj, j) : kfy0.m149636E(obj, j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    static {
        AbstractC18158b c18157a;
        Unsafe unsafeM149653p = m149653p();
        f126526a = unsafeM149653p;
        f126527b = avx0.m100546a();
        boolean zM149632A = m149632A(Long.TYPE);
        f126528c = zM149632A;
        boolean zM149632A2 = m149632A(Integer.TYPE);
        f126529d = zM149632A2;
        if (unsafeM149653p == null) {
            c18157a = null;
        } else if (zM149632A) {
            c18157a = new C18159c(unsafeM149653p);
        } else if (zM149632A2) {
            c18157a = new C18157a(unsafeM149653p);
        } else {
            c18157a = null;
        }
        f126530e = c18157a;
        f126531f = c18157a == null ? false : c18157a.m149674j();
        f126532g = c18157a == null ? false : c18157a.m149673h();
        f126533h = m149652o(byte[].class);
        m149652o(boolean[].class);
        m149656s(boolean[].class);
        m149652o(int[].class);
        m149656s(int[].class);
        m149652o(long[].class);
        m149656s(long[].class);
        m149652o(float[].class);
        m149656s(float[].class);
        m149652o(double[].class);
        m149656s(double[].class);
        m149652o(Object[].class);
        m149656s(Object[].class);
        Field fieldM149634C = m149634C();
        if (fieldM149634C != null && c18157a != null) {
            c18157a.f126535a.objectFieldOffset(fieldM149634C);
        }
        f126534i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m149632A(Class<?> cls) {
        try {
            Class<?> cls2 = f126527b;
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
    public static Object m149633B(Object obj, long j) {
        return f126530e.f126535a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: C */
    public static Field m149634C() {
        Field fieldM149641d = m149641d(Buffer.class, "effectiveDirectAddress");
        if (fieldM149641d != null) {
            return fieldM149641d;
        }
        Field fieldM149641d2 = m149641d(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM149641d2 == null || fieldM149641d2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM149641d2;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ boolean m149635D(Object obj, long j) {
        return ((byte) (m149657t(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m149636E(Object obj, long j) {
        return ((byte) (m149657t(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m149637F(Object obj, long j) {
        return f126530e.mo149670k(obj, j);
    }

    /* JADX INFO: renamed from: a */
    public static double m149638a(Object obj, long j) {
        return f126530e.mo149664a(obj, j);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m149639b(Class<T> cls) {
        try {
            return (T) f126526a.allocateInstance(cls);
        } catch (InstantiationException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m149641d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m149643f(Object obj, long j, double d) {
        f126530e.mo149666c(obj, j, d);
    }

    /* JADX INFO: renamed from: g */
    public static void m149644g(Object obj, long j, float f) {
        f126530e.mo149667d(obj, j, f);
    }

    /* JADX INFO: renamed from: h */
    public static void m149645h(Object obj, long j, int i) {
        f126530e.m149671e(obj, j, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m149646i(Object obj, long j, long j2) {
        f126530e.m149672f(obj, j, j2);
    }

    /* JADX INFO: renamed from: j */
    public static void m149647j(Object obj, long j, Object obj2) {
        f126530e.f126535a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m149648k(Object obj, long j, boolean z) {
        m149658u(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m149649l(Throwable th) {
        Logger.getLogger(kfy0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    /* JADX INFO: renamed from: m */
    public static void m149650m(byte[] bArr, long j, byte b) {
        f126530e.mo149665b(bArr, f126533h + j, b);
    }

    /* JADX INFO: renamed from: n */
    public static float m149651n(Object obj, long j) {
        return f126530e.mo149669i(obj, j);
    }

    /* JADX INFO: renamed from: o */
    public static int m149652o(Class<?> cls) {
        if (f126532g) {
            return f126530e.f126535a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public static Unsafe m149653p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new pfy0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m149655r(Object obj, long j, boolean z) {
        m149662y(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: s */
    public static int m149656s(Class<?> cls) {
        if (f126532g) {
            return f126530e.f126535a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: t */
    public static int m149657t(Object obj, long j) {
        return f126530e.m149675l(obj, j);
    }

    /* JADX INFO: renamed from: u */
    public static void m149658u(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM149657t = m149657t(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m149645h(obj, j2, ((255 & b) << i) | (iM149657t & (~(255 << i))));
    }

    /* JADX INFO: renamed from: v */
    public static void m149659v(Object obj, long j, boolean z) {
        f126530e.mo149668g(obj, j, z);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m149660w() {
        return f126532g;
    }

    /* JADX INFO: renamed from: x */
    public static long m149661x(Object obj, long j) {
        return f126530e.m149676m(obj, j);
    }

    /* JADX INFO: renamed from: y */
    public static void m149662y(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m149645h(obj, j2, ((255 & b) << i) | (m149657t(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m149663z() {
        return f126531f;
    }
}
