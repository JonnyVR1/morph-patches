package com.p046p1.mobile.putong.live.external.view.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import p149l.fpr;
import p149l.l9s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesEntryAnimBackground extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f46258a;

    /* JADX INFO: renamed from: b */
    public C12584a f46259b;

    /* JADX INFO: renamed from: c */
    public C12584a f46260c;

    /* JADX INFO: renamed from: d */
    public final Paint f46261d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAnimBackground$a */
    public static class C12584a {

        /* JADX INFO: renamed from: a */
        public final Bitmap f46262a;

        /* JADX INFO: renamed from: b */
        public int f46263b;

        /* JADX INFO: renamed from: c */
        public int f46264c;

        /* JADX INFO: renamed from: d */
        public int f46265d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f46266e;

        /* JADX INFO: renamed from: f */
        @ColorInt
        public int f46267f;

        public C12584a(int i, int i2, int i3, @ColorInt int i4, @ColorInt int i5, Bitmap bitmap) {
            this.f46263b = i;
            this.f46264c = i2;
            this.f46265d = i3;
            this.f46266e = i4;
            this.f46267f = i5;
            this.f46262a = bitmap;
        }

        /* JADX INFO: renamed from: a */
        public Shader m70855a(int i, int i2, int i3) {
            if (this.f46262a == null) {
                return new LinearGradient(i, 0.0f, i + i2, 0.0f, this.f46266e, this.f46267f, Shader.TileMode.REPEAT);
            }
            Bitmap bitmap = this.f46262a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            float fMax = Math.max((i2 * 1.0f) / this.f46262a.getWidth(), (i3 * 1.0f) / this.f46262a.getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            bitmapShader.setLocalMatrix(matrix);
            return bitmapShader;
        }

        public String toString() {
            return "Rectangle{width=" + this.f46263b + ", height=" + this.f46264c + '}';
        }
    }

    public LiveActivitiesEntryAnimBackground(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46261d = new Paint(1);
    }

    /* JADX INFO: renamed from: b */
    public ValueAnimator m70849b(fpr fprVar, fpr fprVar2) {
        m70854g();
        this.f46259b = m70850c(this, fprVar);
        this.f46260c = m70850c(this, fprVar2);
        this.f46258a.setDuration(500L);
        this.f46258a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hpr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f108961a.m70851d(valueAnimator);
            }
        });
        return this.f46258a;
    }

    /* JADX INFO: renamed from: c */
    public final C12584a m70850c(View view, fpr fprVar) {
        return new C12584a(fprVar.mo122633e(), fprVar.mo122634f(), fprVar.mo122637i(), fprVar.mo122629a(), fprVar.mo122632d(), l9s.m149078h() ? BitmapFactory.decodeResource(view.getResources(), fprVar.mo122635g()) : null);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m70851d(ValueAnimator valueAnimator) {
        float animatedFraction = this.f46258a.getAnimatedFraction();
        C12584a c12584a = this.f46259b;
        int i = c12584a.f46263b;
        C12584a c12584a2 = this.f46260c;
        int i2 = (int) (i + ((c12584a2.f46263b - i) * animatedFraction));
        int i3 = c12584a.f46264c;
        m70853f(i2, (int) (i3 + (animatedFraction * (c12584a2.f46264c - i3))));
    }

    /* JADX INFO: renamed from: e */
    public void m70852e(fpr fprVar) {
        this.f46260c = m70850c(this, fprVar);
        m70853f(fprVar.mo122633e(), fprVar.mo122634f());
    }

    /* JADX INFO: renamed from: f */
    public final void m70853f(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
        requestLayout();
    }

    /* JADX INFO: renamed from: g */
    public final void m70854g() {
        ValueAnimator valueAnimator = this.f46258a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46258a = null;
        }
        this.f46258a = ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f46260c != null) {
            ValueAnimator valueAnimator = this.f46258a;
            float animatedFraction = (valueAnimator == null || !valueAnimator.isRunning()) ? 0.0f : 1.0f - this.f46258a.getAnimatedFraction();
            C12584a c12584a = this.f46259b;
            float f = c12584a != null ? (this.f46260c.f46265d - c12584a.f46265d) * animatedFraction : 0.0f;
            C12584a c12584a2 = this.f46260c;
            int i = (int) (c12584a2.f46265d - f);
            this.f46261d.setShader(c12584a2.m70855a(0, getMeasuredWidth(), getMeasuredHeight()));
            float f2 = i;
            canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f2, f2, this.f46261d);
        }
    }
}
