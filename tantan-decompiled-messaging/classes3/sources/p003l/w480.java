package p003l;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class w480 {

    /* JADX INFO: renamed from: a */
    public static final int f8485a;

    /* JADX INFO: renamed from: b */
    public static final boolean f8486b;

    /* JADX INFO: renamed from: l.w480$a */
    public static class C0612a implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassLoader run() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    static {
        int iM8473d = m8473d();
        f8485a = iM8473d;
        f8486b = iM8473d != 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m8470a() {
        return f8485a;
    }

    /* JADX INFO: renamed from: b */
    public static ClassLoader m8471b() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new C0612a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8472c() {
        return f8486b;
    }

    /* JADX INFO: renamed from: d */
    public static int m8473d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, m8471b()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
