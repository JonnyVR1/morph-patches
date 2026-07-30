package p149l;

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
public final class ksx0 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f124515a;

    /* JADX INFO: renamed from: b */
    public static final Class f124516b;

    /* JADX INFO: renamed from: c */
    public static final boolean f124517c;

    /* JADX INFO: renamed from: d */
    public static final esx0 f124518d;

    /* JADX INFO: renamed from: e */
    public static final boolean f124519e;

    /* JADX INFO: renamed from: f */
    public static final boolean f124520f;

    /* JADX INFO: renamed from: g */
    public static final long f124521g;

    /* JADX INFO: renamed from: h */
    public static final boolean f124522h;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    static {
        boolean z;
        boolean z2;
        esx0 esx0Var;
        Unsafe unsafeM147120l = m147120l();
        f124515a = unsafeM147120l;
        int i = egw0.f91264a;
        f124516b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM147104A = m147104A(cls);
        f124517c = zM147104A;
        Class cls2 = Integer.TYPE;
        boolean zM147104A2 = m147104A(cls2);
        esx0 vrx0Var = null;
        if (unsafeM147120l != null) {
            if (zM147104A) {
                vrx0Var = new asx0(unsafeM147120l);
            } else if (zM147104A2) {
                vrx0Var = new vrx0(unsafeM147120l);
            }
        }
        f124518d = vrx0Var;
        if (vrx0Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = vrx0Var.f93064a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m147110b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                m147121m(th);
            }
        }
        f124519e = z;
        esx0 esx0Var2 = f124518d;
        if (esx0Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = esx0Var2.f93064a.getClass();
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
                m147121m(th2);
                z2 = false;
            }
        }
        f124520f = z2;
        f124521g = m147108E(byte[].class);
        m147108E(boolean[].class);
        m147109a(boolean[].class);
        m147108E(int[].class);
        m147109a(int[].class);
        m147108E(long[].class);
        m147109a(long[].class);
        m147108E(float[].class);
        m147109a(float[].class);
        m147108E(double[].class);
        m147109a(double[].class);
        m147108E(Object[].class);
        m147109a(Object[].class);
        Field fieldM147110b = m147110b();
        if (fieldM147110b != null && (esx0Var = f124518d) != null) {
            esx0Var.f93064a.objectFieldOffset(fieldM147110b);
        }
        f124522h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m147104A(Class cls) {
        int i = egw0.f91264a;
        try {
            Class cls2 = f124516b;
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
    public static boolean m147105B(Object obj, long j) {
        return f124518d.mo98638g(obj, j);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m147106C() {
        return f124520f;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m147107D() {
        return f124519e;
    }

    /* JADX INFO: renamed from: E */
    public static int m147108E(Class cls) {
        if (f124520f) {
            return f124518d.f93064a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m147109a(Class cls) {
        if (f124520f) {
            return f124518d.f93064a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static Field m147110b() {
        int i = egw0.f91264a;
        Field fieldM147111c = m147111c(Buffer.class, "effectiveDirectAddress");
        if (fieldM147111c != null) {
            return fieldM147111c;
        }
        Field fieldM147111c2 = m147111c(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldM147111c2 == null || fieldM147111c2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM147111c2;
    }

    /* JADX INFO: renamed from: c */
    public static Field m147111c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147112d(Object obj, long j, byte b) {
        esx0 esx0Var = f124518d;
        long j2 = (-4) & j;
        int i = esx0Var.f93064a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        esx0Var.f93064a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: e */
    public static void m147113e(Object obj, long j, byte b) {
        esx0 esx0Var = f124518d;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        esx0Var.f93064a.putInt(obj, j2, ((255 & b) << i) | (esx0Var.f93064a.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: f */
    public static double m147114f(Object obj, long j) {
        return f124518d.mo98632a(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static float m147115g(Object obj, long j) {
        return f124518d.mo98633b(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static int m147116h(Object obj, long j) {
        return f124518d.f93064a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static long m147117i(Object obj, long j) {
        return f124518d.f93064a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public static Object m147118j(Class cls) {
        try {
            return f124515a.allocateInstance(cls);
        } catch (InstantiationException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object m147119k(Object obj, long j) {
        return f124518d.f93064a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m147120l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new rrx0());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m147121m(Throwable th) {
        Logger.getLogger(ksx0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: renamed from: r */
    public static void m147126r(Object obj, long j, boolean z) {
        f124518d.mo98634c(obj, j, z);
    }

    /* JADX INFO: renamed from: s */
    public static void m147127s(byte[] bArr, long j, byte b) {
        f124518d.mo98635d(bArr, f124521g + j, b);
    }

    /* JADX INFO: renamed from: t */
    public static void m147128t(Object obj, long j, double d) {
        f124518d.mo98636e(obj, j, d);
    }

    /* JADX INFO: renamed from: u */
    public static void m147129u(Object obj, long j, float f) {
        f124518d.mo98637f(obj, j, f);
    }

    /* JADX INFO: renamed from: v */
    public static void m147130v(Object obj, long j, int i) {
        f124518d.f93064a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: w */
    public static void m147131w(Object obj, long j, long j2) {
        f124518d.f93064a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: x */
    public static void m147132x(Object obj, long j, Object obj2) {
        f124518d.f93064a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m147133y(Object obj, long j) {
        return ((byte) ((f124518d.f93064a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m147134z(Object obj, long j) {
        return ((byte) ((f124518d.f93064a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
