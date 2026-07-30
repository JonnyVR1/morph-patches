package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

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
import p153l.bnl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkMatchLoadView extends View {

    /* JADX INFO: renamed from: a */
    public ValueAnimator f52544a;

    /* JADX INFO: renamed from: b */
    public float f52545b;

    /* JADX INFO: renamed from: c */
    public Paint f52546c;

    /* JADX INFO: renamed from: d */
    public Paint f52547d;

    /* JADX INFO: renamed from: e */
    public int f52548e;

    /* JADX INFO: renamed from: f */
    public int f52549f;

    /* JADX INFO: renamed from: g */
    public float f52550g;

    public PkMatchLoadView(Context context) {
        super(context);
        this.f52548e = 10;
        this.f52549f = 8;
        this.f52550g = 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public final void m77359c(Canvas canvas, int i, int i2, double d) {
        double d2 = d * 255.0d;
        this.f52547d.setAlpha((int) (255.0d - d2));
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, this.f52548e, this.f52546c);
        this.f52547d.setAlpha((int) d2);
        canvas.drawCircle(f, f2, m77361e(d), this.f52547d);
    }

    /* JADX INFO: renamed from: d */
    public void m77360d() {
        bnl0.m105524M(this, false);
        this.f52544a.cancel();
    }

    /* JADX INFO: renamed from: e */
    public final float m77361e(double d) {
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0.0f;
        }
        return (float) ((((double) this.f52549f) * d) + ((double) this.f52548e));
    }

    /* JADX INFO: renamed from: f */
    public final double m77362f(float f, int i, int i2, int i3, int i4, double d, double d2) {
        double dAbs;
        float f2;
        if (f > i && f < i2) {
            dAbs = Math.abs(Math.sin((((double) (f / 2.0f)) * 3.141592653589793d) + d));
            f2 = this.f52550g;
        } else {
            if (f <= i3 || f >= i4) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            dAbs = Math.abs(Math.sin((((double) (f / 2.0f)) * 3.141592653589793d) + d2));
            f2 = this.f52550g;
        }
        return dAbs * ((double) f2);
    }

    /* JADX INFO: renamed from: g */
    public final void m77363g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 10.0f);
        this.f52544a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p280
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f150251a.m77364h(valueAnimator);
            }
        });
        this.f52544a.setRepeatMode(1);
        this.f52544a.setInterpolator(new LinearInterpolator());
        this.f52544a.setRepeatCount(-1);
        this.f52544a.setDuration(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f52544a.start();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m77364h(ValueAnimator valueAnimator) {
        this.f52545b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77365i(ValueAnimator valueAnimator) {
        this.f52550g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m77366j() {
        bnl0.m105524M(this, true);
        this.f52544a.cancel();
        this.f52550g = 1.0f;
        m77363g();
    }

    /* JADX INFO: renamed from: k */
    public void m77367k() {
        bnl0.m105524M(this, true);
        this.f52544a.cancel();
        this.f52550g = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f52544a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.q280
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f155307a.m77365i(valueAnimator);
            }
        });
        this.f52544a.setInterpolator(new LinearInterpolator());
        this.f52544a.setDuration(300L);
        this.f52544a.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f52544a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f52544a.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f52546c == null) {
            Paint paint = new Paint();
            this.f52546c = paint;
            paint.setColor(Color.parseColor("#e9e9e9"));
            Paint paint2 = this.f52546c;
            Paint.Style style = Paint.Style.FILL;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f52547d = paint3;
            paint3.setColor(Color.parseColor("#ff3a00"));
            this.f52547d.setStyle(style);
        }
        int width = getWidth() / 5;
        int height = getHeight() / 2;
        m77359c(canvas, width, height, m77362f(this.f52545b, 0, 2, 7, 9, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.5707963267948966d));
        m77359c(canvas, width * 2, height, m77362f(this.f52545b, 1, 3, 6, 8, -1.5707963267948966d, 3.141592653589793d));
        m77359c(canvas, width * 3, height, m77362f(this.f52545b, 2, 4, 5, 7, 3.141592653589793d, -1.5707963267948966d));
        m77359c(canvas, width * 4, height, m77362f(this.f52545b, 3, 5, -1, -1, 1.5707963267948966d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77363g();
    }

    public PkMatchLoadView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52548e = 10;
        this.f52549f = 8;
        this.f52550g = 1.0f;
    }

    public PkMatchLoadView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52548e = 10;
        this.f52549f = 8;
        this.f52550g = 1.0f;
    }
}
