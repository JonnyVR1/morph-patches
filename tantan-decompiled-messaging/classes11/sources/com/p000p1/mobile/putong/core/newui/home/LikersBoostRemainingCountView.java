package com.p000p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.home.BounceButton;
import com.p1.mobile.putong.data.BoostLimit;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import l.bt0;
import l.jir;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LikersBoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f449a;

    /* JADX INFO: renamed from: b */
    public VText f450b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f451c;

    /* JADX INFO: renamed from: d */
    public VText f452d;

    /* JADX INFO: renamed from: e */
    public BounceButton f453e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f454f;

    public LikersBoostRemainingCountView(Context context) {
        super(context);
        this.f454f = null;
    }

    private int getBoostLimitCount() {
        Iterator it = CoreModule.c.o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((BoostLimit) it.next()).remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f449a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f449a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f449a.getRight(), getBottom());
        this.f449a.setLayoutParams(layoutParams);
        if (this.f450b.getVisibility() == 0 && this.f450b.getHeight() == 0) {
            xdl0.n0(this.f450b);
            int iD = t100.d(16.0f);
            int width = (this.f449a.getWidth() - this.f450b.getWidth()) / 2;
            VText vText = this.f450b;
            vText.layout(width, iD, vText.getWidth() + width, this.f450b.getHeight() + iD);
        }
        if (this.f451c.getVisibility() == 0 && this.f451c.getHeight() == 0) {
            xdl0.n0(this.f451c);
            int iD2 = t100.d(34.0f);
            int width2 = (this.f449a.getWidth() - this.f451c.getWidth()) / 2;
            LinearLayout linearLayout = this.f451c;
            linearLayout.layout(width2, iD2, linearLayout.getWidth() + width2, this.f451c.getHeight() + iD2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m675f(View view) {
        jir.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m676g(boolean z) {
        return z ? t100.d(63.0f) : t100.d(130.0f);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m677h(View.OnClickListener onClickListener, View view) {
        m682m(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m678i(ValueAnimator valueAnimator) {
        m683n(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m679j(ValueAnimator valueAnimator) {
        m683n(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m680k(int i) {
        m683n(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m681l(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m683n(1.0f);
            setHeight(i);
            this.f450b.postDelayed(new Runnable() { // from class: l.iir
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14654a.m680k(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m682m(boolean z) {
        AnimatorSet animatorSet = this.f454f;
        if (!z) {
            if (NullChecker.a(animatorSet)) {
                this.f454f.cancel();
                this.f454f = null;
            }
            m683n(0.0f);
            setHeight(m676g(true));
            return true;
        }
        if (NullChecker.a(animatorSet) && this.f454f.isRunning()) {
            return false;
        }
        this.f454f = new AnimatorSet();
        final int iM676g = m676g(true);
        final int iM676g2 = m676g(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM676g, iM676g2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fir
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13040a.m678i(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM676g2, iM676g);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gir
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13592a.m679j(valueAnimator);
            }
        });
        bt0.f(valueAnimatorOfInt2, new Runnable() { // from class: l.hir
            @Override // java.lang.Runnable
            public final void run() {
                this.f14138a.m681l(jElapsedRealtime, iM676g2, iM676g);
            }
        });
        this.f454f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f454f.start();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m683n(float f) {
        VText vText = this.f450b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f451c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f450b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f451c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f452d.setText(String.valueOf(getBoostLimitCount()));
        }
        this.f451c.setVisibility(0);
        this.f451c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m675f(this);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f453e.setOnClickListener(new View.OnClickListener() { // from class: l.eir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12582a.m677h(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f453e.setOnLongClickListener(onLongClickListener);
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f454f = null;
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f454f = null;
    }
}
