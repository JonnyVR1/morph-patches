package com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar;

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
import p153l.gt0;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class MessageSurfaceAnimContainer extends FrameLayout implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public Rect f32853a;

    /* JADX INFO: renamed from: b */
    public Rect f32854b;

    /* JADX INFO: renamed from: c */
    public Rect f32855c;

    /* JADX INFO: renamed from: d */
    public RectF f32856d;

    /* JADX INFO: renamed from: e */
    public Path f32857e;

    /* JADX INFO: renamed from: f */
    public boolean f32858f;

    /* JADX INFO: renamed from: g */
    public boolean f32859g;

    /* JADX INFO: renamed from: h */
    public x20 f32860h;

    /* JADX INFO: renamed from: i */
    public x20 f32861i;

    /* JADX INFO: renamed from: j */
    public x20 f32862j;

    /* JADX INFO: renamed from: k */
    public int f32863k;

    /* JADX INFO: renamed from: l */
    public float f32864l;

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32853a = new Rect();
        this.f32854b = new Rect();
        this.f32855c = new Rect();
        this.f32856d = new RectF();
        this.f32857e = new Path();
        this.f32858f = false;
        this.f32859g = false;
        this.f32863k = qa00.f156322i;
    }

    /* JADX INFO: renamed from: a */
    public void m50587a(@NonNull Rect rect, x20 x20Var) {
        if (m50589c()) {
            return;
        }
        gt0.m132159e(this);
        this.f32859g = true;
        this.f32858f = false;
        this.f32855c.set(rect);
        this.f32862j = x20Var;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        gt0.m132156b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m50588b(@NonNull Rect rect, x20 x20Var, x20 x20Var2) {
        if (m50589c()) {
            return;
        }
        gt0.m132159e(this);
        this.f32858f = true;
        this.f32859g = false;
        this.f32854b.set(rect);
        this.f32860h = x20Var;
        this.f32861i = x20Var2;
        this.f32856d.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f32864l = ((float) this.f32853a.height()) - this.f32856d.height() > 0.0f ? ((this.f32853a.width() - this.f32856d.width()) * 1.0f) / (this.f32853a.height() - this.f32856d.height()) : 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        gt0.m132156b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50589c() {
        return this.f32858f || this.f32859g;
    }

    /* JADX INFO: renamed from: d */
    public final void m50590d() {
        this.f32858f = false;
        this.f32859g = false;
        setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!m50589c()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f32857e);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m50591e() {
        if (this.f32858f) {
            this.f32858f = false;
            requestLayout();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        m50590d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f32858f && NullChecker.m82486a(this.f32861i)) {
            this.f32861i.call();
        }
        if (this.f32859g && NullChecker.m82486a(this.f32862j)) {
            this.f32862j.call();
        }
        m50590d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f32858f && NullChecker.m82486a(this.f32860h)) {
            this.f32860h.call();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f32858f) {
            float fMin = Math.min(fFloatValue / this.f32864l, 1.0f);
            Rect rect = this.f32854b;
            int i = rect.left;
            Rect rect2 = this.f32853a;
            int i2 = (int) (i + ((rect2.left - i) * fMin));
            int i3 = rect.right;
            int i4 = (int) (i3 + ((rect2.right - i3) * fMin));
            int i5 = rect.top;
            int i6 = (int) (i5 + ((rect2.top - i5) * fFloatValue));
            int i7 = rect.bottom;
            this.f32856d.set(i2, i6, i4, (int) (i7 + ((rect2.bottom - i7) * fFloatValue)));
        } else {
            Rect rect3 = this.f32853a;
            int i8 = rect3.left;
            Rect rect4 = this.f32855c;
            int i9 = (int) (i8 + ((rect4.left - i8) * fFloatValue));
            int i10 = rect3.top;
            int i11 = (int) (i10 + ((rect4.top - i10) * fFloatValue));
            int i12 = rect3.right;
            int i13 = (int) (i12 + ((rect4.right - i12) * fFloatValue));
            int i14 = rect3.bottom;
            this.f32856d.set(i9, i11, i13, (int) (i14 + ((rect4.bottom - i14) * fFloatValue)));
            setAlpha(Math.min(1.0f - fFloatValue, 0.5f));
        }
        this.f32857e.reset();
        Path path = this.f32857e;
        RectF rectF = this.f32856d;
        int i15 = this.f32863k;
        path.addRoundRect(rectF, i15, i15, Path.Direction.CW);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.f32853a;
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        this.f32853a.bottom = getMeasuredHeight();
    }

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageSurfaceAnimContainer(@NonNull Context context) {
        this(context, null);
    }
}
