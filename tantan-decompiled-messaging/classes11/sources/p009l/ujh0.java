package p009l;

import com.p008ss.android.ttvecamera.C0743g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ujh0 {
    /* JADX INFO: renamed from: a */
    private static Method m23063a(Class<? extends Object> cls, String str, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str) && m23065c(method.getParameterTypes(), objArr)) {
                return method;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return m23063a(superclass, str, objArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m23064b(String str, String str2, Object[] objArr) {
        try {
            Method methodM23063a = m23063a(Class.forName(str), str2, objArr);
            methodM23063a.setAccessible(true);
            return (T) methodM23063a.invoke(null, objArr);
        } catch (Exception e) {
            C0743g.m11174j("TEReflectUtil", "couldn't invoke " + str2 + ", " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m23065c(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr == null || clsArr.length == 0) {
            return objArr == null || objArr.length == 0;
        }
        if (objArr == null || clsArr.length != objArr.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && !clsArr[i].isAssignableFrom(obj.getClass())) {
                return false;
            }
        }
        return true;
    }
}
