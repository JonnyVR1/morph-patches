package com.p046p1.mobile.putong.live.livingroom.view.rollview;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.Nullable;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.dxs;
import p149l.p9c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveRollView<T extends View> extends ViewSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public float f52110a;

    /* JADX INFO: renamed from: b */
    public int f52111b;

    /* JADX INFO: renamed from: c */
    public float f52112c;

    /* JADX INFO: renamed from: d */
    public boolean f52113d;

    /* JADX INFO: renamed from: e */
    public int f52114e;

    /* JADX INFO: renamed from: f */
    public Animator f52115f;

    /* JADX INFO: renamed from: g */
    public dxs f52116g;

    /* JADX INFO: renamed from: h */
    public int f52117h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.rollview.LiveRollView$a */
    public class AnimationAnimationListenerC12946a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f52118a;

        public AnimationAnimationListenerC12946a(d30 d30Var) {
            this.f52118a = d30Var;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LiveRollView.this.m76689g(this.f52118a);
            if (NullChecker.m81303a(LiveRollView.this.f52116g)) {
                LiveRollView.this.f52116g.mo114028d();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public LiveRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52114e = 0;
        this.f52117h = 400;
        m76693k(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public void m76688f(View view, int i, int i2, @Nullable final d30 d30Var) {
        if (i == i2) {
            m76689g(d30Var);
            m76698p();
        } else {
            m76699q();
            Animator duration = bt0.m103733f(bt0.m103742o(view, dt0.f87802n, i, i2), new Runnable() { // from class: l.lgt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128014a.m76695m(d30Var);
                }
            }).setDuration(this.f52117h);
            this.f52115f = duration;
            duration.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76689g(@Nullable d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public int m76690h(View view) {
        return (int) Math.min(m76691i(view), this.f52112c);
    }

    /* JADX INFO: renamed from: i */
    public int m76691i(View view) {
        if (!NullChecker.m81303a(view)) {
            return 0;
        }
        view.measure(0, Integer.MIN_VALUE);
        return view.getMeasuredWidth() + t100.m186890d(10.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public T m76692j(boolean z) {
        return z ? (T) getCurrentView() : (T) getNextView();
    }

    /* JADX INFO: renamed from: k */
    public final void m76693k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147736j0);
        this.f52110a = typedArrayObtainStyledAttributes.getDimensionPixelSize(p9c0.f147742m0, t100.m186892f(12));
        this.f52111b = typedArrayObtainStyledAttributes.getColor(p9c0.f147740l0, -1);
        this.f52112c = typedArrayObtainStyledAttributes.getDimension(p9c0.f147744n0, 0.0f);
        this.f52113d = typedArrayObtainStyledAttributes.getBoolean(p9c0.f147738k0, false);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
        m76694l();
    }

    /* JADX INFO: renamed from: l */
    public void m76694l() {
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76695m(d30 d30Var) {
        m76689g(d30Var);
        m76698p();
    }

    public View makeView() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m76697o(d30 d30Var) {
        m76688f(this, getWidth(), this.f52114e, d30Var);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m76698p() {
        if (NullChecker.m81303a(this.f52116g)) {
            this.f52116g.mo114026b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m76699q() {
        if (NullChecker.m81303a(this.f52116g)) {
            this.f52116g.mo114027c();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m76700r() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    @Override // android.widget.ViewSwitcher
    public void reset() {
        mo76702t();
        m76700r();
        m76703u();
    }

    /* JADX INFO: renamed from: s */
    public void m76701s() {
        xdl0.m208327D0(m76690h(getCurrentView()), this);
    }

    public void setAdapterViewAnimTime(int i) {
        this.f52117h = i;
    }

    public void setContentLayoutGravity(FrameLayout.LayoutParams layoutParams) {
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) getCurrentView();
        if (horizontalMarqueeView != null) {
            horizontalMarqueeView.setContentLayoutParams(layoutParams);
        }
        HorizontalMarqueeView horizontalMarqueeView2 = (HorizontalMarqueeView) getNextView();
        if (horizontalMarqueeView2 != null) {
            horizontalMarqueeView2.setContentLayoutParams(layoutParams);
        }
    }

    public void setNextAnim(long j) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, getHeight(), 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getHeight());
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setPreAnim(long j) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -getHeight(), 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, getHeight());
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setRollAction(@Nullable dxs dxsVar) {
        this.f52116g = dxsVar;
    }

    /* JADX INFO: renamed from: t */
    public void mo76702t() {
        if (NullChecker.m81303a(getInAnimation())) {
            getInAnimation().cancel();
        }
        if (NullChecker.m81303a(getOutAnimation())) {
            getOutAnimation().cancel();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m76703u() {
        if (NullChecker.m81303a(this.f52115f)) {
            dt0.m113501A(this.f52115f);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m76704v(int i, boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) (z ? getCurrentView() : getNextView());
        if (NullChecker.m81303a(horizontalMarqueeView)) {
            if (m76691i(horizontalMarqueeView) > i) {
                layoutParams.gravity = 8388611;
            } else {
                layoutParams.gravity = 17;
            }
            horizontalMarqueeView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m76705w(@Nullable final d30 d30Var) {
        View nextView = getNextView();
        if (!this.f52113d) {
            m76696n(d30Var);
            return;
        }
        this.f52114e = m76690h(nextView);
        if (this.f52114e > m76690h(getCurrentView())) {
            m76688f(this, getWidth(), this.f52114e, new d30() { // from class: l.jgt
                @Override // p149l.d30
                public final void call() {
                    this.f117827a.m76696n(d30Var);
                }
            });
        } else {
            m76696n(new d30() { // from class: l.kgt
                @Override // p149l.d30
                public final void call() {
                    this.f123071a.m76697o(d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void m76696n(@Nullable d30 d30Var) {
        showNext();
        if (NullChecker.m81303a(this.f52116g)) {
            this.f52116g.mo74746a();
        }
        Animation inAnimation = getInAnimation();
        if (NullChecker.m81303a(inAnimation)) {
            inAnimation.setAnimationListener(new AnimationAnimationListenerC12946a(d30Var));
        }
    }

    public LiveRollView(Context context) {
        super(context);
        this.f52114e = 0;
        this.f52117h = 400;
    }
}
