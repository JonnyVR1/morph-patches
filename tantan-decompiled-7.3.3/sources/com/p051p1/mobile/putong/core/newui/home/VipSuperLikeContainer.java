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
import com.p051p1.mobile.putong.core.newui.home.VipSuperLikeContainer;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.lwl0;
import p153l.lyh0;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class VipSuperLikeContainer extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f22585a;

    /* JADX INFO: renamed from: b */
    public VText f22586b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f22587c;

    /* JADX INFO: renamed from: d */
    public VText f22588d;

    /* JADX INFO: renamed from: e */
    public VImage f22589e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f22590f;

    /* JADX INFO: renamed from: g */
    public int f22591g;

    /* JADX INFO: renamed from: h */
    public int f22592h;

    public VipSuperLikeContainer(Context context) {
        super(context);
        this.f22590f = null;
        this.f22591g = qa00.m175859d(63.0f);
        this.f22592h = qa00.m175859d(130.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m37970b(View.OnLongClickListener onLongClickListener, View view) {
        bnl0.m105564k0(view);
        return onLongClickListener.onLongClick(view);
    }

    private void setHeight(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22585a.getLayoutParams();
        layoutParams.height = i;
        RelativeLayout relativeLayout = this.f22585a;
        relativeLayout.layout(relativeLayout.getLeft(), getBottom() - i, this.f22585a.getRight(), getBottom());
        this.f22585a.setLayoutParams(layoutParams);
        if (this.f22586b.getVisibility() == 0 && this.f22586b.getHeight() == 0) {
            bnl0.m105570n0(this.f22586b);
            int iM175859d = qa00.m175859d(16.0f);
            int width = (this.f22585a.getWidth() - this.f22586b.getWidth()) / 2;
            VText vText = this.f22586b;
            vText.layout(width, iM175859d, vText.getWidth() + width, this.f22586b.getHeight() + iM175859d);
        }
        if (this.f22587c.getVisibility() != 0 || this.f22587c.getHeight() >= this.f22588d.getHeight()) {
            return;
        }
        bnl0.m105570n0(this.f22587c);
        int iM175859d2 = qa00.m175859d(34.0f);
        this.f22587c.layout(0, iM175859d2, this.f22585a.getWidth(), this.f22587c.getHeight() + iM175859d2);
        bnl0.m105564k0(this.f22588d);
        int width2 = (this.f22587c.getWidth() - this.f22588d.getWidth()) / 2;
        VText vText2 = this.f22588d;
        vText2.layout(width2, 0, vText2.getWidth() + width2, this.f22588d.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public final void m37975g(View view) {
        lwl0.m156072a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final int m37976h(boolean z) {
        return z ? this.f22591g : this.f22592h;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37977i(View.OnClickListener onClickListener, View view) {
        m37982n(false);
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m37978j(ValueAnimator valueAnimator) {
        m37983o(valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m37979k(ValueAnimator valueAnimator) {
        m37983o(1.0f - valueAnimator.getAnimatedFraction());
        setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m37980l(int i) {
        m37983o(0.0f);
        setHeight(i);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m37981m(long j, int i, final int i2) {
        if (SystemClock.elapsedRealtime() - j < 100) {
            m37983o(1.0f);
            setHeight(i);
            this.f22586b.postDelayed(new Runnable() { // from class: l.kwl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129075a.m37980l(i2);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m37982n(boolean z) {
        AnimatorSet animatorSet = this.f22590f;
        if (!z) {
            if (NullChecker.m82486a(animatorSet)) {
                this.f22590f.cancel();
                this.f22590f = null;
            }
            m37983o(0.0f);
            setHeight(m37976h(true));
            return true;
        }
        if (NullChecker.m82486a(animatorSet) && this.f22590f.isRunning()) {
            return false;
        }
        this.f22590f = new AnimatorSet();
        final int iM37976h = m37976h(true);
        final int iM37976h2 = m37976h(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM37976h, iM37976h2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(InterpolatorType.overshoot.obtain());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hwl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f111899a.m37978j(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iM37976h2, iM37976h);
        valueAnimatorOfInt2.setStartDelay(500L);
        valueAnimatorOfInt2.setInterpolator(InterpolatorType.accelerate.obtain());
        valueAnimatorOfInt2.setDuration(200L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.iwl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f117280a.m37979k(valueAnimator);
            }
        });
        gt0.m132160f(valueAnimatorOfInt2, new Runnable() { // from class: l.jwl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122940a.m37981m(jElapsedRealtime, iM37976h2, iM37976h);
            }
        });
        this.f22590f.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        this.f22590f.start();
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m37983o(float f) {
        VText vText = this.f22586b;
        if (f <= 0.1f) {
            vText.setVisibility(8);
            this.f22587c.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        this.f22586b.setAlpha((f - 0.1f) / 0.9f);
        LinearLayout linearLayout = this.f22587c;
        if (f <= 0.3f) {
            linearLayout.setVisibility(8);
            return;
        }
        if (linearLayout.getVisibility() != 0) {
            this.f22588d.setText(q8g0.m175783O(new StringBuffer(String.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday())).toString(), 0, lyh0.m156283c(3), qa00.m175861f(18)));
        }
        this.f22587c.setVisibility(0);
        this.f22587c.setAlpha((f - 0.3f) / 0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37975g(this);
    }

    public void setMaxHeight(int i) {
        if (i < qa00.m175859d(100.0f)) {
            i = qa00.m175859d(100.0f);
        }
        this.f22592h = i;
    }

    public void setMinHeight(int i) {
        this.f22591g = i;
    }

    @Override // android.view.View
    public void setOnClickListener(final View.OnClickListener onClickListener) {
        this.f22589e.setOnClickListener(new View.OnClickListener() { // from class: l.fwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101182a.m37977i(onClickListener, view);
            }
        });
    }

    @Override // android.view.View
    public void setOnLongClickListener(final View.OnLongClickListener onLongClickListener) {
        this.f22589e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gwl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return VipSuperLikeContainer.m37970b(onLongClickListener, view);
            }
        });
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22590f = null;
        this.f22591g = qa00.m175859d(63.0f);
        this.f22592h = qa00.m175859d(130.0f);
    }

    public VipSuperLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22590f = null;
        this.f22591g = qa00.m175859d(63.0f);
        this.f22592h = qa00.m175859d(130.0f);
    }
}
