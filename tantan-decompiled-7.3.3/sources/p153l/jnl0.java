package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class jnl0 {

    /* JADX INFO: renamed from: a */
    public static Method f121876a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f121876a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f121876a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m146264a(View view, Rect rect, Rect rect2) {
        Method method = f121876a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m146265b(View view) {
        return kkl0.m150191x(view) == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m146266c(View view) {
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
