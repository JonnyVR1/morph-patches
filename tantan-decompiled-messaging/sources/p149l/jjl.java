package p149l;

import android.graphics.Color;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class jjl {
    /* JADX INFO: renamed from: a */
    public static String m141807a(String str) {
        return "." + str + ",." + str + " *";
    }

    /* JADX INFO: renamed from: b */
    public static String m141808b(@ColorInt int i) {
        return vck0.m197793D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }
}
