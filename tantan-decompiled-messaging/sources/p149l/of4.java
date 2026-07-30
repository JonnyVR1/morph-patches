package p149l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class of4 {

    /* JADX INFO: renamed from: a */
    public static Method f143623a;

    /* JADX INFO: renamed from: b */
    public static Method f143624b;

    /* JADX INFO: renamed from: c */
    public static boolean f143625c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: a */
    public static void m164056a(@NonNull Canvas canvas, boolean z) {
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
            qkq0.m175383a("This method doesn't work on Pie!");
            return;
        }
        if (!f143625c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f143623a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f143624b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f143625c = true;
        }
        if (z) {
            try {
                Method method2 = f143623a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e) {
                aag0.m95543a(e.getCause());
                return;
            }
        }
        if (z || (method = f143624b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
