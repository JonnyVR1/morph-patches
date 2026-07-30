package com.p051p1.mobile.putong.live.livingroom.view.rollview;

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
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.HorizontalMarqueeView;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.ezs;
import p153l.gt0;
import p153l.it0;
import p153l.qa00;
import p153l.vhc0;
import p153l.x20;

/* JADX INFO: loaded from: classes5.dex */
public class LiveRollView<T extends View> extends ViewSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public float f52958a;

    /* JADX INFO: renamed from: b */
    public int f52959b;

    /* JADX INFO: renamed from: c */
    public float f52960c;

    /* JADX INFO: renamed from: d */
    public boolean f52961d;

    /* JADX INFO: renamed from: e */
    public int f52962e;

    /* JADX INFO: renamed from: f */
    public Animator f52963f;

    /* JADX INFO: renamed from: g */
    public ezs f52964g;

    /* JADX INFO: renamed from: h */
    public int f52965h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.rollview.LiveRollView$a */
    public class AnimationAnimationListenerC13109a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f52966a;

        public AnimationAnimationListenerC13109a(x20 x20Var) {
            this.f52966a = x20Var;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            LiveRollView.this.m77872g(this.f52966a);
            if (NullChecker.m82486a(LiveRollView.this.f52964g)) {
                LiveRollView.this.f52964g.mo123419d();
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
        this.f52962e = 0;
        this.f52965h = 400;
        m77876k(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public void m77871f(View view, int i, int i2, @Nullable final x20 x20Var) {
        if (i == i2) {
            m77872g(x20Var);
            m77881p();
        } else {
            m77882q();
            Animator duration = gt0.m132160f(gt0.m132169o(view, it0.f116781n, i, i2), new Runnable() { // from class: l.mit
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137018a.m77878m(x20Var);
                }
            }).setDuration(this.f52965h);
            this.f52963f = duration;
            duration.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m77872g(@Nullable x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public int m77873h(View view) {
        return (int) Math.min(m77874i(view), this.f52960c);
    }

    /* JADX INFO: renamed from: i */
    public int m77874i(View view) {
        if (!NullChecker.m82486a(view)) {
            return 0;
        }
        view.measure(0, Integer.MIN_VALUE);
        return view.getMeasuredWidth() + qa00.m175859d(10.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public T m77875j(boolean z) {
        return z ? (T) getCurrentView() : (T) getNextView();
    }

    /* JADX INFO: renamed from: k */
    public final void m77876k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184135j0);
        this.f52958a = typedArrayObtainStyledAttributes.getDimensionPixelSize(vhc0.f184141m0, qa00.m175861f(12));
        this.f52959b = typedArrayObtainStyledAttributes.getColor(vhc0.f184139l0, -1);
        this.f52960c = typedArrayObtainStyledAttributes.getDimension(vhc0.f184143n0, 0.0f);
        this.f52961d = typedArrayObtainStyledAttributes.getBoolean(vhc0.f184137k0, false);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
        m77877l();
    }

    /* JADX INFO: renamed from: l */
    public void m77877l() {
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m77878m(x20 x20Var) {
        m77872g(x20Var);
        m77881p();
    }

    public View makeView() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m77880o(x20 x20Var) {
        m77871f(this, getWidth(), this.f52962e, x20Var);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m77881p() {
        if (NullChecker.m82486a(this.f52964g)) {
            this.f52964g.mo123417b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m77882q() {
        if (NullChecker.m82486a(this.f52964g)) {
            this.f52964g.mo123418c();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m77883r() {
        setInAnimation(null);
        setOutAnimation(null);
    }

    @Override // android.widget.ViewSwitcher
    public void reset() {
        mo77885t();
        m77883r();
        m77886u();
    }

    /* JADX INFO: renamed from: s */
    public void m77884s() {
        bnl0.m105507D0(m77873h(getCurrentView()), this);
    }

    public void setAdapterViewAnimTime(int i) {
        this.f52965h = i;
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

    public void setRollAction(@Nullable ezs ezsVar) {
        this.f52964g = ezsVar;
    }

    /* JADX INFO: renamed from: t */
    public void mo77885t() {
        if (NullChecker.m82486a(getInAnimation())) {
            getInAnimation().cancel();
        }
        if (NullChecker.m82486a(getOutAnimation())) {
            getOutAnimation().cancel();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m77886u() {
        if (NullChecker.m82486a(this.f52963f)) {
            it0.m142007A(this.f52963f);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m77887v(int i, boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        HorizontalMarqueeView horizontalMarqueeView = (HorizontalMarqueeView) (z ? getCurrentView() : getNextView());
        if (NullChecker.m82486a(horizontalMarqueeView)) {
            if (m77874i(horizontalMarqueeView) > i) {
                layoutParams.gravity = 8388611;
            } else {
                layoutParams.gravity = 17;
            }
            horizontalMarqueeView.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m77888w(@Nullable final x20 x20Var) {
        View nextView = getNextView();
        if (!this.f52961d) {
            m77879n(x20Var);
            return;
        }
        this.f52962e = m77873h(nextView);
        if (this.f52962e > m77873h(getCurrentView())) {
            m77871f(this, getWidth(), this.f52962e, new x20() { // from class: l.kit
                @Override // p153l.x20
                public final void call() {
                    this.f127026a.m77879n(x20Var);
                }
            });
        } else {
            m77879n(new x20() { // from class: l.lit
                @Override // p153l.x20
                public final void call() {
                    this.f132249a.m77880o(x20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void m77879n(@Nullable x20 x20Var) {
        showNext();
        if (NullChecker.m82486a(this.f52964g)) {
            this.f52964g.mo75929a();
        }
        Animation inAnimation = getInAnimation();
        if (NullChecker.m82486a(inAnimation)) {
            inAnimation.setAnimationListener(new AnimationAnimationListenerC13109a(x20Var));
        }
    }

    public LiveRollView(Context context) {
        super(context);
        this.f52962e = 0;
        this.f52965h = 400;
    }
}
