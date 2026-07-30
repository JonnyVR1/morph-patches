package com.p046p1.mobile.putong.core.newui.view;

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
import com.google.android.gms.common.ConnectionResult;
import com.tantanapp.common.utils.NullChecker;
import p149l.e9c0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f26929a;

    /* JADX INFO: renamed from: b */
    public RectF f26930b;

    /* JADX INFO: renamed from: c */
    public boolean f26931c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f26932d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f26933e;

    /* JADX INFO: renamed from: f */
    public int f26934f;

    /* JADX INFO: renamed from: g */
    public int f26935g;

    /* JADX INFO: renamed from: h */
    public int f26936h;

    /* JADX INFO: renamed from: i */
    public Path f26937i;

    /* JADX INFO: renamed from: j */
    public Path f26938j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f26939k;

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f89982O0);
        this.f26935g = typedArrayObtainStyledAttributes.getInt(e9c0.f89988Q0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        this.f26934f = typedArrayObtainStyledAttributes.getInt(e9c0.f89985P0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m43725b() {
        if (this.f26934f > getWidth() - (getHeight() * 2)) {
            this.f26934f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.m81303a(this.f26939k)) {
            this.f26939k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f26934f, getWidth() * 2);
        this.f26939k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h0t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f105244a.m43727d(valueAnimator);
            }
        });
        this.f26939k.setRepeatMode(1);
        this.f26939k.setRepeatCount(-1);
        this.f26939k.setDuration(this.f26935g);
        this.f26939k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m43726c() {
        this.f26931c = true;
        Paint paint = new Paint();
        this.f26929a = paint;
        paint.setColor(-1);
        this.f26929a.setAntiAlias(true);
        this.f26929a.setDither(true);
        this.f26929a.setStyle(Paint.Style.FILL);
        this.f26932d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f26930b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f26937i = path;
        path.reset();
        this.f26937i.addRoundRect(this.f26930b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f26938j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m43727d(ValueAnimator valueAnimator) {
        this.f26936h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f26936h;
        this.f26933e = new LinearGradient(i - 2, 0.0f, i + this.f26934f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
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
        if (NullChecker.m81303a(this.f26939k)) {
            this.f26939k.cancel();
            this.f26931c = false;
            this.f26939k = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f26931c) {
            m43726c();
            m43725b();
        }
        Paint paint = this.f26929a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f26929a.setStyle(Paint.Style.FILL);
        this.f26929a.setShader(this.f26932d);
        canvas.drawRoundRect(this.f26930b, getHeight() / 2, getHeight() / 2, this.f26929a);
        int i = this.f26936h;
        this.f26938j.reset();
        this.f26938j.addRect(i, 0.0f, i + this.f26934f, getHeight(), Path.Direction.CCW);
        this.f26938j.op(this.f26937i, Path.Op.INTERSECT);
        this.f26929a.setShader(this.f26933e);
        canvas.drawPath(this.f26938j, this.f26929a);
        this.f26929a.setXfermode(null);
        this.f26929a.setShader(null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f26931c = false;
    }

    public LiveLightView(Context context) {
        this(context, null);
    }

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26934f = 90;
        this.f26935g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
