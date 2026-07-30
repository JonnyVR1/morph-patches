package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

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
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.hfw;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.l2f0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInAnimFrame extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final int f5323g = -t100.d(25.0f);

    /* JADX INFO: renamed from: a */
    public FrameLayout f5324a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5325b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout.LayoutParams f5326c;

    /* JADX INFO: renamed from: d */
    public C0358a f5327d;

    /* JADX INFO: renamed from: e */
    public List<Animator> f5328e;

    /* JADX INFO: renamed from: f */
    public Handler f5329f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$a */
    public class C0359a extends AnimatorListenerAdapter {
        public C0359a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SignInAnimFrame.this.f5325b.removeAllViews();
            hfw.a("[live]sign_in", "View port remove all child");
            xdl0.M(SignInAnimFrame.this.f5324a, false);
            SignInAnimFrame.this.f5324a.setClickable(false);
            SignInAnimFrame.this.f5327d.m6697m4();
            SignInAnimFrame.this.f5328e.remove(animator);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$b */
    public class C0360b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5331a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f5332b;

        public C0360b(int i, d30 d30Var) {
            this.f5331a = i;
            this.f5332b = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            for (int i = 0; i < this.f5331a; i++) {
                SignInAnimItem signInAnimItem = (SignInAnimItem) SignInAnimFrame.this.f5325b.getChildAt(i);
                signInAnimItem.setTranslationX(0.0f);
                if (i != this.f5331a - 1) {
                    signInAnimItem.setAlpha(0.0f);
                }
            }
            d30 d30Var = this.f5332b;
            if (d30Var != null) {
                d30Var.call();
            }
            SignInAnimFrame.this.f5328e.remove(animator);
        }
    }

    public SignInAnimFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(116.0f), t100.d(155.0f));
        this.f5326c = layoutParams;
        this.f5328e = new ArrayList();
        this.f5329f = new Handler();
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6714c(Animator animator) {
        if (animator.isRunning()) {
            animator.cancel();
            hfw.a("[live]sign_in", "Cancel one running animation");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6719h(View view) {
        l2f0.m16942a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m6720i(C0358a c0358a) {
        this.f5327d = c0358a;
    }

    /* JADX INFO: renamed from: j */
    public final void m6721j() {
        hfw.a("[live]sign_in", "Going to cancel all running animation, mAnimList.size = " + this.f5328e.size());
        this.f5329f.removeCallbacksAndMessages(null);
        vwb.z(this.f5328e, new e30() { // from class: l.g2f0
            public final void call(Object obj) {
                SignInAnimFrame.m6714c((Animator) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m6722k(d30 d30Var) {
        final int childCount = this.f5325b.getChildCount();
        final HashMap map = new HashMap();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        for (int i = 0; i < childCount; i++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f5325b.getChildAt(i);
            map.put(signInAnimItem, Float.valueOf(signInAnimItem.getTranslationX()));
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k2f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14175a.m6724m(childCount, map, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0360b(childCount, d30Var));
        valueAnimatorOfFloat.start();
        this.f5328e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: l */
    public final void m6723l() {
        final float width = (this.f5325b.getWidth() / 2) - t100.d(25.0f);
        final float height = (this.f5325b.getHeight() / 2) - t100.o;
        final float f = (float) (6.283185307179586d / ((double) (4.0f * width)));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        int childCount = this.f5325b.getChildCount();
        final SignInAnimItem signInAnimItem = (SignInAnimItem) this.f5325b.getChildAt(childCount - 1);
        if (signInAnimItem == null) {
            hfw.a("[live]sign_in", "Can no fly, childCount = " + childCount);
            CrashHelper.c(new IllegalStateException("View port has no child"));
            return;
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.j2f0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13533a.m6725n(width, signInAnimItem, height, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0359a());
        valueAnimatorOfFloat.start();
        this.f5328e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m6724m(int i, Map map, ValueAnimator valueAnimator) {
        for (int i2 = 0; i2 < i; i2++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f5325b.getChildAt(i2);
            signInAnimItem.setTranslationX(((Float) map.get(signInAnimItem)).floatValue() * (1.0f - valueAnimator.getAnimatedFraction()));
            if (i2 != i - 1) {
                signInAnimItem.f5334a.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6725n(float f, SignInAnimItem signInAnimItem, float f2, float f3, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f4 = f * animatedFraction;
        signInAnimItem.setTranslationX(f4);
        signInAnimItem.setTranslationY((float) (((double) (-f2)) * Math.sin(f3 * f4)));
        signInAnimItem.setRotation(180.0f * animatedFraction);
        float f5 = 1.0f - (0.9f * animatedFraction);
        signInAnimItem.setScaleX(f5);
        signInAnimItem.setScaleY(f5);
        signInAnimItem.setAlpha(1.0f - (0.8f * animatedFraction));
        this.f5324a.setAlpha(1.0f - animatedFraction);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m6726o(int i) {
        if (i > 1) {
            m6722k(new d30() { // from class: l.i2f0
                public final void call() {
                    this.f12407a.m6723l();
                }
            });
        } else {
            m6723l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6721j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6719h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m6727p(List<BLiveSignInReward> list) {
        hfw.a("[live]sign_in", "render rewards size: " + list.size());
        m6721j();
        this.f5324a.setAlpha(1.0f);
        this.f5324a.setClickable(true);
        xdl0.M(this.f5324a, true);
        final int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            BLiveSignInReward bLiveSignInReward = list.get(i);
            SignInAnimItem signInAnimItem = (SignInAnimItem) View.inflate(getContext(), t6c0.f19497D5, null);
            this.f5325b.addView(signInAnimItem, this.f5326c);
            hfw.a("[live]sign_in", "View port child count after addView: " + this.f5325b.getChildCount());
            signInAnimItem.m6730b(bLiveSignInReward.icon);
            if (size > 1) {
                m6728q(signInAnimItem, size, i);
            }
        }
        this.f5329f.postDelayed(new Runnable() { // from class: l.h2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11855a.m6726o(size);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: q */
    public final void m6728q(SignInAnimItem signInAnimItem, int i, int i2) {
        int i3 = f5323g;
        int i4 = this.f5326c.width;
        signInAnimItem.setTranslationX((i2 * (i3 + i4)) - (((((i - 1) * i3) + (i * i4)) / 2) - (i4 / 2)));
    }
}
