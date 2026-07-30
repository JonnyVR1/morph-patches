package p149l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ikq0 {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f113718a;

    /* JADX INFO: renamed from: l.ikq0$a */
    public static class C17572a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f113719a;

        /* JADX INFO: renamed from: b */
        public final T f113720b;
    }

    static {
        HashMap map = new HashMap();
        f113718a = map;
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
    public static <T> T m136878a(Class<? extends Object> cls, Object obj, String str) throws NoSuchFieldException {
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m136879b(Class<? extends Object> cls, String str) {
        try {
            return (T) m136878a(cls, null, str);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m136880c(Class<?> cls, String str, Object... objArr) {
        return (T) m136885h(cls, str, m136889l(objArr)).invoke(null, m136890m(objArr));
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m136881d(Object obj, String str) {
        try {
            return (T) m136878a(obj.getClass(), obj, str);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m136882e(Object obj, String str, Object... objArr) {
        try {
            return (T) m136891n(obj, str, objArr);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m136883f(String str, String str2) {
        try {
            return (T) m136878a(nwq0.m161880c(null, str), null, str2);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m136884g(String str, String str2, Object... objArr) {
        try {
            return (T) m136880c(nwq0.m161880c(null, str), str2, objArr);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static Method m136885h(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM136886i = m136886i(cls.getDeclaredMethods(), str, clsArr);
        if (methodM136886i != null) {
            methodM136886i.setAccessible(true);
            return methodM136886i;
        }
        if (cls.getSuperclass() != null) {
            return m136885h(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    /* JADX INFO: renamed from: i */
    private static Method m136886i(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            jfd0.m141176a("Method name must not be null.");
            return null;
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m136888k(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m136887j(Object obj, String str, Object obj2) {
        try {
            m136892o(obj, str, obj2);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: k */
    private static boolean m136888k(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
            Class<?> cls = clsArr2[i];
            if (cls != null && !clsArr[i].isAssignableFrom(cls)) {
                Map<Class<?>, Class<?>> map = f113718a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    private static Class<?>[] m136889l(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C17572a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C17572a) obj).f113719a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: m */
    private static Object[] m136890m(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C17572a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C17572a) obj).f113720b;
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m136891n(Object obj, String str, Object... objArr) {
        return (T) m136885h(obj.getClass(), str, m136889l(objArr)).invoke(obj, m136890m(objArr));
    }

    /* JADX INFO: renamed from: o */
    public static void m136892o(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Class<?> superclass = obj.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
