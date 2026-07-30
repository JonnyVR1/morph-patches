package com.p046p1.mobile.putong.core.p053ui.profile.exploop;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f33271a;

    /* JADX INFO: renamed from: b */
    public int f33272b;

    /* JADX INFO: renamed from: c */
    public int f33273c;

    /* JADX INFO: renamed from: d */
    public Paint f33274d;

    /* JADX INFO: renamed from: e */
    public RectF f33275e;

    /* JADX INFO: renamed from: f */
    public RectF f33276f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f33277g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.ExpSetInfoProgressView$a */
    public class C8640a implements ValueAnimator.AnimatorUpdateListener {
        public C8640a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ExpSetInfoProgressView.this.f33276f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), ExpSetInfoProgressView.this.f33272b);
            ExpSetInfoProgressView.this.invalidate();
        }
    }

    public ExpSetInfoProgressView(Context context) {
        super(context);
        m51240c();
    }

    /* JADX INFO: renamed from: c */
    public final void m51240c() {
        Paint paint = new Paint();
        this.f33274d = paint;
        paint.setColor(-65536);
        this.f33272b = t100.m186890d(6.0f);
        this.f33275e = new RectF();
        this.f33276f = new RectF();
        this.f33273c = t100.m186890d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m51241d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f33277g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33277g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f33276f.right, (this.f33271a / i2) * i).setDuration(300L);
        this.f33277g = duration;
        duration.addUpdateListener(new C8640a());
        this.f33277g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33271a <= 0 || this.f33272b <= 0) {
            return;
        }
        this.f33274d.setColor(-526345);
        RectF rectF = this.f33275e;
        int i = this.f33273c;
        canvas.drawRoundRect(rectF, i, i, this.f33274d);
        this.f33274d.setColor(-98787);
        RectF rectF2 = this.f33276f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f33273c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f33274d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f33271a = size;
        setMeasuredDimension(size, this.f33272b);
        this.f33275e.set(0.0f, 0.0f, this.f33271a, this.f33272b);
        this.f33274d.setAntiAlias(true);
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m51240c();
    }

    public ExpSetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m51240c();
    }
}
