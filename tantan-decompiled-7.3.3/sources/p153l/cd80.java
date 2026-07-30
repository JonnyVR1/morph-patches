package p153l;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public final class cd80 {

    /* JADX INFO: renamed from: a */
    public static final int f81111a;

    /* JADX INFO: renamed from: b */
    public static final boolean f81112b;

    /* JADX INFO: renamed from: l.cd80$a */
    public static class C16235a implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassLoader run() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    static {
        int iM109127d = m109127d();
        f81111a = iM109127d;
        f81112b = iM109127d != 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m109124a() {
        return f81111a;
    }

    /* JADX INFO: renamed from: b */
    public static ClassLoader m109125b() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new C16235a());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m109126c() {
        return f81112b;
    }

    /* JADX INFO: renamed from: d */
    public static int m109127d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, m109125b()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
