package com.p051p1.mobile.putong.core.newui.view;

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
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveLightView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f27777a;

    /* JADX INFO: renamed from: b */
    public RectF f27778b;

    /* JADX INFO: renamed from: c */
    public boolean f27779c;

    /* JADX INFO: renamed from: d */
    public LinearGradient f27780d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f27781e;

    /* JADX INFO: renamed from: f */
    public int f27782f;

    /* JADX INFO: renamed from: g */
    public int f27783g;

    /* JADX INFO: renamed from: h */
    public int f27784h;

    /* JADX INFO: renamed from: i */
    public Path f27785i;

    /* JADX INFO: renamed from: j */
    public Path f27786j;

    /* JADX INFO: renamed from: k */
    public ValueAnimator f27787k;

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126752O0);
        this.f27783g = typedArrayObtainStyledAttributes.getInt(khc0.f126758Q0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        this.f27782f = typedArrayObtainStyledAttributes.getInt(khc0.f126755P0, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m44911b() {
        if (this.f27782f > getWidth() - (getHeight() * 2)) {
            this.f27782f = getWidth() - (getHeight() * 2);
        }
        if (NullChecker.m82486a(this.f27787k)) {
            this.f27787k.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.f27782f, getWidth() * 2);
        this.f27787k = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i2t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f112666a.m44913d(valueAnimator);
            }
        });
        this.f27787k.setRepeatMode(1);
        this.f27787k.setRepeatCount(-1);
        this.f27787k.setDuration(this.f27783g);
        this.f27787k.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m44912c() {
        this.f27779c = true;
        Paint paint = new Paint();
        this.f27777a = paint;
        paint.setColor(-1);
        this.f27777a.setAntiAlias(true);
        this.f27777a.setDither(true);
        this.f27777a.setStyle(Paint.Style.FILL);
        this.f27780d = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#ff3a00"), Color.parseColor("#ff852a"), Shader.TileMode.CLAMP);
        this.f27778b = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        this.f27785i = path;
        path.reset();
        this.f27785i.addRoundRect(this.f27778b, getHeight() / 2, getHeight() / 2, Path.Direction.CCW);
        this.f27786j = new Path();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m44913d(ValueAnimator valueAnimator) {
        this.f27784h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = this.f27784h;
        this.f27781e = new LinearGradient(i - 2, 0.0f, i + this.f27782f, 0.0f, Color.parseColor("#00000000"), Color.parseColor("#ff952a"), Shader.TileMode.CLAMP);
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
        if (NullChecker.m82486a(this.f27787k)) {
            this.f27787k.cancel();
            this.f27779c = false;
            this.f27787k = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f27779c) {
            m44912c();
            m44911b();
        }
        Paint paint = this.f27777a;
        if (paint == null) {
            return;
        }
        paint.setColor(-1);
        this.f27777a.setStyle(Paint.Style.FILL);
        this.f27777a.setShader(this.f27780d);
        canvas.drawRoundRect(this.f27778b, getHeight() / 2, getHeight() / 2, this.f27777a);
        int i = this.f27784h;
        this.f27786j.reset();
        this.f27786j.addRect(i, 0.0f, i + this.f27782f, getHeight(), Path.Direction.CCW);
        this.f27786j.op(this.f27785i, Path.Op.INTERSECT);
        this.f27777a.setShader(this.f27781e);
        canvas.drawPath(this.f27786j, this.f27777a);
        this.f27777a.setXfermode(null);
        this.f27777a.setShader(null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f27779c = false;
    }

    public LiveLightView(Context context) {
        this(context, null);
    }

    public LiveLightView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27782f = 90;
        this.f27783g = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
