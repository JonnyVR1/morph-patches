package com.p000p1.mobile.putong.core.p001ui.profile.exploop;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpSetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f1093a;

    /* JADX INFO: renamed from: b */
    public int f1094b;

    /* JADX INFO: renamed from: c */
    public int f1095c;

    /* JADX INFO: renamed from: d */
    public Paint f1096d;

    /* JADX INFO: renamed from: e */
    public RectF f1097e;

    /* JADX INFO: renamed from: f */
    public RectF f1098f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f1099g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.ExpSetInfoProgressView$a */
    public class C0065a implements ValueAnimator.AnimatorUpdateListener {
        public C0065a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpSetInfoProgressView.this.f1098f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), ExpSetInfoProgressView.this.f1094b);
            ExpSetInfoProgressView.this.invalidate();
        }
    }

    public ExpSetInfoProgressView(Context context) {
        super(context);
        m1695c();
    }

    /* JADX INFO: renamed from: c */
    public final void m1695c() {
        Paint paint = new Paint();
        this.f1096d = paint;
        paint.setColor(-65536);
        this.f1094b = t100.d(6.0f);
        this.f1097e = new RectF();
        this.f1098f = new RectF();
        this.f1095c = t100.d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m1696d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f1099g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f1099g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f1098f.right, (this.f1093a / i2) * i).setDuration(300L);
        this.f1099g = duration;
        duration.addUpdateListener(new C0065a());
        this.f1099g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1093a <= 0 || this.f1094b <= 0) {
            return;
        }
        this.f1096d.setColor(-526345);
        RectF rectF = this.f1097e;
        int i = this.f1095c;
        canvas.drawRoundRect(rectF, i, i, this.f1096d);
        this.f1096d.setColor(-98787);
        RectF rectF2 = this.f1098f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f1095c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f1096d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f1093a = size;
        setMeasuredDimension(size, this.f1094b);
        this.f1097e.set(0.0f, 0.0f, this.f1093a, this.f1094b);
        this.f1096d.setAntiAlias(true);
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1695c();
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1695c();
    }
}
