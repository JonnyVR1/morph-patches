package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class SetInfoProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f35087a;

    /* JADX INFO: renamed from: b */
    public int f35088b;

    /* JADX INFO: renamed from: c */
    public int f35089c;

    /* JADX INFO: renamed from: d */
    public Paint f35090d;

    /* JADX INFO: renamed from: e */
    public RectF f35091e;

    /* JADX INFO: renamed from: f */
    public RectF f35092f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f35093g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.SetInfoProgressView$a */
    public class C8911a implements ValueAnimator.AnimatorUpdateListener {
        public C8911a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SetInfoProgressView.this.f35092f.set(0.0f, 0.0f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), SetInfoProgressView.this.f35088b);
            SetInfoProgressView.this.invalidate();
        }
    }

    public SetInfoProgressView(Context context) {
        super(context);
        m54226c();
    }

    /* JADX INFO: renamed from: c */
    public final void m54226c() {
        Paint paint = new Paint();
        this.f35090d = paint;
        paint.setColor(-65536);
        this.f35088b = qa00.m175859d(6.0f);
        this.f35091e = new RectF();
        this.f35092f = new RectF();
        this.f35089c = qa00.m175859d(7.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m54227d(int i, int i2) {
        if (i > i2 || i < 0 || i2 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f35093g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f35093g.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofInt((int) this.f35092f.right, (this.f35087a / i2) * i).setDuration(300L);
        this.f35093g = duration;
        duration.addUpdateListener(new C8911a());
        this.f35093g.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f35087a <= 0 || this.f35088b <= 0) {
            return;
        }
        this.f35090d.setColor(-526345);
        RectF rectF = this.f35091e;
        int i = this.f35089c;
        canvas.drawRoundRect(rectF, i, i, this.f35090d);
        this.f35090d.setColor(-98787);
        RectF rectF2 = this.f35092f;
        if (rectF2.right > 0.0f) {
            int i2 = this.f35089c;
            canvas.drawRoundRect(rectF2, i2, i2, this.f35090d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.f35087a = size;
        setMeasuredDimension(size, this.f35088b);
        this.f35091e.set(0.0f, 0.0f, this.f35087a, this.f35088b);
        this.f35090d.setAntiAlias(true);
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54226c();
    }

    public SetInfoProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m54226c();
    }
}
