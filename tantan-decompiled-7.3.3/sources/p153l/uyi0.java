package p153l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public final class uyi0 {

    /* JADX INFO: renamed from: a */
    public static final Object f181625a;

    /* JADX INFO: renamed from: b */
    public static final Method f181626b;

    /* JADX INFO: renamed from: c */
    public static final Method f181627c;

    static {
        Object objM198654b = m198654b();
        f181625a = objM198654b;
        f181626b = objM198654b == null ? null : m198653a();
        f181627c = objM198654b != null ? m198656d(objM198654b) : null;
    }

    /* JADX INFO: renamed from: a */
    public static Method m198653a() {
        return m198655c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* JADX INFO: renamed from: b */
    public static Object m198654b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m198655c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m198656d(Object obj) {
        try {
            Method methodM198655c = m198655c("getStackTraceDepth", Throwable.class);
            if (methodM198655c == null) {
                return null;
            }
            methodM198655c.invoke(obj, new Throwable());
            return methodM198655c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static <X extends Throwable> void m198657e(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            m198660h(th, cls);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static void m198658f(Throwable th) {
        if (th != null) {
            m198661i(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static <X extends Throwable> void m198659g(Throwable th, Class<X> cls) throws Throwable {
        m198657e(th, cls);
        m198658f(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: h */
    public static <X extends Throwable> void m198660h(Throwable th, Class<X> cls) throws Throwable {
        xn80.m212111p(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m198661i(Throwable th) {
        xn80.m212111p(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
