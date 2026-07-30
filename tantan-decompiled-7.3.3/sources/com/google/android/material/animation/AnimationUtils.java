package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import p153l.lor;
import p153l.yjg;
import p153l.zjg;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new zjg();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new yjg();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new lor();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static int lerp(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
