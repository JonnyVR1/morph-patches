package p149l;

import com.tantanapp.beatles.utils.ReflectException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class kmc0 {

    /* JADX INFO: renamed from: a */
    public final Object f123782a;

    /* JADX INFO: renamed from: b */
    public final boolean f123783b = true;

    /* JADX INFO: renamed from: l.kmc0$a */
    public static class C18046a {
    }

    public kmc0(Class<?> cls) {
        this.f123782a = cls;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: a */
    public static <T extends AccessibleObject> T m146491a(T t) {
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
    public static Class<?> m146492g(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static kmc0 m146493k(Class<?> cls) {
        return new kmc0(cls);
    }

    /* JADX INFO: renamed from: l */
    public static kmc0 m146494l(Object obj) {
        return new kmc0(obj);
    }

    /* JADX INFO: renamed from: m */
    public static kmc0 m146495m(String str) throws ReflectException {
        return m146493k(m146492g(str));
    }

    /* JADX INFO: renamed from: n */
    public static kmc0 m146496n(Method method, Object obj, Object... objArr) throws ReflectException {
        return m146497o(true, method, obj, objArr);
    }

    /* JADX INFO: renamed from: o */
    public static kmc0 m146497o(boolean z, Method method, Object obj, Object... objArr) throws ReflectException {
        if (z) {
            try {
                m146491a(method);
            } catch (Exception e) {
                throw new ReflectException(e);
            }
        }
        if (method.getReturnType() != Void.TYPE) {
            return m146494l(method.invoke(obj, objArr));
        }
        method.invoke(obj, objArr);
        return m146494l(obj);
    }

    /* JADX INFO: renamed from: s */
    public static Class<?>[] m146498s(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? C18046a.class : obj.getClass();
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: t */
    public static Object m146499t(Object obj) {
        return obj instanceof kmc0 ? ((kmc0) obj).m146506h() : obj;
    }

    /* JADX INFO: renamed from: u */
    public static Class<?> m146500u(Class<?> cls) {
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
    public kmc0 m146501b(String str) throws ReflectException {
        return m146502c(str, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public kmc0 m146502c(String str, Object... objArr) throws ReflectException {
        Class<?>[] clsArrM146498s = m146498s(objArr);
        try {
            try {
                return m146496n(m146503d(str, clsArrM146498s), this.f123782a, objArr);
            } catch (NoSuchMethodException e) {
                throw new ReflectException(e);
            }
        } catch (NoSuchMethodException unused) {
            return m146496n(m146510q(str, clsArrM146498s), this.f123782a, objArr);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Method m146503d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM146511r = m146511r();
        try {
            return clsM146511r.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsM146511r.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsM146511r = clsM146511r.getSuperclass();
                }
            } while (clsM146511r != null);
            throw new NoSuchMethodException();
        }
    }

    /* JADX INFO: renamed from: e */
    public kmc0 m146504e(String str) throws ReflectException {
        try {
            return m146494l(m146505f(str).get(this.f123782a));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof kmc0) {
            return this.f123782a.equals(((kmc0) obj).m146506h());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Field m146505f(String str) throws ReflectException {
        Class<?> clsM146511r = m146511r();
        try {
            return clsM146511r.getField(str);
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) m146491a(clsM146511r.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsM146511r = clsM146511r.getSuperclass();
                }
            } while (clsM146511r != null);
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public <T> T m146506h() {
        return (T) this.f123782a;
    }

    public int hashCode() {
        return this.f123782a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m146507i(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && m146508j(method.getParameterTypes(), clsArr);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m146508j(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C18046a.class && !m146500u(clsArr[i]).isAssignableFrom(m146500u(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public kmc0 m146509p(String str, Object obj) throws ReflectException {
        try {
            m146505f(str).set(this.f123782a, m146499t(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX INFO: renamed from: q */
    public final Method m146510q(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsM146511r = m146511r();
        for (Method method : clsM146511r.getMethods()) {
            if (m146507i(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsM146511r.getDeclaredMethods()) {
                if (m146507i(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsM146511r = clsM146511r.getSuperclass();
        } while (clsM146511r != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + m146511r() + ".");
    }

    /* JADX INFO: renamed from: r */
    public Class<?> m146511r() {
        boolean z = this.f123783b;
        Object obj = this.f123782a;
        return z ? (Class) obj : obj.getClass();
    }

    public String toString() {
        return this.f123782a.toString();
    }

    public kmc0(Object obj) {
        this.f123782a = obj;
    }
}
