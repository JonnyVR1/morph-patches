package p149l;

import com.p069ss.android.ttvecamera.C13341g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class ujh0 {
    /* JADX INFO: renamed from: a */
    private static Method m194011a(Class<? extends Object> cls, String str, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str) && m194013c(method.getParameterTypes(), objArr)) {
                return method;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return m194011a(superclass, str, objArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m194012b(String str, String str2, Object[] objArr) {
        try {
            Method methodM194011a = m194011a(Class.forName(str), str2, objArr);
            methodM194011a.setAccessible(true);
            return (T) methodM194011a.invoke(null, objArr);
        } catch (Exception e) {
            C13341g.m80823j("TEReflectUtil", "couldn't invoke " + str2 + ", " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m194013c(Class<?>[] clsArr, Object[] objArr) {
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
