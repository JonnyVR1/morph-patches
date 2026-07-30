package com.p051p1.mobile.putong.core.p058ui.tarot;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class LineView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f37364a;

    /* JADX INFO: renamed from: b */
    public float f37365b;

    /* JADX INFO: renamed from: c */
    public float f37366c;

    /* JADX INFO: renamed from: d */
    public float f37367d;

    /* JADX INFO: renamed from: e */
    public float f37368e;

    /* JADX INFO: renamed from: f */
    public float f37369f;

    /* JADX INFO: renamed from: g */
    public float f37370g;

    /* JADX INFO: renamed from: h */
    public int f37371h;

    /* JADX INFO: renamed from: i */
    public Paint f37372i;

    /* JADX INFO: renamed from: j */
    public int f37373j;

    /* JADX INFO: renamed from: k */
    public float f37374k;

    /* JADX INFO: renamed from: l */
    public Paint f37375l;

    /* JADX INFO: renamed from: m */
    public Path f37376m;

    /* JADX INFO: renamed from: n */
    public int f37377n;

    /* JADX INFO: renamed from: o */
    public float f37378o;

    /* JADX INFO: renamed from: p */
    public float f37379p;

    /* JADX INFO: renamed from: q */
    public float f37380q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f37381r;

    /* JADX INFO: renamed from: s */
    public boolean f37382s;

    /* JADX INFO: renamed from: t */
    public RectF f37383t;

    /* JADX INFO: renamed from: u */
    public float f37384u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.LineView$a */
    public interface InterfaceC9074a {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37365b = 30.0f;
        this.f37366c = 50.0f;
        this.f37367d = 500.0f;
        this.f37370g = 10.0f;
        this.f37371h = -1;
        this.f37373j = 5;
        this.f37374k = 20.0f;
        this.f37377n = 800;
        this.f37379p = 1.0f;
        this.f37380q = 70.0f;
        m57034b();
    }

    /* JADX INFO: renamed from: b */
    public final void m57034b() {
        Paint paint = new Paint();
        this.f37364a = paint;
        paint.setColor(this.f37371h);
        Paint paint2 = this.f37364a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f37364a.setDither(true);
        this.f37364a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f37372i = paint3;
        paint3.setColor(this.f37371h);
        this.f37372i.setStrokeWidth(this.f37373j);
        this.f37372i.setStyle(Paint.Style.STROKE);
        this.f37372i.setDither(true);
        this.f37372i.setAntiAlias(true);
        float f = (180.0f - this.f37380q) / 2.0f;
        this.f37384u = f;
        this.f37378o = f - 180.0f;
        float f2 = this.f37365b;
        float f3 = this.f37367d;
        this.f37368e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f37366c;
        float f5 = this.f37367d;
        this.f37369f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f37384u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f37375l = paint4;
        paint4.setColor(this.f37371h);
        this.f37375l.setStyle(style);
        this.f37375l.setDither(true);
        this.f37375l.setAntiAlias(true);
        this.f37376m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f37379p, this.f37380q);
        this.f37381r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f37377n);
        this.f37381r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ior
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f116195a.m57035c(valueAnimator);
            }
        });
        float f6 = this.f37365b;
        float f7 = this.f37366c;
        float f8 = this.f37367d;
        this.f37383t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m57035c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f37379p = fFloatValue;
        if (fFloatValue == this.f37380q) {
            this.f37382s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f37381r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f37368e, this.f37369f, this.f37370g, this.f37364a);
        canvas.drawArc(this.f37383t, this.f37378o, this.f37379p, false, this.f37372i);
        float fSin = (float) (((double) (this.f37367d - (this.f37374k / 2.0f))) * Math.sin((((double) (this.f37384u + this.f37379p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f37367d - (this.f37374k / 2.0f))) * Math.cos((((double) (this.f37384u + this.f37379p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f37367d + (this.f37374k / 2.0f))) * Math.sin((((double) (this.f37384u + this.f37379p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f37367d + (this.f37374k / 2.0f))) * Math.cos((((double) (this.f37384u + this.f37379p)) * 3.141592653589793d) / 180.0d));
        float f = this.f37365b;
        float f2 = this.f37367d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f37366c;
        float f5 = (f2 - fSin) + f4;
        this.f37376m.moveTo(f3, f5);
        this.f37376m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f37376m.lineTo(f3 + ((float) (((double) this.f37374k) * Math.sin((((double) (this.f37379p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f37374k) * Math.cos((((double) (this.f37379p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f37376m.close();
        canvas.drawPath(this.f37376m, this.f37375l);
        this.f37376m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f37367d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f37365b * 2.0f)), (int) (((double) ((this.f37366c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f37384u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC9074a interfaceC9074a) {
    }

    public LineView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineView(Context context) {
        this(context, null);
    }
}
