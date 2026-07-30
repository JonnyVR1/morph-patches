package com.p000p1.mobile.putong.core.p004ui.tarot;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f6297a;

    /* JADX INFO: renamed from: b */
    public float f6298b;

    /* JADX INFO: renamed from: c */
    public float f6299c;

    /* JADX INFO: renamed from: d */
    public float f6300d;

    /* JADX INFO: renamed from: e */
    public float f6301e;

    /* JADX INFO: renamed from: f */
    public float f6302f;

    /* JADX INFO: renamed from: g */
    public float f6303g;

    /* JADX INFO: renamed from: h */
    public int f6304h;

    /* JADX INFO: renamed from: i */
    public Paint f6305i;

    /* JADX INFO: renamed from: j */
    public int f6306j;

    /* JADX INFO: renamed from: k */
    public float f6307k;

    /* JADX INFO: renamed from: l */
    public Paint f6308l;

    /* JADX INFO: renamed from: m */
    public Path f6309m;

    /* JADX INFO: renamed from: n */
    public int f6310n;

    /* JADX INFO: renamed from: o */
    public float f6311o;

    /* JADX INFO: renamed from: p */
    public float f6312p;

    /* JADX INFO: renamed from: q */
    public float f6313q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f6314r;

    /* JADX INFO: renamed from: s */
    public boolean f6315s;

    /* JADX INFO: renamed from: t */
    public RectF f6316t;

    /* JADX INFO: renamed from: u */
    public float f6317u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.LineView$a */
    public interface InterfaceC0347a {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6298b = 30.0f;
        this.f6299c = 50.0f;
        this.f6300d = 500.0f;
        this.f6303g = 10.0f;
        this.f6304h = -1;
        this.f6306j = 5;
        this.f6307k = 20.0f;
        this.f6310n = 800;
        this.f6312p = 1.0f;
        this.f6313q = 70.0f;
        m9249b();
    }

    /* JADX INFO: renamed from: b */
    public final void m9249b() {
        Paint paint = new Paint();
        this.f6297a = paint;
        paint.setColor(this.f6304h);
        Paint paint2 = this.f6297a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f6297a.setDither(true);
        this.f6297a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f6305i = paint3;
        paint3.setColor(this.f6304h);
        this.f6305i.setStrokeWidth(this.f6306j);
        this.f6305i.setStyle(Paint.Style.STROKE);
        this.f6305i.setDither(true);
        this.f6305i.setAntiAlias(true);
        float f = (180.0f - this.f6313q) / 2.0f;
        this.f6317u = f;
        this.f6311o = f - 180.0f;
        float f2 = this.f6298b;
        float f3 = this.f6300d;
        this.f6301e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f6299c;
        float f5 = this.f6300d;
        this.f6302f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f6317u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f6308l = paint4;
        paint4.setColor(this.f6304h);
        this.f6308l.setStyle(style);
        this.f6308l.setDither(true);
        this.f6308l.setAntiAlias(true);
        this.f6309m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f6312p, this.f6313q);
        this.f6314r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f6310n);
        this.f6314r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hmr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13947a.m9250c(valueAnimator);
            }
        });
        float f6 = this.f6298b;
        float f7 = this.f6299c;
        float f8 = this.f6300d;
        this.f6316t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m9250c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6312p = fFloatValue;
        if (fFloatValue == this.f6313q) {
            this.f6315s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f6314r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f6301e, this.f6302f, this.f6303g, this.f6297a);
        canvas.drawArc(this.f6316t, this.f6311o, this.f6312p, false, this.f6305i);
        float fSin = (float) (((double) (this.f6300d - (this.f6307k / 2.0f))) * Math.sin((((double) (this.f6317u + this.f6312p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f6300d - (this.f6307k / 2.0f))) * Math.cos((((double) (this.f6317u + this.f6312p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f6300d + (this.f6307k / 2.0f))) * Math.sin((((double) (this.f6317u + this.f6312p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f6300d + (this.f6307k / 2.0f))) * Math.cos((((double) (this.f6317u + this.f6312p)) * 3.141592653589793d) / 180.0d));
        float f = this.f6298b;
        float f2 = this.f6300d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f6299c;
        float f5 = (f2 - fSin) + f4;
        this.f6309m.moveTo(f3, f5);
        this.f6309m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f6309m.lineTo(f3 + ((float) (((double) this.f6307k) * Math.sin((((double) (this.f6312p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f6307k) * Math.cos((((double) (this.f6312p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f6309m.close();
        canvas.drawPath(this.f6309m, this.f6308l);
        this.f6309m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f6300d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f6298b * 2.0f)), (int) (((double) ((this.f6299c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f6317u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC0347a interfaceC0347a) {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineView(Context context) {
        this(context, null);
    }
}
