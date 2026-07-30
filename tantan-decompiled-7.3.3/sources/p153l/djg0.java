package p153l;

import android.app.Activity;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes.dex */
public abstract class djg0 {

    /* JADX INFO: renamed from: a */
    public static final String f88849a = "SudGIP ".concat(djg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public static Object m116092a() {
        Object obj;
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e) {
            SudLogger.m222813e(f88849a, "getActivityThreadInActivityThreadStaticField: " + e.getMessage());
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null).invoke(null, null);
        } catch (Exception e2) {
            SudLogger.m222813e(f88849a, "getActivityThreadInActivityThreadStaticMethod: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Activity m116093b() {
        Activity activity;
        LinkedList<Activity> linkedList = new LinkedList();
        try {
            Object objM116092a = m116092a();
            if (objM116092a != null) {
                Field declaredField = objM116092a.getClass().getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objM116092a);
                if (obj instanceof Map) {
                    activity = null;
                    for (Object obj2 : ((Map) obj).values()) {
                        try {
                            Class<?> cls = obj2.getClass();
                            Field declaredField2 = cls.getDeclaredField("activity");
                            declaredField2.setAccessible(true);
                            Activity activity2 = (Activity) declaredField2.get(obj2);
                            if (activity == null) {
                                Field declaredField3 = cls.getDeclaredField("paused");
                                declaredField3.setAccessible(true);
                                if (declaredField3.getBoolean(obj2)) {
                                    linkedList.addFirst(activity2);
                                } else {
                                    activity = activity2;
                                }
                            } else {
                                linkedList.addFirst(activity2);
                            }
                        } catch (Exception e) {
                            e = e;
                            SudLogger.m222813e(f88849a, "getActivitiesByReflect: " + e.getMessage());
                        }
                    }
                    if (activity != null) {
                        linkedList.addFirst(activity);
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            activity = null;
        }
        for (Activity activity3 : linkedList) {
            if (activity3 != null && !activity3.isFinishing() && !activity3.isDestroyed()) {
                return activity3;
            }
        }
        return null;
    }
}
