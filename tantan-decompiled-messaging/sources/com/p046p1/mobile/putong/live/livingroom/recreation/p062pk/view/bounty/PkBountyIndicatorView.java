package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty;

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
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyIndicatorLight;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyWinIndicator;
import java.util.List;
import p149l.al70;
import p149l.bt0;
import p149l.dt0;
import p149l.i3c0;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyIndicatorView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int f51759h = t100.m186890d(140.0f);

    /* JADX INFO: renamed from: i */
    public static final int f51760i = t100.m186890d(116.0f);

    /* JADX INFO: renamed from: a */
    public PkBountyIndicatorView f51761a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f51762b;

    /* JADX INFO: renamed from: c */
    public PkHorizontalMarqueeView f51763c;

    /* JADX INFO: renamed from: d */
    public int f51764d;

    /* JADX INFO: renamed from: e */
    public int f51765e;

    /* JADX INFO: renamed from: f */
    public Animator f51766f;

    /* JADX INFO: renamed from: g */
    public Animator f51767g;

    public PkBountyIndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51765e = f51760i;
        this.f51766f = null;
        this.f51767g = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m76262e(View view) {
        al70.m97277a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m76263f() {
        dt0.m113501A(this.f51766f);
        dt0.m113501A(this.f51767g);
        PkHorizontalMarqueeView pkHorizontalMarqueeView = this.f51763c;
        if (pkHorizontalMarqueeView != null) {
            pkHorizontalMarqueeView.m76285b();
        }
        if (this.f51762b != null) {
            for (int i = 0; i < this.f51762b.getChildCount(); i++) {
                PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) this.f51762b.getChildAt(i);
                if (pkBountyIndicatorLightItemView != null) {
                    pkBountyIndicatorLightItemView.m76245h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76264g(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m76265h(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m76264g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76266i(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m76264g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final void m76267j(BLivePkBountyWinIndicator bLivePkBountyWinIndicator) {
        if (this.f51762b.getChildCount() == 0) {
            m76269l(bLivePkBountyWinIndicator);
            return;
        }
        if (!vwb.m200296J(bLivePkBountyWinIndicator.lights) && this.f51762b.getChildCount() == bLivePkBountyWinIndicator.lights.size()) {
            for (int i = 0; i < this.f51762b.getChildCount(); i++) {
                PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) this.f51762b.getChildAt(i);
                if (pkBountyIndicatorLightItemView != null) {
                    pkBountyIndicatorLightItemView.m76252o(bLivePkBountyWinIndicator.lights.get(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m76268k(BLivePkBountyWinIndicator bLivePkBountyWinIndicator, boolean z) {
        if (bLivePkBountyWinIndicator == null) {
            return;
        }
        this.f51761a.setBackgroundResource(i3c0.f110738I4);
        this.f51763c.setMarqueeText(bLivePkBountyWinIndicator.tip);
        xdl0.m208344M(this.f51763c, false);
        xdl0.m208344M(this.f51762b, true);
        if (z) {
            m76267j(bLivePkBountyWinIndicator);
        } else {
            m76269l(bLivePkBountyWinIndicator);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m76269l(BLivePkBountyWinIndicator bLivePkBountyWinIndicator) {
        List<BLivePkBountyIndicatorLight> list = bLivePkBountyWinIndicator.lights;
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            return;
        }
        if (list.size() == 6) {
            this.f51765e = f51759h;
        }
        xdl0.m208344M(this, true);
        this.f51762b.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            PkBountyIndicatorLightItemView pkBountyIndicatorLightItemView = (PkBountyIndicatorLightItemView) LayoutInflater.from(getContext()).inflate(t6c0.f168156Q4, (ViewGroup) null, false);
            pkBountyIndicatorLightItemView.m76253p(list.get(i));
            if (i != 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = -t100.m186890d(5.0f);
                pkBountyIndicatorLightItemView.setLayoutParams(layoutParams);
            }
            this.f51762b.addView(pkBountyIndicatorLightItemView);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f51762b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredWidth = this.f51762b.getMeasuredWidth();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.width = measuredWidth;
            setLayoutParams(layoutParams2);
            this.f51762b.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m76270m() {
        xdl0.m208344M(this.f51763c, false);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f51765e, this.f51764d);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zk70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f203512a.m76265h(valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(300L);
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(this.f51762b, "alpha", 0L, 300L, new AccelerateInterpolator(), 0.0f, 1.0f), valueAnimatorOfInt);
        this.f51767g = animatorM103753z;
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: n */
    public void m76271n() {
        if (TextUtils.isEmpty(this.f51763c.getMarqueeText())) {
            return;
        }
        this.f51764d = getMeasuredWidth();
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getMeasuredWidth(), this.f51765e);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wk70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186730a.m76266i(valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(300L);
        Animator animatorM103743p = bt0.m103743p(this.f51762b, "alpha", 0L, 300L, new AccelerateInterpolator(), 1.0f, 0.0f);
        this.f51766f = bt0.m103753z(animatorM103743p, valueAnimatorOfInt);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.xk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f193270a.m76272o();
            }
        });
        this.f51766f.start();
    }

    /* JADX INFO: renamed from: o */
    public final void m76272o() {
        xdl0.m208344M(this.f51763c, true);
        this.f51763c.setAnimDuration(1000);
        this.f51763c.m76288e(300, new Runnable() { // from class: l.yk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f198733a.m76270m();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76263f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76262e(this);
    }

    public PkBountyIndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyIndicatorView(Context context) {
        this(context, null);
    }
}
