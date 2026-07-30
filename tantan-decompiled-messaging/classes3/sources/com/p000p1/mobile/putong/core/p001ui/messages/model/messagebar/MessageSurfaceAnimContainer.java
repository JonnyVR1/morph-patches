package com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.t100;
import p003l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageSurfaceAnimContainer extends FrameLayout implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public Rect f1896a;

    /* JADX INFO: renamed from: b */
    public Rect f1897b;

    /* JADX INFO: renamed from: c */
    public Rect f1898c;

    /* JADX INFO: renamed from: d */
    public RectF f1899d;

    /* JADX INFO: renamed from: e */
    public Path f1900e;

    /* JADX INFO: renamed from: f */
    public boolean f1901f;

    /* JADX INFO: renamed from: g */
    public boolean f1902g;

    /* JADX INFO: renamed from: h */
    public d30 f1903h;

    /* JADX INFO: renamed from: i */
    public d30 f1904i;

    /* JADX INFO: renamed from: j */
    public d30 f1905j;

    /* JADX INFO: renamed from: k */
    public int f1906k;

    /* JADX INFO: renamed from: l */
    public float f1907l;

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1896a = new Rect();
        this.f1897b = new Rect();
        this.f1898c = new Rect();
        this.f1899d = new RectF();
        this.f1900e = new Path();
        this.f1901f = false;
        this.f1902g = false;
        this.f1906k = t100.i;
    }

    /* JADX INFO: renamed from: a */
    public void m2533a(@NonNull Rect rect, d30 d30Var) {
        if (m2535c()) {
            return;
        }
        bt0.e(this);
        this.f1902g = true;
        this.f1901f = false;
        this.f1898c.set(rect);
        this.f1905j = d30Var;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        bt0.b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m2534b(@NonNull Rect rect, d30 d30Var, d30 d30Var2) {
        if (m2535c()) {
            return;
        }
        bt0.e(this);
        this.f1901f = true;
        this.f1902g = false;
        this.f1897b.set(rect);
        this.f1903h = d30Var;
        this.f1904i = d30Var2;
        this.f1899d.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1907l = ((float) this.f1896a.height()) - this.f1899d.height() > 0.0f ? ((this.f1896a.width() - this.f1899d.width()) * 1.0f) / (this.f1896a.height() - this.f1899d.height()) : 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        bt0.b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2535c() {
        return this.f1901f || this.f1902g;
    }

    /* JADX INFO: renamed from: d */
    public final void m2536d() {
        this.f1901f = false;
        this.f1902g = false;
        setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!m2535c()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f1900e);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m2537e() {
        if (this.f1901f) {
            this.f1901f = false;
            requestLayout();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        m2536d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f1901f && NullChecker.a(this.f1904i)) {
            this.f1904i.call();
        }
        if (this.f1902g && NullChecker.a(this.f1905j)) {
            this.f1905j.call();
        }
        m2536d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f1901f && NullChecker.a(this.f1903h)) {
            this.f1903h.call();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f1901f) {
            float fMin = Math.min(fFloatValue / this.f1907l, 1.0f);
            Rect rect = this.f1897b;
            int i = rect.left;
            Rect rect2 = this.f1896a;
            int i2 = (int) (i + ((rect2.left - i) * fMin));
            int i3 = rect.right;
            int i4 = (int) (i3 + ((rect2.right - i3) * fMin));
            int i5 = rect.top;
            int i6 = (int) (i5 + ((rect2.top - i5) * fFloatValue));
            int i7 = rect.bottom;
            this.f1899d.set(i2, i6, i4, (int) (i7 + ((rect2.bottom - i7) * fFloatValue)));
        } else {
            Rect rect3 = this.f1896a;
            int i8 = rect3.left;
            Rect rect4 = this.f1898c;
            int i9 = (int) (i8 + ((rect4.left - i8) * fFloatValue));
            int i10 = rect3.top;
            int i11 = (int) (i10 + ((rect4.top - i10) * fFloatValue));
            int i12 = rect3.right;
            int i13 = (int) (i12 + ((rect4.right - i12) * fFloatValue));
            int i14 = rect3.bottom;
            this.f1899d.set(i9, i11, i13, (int) (i14 + ((rect4.bottom - i14) * fFloatValue)));
            setAlpha(Math.min(1.0f - fFloatValue, 0.5f));
        }
        this.f1900e.reset();
        Path path = this.f1900e;
        RectF rectF = this.f1899d;
        int i15 = this.f1906k;
        path.addRoundRect(rectF, i15, i15, Path.Direction.CW);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.f1896a;
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        this.f1896a.bottom = getMeasuredHeight();
    }

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageSurfaceAnimContainer(@NonNull Context context) {
        this(context, null);
    }
}
