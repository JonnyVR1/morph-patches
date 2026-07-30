package p149l;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class gpf0 {
    /* JADX INFO: renamed from: a */
    public static void m127351a(Context context) {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("com.google.android.play.core.splitcompat.SplitCompat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("install", Context.class);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
        if (method != null) {
            try {
                method.invoke(cls, context);
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m127352b(Context context) {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("com.google.android.play.core.splitcompat.SplitCompat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            try {
                method = cls.getMethod("installActivity", Context.class);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
        if (method != null) {
            try {
                method.invoke(cls, context);
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }
}
