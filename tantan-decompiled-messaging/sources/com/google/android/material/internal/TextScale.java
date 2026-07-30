package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Map;
import p149l.g9j0;
import p149l.u7j0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextScale extends u7j0 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@NonNull g9j0 g9j0Var) {
        View view = g9j0Var.f101571b;
        if (view instanceof TextView) {
            g9j0Var.f101570a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p149l.u7j0
    public void captureEndValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Override // p149l.u7j0
    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Override // p149l.u7j0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        if (g9j0Var == null || g9j0Var2 == null || !(g9j0Var.f101571b instanceof TextView)) {
            return null;
        }
        View view = g9j0Var2.f101571b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map<String, Object> map = g9j0Var.f101570a;
        Map<String, Object> map2 = g9j0Var2.f101570a;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
