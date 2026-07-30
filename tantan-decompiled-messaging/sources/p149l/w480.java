package p149l;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public final class w480 {

    /* JADX INFO: renamed from: a */
    public static final int f184485a;

    /* JADX INFO: renamed from: b */
    public static final boolean f184486b;

    /* JADX INFO: renamed from: l.w480$a */
    public static class C20798a implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassLoader run() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    static {
        int iM201478d = m201478d();
        f184485a = iM201478d;
        f184486b = iM201478d != 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m201475a() {
        return f184485a;
    }

    /* JADX INFO: renamed from: b */
    public static ClassLoader m201476b() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new C20798a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m201477c() {
        return f184486b;
    }

    /* JADX INFO: renamed from: d */
    public static int m201478d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, m201476b()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
