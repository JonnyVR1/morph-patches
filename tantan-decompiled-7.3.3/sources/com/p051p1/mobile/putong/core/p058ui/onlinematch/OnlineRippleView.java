package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.tantanapp.common.utils.NullChecker;
import p153l.khc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineRippleView extends View {

    /* JADX INFO: renamed from: k */
    public static final int f33474k = qa00.m175859d(122.0f);

    /* JADX INFO: renamed from: l */
    public static final int f33475l = qa00.m175859d(170.0f);

    /* JADX INFO: renamed from: a */
    public ValueAnimator f33476a;

    /* JADX INFO: renamed from: b */
    public Paint f33477b;

    /* JADX INFO: renamed from: c */
    public int f33478c;

    /* JADX INFO: renamed from: d */
    public int f33479d;

    /* JADX INFO: renamed from: e */
    public int f33480e;

    /* JADX INFO: renamed from: f */
    public int f33481f;

    /* JADX INFO: renamed from: g */
    public int f33482g;

    /* JADX INFO: renamed from: h */
    public int f33483h;

    /* JADX INFO: renamed from: i */
    public int f33484i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    public int f33485j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.OnlineRippleView$a */
    public class C8765a implements ValueAnimator.AnimatorUpdateListener {
        public C8765a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            OnlineRippleView.this.f33481f = iIntValue;
            OnlineRippleView onlineRippleView = OnlineRippleView.this;
            onlineRippleView.f33482g = ((((onlineRippleView.f33479d - iIntValue) * 100) / OnlineRippleView.this.f33480e) * 76) / 100;
            OnlineRippleView.this.f33477b.setAlpha(OnlineRippleView.this.f33482g);
            OnlineRippleView.this.invalidate();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = f33474k;
        this.f33478c = i2;
        int i3 = f33475l;
        this.f33479d = i3;
        this.f33480e = i3 - i2;
        m51388g(attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m51388g(AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126770U0);
            this.f33485j = typedArrayObtainStyledAttributes.getColor(khc0.f126773V0, -1);
            this.f33478c = (int) typedArrayObtainStyledAttributes.getDimension(khc0.f126778X0, f33474k);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(khc0.f126776W0, f33475l);
            this.f33479d = dimension;
            this.f33480e = dimension - this.f33478c;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f33478c, this.f33479d);
        this.f33476a = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1200L);
        this.f33476a.setStartDelay(200L);
        this.f33476a.addUpdateListener(new C8765a());
        this.f33476a.setRepeatMode(1);
        this.f33476a.setRepeatCount(-1);
        Paint paint = new Paint();
        this.f33477b = paint;
        paint.setColor(this.f33485j);
        this.f33481f = this.f33478c;
        this.f33477b.setAlpha(this.f33482g);
        this.f33477b.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m51389h() {
        if (this.f33476a.isRunning()) {
            return;
        }
        this.f33476a.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m51390i() {
        if (this.f33476a.isRunning()) {
            this.f33476a.cancel();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m51389h();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51390i();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f33483h / 2, this.f33484i / 2, this.f33481f / 2, this.f33477b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f33483h = View.MeasureSpec.getSize(i);
        this.f33484i = View.MeasureSpec.getSize(i2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m51389h();
        } else {
            m51390i();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineRippleView(Context context) {
        this(context, null);
    }
}
