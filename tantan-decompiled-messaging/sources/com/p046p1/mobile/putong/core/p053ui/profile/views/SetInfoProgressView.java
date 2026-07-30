package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class SetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f34239a;

    /* JADX INFO: renamed from: b */
    public int f34240b;

    /* JADX INFO: renamed from: c */
    public int f34241c;

    /* JADX INFO: renamed from: d */
    public Paint f34242d;

    /* JADX INFO: renamed from: e */
    public RectF f34243e;

    /* JADX INFO: renamed from: f */
    public RectF f34244f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f34245g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.SetInfoProgressView$a */
    public class C8748a implements ValueAnimator.AnimatorUpdateListener {
        public C8748a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SetInfoProgressView.this.f34244f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), SetInfoProgressView.this.f34240b);
            SetInfoProgressView.this.invalidate();
        }
    }

    public SetInfoProgressView(Context context) {
        super(context);
        m53043c();
    }

    /* JADX INFO: renamed from: c */
    public final void m53043c() {
        Paint paint = new Paint();
        this.f34242d = paint;
        paint.setColor(-65536);
        this.f34240b = t100.m186890d(6.0f);
        this.f34243e = new RectF();
        this.f34244f = new RectF();
        this.f34241c = t100.m186890d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m53044d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f34245g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f34245g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f34244f.right, (this.f34239a / i2) * i).setDuration(300L);
        this.f34245g = duration;
        duration.addUpdateListener(new C8748a());
        this.f34245g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f34239a <= 0 || this.f34240b <= 0) {
            return;
        }
        this.f34242d.setColor(-526345);
        RectF rectF = this.f34243e;
        int i = this.f34241c;
        canvas.drawRoundRect(rectF, i, i, this.f34242d);
        this.f34242d.setColor(-98787);
        RectF rectF2 = this.f34244f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f34241c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f34242d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f34239a = size;
        setMeasuredDimension(size, this.f34240b);
        this.f34243e.set(0.0f, 0.0f, this.f34239a, this.f34240b);
        this.f34242d.setAntiAlias(true);
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53043c();
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53043c();
    }
}
