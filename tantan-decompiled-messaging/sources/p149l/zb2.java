package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes11.dex */
public class zb2 {
    /* JADX INFO: renamed from: a */
    public static String m217813a(String str) {
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
    public static GradientDrawable m217814b(String str, int i) {
        float fM186890d = t100.m186890d(i);
        int color = Color.parseColor(m217813a(str));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(fM186890d);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m217815c(String str, String str2, int i, GradientDrawable.Orientation orientation) {
        int[] iArr = {Color.parseColor(m217813a(str)), Color.parseColor(m217813a(str2))};
        float fM186890d = t100.m186890d(i);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fM186890d);
        return gradientDrawable;
    }

    @ColorInt
    /* JADX INFO: renamed from: d */
    public static int m217816d(String str) {
        return Color.parseColor(m217813a(str));
    }
}
