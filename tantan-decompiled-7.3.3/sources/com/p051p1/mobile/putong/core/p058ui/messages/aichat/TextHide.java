package com.p051p1.mobile.putong.core.p058ui.messages.aichat;

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
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class TextHide extends VText {

    /* JADX INFO: renamed from: i */
    public LinearGradient f32598i;

    /* JADX INFO: renamed from: j */
    public Matrix f32599j;

    /* JADX INFO: renamed from: k */
    public AbstractC8684b f32600k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$a */
    public class C8683a extends AnimatorListenerAdapter {
        public C8683a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (NullChecker.m82486a(TextHide.this.f32600k)) {
                TextHide.this.f32600k.m50223a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (NullChecker.m82486a(TextHide.this.f32600k)) {
                TextHide.this.f32600k.m50225c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.aichat.TextHide$b */
    public static abstract class AbstractC8684b {
        /* JADX INFO: renamed from: a */
        public void m50223a() {
        }

        /* JADX INFO: renamed from: b */
        public void m50224b(float f) {
        }

        /* JADX INFO: renamed from: c */
        public void m50225c() {
        }
    }

    public TextHide(Context context) {
        super(context);
        this.f32599j = new Matrix();
    }

    /* JADX INFO: renamed from: p */
    public static int m50220p(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m50221q(ValueAnimator valueAnimator) {
        this.f32599j.reset();
        this.f32599j.setTranslate(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f32598i.setLocalMatrix(this.f32599j);
        invalidate();
        if (NullChecker.m82486a(this.f32600k)) {
            this.f32600k.m50224b(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m50222r(String str, int i) {
        setText(str);
        TextPaint paint = getPaint();
        float fMeasureText = getPaint().measureText(getText().toString());
        LinearGradient linearGradient = new LinearGradient(-fMeasureText, 0.0f, 0.0f, 0.0f, new int[]{m50220p(getCurrentTextColor(), 255), 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f32598i = linearGradient;
        paint.setShader(linearGradient);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMeasureText + fMeasureText);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addListener(new C8683a());
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wri0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f190525a.m50221q(valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public void setTextAnim(String str) {
        m50222r(str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32599j = new Matrix();
    }

    public TextHide(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32599j = new Matrix();
    }
}
