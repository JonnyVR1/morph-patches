package p007l;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class sek0 {
    /* JADX INFO: renamed from: a */
    public static void m10654a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            activity.setTranslucent(false);
            return;
        }
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, null);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        } catch (NoSuchMethodException e2) {
            CrashHelper.c(e2);
        } catch (InvocationTargetException e3) {
            CrashHelper.c(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10655b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            activity.setTranslucent(true);
        } else {
            m10656c(activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX INFO: renamed from: c */
    public static void m10656c(Activity activity) {
        Method declaredMethod;
        Object objInvoke;
        try {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i < 34 || (i == 34 && Build.VERSION.PREVIEW_SDK_INT == 0)) {
                    try {
                        declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", null);
                    } catch (NoSuchMethodException unused) {
                        declaredMethod = null;
                    }
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        objInvoke = declaredMethod.invoke(activity, null);
                    } else {
                        objInvoke = null;
                    }
                } else {
                    objInvoke = null;
                }
                Class<?> cls = null;
                for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
                    if (cls2.getSimpleName().contains("TranslucentConversionListener") && !cls2.getSimpleName().contains("SemTranslucentConversionListener")) {
                        cls = cls2;
                    }
                }
                Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, null, objInvoke);
            } catch (NoSuchMethodException e) {
                try {
                    Method[] declaredMethods = Activity.class.getDeclaredMethods();
                    StringBuilder sb = new StringBuilder();
                    for (Method method : declaredMethods) {
                        sb.append("\n");
                        sb.append(method);
                    }
                    CrashHelper.c(new RuntimeException("convertActivityToTranslucentAfterL NoSuchMethodException , methods=" + ((Object) sb), e));
                } catch (Throwable th) {
                    CrashHelper.c(new RuntimeException("activity getDeclaredMethods error", th));
                }
            }
        } catch (IllegalAccessException e2) {
            CrashHelper.c(e2);
        } catch (InvocationTargetException e3) {
            CrashHelper.c(e3);
        }
    }
}
