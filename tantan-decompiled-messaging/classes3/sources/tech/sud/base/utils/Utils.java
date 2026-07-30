package tech.sud.base.utils;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Field;
import l.jfd0;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Utils {
    public static final String _TAG = "SudGIP Utils";
    private static Application sApp;

    private static Object getActivityThread() {
        Object activityThreadInActivityThreadStaticField = getActivityThreadInActivityThreadStaticField();
        return activityThreadInActivityThreadStaticField != null ? activityThreadInActivityThreadStaticField : getActivityThreadInActivityThreadStaticMethod();
    }

    private static Object getActivityThreadInActivityThreadStaticField() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e) {
            SudLogger.m10034e(_TAG, "getActivityThreadInActivityThreadStaticField: " + e.getMessage());
            return null;
        }
    }

    private static Object getActivityThreadInActivityThreadStaticMethod() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e) {
            SudLogger.m10034e(_TAG, "getActivityThreadInActivityThreadStaticMethod: " + e.getMessage());
            return null;
        }
    }

    public static Application getApp() {
        Application application = sApp;
        if (application != null) {
            return application;
        }
        init(getApplicationByReflect());
        if (sApp == null) {
            jfd0.a("reflect failed.");
            return null;
        }
        SudLogger.m10032d(_TAG, UtilsBridge.getCurrentProcessName() + " reflect app success.");
        return sApp;
    }

    private static Application getApplicationByReflect() {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object activityThread = getActivityThread();
            if (activityThread == null || (objInvoke = cls.getMethod("getApplication", null).invoke(activityThread, null)) == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void init(Application application) {
        if (application == null) {
            SudLogger.m10032d(_TAG, "app is null.");
            return;
        }
        Application application2 = sApp;
        if (application2 == null) {
            sApp = application;
        } else {
            if (application2.equals(application)) {
                return;
            }
            sApp = application;
        }
    }

    public static void initContext(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            init((Application) applicationContext);
        }
    }
}
