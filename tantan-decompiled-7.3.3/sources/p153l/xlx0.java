package p153l;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final class xlx0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f195023a;

    /* JADX INFO: renamed from: b */
    public static final Class f195024b;

    /* JADX INFO: renamed from: c */
    public static final boolean f195025c;

    /* JADX INFO: renamed from: d */
    public static final wlx0 f195026d;

    /* JADX INFO: renamed from: e */
    public static final boolean f195027e;

    /* JADX INFO: renamed from: f */
    public static final boolean f195028f;

    /* JADX INFO: renamed from: g */
    public static final long f195029g;

    /* JADX INFO: renamed from: h */
    public static final long f195030h;

    /* JADX INFO: renamed from: i */
    public static final boolean f195031i;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z;
        boolean z2;
        wlx0 wlx0Var;
        Unsafe unsafeM211704q = m211704q();
        f195023a = unsafeM211704q;
        int i = cgx0.f81747a;
        f195024b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM211686G = m211686G(cls);
        f195025c = zM211686G;
        Class cls2 = Integer.TYPE;
        boolean zM211686G2 = m211686G(cls2);
        wlx0 ulx0Var = null;
        if (unsafeM211704q != null) {
            if (zM211686G) {
                ulx0Var = new vlx0(unsafeM211704q);
            } else if (zM211686G2) {
                ulx0Var = new ulx0(unsafeM211704q);
            }
        }
        f195026d = ulx0Var;
        if (ulx0Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ulx0Var.f189747a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m211692e() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m211705r(th);
            }
        }
        f195027e = z;
        wlx0 wlx0Var2 = f195026d;
        if (wlx0Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = wlx0Var2.f189747a.getClass();
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
                m211705r(th2);
                z2 = false;
            }
        }
        f195028f = z2;
        f195029g = m211690c(byte[].class);
        m211690c(boolean[].class);
        m211691d(boolean[].class);
        m211690c(int[].class);
        m211691d(int[].class);
        m211690c(long[].class);
        m211691d(long[].class);
        m211690c(float[].class);
        m211691d(float[].class);
        m211690c(double[].class);
        m211691d(double[].class);
        m211690c(Object[].class);
        m211691d(Object[].class);
        Field fieldM211692e = m211692e();
        long jObjectFieldOffset = -1;
        if (fieldM211692e != null && (wlx0Var = f195026d) != null) {
            jObjectFieldOffset = wlx0Var.f189747a.objectFieldOffset(fieldM211692e);
        }
        f195030h = jObjectFieldOffset;
        f195031i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static void m211680A(Object obj, long j, float f) {
        f195026d.mo196636h(obj, j, f);
    }

    /* JADX INFO: renamed from: B */
    public static void m211681B(Object obj, long j, int i) {
        f195026d.f189747a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: C */
    public static void m211682C(Object obj, long j, long j2) {
        f195026d.f189747a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: D */
    public static void m211683D(Object obj, long j, Object obj2) {
        f195026d.f189747a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: E */
    public static /* bridge */ /* synthetic */ boolean m211684E(Object obj, long j) {
        return ((byte) ((f195026d.f189747a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: F */
    public static /* bridge */ /* synthetic */ boolean m211685F(Object obj, long j) {
        return ((byte) ((f195026d.f189747a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m211686G(Class cls) {
        int i = cgx0.f81747a;
        try {
            Class cls2 = f195024b;
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

    /* JADX INFO: renamed from: H */
    public static boolean m211687H(Object obj, long j) {
        return f195026d.mo196637i(obj, j);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m211688a() {
        return f195028f;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m211689b() {
        return f195027e;
    }

    /* JADX INFO: renamed from: c */
    public static int m211690c(Class cls) {
        if (f195028f) {
            return f195026d.f189747a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m211691d(Class cls) {
        if (f195028f) {
            return f195026d.f189747a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static Field m211692e() {
        int i = cgx0.f81747a;
        Field fieldM211693f = m211693f(Buffer.class, "effectiveDirectAddress");
        if (fieldM211693f != null) {
            return fieldM211693f;
        }
        Field fieldM211693f2 = m211693f(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM211693f2 == null || fieldM211693f2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM211693f2;
    }

    /* JADX INFO: renamed from: f */
    public static Field m211693f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m211694g(Object obj, long j, byte b) {
        wlx0 wlx0Var = f195026d;
        long j2 = (-4) & j;
        int i = wlx0Var.f189747a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        wlx0Var.f189747a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: h */
    public static void m211695h(Object obj, long j, byte b) {
        wlx0 wlx0Var = f195026d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        wlx0Var.f189747a.putInt(obj, j2, ((255 & b) << i) | (wlx0Var.f189747a.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: i */
    public static byte m211696i(long j) {
        return f195026d.mo196629a(j);
    }

    /* JADX INFO: renamed from: j */
    public static double m211697j(Object obj, long j) {
        return f195026d.mo196630b(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public static float m211698k(Object obj, long j) {
        return f195026d.mo196631c(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public static int m211699l(Object obj, long j) {
        return f195026d.f189747a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: m */
    public static long m211700m(ByteBuffer byteBuffer) {
        wlx0 wlx0Var = f195026d;
        return wlx0Var.f189747a.getLong(byteBuffer, f195030h);
    }

    /* JADX INFO: renamed from: n */
    public static long m211701n(Object obj, long j) {
        return f195026d.f189747a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: o */
    public static Object m211702o(Class cls) {
        try {
            return f195023a.allocateInstance(cls);
        } catch (InstantiationException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object m211703p(Object obj, long j) {
        return f195026d.f189747a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: q */
    public static Unsafe m211704q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new tlx0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m211705r(Throwable th) {
        Logger.getLogger(xlx0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: renamed from: w */
    public static void m211710w(long j, byte[] bArr, long j2, long j3) {
        f195026d.mo196632d(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: x */
    public static void m211711x(Object obj, long j, boolean z) {
        f195026d.mo196633e(obj, j, z);
    }

    /* JADX INFO: renamed from: y */
    public static void m211712y(byte[] bArr, long j, byte b) {
        f195026d.mo196634f(bArr, f195029g + j, b);
    }

    /* JADX INFO: renamed from: z */
    public static void m211713z(Object obj, long j, double d) {
        f195026d.mo196635g(obj, j, d);
    }
}
