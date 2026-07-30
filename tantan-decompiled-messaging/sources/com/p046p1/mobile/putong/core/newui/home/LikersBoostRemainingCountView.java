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
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import com.p046p1.mobile.putong.data.BoostLimit;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p147v.VText;
import p149l.bt0;
import p149l.jir;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LikersBoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f21671a;

    /* JADX INFO: renamed from: b */
    public VText f21672b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f21673c;

    /* JADX INFO: renamed from: d */
    public VText f21674d;

    /* JADX INFO: renamed from: e */
    public BounceButton f21675e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f21676f;

    public LikersBoostRemainingCountView(Context context) {
        super(context);
        this.f21676f = null;
    }

    private int getBoostLimitCount() {
        Iterator<BoostLimit> it = CoreModule.f17545c.m31484o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21671a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f21671a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f21671a.getRight(), getBottom());
        this.f21671a.setLayoutParams(layoutParams);
        if (this.f21672b.getVisibility() == 0 && this.f21672b.getHeight() == 0) {
            xdl0.m208390n0(this.f21672b);
            int iM186890d = t100.m186890d(16.0f);
            int width = (this.f21671a.getWidth() - this.f21672b.getWidth()) / 2;
            VText vText = this.f21672b;
            vText.layout(width, iM186890d, vText.getWidth() + width, this.f21672b.getHeight() + iM186890d);
        }
        if (this.f21673c.getVisibility() == 0 && this.f21673c.getHeight() == 0) {
            xdl0.m208390n0(this.f21673c);
            int iM186890d2 = t100.m186890d(34.0f);
            int width2 = (this.f21671a.getWidth() - this.f21673c.getWidth()) / 2;
            LinearLayout linearLayout = this.f21673c;
            linearLayout.layout(width2, iM186890d2, linearLayout.getWidth() + width2, this.f21673c.getHeight() + iM186890d2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m36726f(View view) {
        jir.m141664a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m36727g(boolean z) {
        return z ? t100.m186890d(63.0f) : t100.m186890d(130.0f);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m36728h(View.OnClickListener onClickListener, View view) {
        m36733m(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m36729i(ValueAnimator valueAnimator) {
        m36734n(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m36730j(ValueAnimator valueAnimator) {
        m36734n(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m36731k(int i) {
        m36734n(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m36732l(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m36734n(1.0f);
            setHeight(i);
            this.f21672b.postDelayed(new Runnable() { // from class: l.iir
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113426a.m36731k(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m36733m(boolean z) {
        AnimatorSet animatorSet = this.f21676f;
        if (!z) {
            if (NullChecker.m81303a(animatorSet)) {
                this.f21676f.cancel();
                this.f21676f = null;
            }
            m36734n(0.0f);
            setHeight(m36727g(true));
            return true;
        }
        if (NullChecker.m81303a(animatorSet) && this.f21676f.isRunning()) {
            return false;
        }
        this.f21676f = new AnimatorSet();
        final int iM36727g = m36727g(true);
        final int iM36727g2 = m36727g(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM36727g, iM36727g2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fir
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f97713a.m36729i(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM36727g2, iM36727g);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gir
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f102960a.m36730j(valueAnimator);
            }
        });
        bt0.m103733f(valueAnimatorOfInt2, new Runnable() { // from class: l.hir
            @Override // java.lang.Runnable
            public final void run() {
                this.f107959a.m36732l(jElapsedRealtime, iM36727g2, iM36727g);
            }
        });
        this.f21676f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f21676f.start();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m36734n(float f) {
        VText vText = this.f21672b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f21673c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f21672b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f21673c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f21674d.setText(String.valueOf(getBoostLimitCount()));
        }
        this.f21673c.setVisibility(0);
        this.f21673c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36726f(this);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f21675e.setOnClickListener(new View.OnClickListener() { // from class: l.eir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91628a.m36728h(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21675e.setOnLongClickListener(onLongClickListener);
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21676f = null;
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21676f = null;
    }
}
