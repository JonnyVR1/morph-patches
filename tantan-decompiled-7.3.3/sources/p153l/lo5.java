package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tantanapp.common.utils.CrashHelper;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes8.dex */
public class lo5 {
    /* JADX INFO: renamed from: a */
    public static void m155037a(int i) {
        try {
            Reflect.m222383on("android.graphics.Bitmap").set("sDefaultDensity", Integer.valueOf(i));
        } catch (Throwable th) {
            if (dmk0.m116964c(th, NoSuchFieldException.class)) {
                return;
            }
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m155038b(Context context) {
        try {
            float f = Resources.getSystem().getDisplayMetrics().density;
            float f2 = Resources.getSystem().getDisplayMetrics().scaledDensity;
            int i = Resources.getSystem().getDisplayMetrics().densityDpi;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics.density == f && displayMetrics.scaledDensity == f2 && displayMetrics.densityDpi == i) {
                return;
            }
            displayMetrics.scaledDensity = f2;
            displayMetrics.density = f;
            displayMetrics.densityDpi = i;
            m155037a(i);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m155039c(Context context, int i) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / i;
            float f2 = Resources.getSystem().getDisplayMetrics().density;
            float f3 = Resources.getSystem().getDisplayMetrics().scaledDensity;
            displayMetrics.density = f;
            displayMetrics.scaledDensity = (f3 / f2) * f;
            int i2 = ((int) f) * 160;
            displayMetrics.densityDpi = i2;
            m155037a(i2);
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m155040d(int i) {
        return i != 0 && rsf0.m182965i(i) <= 320.0f;
    }
}
