package com.p046p1.mobile.putong.core.p053ui.tarot;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class LineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f36516a;

    /* JADX INFO: renamed from: b */
    public float f36517b;

    /* JADX INFO: renamed from: c */
    public float f36518c;

    /* JADX INFO: renamed from: d */
    public float f36519d;

    /* JADX INFO: renamed from: e */
    public float f36520e;

    /* JADX INFO: renamed from: f */
    public float f36521f;

    /* JADX INFO: renamed from: g */
    public float f36522g;

    /* JADX INFO: renamed from: h */
    public int f36523h;

    /* JADX INFO: renamed from: i */
    public Paint f36524i;

    /* JADX INFO: renamed from: j */
    public int f36525j;

    /* JADX INFO: renamed from: k */
    public float f36526k;

    /* JADX INFO: renamed from: l */
    public Paint f36527l;

    /* JADX INFO: renamed from: m */
    public Path f36528m;

    /* JADX INFO: renamed from: n */
    public int f36529n;

    /* JADX INFO: renamed from: o */
    public float f36530o;

    /* JADX INFO: renamed from: p */
    public float f36531p;

    /* JADX INFO: renamed from: q */
    public float f36532q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f36533r;

    /* JADX INFO: renamed from: s */
    public boolean f36534s;

    /* JADX INFO: renamed from: t */
    public RectF f36535t;

    /* JADX INFO: renamed from: u */
    public float f36536u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.LineView$a */
    public interface InterfaceC8911a {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36517b = 30.0f;
        this.f36518c = 50.0f;
        this.f36519d = 500.0f;
        this.f36522g = 10.0f;
        this.f36523h = -1;
        this.f36525j = 5;
        this.f36526k = 20.0f;
        this.f36529n = 800;
        this.f36531p = 1.0f;
        this.f36532q = 70.0f;
        m55851b();
    }

    /* JADX INFO: renamed from: b */
    public final void m55851b() {
        Paint paint = new Paint();
        this.f36516a = paint;
        paint.setColor(this.f36523h);
        Paint paint2 = this.f36516a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f36516a.setDither(true);
        this.f36516a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f36524i = paint3;
        paint3.setColor(this.f36523h);
        this.f36524i.setStrokeWidth(this.f36525j);
        this.f36524i.setStyle(Paint.Style.STROKE);
        this.f36524i.setDither(true);
        this.f36524i.setAntiAlias(true);
        float f = (180.0f - this.f36532q) / 2.0f;
        this.f36536u = f;
        this.f36530o = f - 180.0f;
        float f2 = this.f36517b;
        float f3 = this.f36519d;
        this.f36520e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f36518c;
        float f5 = this.f36519d;
        this.f36521f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f36536u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f36527l = paint4;
        paint4.setColor(this.f36523h);
        this.f36527l.setStyle(style);
        this.f36527l.setDither(true);
        this.f36527l.setAntiAlias(true);
        this.f36528m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36531p, this.f36532q);
        this.f36533r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f36529n);
        this.f36533r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hmr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f108464a.m55852c(valueAnimator);
            }
        });
        float f6 = this.f36517b;
        float f7 = this.f36518c;
        float f8 = this.f36519d;
        this.f36535t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m55852c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f36531p = fFloatValue;
        if (fFloatValue == this.f36532q) {
            this.f36534s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f36533r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f36520e, this.f36521f, this.f36522g, this.f36516a);
        canvas.drawArc(this.f36535t, this.f36530o, this.f36531p, false, this.f36524i);
        float fSin = (float) (((double) (this.f36519d - (this.f36526k / 2.0f))) * Math.sin((((double) (this.f36536u + this.f36531p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f36519d - (this.f36526k / 2.0f))) * Math.cos((((double) (this.f36536u + this.f36531p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f36519d + (this.f36526k / 2.0f))) * Math.sin((((double) (this.f36536u + this.f36531p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f36519d + (this.f36526k / 2.0f))) * Math.cos((((double) (this.f36536u + this.f36531p)) * 3.141592653589793d) / 180.0d));
        float f = this.f36517b;
        float f2 = this.f36519d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f36518c;
        float f5 = (f2 - fSin) + f4;
        this.f36528m.moveTo(f3, f5);
        this.f36528m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f36528m.lineTo(f3 + ((float) (((double) this.f36526k) * Math.sin((((double) (this.f36531p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f36526k) * Math.cos((((double) (this.f36531p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f36528m.close();
        canvas.drawPath(this.f36528m, this.f36527l);
        this.f36528m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f36519d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f36517b * 2.0f)), (int) (((double) ((this.f36518c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f36536u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC8911a interfaceC8911a) {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineView(Context context) {
        this(context, null);
    }
}
