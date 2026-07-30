package p153l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class otq0 {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Class<?>> f149000a;

    /* JADX INFO: renamed from: l.otq0$a */
    public static class C19213a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends T> f149001a;

        /* JADX INFO: renamed from: b */
        public final T f149002b;
    }

    static {
        HashMap map = new HashMap();
        f149000a = map;
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
    public static <T> T m169163a(Class<? extends Object> cls, Object obj, String str) throws NoSuchFieldException {
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
    public static <T> T m169164b(Class<? extends Object> cls, String str) {
        try {
            return (T) m169163a(cls, null, str);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m169165c(Class<?> cls, String str, Object... objArr) {
        return (T) m169170h(cls, str, m169174l(objArr)).invoke(null, m169175m(objArr));
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m169166d(Object obj, String str) {
        try {
            return (T) m169163a(obj.getClass(), obj, str);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m169167e(Object obj, String str, Object... objArr) {
        try {
            return (T) m169176n(obj, str, objArr);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m169168f(String str, String str2) {
        try {
            return (T) m169163a(t5r0.m189419c(null, str), null, str2);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m169169g(String str, String str2, Object... objArr) {
        try {
            return (T) m169165c(t5r0.m189419c(null, str), str2, objArr);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static Method m169170h(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method methodM169171i = m169171i(cls.getDeclaredMethods(), str, clsArr);
        if (methodM169171i != null) {
            methodM169171i.setAccessible(true);
            return methodM169171i;
        }
        if (cls.getSuperclass() != null) {
            return m169170h(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    /* JADX INFO: renamed from: i */
    private static Method m169171i(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            mnd0.m159157a("Method name must not be null.");
            return null;
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m169173k(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static void m169172j(Object obj, String str, Object obj2) {
        try {
            m169177o(obj, str, obj2);
        } catch (Exception e) {
            Objects.toString(obj);
            e.toString();
        }
    }

    /* JADX INFO: renamed from: k */
    private static boolean m169173k(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                Map<Class<?>, Class<?>> map = f149000a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    private static Class<?>[] m169174l(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C19213a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C19213a) obj).f149001a;
            }
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: m */
    private static Object[] m169175m(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C19213a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C19213a) obj).f149002b;
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m169176n(Object obj, String str, Object... objArr) {
        return (T) m169170h(obj.getClass(), str, m169174l(objArr)).invoke(obj, m169175m(objArr));
    }

    /* JADX INFO: renamed from: o */
    public static void m169177o(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
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
