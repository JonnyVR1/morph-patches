package com.p000p1.mobile.putong.core.newui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.e9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5707a;

    /* JADX INFO: renamed from: b */
    public RectF f5708b;

    /* JADX INFO: renamed from: c */
    public boolean f5709c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f5710d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f5711e;

    /* JADX INFO: renamed from: f */
    public int f5712f;

    /* JADX INFO: renamed from: g */
    public int f5713g;

    /* JADX INFO: renamed from: h */
    public int f5714h;

    /* JADX INFO: renamed from: i */
    public Path f5715i;

    /* JADX INFO: renamed from: j */
    public Path f5716j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f5717k;

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.O0);
        this.f5713g = typedArrayObtainStyledAttributes.getInt(e9c0.Q0, 1500);
        this.f5712f = typedArrayObtainStyledAttributes.getInt(e9c0.P0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m7989b() {
        if (this.f5712f > getWidth() - (getHeight() * 2)) {
            this.f5712f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.a(this.f5717k)) {
            this.f5717k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f5712f, getWidth() * 2);
        this.f5717k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h0t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13832a.m7991d(valueAnimator);
            }
        });
        this.f5717k.setRepeatMode(1);
        this.f5717k.setRepeatCount(-1);
        this.f5717k.setDuration(this.f5713g);
        this.f5717k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m7990c() {
        this.f5709c = true;
        Paint paint = new Paint();
        this.f5707a = paint;
        paint.setColor(-1);
        this.f5707a.setAntiAlias(true);
        this.f5707a.setDither(true);
        this.f5707a.setStyle(Paint.Style.FILL);
        this.f5710d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f5708b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f5715i = path;
        path.reset();
        this.f5715i.addRoundRect(this.f5708b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f5716j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m7991d(ValueAnimator valueAnimator) {
        this.f5714h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f5714h;
        this.f5711e = new LinearGradient(i - 2, 0.0f, i + this.f5712f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
        postInvalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f5717k)) {
            this.f5717k.cancel();
            this.f5709c = false;
            this.f5717k = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f5709c) {
            m7990c();
            m7989b();
        }
        Paint paint = this.f5707a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f5707a.setStyle(Paint.Style.FILL);
        this.f5707a.setShader(this.f5710d);
        canvas.drawRoundRect(this.f5708b, getHeight() / 2, getHeight() / 2, this.f5707a);
        int i = this.f5714h;
        this.f5716j.reset();
        this.f5716j.addRect(i, 0.0f, i + this.f5712f, getHeight(), Path.Direction.CCW);
        this.f5716j.op(this.f5715i, Path.Op.INTERSECT);
        this.f5707a.setShader(this.f5711e);
        canvas.drawPath(this.f5716j, this.f5707a);
        this.f5707a.setXfermode(null);
        this.f5707a.setShader(null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f5709c = false;
    }

    public LiveLightView(Context context) {
        this(context, null);
    }

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5712f = 90;
        this.f5713g = 1500;
    }
}
