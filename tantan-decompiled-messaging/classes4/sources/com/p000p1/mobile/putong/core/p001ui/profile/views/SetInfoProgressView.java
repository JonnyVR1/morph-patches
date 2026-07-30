package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f2061a;

    /* JADX INFO: renamed from: b */
    public int f2062b;

    /* JADX INFO: renamed from: c */
    public int f2063c;

    /* JADX INFO: renamed from: d */
    public Paint f2064d;

    /* JADX INFO: renamed from: e */
    public RectF f2065e;

    /* JADX INFO: renamed from: f */
    public RectF f2066f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f2067g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.SetInfoProgressView$a */
    public class C0173a implements ValueAnimator.AnimatorUpdateListener {
        public C0173a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SetInfoProgressView.this.f2066f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), SetInfoProgressView.this.f2062b);
            SetInfoProgressView.this.invalidate();
        }
    }

    public SetInfoProgressView(Context context) {
        super(context);
        m3601c();
    }

    /* JADX INFO: renamed from: c */
    public final void m3601c() {
        Paint paint = new Paint();
        this.f2064d = paint;
        paint.setColor(-65536);
        this.f2062b = t100.d(6.0f);
        this.f2065e = new RectF();
        this.f2066f = new RectF();
        this.f2063c = t100.d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m3602d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f2067g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f2067g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f2066f.right, (this.f2061a / i2) * i).setDuration(300L);
        this.f2067g = duration;
        duration.addUpdateListener(new C0173a());
        this.f2067g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2061a <= 0 || this.f2062b <= 0) {
            return;
        }
        this.f2064d.setColor(-526345);
        RectF rectF = this.f2065e;
        int i = this.f2063c;
        canvas.drawRoundRect(rectF, i, i, this.f2064d);
        this.f2064d.setColor(-98787);
        RectF rectF2 = this.f2066f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f2063c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f2064d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f2061a = size;
        setMeasuredDimension(size, this.f2062b);
        this.f2065e.set(0.0f, 0.0f, this.f2061a, this.f2062b);
        this.f2064d.setAntiAlias(true);
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3601c();
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3601c();
    }
}
