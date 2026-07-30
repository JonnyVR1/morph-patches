package com.p051p1.mobile.putong.core.p058ui.profile.exploop;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f34119a;

    /* JADX INFO: renamed from: b */
    public int f34120b;

    /* JADX INFO: renamed from: c */
    public int f34121c;

    /* JADX INFO: renamed from: d */
    public Paint f34122d;

    /* JADX INFO: renamed from: e */
    public RectF f34123e;

    /* JADX INFO: renamed from: f */
    public RectF f34124f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f34125g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.ExpSetInfoProgressView$a */
    public class C8803a implements ValueAnimator.AnimatorUpdateListener {
        public C8803a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpSetInfoProgressView.this.f34124f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), ExpSetInfoProgressView.this.f34120b);
            ExpSetInfoProgressView.this.invalidate();
        }
    }

    public ExpSetInfoProgressView(Context context) {
        super(context);
        m52423c();
    }

    /* JADX INFO: renamed from: c */
    public final void m52423c() {
        Paint paint = new Paint();
        this.f34122d = paint;
        paint.setColor(-65536);
        this.f34120b = qa00.m175859d(6.0f);
        this.f34123e = new RectF();
        this.f34124f = new RectF();
        this.f34121c = qa00.m175859d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m52424d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f34125g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f34125g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f34124f.right, (this.f34119a / i2) * i).setDuration(300L);
        this.f34125g = duration;
        duration.addUpdateListener(new C8803a());
        this.f34125g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f34119a <= 0 || this.f34120b <= 0) {
            return;
        }
        this.f34122d.setColor(-526345);
        RectF rectF = this.f34123e;
        int i = this.f34121c;
        canvas.drawRoundRect(rectF, i, i, this.f34122d);
        this.f34122d.setColor(-98787);
        RectF rectF2 = this.f34124f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f34121c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f34122d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f34119a = size;
        setMeasuredDimension(size, this.f34120b);
        this.f34123e.set(0.0f, 0.0f, this.f34119a, this.f34120b);
        this.f34122d.setAntiAlias(true);
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m52423c();
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52423c();
    }
}
