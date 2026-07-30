package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchLoadView extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f51696a;

    /* JADX INFO: renamed from: b */
    public float f51697b;

    /* JADX INFO: renamed from: c */
    public Paint f51698c;

    /* JADX INFO: renamed from: d */
    public Paint f51699d;

    /* JADX INFO: renamed from: e */
    public int f51700e;

    /* JADX INFO: renamed from: f */
    public int f51701f;

    /* JADX INFO: renamed from: g */
    public float f51702g;

    public PkMatchLoadView(Context context) {
        super(context);
        this.f51700e = 10;
        this.f51701f = 8;
        this.f51702g = 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public final void m76176c(Canvas canvas, int i, int i2, double d) {
        double d2 = d * 255.0d;
        this.f51699d.setAlpha((int) (255.0d - d2));
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, this.f51700e, this.f51698c);
        this.f51699d.setAlpha((int) d2);
        canvas.drawCircle(f, f2, m76178e(d), this.f51699d);
    }

    /* JADX INFO: renamed from: d */
    public void m76177d() {
        xdl0.m208344M(this, false);
        this.f51696a.cancel();
    }

    /* JADX INFO: renamed from: e */
    public final float m76178e(double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0.0f;
        }
        return (float) ((((double) this.f51701f) * d) + ((double) this.f51700e));
    }

    /* JADX INFO: renamed from: f */
    public final double m76179f(float f, int i, int i2, int i3, int i4, double d, double d2) {
        double dAbs;
        float f2;
        if (f > i && f < i2) {
            dAbs = Math.abs(Math.sin((((double) (f / 2.0f)) * 3.141592653589793d) + d));
            f2 = this.f51702g;
        } else {
            if (f <= i3 || f >= i4) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            dAbs = Math.abs(Math.sin((((double) (f / 2.0f)) * 3.141592653589793d) + d2));
            f2 = this.f51702g;
        }
        return dAbs * ((double) f2);
    }

    /* JADX INFO: renamed from: g */
    public final void m76180g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 10.0f);
        this.f51696a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ju70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f119745a.m76181h(valueAnimator);
            }
        });
        this.f51696a.setRepeatMode(1);
        this.f51696a.setInterpolator(new LinearInterpolator());
        this.f51696a.setRepeatCount(-1);
        this.f51696a.setDuration(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f51696a.start();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m76181h(ValueAnimator valueAnimator) {
        this.f51697b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76182i(ValueAnimator valueAnimator) {
        this.f51702g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m76183j() {
        xdl0.m208344M(this, true);
        this.f51696a.cancel();
        this.f51702g = 1.0f;
        m76180g();
    }

    /* JADX INFO: renamed from: k */
    public void m76184k() {
        xdl0.m208344M(this, true);
        this.f51696a.cancel();
        this.f51702g = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f51696a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ku70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124665a.m76182i(valueAnimator);
            }
        });
        this.f51696a.setInterpolator(new LinearInterpolator());
        this.f51696a.setDuration(300L);
        this.f51696a.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f51696a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f51696a.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f51698c == null) {
            Paint paint = new Paint();
            this.f51698c = paint;
            paint.setColor(Color.parseColor("#e9e9e9"));
            Paint paint2 = this.f51698c;
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f51699d = paint3;
            paint3.setColor(Color.parseColor("#ff3a00"));
            this.f51699d.setStyle(style);
        }
        int width = getWidth() / 5;
        int height = getHeight() / 2;
        m76176c(canvas, width, height, m76179f(this.f51697b, 0, 2, 7, 9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.5707963267948966d));
        m76176c(canvas, width * 2, height, m76179f(this.f51697b, 1, 3, 6, 8, -1.5707963267948966d, 3.141592653589793d));
        m76176c(canvas, width * 3, height, m76179f(this.f51697b, 2, 4, 5, 7, 3.141592653589793d, -1.5707963267948966d));
        m76176c(canvas, width * 4, height, m76179f(this.f51697b, 3, 5, -1, -1, 1.5707963267948966d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76180g();
    }

    public PkMatchLoadView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51700e = 10;
        this.f51701f = 8;
        this.f51702g = 1.0f;
    }

    public PkMatchLoadView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51700e = 10;
        this.f51701f = 8;
        this.f51702g = 1.0f;
    }
}
