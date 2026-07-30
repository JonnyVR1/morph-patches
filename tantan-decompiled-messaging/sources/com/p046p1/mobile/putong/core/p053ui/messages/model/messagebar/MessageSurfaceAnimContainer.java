package com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar;

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
import p149l.bt0;
import p149l.d30;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSurfaceAnimContainer extends FrameLayout implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public Rect f32005a;

    /* JADX INFO: renamed from: b */
    public Rect f32006b;

    /* JADX INFO: renamed from: c */
    public Rect f32007c;

    /* JADX INFO: renamed from: d */
    public RectF f32008d;

    /* JADX INFO: renamed from: e */
    public Path f32009e;

    /* JADX INFO: renamed from: f */
    public boolean f32010f;

    /* JADX INFO: renamed from: g */
    public boolean f32011g;

    /* JADX INFO: renamed from: h */
    public d30 f32012h;

    /* JADX INFO: renamed from: i */
    public d30 f32013i;

    /* JADX INFO: renamed from: j */
    public d30 f32014j;

    /* JADX INFO: renamed from: k */
    public int f32015k;

    /* JADX INFO: renamed from: l */
    public float f32016l;

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32005a = new Rect();
        this.f32006b = new Rect();
        this.f32007c = new Rect();
        this.f32008d = new RectF();
        this.f32009e = new Path();
        this.f32010f = false;
        this.f32011g = false;
        this.f32015k = t100.f167260i;
    }

    /* JADX INFO: renamed from: a */
    public void m49404a(@NonNull Rect rect, d30 d30Var) {
        if (m49406c()) {
            return;
        }
        bt0.m103732e(this);
        this.f32011g = true;
        this.f32010f = false;
        this.f32007c.set(rect);
        this.f32014j = d30Var;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        bt0.m103729b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m49405b(@NonNull Rect rect, d30 d30Var, d30 d30Var2) {
        if (m49406c()) {
            return;
        }
        bt0.m103732e(this);
        this.f32010f = true;
        this.f32011g = false;
        this.f32006b.set(rect);
        this.f32012h = d30Var;
        this.f32013i = d30Var2;
        this.f32008d.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f32016l = ((float) this.f32005a.height()) - this.f32008d.height() > 0.0f ? ((this.f32005a.width() - this.f32008d.width()) * 1.0f) / (this.f32005a.height() - this.f32008d.height()) : 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(this);
        duration.addListener(this);
        bt0.m103729b(this, duration).start();
        invalidate();
        setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49406c() {
        return this.f32010f || this.f32011g;
    }

    /* JADX INFO: renamed from: d */
    public final void m49407d() {
        this.f32010f = false;
        this.f32011g = false;
        setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!m49406c()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f32009e);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m49408e() {
        if (this.f32010f) {
            this.f32010f = false;
            requestLayout();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        m49407d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f32010f && NullChecker.m81303a(this.f32013i)) {
            this.f32013i.call();
        }
        if (this.f32011g && NullChecker.m81303a(this.f32014j)) {
            this.f32014j.call();
        }
        m49407d();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f32010f && NullChecker.m81303a(this.f32012h)) {
            this.f32012h.call();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f32010f) {
            float fMin = Math.min(fFloatValue / this.f32016l, 1.0f);
            Rect rect = this.f32006b;
            int i = rect.left;
            Rect rect2 = this.f32005a;
            int i2 = (int) (i + ((rect2.left - i) * fMin));
            int i3 = rect.right;
            int i4 = (int) (i3 + ((rect2.right - i3) * fMin));
            int i5 = rect.top;
            int i6 = (int) (i5 + ((rect2.top - i5) * fFloatValue));
            int i7 = rect.bottom;
            this.f32008d.set(i2, i6, i4, (int) (i7 + ((rect2.bottom - i7) * fFloatValue)));
        } else {
            Rect rect3 = this.f32005a;
            int i8 = rect3.left;
            Rect rect4 = this.f32007c;
            int i9 = (int) (i8 + ((rect4.left - i8) * fFloatValue));
            int i10 = rect3.top;
            int i11 = (int) (i10 + ((rect4.top - i10) * fFloatValue));
            int i12 = rect3.right;
            int i13 = (int) (i12 + ((rect4.right - i12) * fFloatValue));
            int i14 = rect3.bottom;
            this.f32008d.set(i9, i11, i13, (int) (i14 + ((rect4.bottom - i14) * fFloatValue)));
            setAlpha(Math.min(1.0f - fFloatValue, 0.5f));
        }
        this.f32009e.reset();
        Path path = this.f32009e;
        RectF rectF = this.f32008d;
        int i15 = this.f32015k;
        path.addRoundRect(rectF, i15, i15, Path.Direction.CW);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.f32005a;
        rect.left = 0;
        rect.top = 0;
        rect.right = getMeasuredWidth();
        this.f32005a.bottom = getMeasuredHeight();
    }

    public MessageSurfaceAnimContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageSurfaceAnimContainer(@NonNull Context context) {
        this(context, null);
    }
}
