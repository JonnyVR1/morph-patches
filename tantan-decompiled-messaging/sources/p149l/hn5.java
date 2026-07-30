package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tantanapp.common.utils.CrashHelper;
import org.joor.Reflect;

/* JADX INFO: loaded from: classes8.dex */
public class hn5 {
    /* JADX INFO: renamed from: a */
    public static void m131878a(int i) {
        try {
            Reflect.m221137on("android.graphics.Bitmap").set("sDefaultDensity", Integer.valueOf(i));
        } catch (Throwable th) {
            if (xck0.m208122c(th, NoSuchFieldException.class)) {
                return;
            }
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m131879b(Context context) {
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
            m131878a(i);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m131880c(Context context, int i) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels / i;
            float f2 = Resources.getSystem().getDisplayMetrics().density;
            float f3 = Resources.getSystem().getDisplayMetrics().scaledDensity;
            displayMetrics.density = f;
            displayMetrics.scaledDensity = (f3 / f2) * f;
            int i2 = ((int) f) * 160;
            displayMetrics.densityDpi = i2;
            m131878a(i2);
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m131881d(int i) {
        return i != 0 && ikf0.m136795i(i) <= 320.0f;
    }
}
