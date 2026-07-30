package p149l;

import android.R;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;

/* JADX INFO: loaded from: classes2.dex */
public class nek0 {
    /* JADX INFO: renamed from: a */
    public static int m159111a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: b */
    public static int m159112b(Context context, float f) {
        if (context != null) {
            return (int) (context.getResources().getDisplayMetrics().density * f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m159113c(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m159114d(View view, float f, float f2) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.275f, f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.69f, f2);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4));
        objectAnimatorOfPropertyValuesHolder.setDuration(544L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m159115e(Context context, boolean z) {
        return m159117g(context, m0c0.f130730a, z);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m159116f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m159117g(Context context, @AttrRes int i, boolean z) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public static void m159118h(View view, CharSequence charSequence) {
        if (!m159116f() || view == null || charSequence == null) {
            return;
        }
        view.announceForAccessibility(charSequence);
    }
}
