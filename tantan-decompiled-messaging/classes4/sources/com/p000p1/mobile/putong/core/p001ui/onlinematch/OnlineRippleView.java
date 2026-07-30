package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.tantanapp.common.utils.NullChecker;
import l.e9c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineRippleView extends View {

    /* JADX INFO: renamed from: k */
    public static final int f448k = t100.d(122.0f);

    /* JADX INFO: renamed from: l */
    public static final int f449l = t100.d(170.0f);

    /* JADX INFO: renamed from: a */
    public ValueAnimator f450a;

    /* JADX INFO: renamed from: b */
    public Paint f451b;

    /* JADX INFO: renamed from: c */
    public int f452c;

    /* JADX INFO: renamed from: d */
    public int f453d;

    /* JADX INFO: renamed from: e */
    public int f454e;

    /* JADX INFO: renamed from: f */
    public int f455f;

    /* JADX INFO: renamed from: g */
    public int f456g;

    /* JADX INFO: renamed from: h */
    public int f457h;

    /* JADX INFO: renamed from: i */
    public int f458i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    public int f459j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.OnlineRippleView$a */
    public class C0027a implements ValueAnimator.AnimatorUpdateListener {
        public C0027a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            OnlineRippleView.this.f455f = iIntValue;
            OnlineRippleView onlineRippleView = OnlineRippleView.this;
            onlineRippleView.f456g = ((((onlineRippleView.f453d - iIntValue) * 100) / OnlineRippleView.this.f454e) * 76) / 100;
            OnlineRippleView.this.f451b.setAlpha(OnlineRippleView.this.f456g);
            OnlineRippleView.this.invalidate();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = f448k;
        this.f452c = i2;
        int i3 = f449l;
        this.f453d = i3;
        this.f454e = i3 - i2;
        m636g(attributeSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m636g(AttributeSet attributeSet) {
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.U0);
            this.f459j = typedArrayObtainStyledAttributes.getColor(e9c0.V0, -1);
            this.f452c = (int) typedArrayObtainStyledAttributes.getDimension(e9c0.X0, f448k);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(e9c0.W0, f449l);
            this.f453d = dimension;
            this.f454e = dimension - this.f452c;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f452c, this.f453d);
        this.f450a = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(1200L);
        this.f450a.setStartDelay(200L);
        this.f450a.addUpdateListener(new C0027a());
        this.f450a.setRepeatMode(1);
        this.f450a.setRepeatCount(-1);
        Paint paint = new Paint();
        this.f451b = paint;
        paint.setColor(this.f459j);
        this.f455f = this.f452c;
        this.f451b.setAlpha(this.f456g);
        this.f451b.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m637h() {
        if (this.f450a.isRunning()) {
            return;
        }
        this.f450a.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m638i() {
        if (this.f450a.isRunning()) {
            this.f450a.cancel();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m637h();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m638i();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f457h / 2, this.f458i / 2, this.f455f / 2, this.f451b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f457h = View.MeasureSpec.getSize(i);
        this.f458i = View.MeasureSpec.getSize(i2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m637h();
        } else {
            m638i();
        }
    }

    public OnlineRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineRippleView(Context context) {
        this(context, null);
    }
}
