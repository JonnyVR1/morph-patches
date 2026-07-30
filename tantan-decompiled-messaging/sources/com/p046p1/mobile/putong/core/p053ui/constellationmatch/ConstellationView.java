package com.p046p1.mobile.putong.core.p053ui.constellationmatch;

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

/* JADX INFO: loaded from: classes10.dex */
public class ConstellationView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f28815a;

    /* JADX INFO: renamed from: b */
    public float f28816b;

    /* JADX INFO: renamed from: c */
    public float f28817c;

    /* JADX INFO: renamed from: d */
    public float f28818d;

    /* JADX INFO: renamed from: e */
    public float f28819e;

    /* JADX INFO: renamed from: f */
    public float f28820f;

    /* JADX INFO: renamed from: g */
    public float f28821g;

    /* JADX INFO: renamed from: h */
    public int f28822h;

    /* JADX INFO: renamed from: i */
    public Paint f28823i;

    /* JADX INFO: renamed from: j */
    public int f28824j;

    /* JADX INFO: renamed from: k */
    public float f28825k;

    /* JADX INFO: renamed from: l */
    public Paint f28826l;

    /* JADX INFO: renamed from: m */
    public Path f28827m;

    /* JADX INFO: renamed from: n */
    public int f28828n;

    /* JADX INFO: renamed from: o */
    public float f28829o;

    /* JADX INFO: renamed from: p */
    public float f28830p;

    /* JADX INFO: renamed from: q */
    public float f28831q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f28832r;

    /* JADX INFO: renamed from: s */
    public boolean f28833s;

    /* JADX INFO: renamed from: t */
    public RectF f28834t;

    /* JADX INFO: renamed from: u */
    public float f28835u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationView$a */
    public interface InterfaceC8308a {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28816b = 30.0f;
        this.f28817c = 50.0f;
        this.f28818d = 500.0f;
        this.f28821g = 10.0f;
        this.f28822h = Color.parseColor("#AEA3ED");
        this.f28824j = 5;
        this.f28825k = 20.0f;
        this.f28828n = 800;
        this.f28830p = 1.0f;
        this.f28831q = 70.0f;
        m44781b();
    }

    /* JADX INFO: renamed from: b */
    public final void m44781b() {
        Paint paint = new Paint();
        this.f28815a = paint;
        paint.setColor(this.f28822h);
        Paint paint2 = this.f28815a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f28815a.setDither(true);
        this.f28815a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f28823i = paint3;
        paint3.setColor(this.f28822h);
        this.f28823i.setStrokeWidth(this.f28824j);
        this.f28823i.setStyle(Paint.Style.STROKE);
        this.f28823i.setDither(true);
        this.f28823i.setAntiAlias(true);
        float f = (180.0f - this.f28831q) / 2.0f;
        this.f28835u = f;
        this.f28829o = f - 180.0f;
        float f2 = this.f28816b;
        float f3 = this.f28818d;
        this.f28819e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f28817c;
        float f5 = this.f28818d;
        this.f28820f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f28835u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f28826l = paint4;
        paint4.setColor(this.f28822h);
        this.f28826l.setStyle(style);
        this.f28826l.setDither(true);
        this.f28826l.setAntiAlias(true);
        this.f28827m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f28830p, this.f28831q);
        this.f28832r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f28828n);
        this.f28832r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yy5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f200710a.m44782c(valueAnimator);
            }
        });
        float f6 = this.f28816b;
        float f7 = this.f28817c;
        float f8 = this.f28818d;
        this.f28834t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m44782c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f28830p = fFloatValue;
        if (fFloatValue == this.f28831q) {
            this.f28833s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f28832r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f28819e, this.f28820f, this.f28821g, this.f28815a);
        canvas.drawArc(this.f28834t, this.f28829o, this.f28830p, false, this.f28823i);
        float fSin = (float) (((double) (this.f28818d - (this.f28825k / 2.0f))) * Math.sin((((double) (this.f28835u + this.f28830p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f28818d - (this.f28825k / 2.0f))) * Math.cos((((double) (this.f28835u + this.f28830p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f28818d + (this.f28825k / 2.0f))) * Math.sin((((double) (this.f28835u + this.f28830p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f28818d + (this.f28825k / 2.0f))) * Math.cos((((double) (this.f28835u + this.f28830p)) * 3.141592653589793d) / 180.0d));
        float f = this.f28816b;
        float f2 = this.f28818d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f28817c;
        float f5 = (f2 - fSin) + f4;
        this.f28827m.moveTo(f3, f5);
        this.f28827m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f28827m.lineTo(f3 + ((float) (((double) this.f28825k) * Math.sin((((double) (this.f28830p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f28825k) * Math.cos((((double) (this.f28830p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f28827m.close();
        canvas.drawPath(this.f28827m, this.f28826l);
        this.f28827m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f28818d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f28816b * 2.0f)), (int) (((double) ((this.f28817c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f28835u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC8308a interfaceC8308a) {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstellationView(Context context) {
        this(context, null);
    }
}
