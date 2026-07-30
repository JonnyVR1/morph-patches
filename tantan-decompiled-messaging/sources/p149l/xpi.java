package p149l;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class xpi {

    /* JADX INFO: renamed from: a */
    private static final Object f193922a;

    /* JADX INFO: renamed from: b */
    private static final Method f193923b;

    static {
        Object objM210497c = m210497c();
        f193922a = objM210497c;
        f193923b = m210498d(objM210497c);
    }

    /* JADX INFO: renamed from: a */
    public static void m210495a() {
        m210502h(false);
    }

    /* JADX INFO: renamed from: b */
    public static void m210496b() {
        m210502h(false);
    }

    /* JADX INFO: renamed from: c */
    private static Object m210497c() {
        Method methodM210501g;
        Object objM210499e;
        Class<?> clsM210500f;
        Method methodM210501g2;
        Class<?> clsM210500f2 = m210500f("android.os.ServiceManager");
        if (clsM210500f2 == null || (methodM210501g = m210501g(clsM210500f2, "getService", String.class)) == null || (objM210499e = m210499e(methodM210501g, null, "hardware")) == null || (clsM210500f = m210500f("android.os.IHardwareService$Stub")) == null || (methodM210501g2 = m210501g(clsM210500f, "asInterface", IBinder.class)) == null) {
            return null;
        }
        return m210499e(methodM210501g2, null, objM210499e);
    }

    /* JADX INFO: renamed from: d */
    private static Method m210498d(Object obj) {
        if (obj == null) {
            return null;
        }
        return m210501g(obj.getClass(), "setFlashlightEnabled", Boolean.TYPE);
    }

    /* JADX INFO: renamed from: e */
    private static Object m210499e(Method method, Object obj, Object... objArr) {
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
    private static Class<?> m210500f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static Method m210501g(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException | RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m210502h(boolean z) {
        Object obj = f193922a;
        if (obj != null) {
            m210499e(f193923b, obj, Boolean.valueOf(z));
        }
    }
}
