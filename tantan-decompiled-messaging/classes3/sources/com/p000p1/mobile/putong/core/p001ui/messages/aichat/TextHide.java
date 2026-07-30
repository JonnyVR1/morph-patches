package com.p000p1.mobile.putong.core.p001ui.messages.aichat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TextHide extends VText {

    /* JADX INFO: renamed from: i */
    public LinearGradient f1641i;

    /* JADX INFO: renamed from: j */
    public Matrix f1642j;

    /* JADX INFO: renamed from: k */
    public AbstractC0104b f1643k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$a */
    public class C0103a extends AnimatorListenerAdapter {
        public C0103a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (NullChecker.a(TextHide.this.f1643k)) {
                TextHide.this.f1643k.m2138a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (NullChecker.a(TextHide.this.f1643k)) {
                TextHide.this.f1643k.m2140c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$b */
    public static abstract class AbstractC0104b {
        /* JADX INFO: renamed from: a */
        public void m2138a() {
        }

        /* JADX INFO: renamed from: b */
        public void m2139b(float f) {
        }

        /* JADX INFO: renamed from: c */
        public void m2140c() {
        }
    }

    public TextHide(Context context) {
        super(context);
        this.f1642j = new Matrix();
    }

    /* JADX INFO: renamed from: p */
    public static int m2135p(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2136q(ValueAnimator valueAnimator) {
        this.f1642j.reset();
        this.f1642j.setTranslate(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f1641i.setLocalMatrix(this.f1642j);
        invalidate();
        if (NullChecker.a(this.f1643k)) {
            this.f1643k.m2139b(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m2137r(String str, int i) {
        setText(str);
        TextPaint paint = getPaint();
        float fMeasureText = getPaint().measureText(getText().toString());
        LinearGradient linearGradient = new LinearGradient(-fMeasureText, 0.0f, 0.0f, 0.0f, new int[]{m2135p(getCurrentTextColor(), 255), 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f1641i = linearGradient;
        paint.setShader(linearGradient);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMeasureText + fMeasureText);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addListener(new C0103a());
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wii0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8552a.m2136q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setTextAnim(String str) {
        m2137r(str, 1500);
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1642j = new Matrix();
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1642j = new Matrix();
    }
}
