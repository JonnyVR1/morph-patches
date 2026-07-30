package com.p051p1.mobile.putong.core.newui.home;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import com.p051p1.mobile.putong.data.BoostLimit;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.kkr;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LikersBoostRemainingCountView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f22413a;

    /* JADX INFO: renamed from: b */
    public VText f22414b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f22415c;

    /* JADX INFO: renamed from: d */
    public VText f22416d;

    /* JADX INFO: renamed from: e */
    public BounceButton f22417e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f22418f;

    public LikersBoostRemainingCountView(Context context) {
        super(context);
        this.f22418f = null;
    }

    private int getBoostLimitCount() {
        Iterator<BoostLimit> it = CoreModule.f18264c.m32487o3().boostLimits.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining;
        }
        return i;
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22413a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f22413a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f22413a.getRight(), getBottom());
        this.f22413a.setLayoutParams(layoutParams);
        if (this.f22414b.getVisibility() == 0 && this.f22414b.getHeight() == 0) {
            bnl0.m105570n0(this.f22414b);
            int iM175859d = qa00.m175859d(16.0f);
            int width = (this.f22413a.getWidth() - this.f22414b.getWidth()) / 2;
            VText vText = this.f22414b;
            vText.layout(width, iM175859d, vText.getWidth() + width, this.f22414b.getHeight() + iM175859d);
        }
        if (this.f22415c.getVisibility() == 0 && this.f22415c.getHeight() == 0) {
            bnl0.m105570n0(this.f22415c);
            int iM175859d2 = qa00.m175859d(34.0f);
            int width2 = (this.f22413a.getWidth() - this.f22415c.getWidth()) / 2;
            LinearLayout linearLayout = this.f22415c;
            linearLayout.layout(width2, iM175859d2, linearLayout.getWidth() + width2, this.f22415c.getHeight() + iM175859d2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m37729f(View view) {
        kkr.m150330a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m37730g(boolean z) {
        return z ? qa00.m175859d(63.0f) : qa00.m175859d(130.0f);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m37731h(View.OnClickListener onClickListener, View view) {
        m37736m(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37732i(ValueAnimator valueAnimator) {
        m37737n(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m37733j(ValueAnimator valueAnimator) {
        m37737n(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m37734k(int i) {
        m37737n(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m37735l(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m37737n(1.0f);
            setHeight(i);
            this.f22414b.postDelayed(new Runnable() { // from class: l.jkr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121443a.m37734k(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m37736m(boolean z) {
        AnimatorSet animatorSet = this.f22418f;
        if (!z) {
            if (NullChecker.m82486a(animatorSet)) {
                this.f22418f.cancel();
                this.f22418f = null;
            }
            m37737n(0.0f);
            setHeight(m37730g(true));
            return true;
        }
        if (NullChecker.m82486a(animatorSet) && this.f22418f.isRunning()) {
            return false;
        }
        this.f22418f = new AnimatorSet();
        final int iM37730g = m37730g(true);
        final int iM37730g2 = m37730g(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM37730g, iM37730g2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.gkr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f104762a.m37732i(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM37730g2, iM37730g);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hkr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f110450a.m37733j(valueAnimator);
            }
        });
        gt0.m132160f(valueAnimatorOfInt2, new Runnable() { // from class: l.ikr
            @Override // java.lang.Runnable
            public final void run() {
                this.f115442a.m37735l(jElapsedRealtime, iM37730g2, iM37730g);
            }
        });
        this.f22418f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f22418f.start();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m37737n(float f) {
        VText vText = this.f22414b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f22415c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f22414b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f22415c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f22416d.setText(String.valueOf(getBoostLimitCount()));
        }
        this.f22415c.setVisibility(0);
        this.f22415c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37729f(this);
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f22417e.setOnClickListener(new View.OnClickListener() { // from class: l.fkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99554a.m37731h(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f22417e.setOnLongClickListener(onLongClickListener);
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22418f = null;
    }

    public LikersBoostRemainingCountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22418f = null;
    }
}
