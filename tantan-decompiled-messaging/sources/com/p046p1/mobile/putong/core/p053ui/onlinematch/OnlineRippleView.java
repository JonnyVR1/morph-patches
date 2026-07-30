package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.tantanapp.common.utils.NullChecker;
import p149l.e9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineRippleView extends View {

    /* JADX INFO: renamed from: k */
    public static final int f32626k = t100.m186890d(122.0f);

    /* JADX INFO: renamed from: l */
    public static final int f32627l = t100.m186890d(170.0f);

    /* JADX INFO: renamed from: a */
    public ValueAnimator f32628a;

    /* JADX INFO: renamed from: b */
    public Paint f32629b;

    /* JADX INFO: renamed from: c */
    public int f32630c;

    /* JADX INFO: renamed from: d */
    public int f32631d;

    /* JADX INFO: renamed from: e */
    public int f32632e;

    /* JADX INFO: renamed from: f */
    public int f32633f;

    /* JADX INFO: renamed from: g */
    public int f32634g;

    /* JADX INFO: renamed from: h */
    public int f32635h;

    /* JADX INFO: renamed from: i */
    public int f32636i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    public int f32637j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.OnlineRippleView$a */
    public class C8602a implements ValueAnimator.AnimatorUpdateListener {
        public C8602a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            OnlineRippleView.this.f32633f = iIntValue;
            OnlineRippleView onlineRippleView = OnlineRippleView.this;
            onlineRippleView.f32634g = ((((onlineRippleView.f32631d - iIntValue) * 100) / OnlineRippleView.this.f32632e) * 76) / 100;
            OnlineRippleView.this.f32629b.setAlpha(OnlineRippleView.this.f32634g);
            OnlineRippleView.this.invalidate();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = f32626k;
        this.f32630c = i2;
        int i3 = f32627l;
        this.f32631d = i3;
        this.f32632e = i3 - i2;
        m50205g(attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m50205g(AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f90000U0);
            this.f32637j = typedArrayObtainStyledAttributes.getColor(e9c0.f90003V0, -1);
            this.f32630c = (int) typedArrayObtainStyledAttributes.getDimension(e9c0.f90008X0, f32626k);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(e9c0.f90006W0, f32627l);
            this.f32631d = dimension;
            this.f32632e = dimension - this.f32630c;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f32630c, this.f32631d);
        this.f32628a = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1200L);
        this.f32628a.setStartDelay(200L);
        this.f32628a.addUpdateListener(new C8602a());
        this.f32628a.setRepeatMode(1);
        this.f32628a.setRepeatCount(-1);
        Paint paint = new Paint();
        this.f32629b = paint;
        paint.setColor(this.f32637j);
        this.f32633f = this.f32630c;
        this.f32629b.setAlpha(this.f32634g);
        this.f32629b.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m50206h() {
        if (this.f32628a.isRunning()) {
            return;
        }
        this.f32628a.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m50207i() {
        if (this.f32628a.isRunning()) {
            this.f32628a.cancel();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m50206h();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50207i();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f32635h / 2, this.f32636i / 2, this.f32633f / 2, this.f32629b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f32635h = View.MeasureSpec.getSize(i);
        this.f32636i = View.MeasureSpec.getSize(i2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m50206h();
        } else {
            m50207i();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineRippleView(Context context) {
        this(context, null);
    }
}
