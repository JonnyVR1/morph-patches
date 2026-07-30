package p009l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zb2 {
    /* JADX INFO: renamed from: a */
    public static String m25627a(String str) {
        if (str.length() == 3) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 3; i++) {
                char cCharAt = str.charAt(i);
                sb.append(cCharAt);
                sb.append(cCharAt);
            }
            return sb.toString();
        }
        if (str.length() != 4 || !str.startsWith("#")) {
            return !str.startsWith("#") ? "#".concat(str) : str;
        }
        StringBuilder sb2 = new StringBuilder("#");
        for (int i2 = 1; i2 < 4; i2++) {
            char cCharAt2 = str.charAt(i2);
            sb2.append(cCharAt2);
            sb2.append(cCharAt2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static GradientDrawable m25628b(String str, int i) {
        float fD = t100.d(i);
        int color = Color.parseColor(m25627a(str));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(fD);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m25629c(String str, String str2, int i, GradientDrawable.Orientation orientation) {
        int[] iArr = {Color.parseColor(m25627a(str)), Color.parseColor(m25627a(str2))};
        float fD = t100.d(i);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fD);
        return gradientDrawable;
    }

    @ColorInt
    /* JADX INFO: renamed from: d */
    public static int m25630d(String str) {
        return Color.parseColor(m25627a(str));
    }
}
