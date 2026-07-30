package com.p051p1.mobile.putong.core.p058ui.constellationmatch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class ConstellationView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f29663a;

    /* JADX INFO: renamed from: b */
    public float f29664b;

    /* JADX INFO: renamed from: c */
    public float f29665c;

    /* JADX INFO: renamed from: d */
    public float f29666d;

    /* JADX INFO: renamed from: e */
    public float f29667e;

    /* JADX INFO: renamed from: f */
    public float f29668f;

    /* JADX INFO: renamed from: g */
    public float f29669g;

    /* JADX INFO: renamed from: h */
    public int f29670h;

    /* JADX INFO: renamed from: i */
    public Paint f29671i;

    /* JADX INFO: renamed from: j */
    public int f29672j;

    /* JADX INFO: renamed from: k */
    public float f29673k;

    /* JADX INFO: renamed from: l */
    public Paint f29674l;

    /* JADX INFO: renamed from: m */
    public Path f29675m;

    /* JADX INFO: renamed from: n */
    public int f29676n;

    /* JADX INFO: renamed from: o */
    public float f29677o;

    /* JADX INFO: renamed from: p */
    public float f29678p;

    /* JADX INFO: renamed from: q */
    public float f29679q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f29680r;

    /* JADX INFO: renamed from: s */
    public boolean f29681s;

    /* JADX INFO: renamed from: t */
    public RectF f29682t;

    /* JADX INFO: renamed from: u */
    public float f29683u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationView$a */
    public interface InterfaceC8471a {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29664b = 30.0f;
        this.f29665c = 50.0f;
        this.f29666d = 500.0f;
        this.f29669g = 10.0f;
        this.f29670h = Color.parseColor("#AEA3ED");
        this.f29672j = 5;
        this.f29673k = 20.0f;
        this.f29676n = 800;
        this.f29678p = 1.0f;
        this.f29679q = 70.0f;
        m45964b();
    }

    /* JADX INFO: renamed from: b */
    public final void m45964b() {
        Paint paint = new Paint();
        this.f29663a = paint;
        paint.setColor(this.f29670h);
        Paint paint2 = this.f29663a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f29663a.setDither(true);
        this.f29663a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f29671i = paint3;
        paint3.setColor(this.f29670h);
        this.f29671i.setStrokeWidth(this.f29672j);
        this.f29671i.setStyle(Paint.Style.STROKE);
        this.f29671i.setDither(true);
        this.f29671i.setAntiAlias(true);
        float f = (180.0f - this.f29679q) / 2.0f;
        this.f29683u = f;
        this.f29677o = f - 180.0f;
        float f2 = this.f29664b;
        float f3 = this.f29666d;
        this.f29667e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f29665c;
        float f5 = this.f29666d;
        this.f29668f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f29683u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f29674l = paint4;
        paint4.setColor(this.f29670h);
        this.f29674l.setStyle(style);
        this.f29674l.setDither(true);
        this.f29674l.setAntiAlias(true);
        this.f29675m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f29678p, this.f29679q);
        this.f29680r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f29676n);
        this.f29680r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d06
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f84527a.m45965c(valueAnimator);
            }
        });
        float f6 = this.f29664b;
        float f7 = this.f29665c;
        float f8 = this.f29666d;
        this.f29682t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m45965c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f29678p = fFloatValue;
        if (fFloatValue == this.f29679q) {
            this.f29681s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f29680r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f29667e, this.f29668f, this.f29669g, this.f29663a);
        canvas.drawArc(this.f29682t, this.f29677o, this.f29678p, false, this.f29671i);
        float fSin = (float) (((double) (this.f29666d - (this.f29673k / 2.0f))) * Math.sin((((double) (this.f29683u + this.f29678p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f29666d - (this.f29673k / 2.0f))) * Math.cos((((double) (this.f29683u + this.f29678p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f29666d + (this.f29673k / 2.0f))) * Math.sin((((double) (this.f29683u + this.f29678p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f29666d + (this.f29673k / 2.0f))) * Math.cos((((double) (this.f29683u + this.f29678p)) * 3.141592653589793d) / 180.0d));
        float f = this.f29664b;
        float f2 = this.f29666d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f29665c;
        float f5 = (f2 - fSin) + f4;
        this.f29675m.moveTo(f3, f5);
        this.f29675m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f29675m.lineTo(f3 + ((float) (((double) this.f29673k) * Math.sin((((double) (this.f29678p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f29673k) * Math.cos((((double) (this.f29678p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f29675m.close();
        canvas.drawPath(this.f29675m, this.f29674l);
        this.f29675m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f29666d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f29664b * 2.0f)), (int) (((double) ((this.f29665c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f29683u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC8471a interfaceC8471a) {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstellationView(Context context) {
        this(context, null);
    }
}
