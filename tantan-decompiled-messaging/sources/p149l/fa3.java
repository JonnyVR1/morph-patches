package p149l;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class fa3 {

    /* JADX INFO: renamed from: a */
    private static Object f96556a;

    /* JADX INFO: renamed from: b */
    private static Method f96557b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f96557b = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f96556a = method.invoke(null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m120142a(String... strArr) {
        Method method;
        Object obj = f96556a;
        if (obj != null && (method = f96557b) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
