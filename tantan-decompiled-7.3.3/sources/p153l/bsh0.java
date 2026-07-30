package p153l;

import com.p074ss.android.ttvecamera.C13504g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class bsh0 {
    /* JADX INFO: renamed from: a */
    private static Method m106237a(Class<? extends Object> cls, String str, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str) && m106239c(method.getParameterTypes(), objArr)) {
                return method;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return m106237a(superclass, str, objArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m106238b(String str, String str2, Object[] objArr) {
        try {
            Method methodM106237a = m106237a(Class.forName(str), str2, objArr);
            methodM106237a.setAccessible(true);
            return (T) methodM106237a.invoke(null, objArr);
        } catch (Exception e) {
            C13504g.m82006j("TEReflectUtil", "couldn't invoke " + str2 + ", " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m106239c(Class<?>[] clsArr, Object[] objArr) {
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
