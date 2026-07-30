package p153l;

import android.graphics.Color;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aml {
    /* JADX INFO: renamed from: a */
    public static String m98848a(String str) {
        return "." + str + ",." + str + " *";
    }

    /* JADX INFO: renamed from: b */
    public static String m98849b(@ColorInt int i) {
        return bmk0.m105071D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
