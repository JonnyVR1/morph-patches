package p153l;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes13.dex */
public class fc2 {
    /* JADX INFO: renamed from: a */
    public static Drawable m124971a(@ColorInt int i, float f, boolean z) {
        return m124973c(i, -3355444, f, false, z);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m124972b(@ColorInt int i, @ColorInt int i2, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        return m124974d(i, i2, 0.0f, new float[]{f, f, f2, f2, f3, f3, f4, f4}, z, z2);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m124973c(@ColorInt int i, @ColorInt int i2, float f, boolean z, boolean z2) {
        return m124974d(i, i2, f, null, z, z2);
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m124974d(@ColorInt int i, @ColorInt int i2, float f, float[] fArr, boolean z, boolean z2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        if (f != 0.0f) {
            gradientDrawable.setCornerRadius(f);
        }
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        gradientDrawable.setShape(0);
        return !z2 ? gradientDrawable : new RippleDrawable(ColorStateList.valueOf(i2), gradientDrawable, null);
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m124975e(@ColorInt int[] iArr, GradientDrawable.Orientation orientation, float f, boolean z) {
        return m124976f(iArr, orientation, -3355444, f, false, z);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m124976f(@ColorInt int[] iArr, GradientDrawable.Orientation orientation, @ColorInt int i, float f, boolean z, boolean z2) {
        return m124977g(iArr, orientation, i, f, null, z, z2);
    }

    /* JADX INFO: renamed from: g */
    public static Drawable m124977g(@ColorInt int[] iArr, GradientDrawable.Orientation orientation, @ColorInt int i, float f, float[] fArr, boolean z, boolean z2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(orientation);
        if (f != 0.0f) {
            gradientDrawable.setCornerRadius(f);
        }
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        gradientDrawable.setShape(0);
        return !z2 ? gradientDrawable : new RippleDrawable(ColorStateList.valueOf(i), gradientDrawable, null);
    }

    /* JADX INFO: renamed from: h */
    public static GradientDrawable m124978h(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i});
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m124979i(@ColorInt int i, int i2) {
        float fM175859d = qa00.m175859d(i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(fM175859d);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j */
    public static GradientDrawable m124980j(@ColorInt int i, @ColorInt int i2, int i3) {
        return m124981k(i, i2, i3, GradientDrawable.Orientation.LEFT_RIGHT);
    }

    /* JADX INFO: renamed from: k */
    public static GradientDrawable m124981k(@ColorInt int i, @ColorInt int i2, int i3, GradientDrawable.Orientation orientation) {
        int[] iArr = {i, i2};
        float fM175859d = qa00.m175859d(i3);
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(fM175859d);
        return gradientDrawable;
    }
}
