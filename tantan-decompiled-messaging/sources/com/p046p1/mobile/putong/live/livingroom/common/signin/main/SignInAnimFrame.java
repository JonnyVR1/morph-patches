package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.d30;
import p149l.e30;
import p149l.hfw;
import p149l.l2f0;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAnimFrame extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final int f49281g = -t100.m186890d(25.0f);

    /* JADX INFO: renamed from: a */
    public FrameLayout f49282a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49283b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout.LayoutParams f49284c;

    /* JADX INFO: renamed from: d */
    public C12769a f49285d;

    /* JADX INFO: renamed from: e */
    public List<Animator> f49286e;

    /* JADX INFO: renamed from: f */
    public Handler f49287f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$a */
    public class C12770a extends AnimatorListenerAdapter {
        public C12770a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SignInAnimFrame.this.f49283b.removeAllViews();
            hfw.m130790a("[live]sign_in", "View port remove all child");
            xdl0.m208344M(SignInAnimFrame.this.f49282a, false);
            SignInAnimFrame.this.f49282a.setClickable(false);
            SignInAnimFrame.this.f49285d.m73169m4();
            SignInAnimFrame.this.f49286e.remove(animator);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$b */
    public class C12771b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f49289a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f49290b;

        public C12771b(int i, d30 d30Var) {
            this.f49289a = i;
            this.f49290b = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            for (int i = 0; i < this.f49289a; i++) {
                SignInAnimItem signInAnimItem = (SignInAnimItem) SignInAnimFrame.this.f49283b.getChildAt(i);
                signInAnimItem.setTranslationX(0.0f);
                if (i != this.f49289a - 1) {
                    signInAnimItem.setAlpha(0.0f);
                }
            }
            d30 d30Var = this.f49290b;
            if (d30Var != null) {
                d30Var.call();
            }
            SignInAnimFrame.this.f49286e.remove(animator);
        }
    }

    public SignInAnimFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(116.0f), t100.m186890d(155.0f));
        this.f49284c = layoutParams;
        this.f49286e = new ArrayList();
        this.f49287f = new Handler();
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73185c(Animator animator) {
        if (animator.isRunning()) {
            animator.cancel();
            hfw.m130790a("[live]sign_in", "Cancel one running animation");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73190h(View view) {
        l2f0.m148282a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m73191i(C12769a c12769a) {
        this.f49285d = c12769a;
    }

    /* JADX INFO: renamed from: j */
    public final void m73192j() {
        hfw.m130790a("[live]sign_in", "Going to cancel all running animation, mAnimList.size = " + this.f49286e.size());
        this.f49287f.removeCallbacksAndMessages(null);
        vwb.m200354z(this.f49286e, new e30() { // from class: l.g2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                SignInAnimFrame.m73185c((Animator) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m73193k(d30 d30Var) {
        final int childCount = this.f49283b.getChildCount();
        final HashMap map = new HashMap();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        for (int i = 0; i < childCount; i++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f49283b.getChildAt(i);
            map.put(signInAnimItem, Float.valueOf(signInAnimItem.getTranslationX()));
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k2f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f120731a.m73195m(childCount, map, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12771b(childCount, d30Var));
        valueAnimatorOfFloat.start();
        this.f49286e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: l */
    public final void m73194l() {
        final float width = (this.f49283b.getWidth() / 2) - t100.m186890d(25.0f);
        final float height = (this.f49283b.getHeight() / 2) - t100.f167266o;
        final float f = (float) (6.283185307179586d / ((double) (4.0f * width)));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        int childCount = this.f49283b.getChildCount();
        final SignInAnimItem signInAnimItem = (SignInAnimItem) this.f49283b.getChildAt(childCount - 1);
        if (signInAnimItem == null) {
            hfw.m130790a("[live]sign_in", "Can no fly, childCount = " + childCount);
            CrashHelper.m81296c(new IllegalStateException("View port has no child"));
            return;
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.j2f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f115922a.m73196n(width, signInAnimItem, height, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12770a());
        valueAnimatorOfFloat.start();
        this.f49286e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m73195m(int i, Map map, ValueAnimator valueAnimator) {
        for (int i2 = 0; i2 < i; i2++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f49283b.getChildAt(i2);
            signInAnimItem.setTranslationX(((Float) map.get(signInAnimItem)).floatValue() * (1.0f - valueAnimator.getAnimatedFraction()));
            if (i2 != i - 1) {
                signInAnimItem.f49292a.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m73196n(float f, SignInAnimItem signInAnimItem, float f2, float f3, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f4 = f * animatedFraction;
        signInAnimItem.setTranslationX(f4);
        signInAnimItem.setTranslationY((float) (((double) (-f2)) * Math.sin(f3 * f4)));
        signInAnimItem.setRotation(180.0f * animatedFraction);
        float f5 = 1.0f - (0.9f * animatedFraction);
        signInAnimItem.setScaleX(f5);
        signInAnimItem.setScaleY(f5);
        signInAnimItem.setAlpha(1.0f - (0.8f * animatedFraction));
        this.f49282a.setAlpha(1.0f - animatedFraction);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m73197o(int i) {
        if (i > 1) {
            m73193k(new d30() { // from class: l.i2f0
                @Override // p149l.d30
                public final void call() {
                    this.f110553a.m73194l();
                }
            });
        } else {
            m73194l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73192j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73190h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m73198p(List<BLiveSignInReward> list) {
        hfw.m130790a("[live]sign_in", "render rewards size: " + list.size());
        m73192j();
        this.f49282a.setAlpha(1.0f);
        this.f49282a.setClickable(true);
        xdl0.m208344M(this.f49282a, true);
        final int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            BLiveSignInReward bLiveSignInReward = list.get(i);
            SignInAnimItem signInAnimItem = (SignInAnimItem) View.inflate(getContext(), t6c0.f168001D5, null);
            this.f49283b.addView(signInAnimItem, this.f49284c);
            hfw.m130790a("[live]sign_in", "View port child count after addView: " + this.f49283b.getChildCount());
            signInAnimItem.m73201b(bLiveSignInReward.icon);
            if (size > 1) {
                m73199q(signInAnimItem, size, i);
            }
        }
        this.f49287f.postDelayed(new Runnable() { // from class: l.h2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105528a.m73197o(size);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: q */
    public final void m73199q(SignInAnimItem signInAnimItem, int i, int i2) {
        int i3 = f49281g;
        int i4 = this.f49284c.width;
        signInAnimItem.setTranslationX((i2 * (i3 + i4)) - (((((i - 1) * i3) + (i * i4)) / 2) - (i4 / 2)));
    }
}
