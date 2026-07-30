package p153l;

import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* JADX INFO: loaded from: classes2.dex */
public final class emq0 {

    /* JADX INFO: renamed from: f */
    private static emq0 f94679f;

    /* JADX INFO: renamed from: g */
    private static emq0 f94680g;

    /* JADX INFO: renamed from: h */
    private static emq0 f94681h;

    /* JADX INFO: renamed from: a */
    private final String f94682a;

    /* JADX INFO: renamed from: b */
    private final cmq0 f94683b;

    /* JADX INFO: renamed from: c */
    private final dmq0 f94684c;

    /* JADX INFO: renamed from: d */
    private final z7g0.InterfaceC21774a f94685d;

    /* JADX INFO: renamed from: e */
    private final a8g0 f94686e;

    private emq0(String str) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        this.f94682a = str;
        cmq0 cmq0Var = (cmq0) m121373a("net.jpountz.xxhash.XXHash32" + str);
        this.f94683b = cmq0Var;
        this.f94685d = (z7g0.InterfaceC21774a) m121373a("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory");
        StringBuilder sb = new StringBuilder("net.jpountz.xxhash.XXHash64");
        sb.append(str);
        this.f94684c = (dmq0) m121373a(sb.toString());
        this.f94686e = (a8g0) m121373a("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory");
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int iNextInt = random.nextInt();
        cmq0Var.m111313a(bArr, 0, 100, iNextInt);
        m121381g(iNextInt);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m121373a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        ClassLoader classLoader = emq0.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    /* JADX INFO: renamed from: b */
    public static emq0 m121374b() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return m121375c();
        }
        try {
            return m121377f();
        } catch (Throwable unused) {
            return m121375c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static emq0 m121375c() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return m121378h();
        }
        try {
            return m121379i();
        } catch (Throwable unused) {
            return m121378h();
        }
    }

    /* JADX INFO: renamed from: e */
    private static emq0 m121376e(String str) {
        try {
            return new emq0(str);
        } catch (Exception e) {
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized emq0 m121377f() {
        try {
            if (f94679f == null) {
                f94679f = m121376e("JNI");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f94679f;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized emq0 m121378h() {
        try {
            if (f94681h == null) {
                f94681h = m121376e("JavaSafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f94681h;
    }

    /* JADX INFO: renamed from: i */
    public static synchronized emq0 m121379i() {
        try {
            if (f94680g == null) {
                f94680g = m121376e("JavaUnsafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f94680g;
    }

    /* JADX INFO: renamed from: d */
    public cmq0 m121380d() {
        return this.f94683b;
    }

    /* JADX INFO: renamed from: g */
    public z7g0 m121381g(int i) {
        this.f94685d.m218890a(i);
        return null;
    }

    public String toString() {
        return emq0.class.getSimpleName() + ":" + this.f94682a;
    }
}
