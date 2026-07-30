package com.p046p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.VipSuperLikeContainer;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.eqh0;
import p149l.hnl0;
import p149l.i0g0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VipSuperLikeContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f21843a;

    /* JADX INFO: renamed from: b */
    public VText f21844b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f21845c;

    /* JADX INFO: renamed from: d */
    public VText f21846d;

    /* JADX INFO: renamed from: e */
    public VImage f21847e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f21848f;

    /* JADX INFO: renamed from: g */
    public int f21849g;

    /* JADX INFO: renamed from: h */
    public int f21850h;

    public VipSuperLikeContainer(Context context) {
        super(context);
        this.f21848f = null;
        this.f21849g = t100.m186890d(63.0f);
        this.f21850h = t100.m186890d(130.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m36967b(View.OnLongClickListener onLongClickListener, View view) {
        xdl0.m208384k0(view);
        return onLongClickListener.onLongClick(view);
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21843a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f21843a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f21843a.getRight(), getBottom());
        this.f21843a.setLayoutParams(layoutParams);
        if (this.f21844b.getVisibility() == 0 && this.f21844b.getHeight() == 0) {
            xdl0.m208390n0(this.f21844b);
            int iM186890d = t100.m186890d(16.0f);
            int width = (this.f21843a.getWidth() - this.f21844b.getWidth()) / 2;
            VText vText = this.f21844b;
            vText.layout(width, iM186890d, vText.getWidth() + width, this.f21844b.getHeight() + iM186890d);
        }
        if (this.f21845c.getVisibility() != 0 || this.f21845c.getHeight() >= this.f21846d.getHeight()) {
            return;
        }
        xdl0.m208390n0(this.f21845c);
        int iM186890d2 = t100.m186890d(34.0f);
        this.f21845c.layout(0, iM186890d2, this.f21843a.getWidth(), this.f21845c.getHeight() + iM186890d2);
        xdl0.m208384k0(this.f21846d);
        int width2 = (this.f21845c.getWidth() - this.f21846d.getWidth()) / 2;
        VText vText2 = this.f21846d;
        vText2.layout(width2, 0, vText2.getWidth() + width2, this.f21846d.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public final void m36972g(View view) {
        hnl0.m131949a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final int m36973h(boolean z) {
        return z ? this.f21849g : this.f21850h;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m36974i(View.OnClickListener onClickListener, View view) {
        m36979n(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m36975j(ValueAnimator valueAnimator) {
        m36980o(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m36976k(ValueAnimator valueAnimator) {
        m36980o(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m36977l(int i) {
        m36980o(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m36978m(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m36980o(1.0f);
            setHeight(i);
            this.f21844b.postDelayed(new Runnable() { // from class: l.gnl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103606a.m36977l(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m36979n(boolean z) {
        AnimatorSet animatorSet = this.f21848f;
        if (!z) {
            if (NullChecker.m81303a(animatorSet)) {
                this.f21848f.cancel();
                this.f21848f = null;
            }
            m36980o(0.0f);
            setHeight(m36973h(true));
            return true;
        }
        if (NullChecker.m81303a(animatorSet) && this.f21848f.isRunning()) {
            return false;
        }
        this.f21848f = new AnimatorSet();
        final int iM36973h = m36973h(true);
        final int iM36973h2 = m36973h(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM36973h, iM36973h2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dnl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f87082a.m36975j(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM36973h2, iM36973h);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.enl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f92326a.m36976k(valueAnimator);
            }
        });
        bt0.m103733f(valueAnimatorOfInt2, new Runnable() { // from class: l.fnl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98431a.m36978m(jElapsedRealtime, iM36973h2, iM36973h);
            }
        });
        this.f21848f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f21848f.start();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m36980o(float f) {
        VText vText = this.f21844b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f21845c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f21844b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f21845c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f21846d.setText(i0g0.m133848O(new StringBuffer(String.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday())).toString(), 0, eqh0.m117752c(3), t100.m186892f(18)));
        }
        this.f21845c.setVisibility(0);
        this.f21845c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36972g(this);
    }

    public void setMaxHeight(int i) {
        if (i < t100.m186890d(100.0f)) {
            i = t100.m186890d(100.0f);
        }
        this.f21850h = i;
    }

    public void setMinHeight(int i) {
        this.f21849g = i;
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f21847e.setOnClickListener(new View.OnClickListener() { // from class: l.bnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76409a.m36974i(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(final View.OnLongClickListener onLongClickListener) {
        this.f21847e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cnl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipSuperLikeContainer.m36967b(onLongClickListener, view);
            }
        });
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21848f = null;
        this.f21849g = t100.m186890d(63.0f);
        this.f21850h = t100.m186890d(130.0f);
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21848f = null;
        this.f21849g = t100.m186890d(63.0f);
        this.f21850h = t100.m186890d(130.0f);
    }
}
