package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class fel0 {

    /* JADX INFO: renamed from: a */
    public static Method f97141a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f97141a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f97141a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m121042a(View view, Rect rect, Rect rect2) {
        Method method = f97141a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m121043b(View view) {
        return gbl0.m125228x(view) == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m121044c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
