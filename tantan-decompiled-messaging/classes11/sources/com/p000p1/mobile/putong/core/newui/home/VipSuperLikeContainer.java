package com.p000p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.newui.home.VipSuperLikeContainer;
import com.p1.mobile.putong.core.CoreModule;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.eqh0;
import l.hnl0;
import l.t100;
import l.xdl0;
import p009l.i0g0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VipSuperLikeContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f621a;

    /* JADX INFO: renamed from: b */
    public VText f622b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f623c;

    /* JADX INFO: renamed from: d */
    public VText f624d;

    /* JADX INFO: renamed from: e */
    public VImage f625e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f626f;

    /* JADX INFO: renamed from: g */
    public int f627g;

    /* JADX INFO: renamed from: h */
    public int f628h;

    public VipSuperLikeContainer(Context context) {
        super(context);
        this.f626f = null;
        this.f627g = t100.d(63.0f);
        this.f628h = t100.d(130.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m934b(View.OnLongClickListener onLongClickListener, View view) {
        xdl0.k0(view);
        return onLongClickListener.onLongClick(view);
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f621a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f621a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f621a.getRight(), getBottom());
        this.f621a.setLayoutParams(layoutParams);
        if (this.f622b.getVisibility() == 0 && this.f622b.getHeight() == 0) {
            xdl0.n0(this.f622b);
            int iD = t100.d(16.0f);
            int width = (this.f621a.getWidth() - this.f622b.getWidth()) / 2;
            VText vText = this.f622b;
            vText.layout(width, iD, vText.getWidth() + width, this.f622b.getHeight() + iD);
        }
        if (this.f623c.getVisibility() != 0 || this.f623c.getHeight() >= this.f624d.getHeight()) {
            return;
        }
        xdl0.n0(this.f623c);
        int iD2 = t100.d(34.0f);
        this.f623c.layout(0, iD2, this.f621a.getWidth(), this.f623c.getHeight() + iD2);
        xdl0.k0(this.f624d);
        int width2 = (this.f623c.getWidth() - this.f624d.getWidth()) / 2;
        VText vText2 = this.f624d;
        vText2.layout(width2, 0, vText2.getWidth() + width2, this.f624d.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public final void m939g(View view) {
        hnl0.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final int m940h(boolean z) {
        return z ? this.f627g : this.f628h;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m941i(View.OnClickListener onClickListener, View view) {
        m946n(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m942j(ValueAnimator valueAnimator) {
        m947o(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m943k(ValueAnimator valueAnimator) {
        m947o(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m944l(int i) {
        m947o(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m945m(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m947o(1.0f);
            setHeight(i);
            this.f622b.postDelayed(new Runnable() { // from class: l.gnl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13646a.m944l(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m946n(boolean z) {
        AnimatorSet animatorSet = this.f626f;
        if (!z) {
            if (NullChecker.a(animatorSet)) {
                this.f626f.cancel();
                this.f626f = null;
            }
            m947o(0.0f);
            setHeight(m940h(true));
            return true;
        }
        if (NullChecker.a(animatorSet) && this.f626f.isRunning()) {
            return false;
        }
        this.f626f = new AnimatorSet();
        final int iM940h = m940h(true);
        final int iM940h2 = m940h(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM940h, iM940h2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dnl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f11920a.m942j(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM940h2, iM940h);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.enl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12625a.m943k(valueAnimator);
            }
        });
        bt0.f(valueAnimatorOfInt2, new Runnable() { // from class: l.fnl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13105a.m945m(jElapsedRealtime, iM940h2, iM940h);
            }
        });
        this.f626f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f626f.start();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m947o(float f) {
        VText vText = this.f622b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f623c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f622b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f623c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f624d.setText(i0g0.m16116O(new StringBuffer(String.valueOf(CoreModule.c.o3().superLikeLimit.remainToday())).toString(), 0, eqh0.c(3), t100.f(18)));
        }
        this.f623c.setVisibility(0);
        this.f623c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m939g(this);
    }

    public void setMaxHeight(int i) {
        if (i < t100.d(100.0f)) {
            i = t100.d(100.0f);
        }
        this.f628h = i;
    }

    public void setMinHeight(int i) {
        this.f627g = i;
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f625e.setOnClickListener(new View.OnClickListener() { // from class: l.bnl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10208a.m941i(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(final View.OnLongClickListener onLongClickListener) {
        this.f625e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.cnl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipSuperLikeContainer.m934b(onLongClickListener, view);
            }
        });
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f626f = null;
        this.f627g = t100.d(63.0f);
        this.f628h = t100.d(130.0f);
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f626f = null;
        this.f627g = t100.d(63.0f);
        this.f628h = t100.d(130.0f);
    }
}
