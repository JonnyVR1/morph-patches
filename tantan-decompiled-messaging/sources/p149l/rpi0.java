package p149l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public final class rpi0 {

    /* JADX INFO: renamed from: a */
    public static final Object f160504a;

    /* JADX INFO: renamed from: b */
    public static final Method f160505b;

    /* JADX INFO: renamed from: c */
    public static final Method f160506c;

    static {
        Object objM180331b = m180331b();
        f160504a = objM180331b;
        f160505b = objM180331b == null ? null : m180330a();
        f160506c = objM180331b != null ? m180333d(objM180331b) : null;
    }

    /* JADX INFO: renamed from: a */
    public static Method m180330a() {
        return m180332c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* JADX INFO: renamed from: b */
    public static Object m180331b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m180332c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m180333d(Object obj) {
        try {
            Method methodM180332c = m180332c("getStackTraceDepth", Throwable.class);
            if (methodM180332c == null) {
                return null;
            }
            methodM180332c.invoke(obj, new Throwable());
            return methodM180332c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static <X extends Throwable> void m180334e(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            m180337h(th, cls);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static void m180335f(Throwable th) {
        if (th != null) {
            m180338i(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static <X extends Throwable> void m180336g(Throwable th, Class<X> cls) throws Throwable {
        m180334e(th, cls);
        m180335f(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: h */
    public static <X extends Throwable> void m180337h(Throwable th, Class<X> cls) throws Throwable {
        sf80.m183894p(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m180338i(Throwable th) {
        sf80.m183894p(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
