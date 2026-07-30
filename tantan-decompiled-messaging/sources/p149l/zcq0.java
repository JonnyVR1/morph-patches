package p149l;

import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* JADX INFO: loaded from: classes2.dex */
public final class zcq0 {

    /* JADX INFO: renamed from: f */
    private static zcq0 f202562f;

    /* JADX INFO: renamed from: g */
    private static zcq0 f202563g;

    /* JADX INFO: renamed from: h */
    private static zcq0 f202564h;

    /* JADX INFO: renamed from: a */
    private final String f202565a;

    /* JADX INFO: renamed from: b */
    private final xcq0 f202566b;

    /* JADX INFO: renamed from: c */
    private final ycq0 f202567c;

    /* JADX INFO: renamed from: d */
    private final szf0.InterfaceC20085a f202568d;

    /* JADX INFO: renamed from: e */
    private final tzf0 f202569e;

    private zcq0(String str) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        this.f202565a = str;
        xcq0 xcq0Var = (xcq0) m218075a("net.jpountz.xxhash.XXHash32" + str);
        this.f202566b = xcq0Var;
        this.f202568d = (szf0.InterfaceC20085a) m218075a("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory");
        StringBuilder sb = new StringBuilder("net.jpountz.xxhash.XXHash64");
        sb.append(str);
        this.f202567c = (ycq0) m218075a(sb.toString());
        this.f202569e = (tzf0) m218075a("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory");
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int iNextInt = random.nextInt();
        xcq0Var.m208128a(bArr, 0, 100, iNextInt);
        m218083g(iNextInt);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m218075a(String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        ClassLoader classLoader = zcq0.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    /* JADX INFO: renamed from: b */
    public static zcq0 m218076b() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return m218077c();
        }
        try {
            return m218079f();
        } catch (Throwable unused) {
            return m218077c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static zcq0 m218077c() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return m218080h();
        }
        try {
            return m218081i();
        } catch (Throwable unused) {
            return m218080h();
        }
    }

    /* JADX INFO: renamed from: e */
    private static zcq0 m218078e(String str) {
        try {
            return new zcq0(str);
        } catch (Exception e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized zcq0 m218079f() {
        try {
            if (f202562f == null) {
                f202562f = m218078e("JNI");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f202562f;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized zcq0 m218080h() {
        try {
            if (f202564h == null) {
                f202564h = m218078e("JavaSafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f202564h;
    }

    /* JADX INFO: renamed from: i */
    public static synchronized zcq0 m218081i() {
        try {
            if (f202563g == null) {
                f202563g = m218078e("JavaUnsafe");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f202563g;
    }

    /* JADX INFO: renamed from: d */
    public xcq0 m218082d() {
        return this.f202566b;
    }

    /* JADX INFO: renamed from: g */
    public szf0 m218083g(int i) {
        this.f202568d.m186781a(i);
        return null;
    }

    public String toString() {
        return zcq0.class.getSimpleName() + ":" + this.f202565a;
    }
}
