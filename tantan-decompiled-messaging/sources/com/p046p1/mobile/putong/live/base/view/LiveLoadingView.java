package com.p046p1.mobile.putong.live.base.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.y4j0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveLoadingView extends View {

    /* JADX INFO: renamed from: h */
    public static final int f44679h = t100.f167257f;

    /* JADX INFO: renamed from: i */
    public static final int f44680i = t100.f167258g;

    /* JADX INFO: renamed from: a */
    public LinearGradient f44681a;

    /* JADX INFO: renamed from: b */
    public int f44682b;

    /* JADX INFO: renamed from: c */
    public int f44683c;

    /* JADX INFO: renamed from: d */
    public Path f44684d;

    /* JADX INFO: renamed from: e */
    public Paint f44685e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f44686f;

    /* JADX INFO: renamed from: g */
    public int f44687g;

    public LiveLoadingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m68740c();
    }

    /* JADX INFO: renamed from: b */
    public final void m68739b(Canvas canvas, int i, int i2) {
        int i3 = i - this.f44683c;
        if (i3 > i2) {
            return;
        }
        y4j0.m212916a("draw path");
        this.f44684d.reset();
        float f = i;
        this.f44684d.moveTo(f, 0.0f);
        Path path = this.f44684d;
        int i4 = f44679h;
        path.lineTo(i + i4, 0.0f);
        this.f44684d.lineTo((i + i4) - this.f44683c, this.f44682b);
        this.f44684d.lineTo(i3, this.f44682b);
        this.f44684d.lineTo(f, 0.0f);
        canvas.drawPath(this.f44684d, this.f44685e);
        y4j0.m212917b();
        m68739b(canvas, i + i4 + f44680i, i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m68740c() {
        Paint paint = new Paint();
        this.f44685e = paint;
        paint.setAntiAlias(true);
        this.f44685e.setStyle(Paint.Style.FILL);
        this.f44684d = new Path();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -(f44679h + f44680i));
        this.f44686f = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.f44686f.setRepeatCount(-1);
        this.f44686f.setDuration(400L);
        this.f44686f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t0t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f167209a.m68743f(valueAnimator);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m68741d(int i) {
        int i2 = (int) (i * 0.8f);
        this.f44682b = i2;
        this.f44683c = (int) (((double) i2) * Math.tan(Math.toRadians(25.0d)));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f44682b, new int[]{-2130706433, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f44681a = linearGradient;
        this.f44685e.setShader(linearGradient);
    }

    /* JADX INFO: renamed from: e */
    public boolean m68742e() {
        ValueAnimator valueAnimator = this.f44686f;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m68743f(ValueAnimator valueAnimator) {
        this.f44687g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m68744g() {
        if (this.f44686f.isRunning()) {
            return;
        }
        this.f44686f.start();
    }

    /* JADX INFO: renamed from: h */
    public void m68745h() {
        if (this.f44686f.isRunning()) {
            this.f44686f.cancel();
        }
        this.f44687g = 0;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m68745h();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.f44681a == null) {
            m68741d(height);
        }
        y4j0.m212916a("LiveLoadingView#drawLine");
        m68739b(canvas, this.f44687g, width);
        y4j0.m212917b();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m68741d(i2);
    }
}
