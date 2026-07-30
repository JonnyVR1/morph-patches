package com.p000p1.mobile.putong.core.p001ui.constellationmatch;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ConstellationView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f1209a;

    /* JADX INFO: renamed from: b */
    public float f1210b;

    /* JADX INFO: renamed from: c */
    public float f1211c;

    /* JADX INFO: renamed from: d */
    public float f1212d;

    /* JADX INFO: renamed from: e */
    public float f1213e;

    /* JADX INFO: renamed from: f */
    public float f1214f;

    /* JADX INFO: renamed from: g */
    public float f1215g;

    /* JADX INFO: renamed from: h */
    public int f1216h;

    /* JADX INFO: renamed from: i */
    public Paint f1217i;

    /* JADX INFO: renamed from: j */
    public int f1218j;

    /* JADX INFO: renamed from: k */
    public float f1219k;

    /* JADX INFO: renamed from: l */
    public Paint f1220l;

    /* JADX INFO: renamed from: m */
    public Path f1221m;

    /* JADX INFO: renamed from: n */
    public int f1222n;

    /* JADX INFO: renamed from: o */
    public float f1223o;

    /* JADX INFO: renamed from: p */
    public float f1224p;

    /* JADX INFO: renamed from: q */
    public float f1225q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f1226r;

    /* JADX INFO: renamed from: s */
    public boolean f1227s;

    /* JADX INFO: renamed from: t */
    public RectF f1228t;

    /* JADX INFO: renamed from: u */
    public float f1229u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.constellationmatch.ConstellationView$a */
    public interface InterfaceC3083a {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1210b = 30.0f;
        this.f1211c = 50.0f;
        this.f1212d = 500.0f;
        this.f1215g = 10.0f;
        this.f1216h = Color.parseColor("#AEA3ED");
        this.f1218j = 5;
        this.f1219k = 20.0f;
        this.f1222n = 800;
        this.f1224p = 1.0f;
        this.f1225q = 70.0f;
        m2095b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2095b() {
        Paint paint = new Paint();
        this.f1209a = paint;
        paint.setColor(this.f1216h);
        Paint paint2 = this.f1209a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f1209a.setDither(true);
        this.f1209a.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f1217i = paint3;
        paint3.setColor(this.f1216h);
        this.f1217i.setStrokeWidth(this.f1218j);
        this.f1217i.setStyle(Paint.Style.STROKE);
        this.f1217i.setDither(true);
        this.f1217i.setAntiAlias(true);
        float f = (180.0f - this.f1225q) / 2.0f;
        this.f1229u = f;
        this.f1223o = f - 180.0f;
        float f2 = this.f1210b;
        float f3 = this.f1212d;
        this.f1213e = (float) (((double) (f2 + f3)) - (((double) f3) * Math.cos((((double) f) * 3.141592653589793d) / 180.0d)));
        float f4 = this.f1211c;
        float f5 = this.f1212d;
        this.f1214f = (float) (((double) (f4 + f5)) - (((double) f5) * Math.sin((((double) this.f1229u) * 3.141592653589793d) / 180.0d)));
        Paint paint4 = new Paint();
        this.f1220l = paint4;
        paint4.setColor(this.f1216h);
        this.f1220l.setStyle(style);
        this.f1220l.setDither(true);
        this.f1220l.setAntiAlias(true);
        this.f1221m = new Path();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f1224p, this.f1225q);
        this.f1226r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f1222n);
        this.f1226r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yy5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9149a.m2096c(valueAnimator);
            }
        });
        float f6 = this.f1210b;
        float f7 = this.f1211c;
        float f8 = this.f1212d;
        this.f1228t = new RectF(f6, f7, (f8 * 2.0f) + f6, (f8 * 2.0f) + f7);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2096c(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1224p = fFloatValue;
        if (fFloatValue == this.f1225q) {
            this.f1227s = true;
        }
        invalidate();
    }

    public ValueAnimator getAnim() {
        return this.f1226r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f1213e, this.f1214f, this.f1215g, this.f1209a);
        canvas.drawArc(this.f1228t, this.f1223o, this.f1224p, false, this.f1217i);
        float fSin = (float) (((double) (this.f1212d - (this.f1219k / 2.0f))) * Math.sin((((double) (this.f1229u + this.f1224p)) * 3.141592653589793d) / 180.0d));
        float fCos = (float) (((double) (this.f1212d - (this.f1219k / 2.0f))) * Math.cos((((double) (this.f1229u + this.f1224p)) * 3.141592653589793d) / 180.0d));
        float fSin2 = (float) (((double) (this.f1212d + (this.f1219k / 2.0f))) * Math.sin((((double) (this.f1229u + this.f1224p)) * 3.141592653589793d) / 180.0d));
        float fCos2 = (float) (((double) (this.f1212d + (this.f1219k / 2.0f))) * Math.cos((((double) (this.f1229u + this.f1224p)) * 3.141592653589793d) / 180.0d));
        float f = this.f1210b;
        float f2 = this.f1212d;
        float f3 = (f + f2) - fCos;
        float f4 = this.f1211c;
        float f5 = (f2 - fSin) + f4;
        this.f1221m.moveTo(f3, f5);
        this.f1221m.lineTo((f + f2) - fCos2, (f2 - fSin2) + f4);
        this.f1221m.lineTo(f3 + ((float) (((double) this.f1219k) * Math.sin((((double) (this.f1224p + 15.0f)) * 3.141592653589793d) / 180.0d))), f5 - ((float) (((double) this.f1219k) * Math.cos((((double) (this.f1224p + 15.0f)) * 3.141592653589793d) / 180.0d))));
        this.f1221m.close();
        canvas.drawPath(this.f1221m, this.f1220l);
        this.f1221m.reset();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.f1212d;
        setMeasuredDimension((int) ((f * 2.0f) + (this.f1210b * 2.0f)), (int) (((double) ((this.f1211c * 3.0f) + f)) - (((double) f) * Math.sin((((double) this.f1229u) * 3.141592653589793d) / 180.0d))));
    }

    public void setOnEndListener(InterfaceC3083a interfaceC3083a) {
    }

    public ConstellationView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConstellationView(Context context) {
        this(context, null);
    }
}
