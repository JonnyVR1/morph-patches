package p153l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class q1y0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f155231a;

    /* JADX INFO: renamed from: b */
    public static final Class f155232b;

    /* JADX INFO: renamed from: c */
    public static final boolean f155233c;

    /* JADX INFO: renamed from: d */
    public static final k1y0 f155234d;

    /* JADX INFO: renamed from: e */
    public static final boolean f155235e;

    /* JADX INFO: renamed from: f */
    public static final boolean f155236f;

    /* JADX INFO: renamed from: g */
    public static final long f155237g;

    /* JADX INFO: renamed from: h */
    public static final boolean f155238h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z;
        boolean z2;
        k1y0 k1y0Var;
        Unsafe unsafeM174946l = m174946l();
        f155231a = unsafeM174946l;
        int i = kpw0.f128134a;
        f155232b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM174930A = m174930A(cls);
        f155233c = zM174930A;
        Class cls2 = Integer.TYPE;
        boolean zM174930A2 = m174930A(cls2);
        k1y0 b1y0Var = null;
        if (unsafeM174946l != null) {
            if (zM174930A) {
                b1y0Var = new g1y0(unsafeM174946l);
            } else if (zM174930A2) {
                b1y0Var = new b1y0(unsafeM174946l);
            }
        }
        f155234d = b1y0Var;
        if (b1y0Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = b1y0Var.f123560a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m174936b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m174947m(th);
            }
        }
        f155235e = z;
        k1y0 k1y0Var2 = f155234d;
        if (k1y0Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = k1y0Var2.f123560a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                m174947m(th2);
                z2 = false;
            }
        }
        f155236f = z2;
        f155237g = m174934E(byte[].class);
        m174934E(boolean[].class);
        m174935a(boolean[].class);
        m174934E(int[].class);
        m174935a(int[].class);
        m174934E(long[].class);
        m174935a(long[].class);
        m174934E(float[].class);
        m174935a(float[].class);
        m174934E(double[].class);
        m174935a(double[].class);
        m174934E(Object[].class);
        m174935a(Object[].class);
        Field fieldM174936b = m174936b();
        if (fieldM174936b != null && (k1y0Var = f155234d) != null) {
            k1y0Var.f123560a.objectFieldOffset(fieldM174936b);
        }
        f155238h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m174930A(Class cls) {
        int i = kpw0.f128134a;
        try {
            Class cls2 = f155232b;
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
    public static boolean m174931B(Object obj, long j) {
        return f155234d.mo101519g(obj, j);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m174932C() {
        return f155236f;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m174933D() {
        return f155235e;
    }

    /* JADX INFO: renamed from: E */
    public static int m174934E(Class cls) {
        if (f155236f) {
            return f155234d.f123560a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m174935a(Class cls) {
        if (f155236f) {
            return f155234d.f123560a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static Field m174936b() {
        int i = kpw0.f128134a;
        Field fieldM174937c = m174937c(Buffer.class, "effectiveDirectAddress");
        if (fieldM174937c != null) {
            return fieldM174937c;
        }
        Field fieldM174937c2 = m174937c(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM174937c2 == null || fieldM174937c2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM174937c2;
    }

    /* JADX INFO: renamed from: c */
    public static Field m174937c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m174938d(Object obj, long j, byte b) {
        k1y0 k1y0Var = f155234d;
        long j2 = (-4) & j;
        int i = k1y0Var.f123560a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        k1y0Var.f123560a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: e */
    public static void m174939e(Object obj, long j, byte b) {
        k1y0 k1y0Var = f155234d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        k1y0Var.f123560a.putInt(obj, j2, ((255 & b) << i) | (k1y0Var.f123560a.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: f */
    public static double m174940f(Object obj, long j) {
        return f155234d.mo101513a(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static float m174941g(Object obj, long j) {
        return f155234d.mo101514b(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static int m174942h(Object obj, long j) {
        return f155234d.f123560a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static long m174943i(Object obj, long j) {
        return f155234d.f123560a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public static Object m174944j(Class cls) {
        try {
            return f155231a.allocateInstance(cls);
        } catch (InstantiationException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object m174945k(Object obj, long j) {
        return f155234d.f123560a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m174946l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x0y0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m174947m(Throwable th) {
        Logger.getLogger(q1y0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: renamed from: r */
    public static void m174952r(Object obj, long j, boolean z) {
        f155234d.mo101515c(obj, j, z);
    }

    /* JADX INFO: renamed from: s */
    public static void m174953s(byte[] bArr, long j, byte b) {
        f155234d.mo101516d(bArr, f155237g + j, b);
    }

    /* JADX INFO: renamed from: t */
    public static void m174954t(Object obj, long j, double d) {
        f155234d.mo101517e(obj, j, d);
    }

    /* JADX INFO: renamed from: u */
    public static void m174955u(Object obj, long j, float f) {
        f155234d.mo101518f(obj, j, f);
    }

    /* JADX INFO: renamed from: v */
    public static void m174956v(Object obj, long j, int i) {
        f155234d.f123560a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: w */
    public static void m174957w(Object obj, long j, long j2) {
        f155234d.f123560a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: x */
    public static void m174958x(Object obj, long j, Object obj2) {
        f155234d.f123560a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m174959y(Object obj, long j) {
        return ((byte) ((f155234d.f123560a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m174960z(Object obj, long j) {
        return ((byte) ((f155234d.f123560a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
