package p153l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ng4 {

    /* JADX INFO: renamed from: a */
    public static Method f141787a;

    /* JADX INFO: renamed from: b */
    public static Method f141788b;

    /* JADX INFO: renamed from: c */
    public static boolean f141789c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static void m162963a(@NonNull Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i == 28) {
            wtq0.m207906a("This method doesn't work on Pie!");
            return;
        }
        if (!f141789c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f141787a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f141788b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f141789c = true;
        }
        if (z) {
            try {
                Method method2 = f141787a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                iig0.m140070a(e.getCause());
                return;
            }
        }
        if (z || (method = f141788b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
