package p149l;

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
public final class rcx0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f158832a;

    /* JADX INFO: renamed from: b */
    public static final Class f158833b;

    /* JADX INFO: renamed from: c */
    public static final boolean f158834c;

    /* JADX INFO: renamed from: d */
    public static final qcx0 f158835d;

    /* JADX INFO: renamed from: e */
    public static final boolean f158836e;

    /* JADX INFO: renamed from: f */
    public static final boolean f158837f;

    /* JADX INFO: renamed from: g */
    public static final long f158838g;

    /* JADX INFO: renamed from: h */
    public static final long f158839h;

    /* JADX INFO: renamed from: i */
    public static final boolean f158840i;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z;
        boolean z2;
        qcx0 qcx0Var;
        Unsafe unsafeM178839q = m178839q();
        f158832a = unsafeM178839q;
        int i = w6x0.f185008a;
        f158833b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM178821G = m178821G(cls);
        f158834c = zM178821G;
        Class cls2 = Integer.TYPE;
        boolean zM178821G2 = m178821G(cls2);
        qcx0 ocx0Var = null;
        if (unsafeM178839q != null) {
            if (zM178821G) {
                ocx0Var = new pcx0(unsafeM178839q);
            } else if (zM178821G2) {
                ocx0Var = new ocx0(unsafeM178839q);
            }
        }
        f158835d = ocx0Var;
        if (ocx0Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ocx0Var.f153846a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m178827e() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m178840r(th);
            }
        }
        f158836e = z;
        qcx0 qcx0Var2 = f158835d;
        if (qcx0Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = qcx0Var2.f153846a.getClass();
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
                m178840r(th2);
                z2 = false;
            }
        }
        f158837f = z2;
        f158838g = m178825c(byte[].class);
        m178825c(boolean[].class);
        m178826d(boolean[].class);
        m178825c(int[].class);
        m178826d(int[].class);
        m178825c(long[].class);
        m178826d(long[].class);
        m178825c(float[].class);
        m178826d(float[].class);
        m178825c(double[].class);
        m178826d(double[].class);
        m178825c(Object[].class);
        m178826d(Object[].class);
        Field fieldM178827e = m178827e();
        long jObjectFieldOffset = -1;
        if (fieldM178827e != null && (qcx0Var = f158835d) != null) {
            jObjectFieldOffset = qcx0Var.f153846a.objectFieldOffset(fieldM178827e);
        }
        f158839h = jObjectFieldOffset;
        f158840i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static void m178815A(Object obj, long j, float f) {
        f158835d.mo163629h(obj, j, f);
    }

    /* JADX INFO: renamed from: B */
    public static void m178816B(Object obj, long j, int i) {
        f158835d.f153846a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: C */
    public static void m178817C(Object obj, long j, long j2) {
        f158835d.f153846a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: D */
    public static void m178818D(Object obj, long j, Object obj2) {
        f158835d.f153846a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: E */
    public static /* bridge */ /* synthetic */ boolean m178819E(Object obj, long j) {
        return ((byte) ((f158835d.f153846a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: F */
    public static /* bridge */ /* synthetic */ boolean m178820F(Object obj, long j) {
        return ((byte) ((f158835d.f153846a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m178821G(Class cls) {
        int i = w6x0.f185008a;
        try {
            Class cls2 = f158833b;
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
    public static boolean m178822H(Object obj, long j) {
        return f158835d.mo163630i(obj, j);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m178823a() {
        return f158837f;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m178824b() {
        return f158836e;
    }

    /* JADX INFO: renamed from: c */
    public static int m178825c(Class cls) {
        if (f158837f) {
            return f158835d.f153846a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m178826d(Class cls) {
        if (f158837f) {
            return f158835d.f153846a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static Field m178827e() {
        int i = w6x0.f185008a;
        Field fieldM178828f = m178828f(Buffer.class, "effectiveDirectAddress");
        if (fieldM178828f != null) {
            return fieldM178828f;
        }
        Field fieldM178828f2 = m178828f(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM178828f2 == null || fieldM178828f2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM178828f2;
    }

    /* JADX INFO: renamed from: f */
    public static Field m178828f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m178829g(Object obj, long j, byte b) {
        qcx0 qcx0Var = f158835d;
        long j2 = (-4) & j;
        int i = qcx0Var.f153846a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        qcx0Var.f153846a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: h */
    public static void m178830h(Object obj, long j, byte b) {
        qcx0 qcx0Var = f158835d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        qcx0Var.f153846a.putInt(obj, j2, ((255 & b) << i) | (qcx0Var.f153846a.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: i */
    public static byte m178831i(long j) {
        return f158835d.mo163622a(j);
    }

    /* JADX INFO: renamed from: j */
    public static double m178832j(Object obj, long j) {
        return f158835d.mo163623b(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public static float m178833k(Object obj, long j) {
        return f158835d.mo163624c(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public static int m178834l(Object obj, long j) {
        return f158835d.f153846a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: m */
    public static long m178835m(ByteBuffer byteBuffer) {
        qcx0 qcx0Var = f158835d;
        return qcx0Var.f153846a.getLong(byteBuffer, f158839h);
    }

    /* JADX INFO: renamed from: n */
    public static long m178836n(Object obj, long j) {
        return f158835d.f153846a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: o */
    public static Object m178837o(Class cls) {
        try {
            return f158832a.allocateInstance(cls);
        } catch (InstantiationException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object m178838p(Object obj, long j) {
        return f158835d.f153846a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: q */
    public static Unsafe m178839q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ncx0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m178840r(Throwable th) {
        Logger.getLogger(rcx0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: renamed from: w */
    public static void m178845w(long j, byte[] bArr, long j2, long j3) {
        f158835d.mo163625d(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: x */
    public static void m178846x(Object obj, long j, boolean z) {
        f158835d.mo163626e(obj, j, z);
    }

    /* JADX INFO: renamed from: y */
    public static void m178847y(byte[] bArr, long j, byte b) {
        f158835d.mo163627f(bArr, f158838g + j, b);
    }

    /* JADX INFO: renamed from: z */
    public static void m178848z(Object obj, long j, double d) {
        f158835d.mo163628g(obj, j, d);
    }
}
