package com.p046p1.mobile.putong.core.p053ui.messages.aichat;

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
import com.google.android.gms.common.ConnectionResult;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class TextHide extends VText {

    /* JADX INFO: renamed from: i */
    public LinearGradient f31750i;

    /* JADX INFO: renamed from: j */
    public Matrix f31751j;

    /* JADX INFO: renamed from: k */
    public AbstractC8521b f31752k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$a */
    public class C8520a extends AnimatorListenerAdapter {
        public C8520a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (NullChecker.m81303a(TextHide.this.f31752k)) {
                TextHide.this.f31752k.m49040a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (NullChecker.m81303a(TextHide.this.f31752k)) {
                TextHide.this.f31752k.m49042c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$b */
    public static abstract class AbstractC8521b {
        /* JADX INFO: renamed from: a */
        public void m49040a() {
        }

        /* JADX INFO: renamed from: b */
        public void m49041b(float f) {
        }

        /* JADX INFO: renamed from: c */
        public void m49042c() {
        }
    }

    public TextHide(Context context) {
        super(context);
        this.f31751j = new Matrix();
    }

    /* JADX INFO: renamed from: p */
    public static int m49037p(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m49038q(ValueAnimator valueAnimator) {
        this.f31751j.reset();
        this.f31751j.setTranslate(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f31750i.setLocalMatrix(this.f31751j);
        invalidate();
        if (NullChecker.m81303a(this.f31752k)) {
            this.f31752k.m49041b(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m49039r(String str, int i) {
        setText(str);
        TextPaint paint = getPaint();
        float fMeasureText = getPaint().measureText(getText().toString());
        LinearGradient linearGradient = new LinearGradient(-fMeasureText, 0.0f, 0.0f, 0.0f, new int[]{m49037p(getCurrentTextColor(), 255), 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f31750i = linearGradient;
        paint.setShader(linearGradient);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMeasureText + fMeasureText);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addListener(new C8520a());
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wii0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186545a.m49038q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setTextAnim(String str) {
        m49039r(str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31751j = new Matrix();
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31751j = new Matrix();
    }
}
