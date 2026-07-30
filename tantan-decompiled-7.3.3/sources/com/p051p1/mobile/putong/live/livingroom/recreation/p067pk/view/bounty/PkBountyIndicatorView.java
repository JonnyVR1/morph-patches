package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyWinIndicator;
import java.util.List;
import p153l.bnl0;
import p153l.gt0;
import p153l.gt70;
import p153l.it0;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int f52607h = qa00.m175859d(140.0f);

    /* JADX INFO: renamed from: i */
    public static final int f52608i = qa00.m175859d(116.0f);

    /* JADX INFO: renamed from: a */
    public PkBountyIndicatorView f52609a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f52610b;

    /* JADX INFO: renamed from: c */
    public PkHorizontalMarqueeView f52611c;

    /* JADX INFO: renamed from: d */
    public int f52612d;

    /* JADX INFO: renamed from: e */
    public int f52613e;

    /* JADX INFO: renamed from: f */
    public Animator f52614f;

    /* JADX INFO: renamed from: g */
    public Animator f52615g;

    public PkBountyIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52613e = f52608i;
        this.f52614f = null;
        this.f52615g = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m77445e(View view) {
        gt70.m132209a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m77446f() {
        it0.m142007A(this.f52614f);
        it0.m142007A(this.f52615g);
        PkHorizontalMarqueeView pkHorizontalMarqueeView = this.f52611c;
        if (pkHorizontalMarqueeView != null) {
            pkHorizontalMarqueeView.m77468b();
        }
        if (this.f52610b != null) {
            for (int i = 0; i < this.f52610b.getChildCount(); i++) {
                PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) this.f52610b.getChildAt(i);
                if (pkBountyIndicatorLightItemView != null) {
                    pkBountyIndicatorLightItemView.m77428h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m77447g(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m77448h(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m77447g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77449i(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m77447g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final void m77450j(BLivePkBountyWinIndicator bLivePkBountyWinIndicator) {
        if (this.f52610b.getChildCount() == 0) {
            m77452l(bLivePkBountyWinIndicator);
            return;
        }
        if (!jyb.m147479J(bLivePkBountyWinIndicator.lights) && this.f52610b.getChildCount() == bLivePkBountyWinIndicator.lights.size()) {
            for (int i = 0; i < this.f52610b.getChildCount(); i++) {
                PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) this.f52610b.getChildAt(i);
                if (pkBountyIndicatorLightItemView != null) {
                    pkBountyIndicatorLightItemView.m77435o(bLivePkBountyWinIndicator.lights.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m77451k(BLivePkBountyWinIndicator bLivePkBountyWinIndicator, boolean z) {
        if (bLivePkBountyWinIndicator == null) {
            return;
        }
        this.f52609a.setBackgroundResource(obc0.f146066I4);
        this.f52611c.setMarqueeText(bLivePkBountyWinIndicator.tip);
        bnl0.m105524M(this.f52611c, false);
        bnl0.m105524M(this.f52610b, true);
        if (z) {
            m77450j(bLivePkBountyWinIndicator);
        } else {
            m77452l(bLivePkBountyWinIndicator);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m77452l(BLivePkBountyWinIndicator bLivePkBountyWinIndicator) {
        List<BLivePkBountyIndicatorLight> list = bLivePkBountyWinIndicator.lights;
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            return;
        }
        if (list.size() == 6) {
            this.f52613e = f52607h;
        }
        bnl0.m105524M(this, true);
        this.f52610b.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) LayoutInflater.from(getContext()).inflate(yec0.f198888Q4, (ViewGroup) null, false);
            pkBountyIndicatorLightItemView.m77436p(list.get(i));
            if (i != 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = -qa00.m175859d(5.0f);
                pkBountyIndicatorLightItemView.setLayoutParams(layoutParams);
            }
            this.f52610b.addView(pkBountyIndicatorLightItemView);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f52610b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredWidth = this.f52610b.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.width = measuredWidth;
            setLayoutParams(layoutParams2);
            this.f52610b.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m77453m() {
        bnl0.m105524M(this.f52611c, false);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f52613e, this.f52612d);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ft70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f100721a.m77448h(valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(300L);
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(this.f52610b, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f), valueAnimatorOfInt);
        this.f52615g = animatorM132180z;
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: n */
    public void m77454n() {
        if (TextUtils.isEmpty(this.f52611c.getMarqueeText())) {
            return;
        }
        this.f52612d = getMeasuredWidth();
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getMeasuredWidth(), this.f52613e);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ct70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f83672a.m77449i(valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(300L);
        Animator animatorM132170p = gt0.m132170p(this.f52610b, "alpha", 0L, 300L, new AccelerateInterpolator(), 1.0f, 0.0f);
        this.f52614f = gt0.m132180z(animatorM132170p, valueAnimatorOfInt);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.dt70
            @Override // java.lang.Runnable
            public final void run() {
                this.f90543a.m77455o();
            }
        });
        this.f52614f.start();
    }

    /* JADX INFO: renamed from: o */
    public final void m77455o() {
        bnl0.m105524M(this.f52611c, true);
        this.f52611c.setAnimDuration(1000);
        this.f52611c.m77471e(300, new Runnable() { // from class: l.et70
            @Override // java.lang.Runnable
            public final void run() {
                this.f95702a.m77453m();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77446f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77445e(this);
    }

    public PkBountyIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyIndicatorView(Context context) {
        this(context, null);
    }
}
