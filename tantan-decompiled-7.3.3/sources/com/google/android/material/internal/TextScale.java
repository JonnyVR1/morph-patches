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
import p153l.kij0;
import p153l.ygj0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextScale extends ygj0 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(@NonNull kij0 kij0Var) {
        View view = kij0Var.f127001b;
        if (view instanceof TextView) {
            kij0Var.f127000a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p153l.ygj0
    public void captureEndValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    @Override // p153l.ygj0
    public void captureStartValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    @Override // p153l.ygj0
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable kij0 kij0Var, @Nullable kij0 kij0Var2) {
        if (kij0Var == null || kij0Var2 == null || !(kij0Var.f127001b instanceof TextView)) {
            return null;
        }
        View view = kij0Var2.f127001b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map<String, Object> map = kij0Var.f127000a;
        Map<String, Object> map2 = kij0Var2.f127000a;
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
