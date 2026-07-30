package p153l;

import com.tantanapp.beatles.utils.ReflectException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class puc0 {

    /* JADX INFO: renamed from: a */
    public final Object f154166a;

    /* JADX INFO: renamed from: b */
    public final boolean f154167b = true;

    /* JADX INFO: renamed from: l.puc0$a */
    public static class C19445a {
    }

    public puc0(Class<?> cls) {
        this.f154166a = cls;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: a */
    public static <T extends AccessibleObject> T m173840a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (!Modifier.isPublic(member.getModifiers()) || !Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                if (!t.isAccessible()) {
                    t.setAccessible(true);
                }
            }
        } else if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m173841g(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static puc0 m173842k(Class<?> cls) {
        return new puc0(cls);
    }

    /* JADX INFO: renamed from: l */
    public static puc0 m173843l(Object obj) {
        return new puc0(obj);
    }

    /* JADX INFO: renamed from: m */
    public static puc0 m173844m(String str) throws ReflectException {
        return m173842k(m173841g(str));
    }

    /* JADX INFO: renamed from: n */
    public static puc0 m173845n(Method method, Object obj, Object... objArr) throws ReflectException {
        return m173846o(true, method, obj, objArr);
    }

    /* JADX INFO: renamed from: o */
    public static puc0 m173846o(boolean z, Method method, Object obj, Object... objArr) throws ReflectException {
        if (z) {
            try {
                m173840a(method);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }
        if (method.getReturnType() != Void.TYPE) {
            return m173843l(method.invoke(obj, objArr));
        }
        method.invoke(obj, objArr);
        return m173843l(obj);
    }

    /* JADX INFO: renamed from: s */
    public static Class<?>[] m173847s(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? C19445a.class : obj.getClass();
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: t */
    public static Object m173848t(Object obj) {
        return obj instanceof puc0 ? ((puc0) obj).m173855h() : obj;
    }

    /* JADX INFO: renamed from: u */
    public static Class<?> m173849u(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        return Void.TYPE == cls ? Void.class : cls;
    }

    /* JADX INFO: renamed from: b */
    public puc0 m173850b(String str) throws ReflectException {
        return m173851c(str, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public puc0 m173851c(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrM173847s = m173847s(objArr);
        try {
            try {
                return m173845n(m173852d(str, clsArrM173847s), this.f154166a, objArr);
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            return m173845n(m173859q(str, clsArrM173847s), this.f154166a, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Method m173852d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM173860r = m173860r();
        try {
            return clsM173860r.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsM173860r.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsM173860r = clsM173860r.getSuperclass();
                }
            } while (clsM173860r != null);
            throw new NoSuchMethodException();
        }
    }

    /* JADX INFO: renamed from: e */
    public puc0 m173853e(String str) throws ReflectException {
        try {
            return m173843l(m173854f(str).get(this.f154166a));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof puc0) {
            return this.f154166a.equals(((puc0) obj).m173855h());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Field m173854f(String str) throws ReflectException {
        Class<?> clsM173860r = m173860r();
        try {
            return clsM173860r.getField(str);
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) m173840a(clsM173860r.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsM173860r = clsM173860r.getSuperclass();
                }
            } while (clsM173860r != null);
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> T m173855h() {
        return (T) this.f154166a;
    }

    public int hashCode() {
        return this.f154166a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m173856i(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && m173857j(method.getParameterTypes(), clsArr);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m173857j(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C19445a.class && !m173849u(clsArr[i]).isAssignableFrom(m173849u(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public puc0 m173858p(String str, Object obj) throws ReflectException {
        try {
            m173854f(str).set(this.f154166a, m173848t(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final Method m173859q(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM173860r = m173860r();
        for (Method method : clsM173860r.getMethods()) {
            if (m173856i(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsM173860r.getDeclaredMethods()) {
                if (m173856i(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsM173860r = clsM173860r.getSuperclass();
        } while (clsM173860r != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + m173860r() + ".");
    }

    /* JADX INFO: renamed from: r */
    public Class<?> m173860r() {
        boolean z = this.f154167b;
        Object obj = this.f154166a;
        return z ? (Class) obj : obj.getClass();
    }

    public String toString() {
        return this.f154166a.toString();
    }

    public puc0(Object obj) {
        this.f154166a = obj;
    }
}
