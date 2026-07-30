package p149l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cjq0 {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f81218a;

    /* JADX INFO: renamed from: l.cjq0$a */
    public static class C16170a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f81219a;

        /* JADX INFO: renamed from: b */
        public final T f81220b;
    }

    static {
        HashMap map = new HashMap();
        f81218a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        map.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        map.put(cls, cls);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        map.put(cls5, cls5);
        map.put(cls6, cls6);
        map.put(cls7, cls7);
        map.put(cls8, cls8);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m107233a(Class<?> cls, String str, Object... objArr) {
        return (T) m107235c(cls, str, m107238f(objArr)).invoke(null, m107239g(objArr));
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m107234b(String str, String str2, Object... objArr) {
        try {
            return (T) m107233a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m107235c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM107236d = m107236d(cls.getDeclaredMethods(), str, clsArr);
        if (methodM107236d != null) {
            methodM107236d.setAccessible(true);
            return methodM107236d;
        }
        if (cls.getSuperclass() != null) {
            return m107235c(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    /* JADX INFO: renamed from: d */
    private static Method m107236d(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            jfd0.m141176a("Method name must not be null.");
            return null;
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m107237e(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m107237e(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                Map<Class<?>, Class<?>> map = f81218a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static Class<?>[] m107238f(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C16170a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C16170a) obj).f81219a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: g */
    private static Object[] m107239g(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C16170a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C16170a) obj).f81220b;
            }
        }
        return objArr2;
    }
}
