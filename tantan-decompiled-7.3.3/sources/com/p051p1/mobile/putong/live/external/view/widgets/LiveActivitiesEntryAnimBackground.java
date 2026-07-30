package com.p051p1.mobile.putong.live.external.view.widgets;

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
import p153l.grr;
import p153l.mbs;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesEntryAnimBackground extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f47106a;

    /* JADX INFO: renamed from: b */
    public C12747a f47107b;

    /* JADX INFO: renamed from: c */
    public C12747a f47108c;

    /* JADX INFO: renamed from: d */
    public final Paint f47109d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAnimBackground$a */
    public static class C12747a {

        /* JADX INFO: renamed from: a */
        public final Bitmap f47110a;

        /* JADX INFO: renamed from: b */
        public int f47111b;

        /* JADX INFO: renamed from: c */
        public int f47112c;

        /* JADX INFO: renamed from: d */
        public int f47113d;

        /* JADX INFO: renamed from: e */
        @ColorInt
        public int f47114e;

        /* JADX INFO: renamed from: f */
        @ColorInt
        public int f47115f;

        public C12747a(int i, int i2, int i3, @ColorInt int i4, @ColorInt int i5, Bitmap bitmap) {
            this.f47111b = i;
            this.f47112c = i2;
            this.f47113d = i3;
            this.f47114e = i4;
            this.f47115f = i5;
            this.f47110a = bitmap;
        }

        /* JADX INFO: renamed from: a */
        public Shader m72038a(int i, int i2, int i3) {
            if (this.f47110a == null) {
                return new LinearGradient(i, 0.0f, i + i2, 0.0f, this.f47114e, this.f47115f, Shader.TileMode.REPEAT);
            }
            Bitmap bitmap = this.f47110a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            float fMax = Math.max((i2 * 1.0f) / this.f47110a.getWidth(), (i3 * 1.0f) / this.f47110a.getHeight());
            Matrix matrix = new Matrix();
            matrix.setScale(fMax, fMax);
            bitmapShader.setLocalMatrix(matrix);
            return bitmapShader;
        }

        public String toString() {
            return "Rectangle{width=" + this.f47111b + ", height=" + this.f47112c + '}';
        }
    }

    public LiveActivitiesEntryAnimBackground(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47109d = new Paint(1);
    }

    /* JADX INFO: renamed from: b */
    public ValueAnimator m72032b(grr grrVar, grr grrVar2) {
        m72037g();
        this.f47107b = m72033c(this, grrVar);
        this.f47108c = m72033c(this, grrVar2);
        this.f47106a.setDuration(500L);
        this.f47106a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.irr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f116597a.m72034d(valueAnimator);
            }
        });
        return this.f47106a;
    }

    /* JADX INFO: renamed from: c */
    public final C12747a m72033c(View view, grr grrVar) {
        return new C12747a(grrVar.mo131862e(), grrVar.mo131863f(), grrVar.mo131866i(), grrVar.mo131858a(), grrVar.mo131861d(), mbs.m157855h() ? BitmapFactory.decodeResource(view.getResources(), grrVar.mo131864g()) : null);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m72034d(ValueAnimator valueAnimator) {
        float animatedFraction = this.f47106a.getAnimatedFraction();
        C12747a c12747a = this.f47107b;
        int i = c12747a.f47111b;
        C12747a c12747a2 = this.f47108c;
        int i2 = (int) (i + ((c12747a2.f47111b - i) * animatedFraction));
        int i3 = c12747a.f47112c;
        m72036f(i2, (int) (i3 + (animatedFraction * (c12747a2.f47112c - i3))));
    }

    /* JADX INFO: renamed from: e */
    public void m72035e(grr grrVar) {
        this.f47108c = m72033c(this, grrVar);
        m72036f(grrVar.mo131862e(), grrVar.mo131863f());
    }

    /* JADX INFO: renamed from: f */
    public final void m72036f(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
        requestLayout();
    }

    /* JADX INFO: renamed from: g */
    public final void m72037g() {
        ValueAnimator valueAnimator = this.f47106a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47106a = null;
        }
        this.f47106a = ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f47108c != null) {
            ValueAnimator valueAnimator = this.f47106a;
            float animatedFraction = (valueAnimator == null || !valueAnimator.isRunning()) ? 0.0f : 1.0f - this.f47106a.getAnimatedFraction();
            C12747a c12747a = this.f47107b;
            float f = c12747a != null ? (this.f47108c.f47113d - c12747a.f47113d) * animatedFraction : 0.0f;
            C12747a c12747a2 = this.f47108c;
            int i = (int) (c12747a2.f47113d - f);
            this.f47109d.setShader(c12747a2.m72038a(0, getMeasuredWidth(), getMeasuredHeight()));
            float f2 = i;
            canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f2, f2, this.f47109d);
        }
    }
}
