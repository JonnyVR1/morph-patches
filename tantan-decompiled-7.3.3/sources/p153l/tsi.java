package p153l;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class tsi {

    /* JADX INFO: renamed from: a */
    private static final Object f176003a;

    /* JADX INFO: renamed from: b */
    private static final Method f176004b;

    static {
        Object objM192611c = m192611c();
        f176003a = objM192611c;
        f176004b = m192612d(objM192611c);
    }

    /* JADX INFO: renamed from: a */
    public static void m192609a() {
        m192616h(false);
    }

    /* JADX INFO: renamed from: b */
    public static void m192610b() {
        m192616h(false);
    }

    /* JADX INFO: renamed from: c */
    private static Object m192611c() {
        Method methodM192615g;
        Object objM192613e;
        Class<?> clsM192614f;
        Method methodM192615g2;
        Class<?> clsM192614f2 = m192614f("android.os.ServiceManager");
        if (clsM192614f2 == null || (methodM192615g = m192615g(clsM192614f2, "getService", String.class)) == null || (objM192613e = m192613e(methodM192615g, null, "hardware")) == null || (clsM192614f = m192614f("android.os.IHardwareService$Stub")) == null || (methodM192615g2 = m192615g(clsM192614f, "asInterface", IBinder.class)) == null) {
            return null;
        }
        return m192613e(methodM192615g2, null, objM192613e);
    }

    /* JADX INFO: renamed from: d */
    private static Method m192612d(Object obj) {
        if (obj == null) {
            return null;
        }
        return m192615g(obj.getClass(), "setFlashlightEnabled", Boolean.TYPE);
    }

    /* JADX INFO: renamed from: e */
    private static Object m192613e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            Objects.toString(method);
            return null;
        } catch (RuntimeException unused2) {
            Objects.toString(method);
            return null;
        } catch (InvocationTargetException e) {
            Objects.toString(method);
            e.getCause();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static Class<?> m192614f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static Method m192615g(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m192616h(boolean z) {
        Object obj = f176003a;
        if (obj != null) {
            m192613e(f176004b, obj, Boolean.valueOf(z));
        }
    }
}
