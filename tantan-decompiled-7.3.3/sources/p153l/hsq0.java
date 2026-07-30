package p153l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hsq0 {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f111469a;

    /* JADX INFO: renamed from: l.hsq0$a */
    public static class C17573a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f111470a;

        /* JADX INFO: renamed from: b */
        public final T f111471b;
    }

    static {
        HashMap map = new HashMap();
        f111469a = map;
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
    public static <T> T m137028a(Class<?> cls, String str, Object... objArr) {
        return (T) m137030c(cls, str, m137033f(objArr)).invoke(null, m137034g(objArr));
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m137029b(String str, String str2, Object... objArr) {
        try {
            return (T) m137028a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static Method m137030c(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM137031d = m137031d(cls.getDeclaredMethods(), str, clsArr);
        if (methodM137031d != null) {
            methodM137031d.setAccessible(true);
            return methodM137031d;
        }
        if (cls.getSuperclass() != null) {
            return m137030c(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    /* JADX INFO: renamed from: d */
    private static Method m137031d(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            mnd0.m159157a("Method name must not be null.");
            return null;
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m137032e(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m137032e(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                Map<Class<?>, Class<?>> map = f111469a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static Class<?>[] m137033f(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C17573a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C17573a) obj).f111470a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: g */
    private static Object[] m137034g(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C17573a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C17573a) obj).f111471b;
            }
        }
        return objArr2;
    }
}
