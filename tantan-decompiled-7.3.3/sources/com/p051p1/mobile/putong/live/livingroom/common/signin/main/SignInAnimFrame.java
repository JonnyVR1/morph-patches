package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

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
import com.p051p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.bnl0;
import p153l.fhw;
import p153l.jyb;
import p153l.qa00;
import p153l.saf0;
import p153l.x20;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAnimFrame extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final int f50129g = -qa00.m175859d(25.0f);

    /* JADX INFO: renamed from: a */
    public FrameLayout f50130a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50131b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout.LayoutParams f50132c;

    /* JADX INFO: renamed from: d */
    public C12932a f50133d;

    /* JADX INFO: renamed from: e */
    public List<Animator> f50134e;

    /* JADX INFO: renamed from: f */
    public Handler f50135f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$a */
    public class C12933a extends AnimatorListenerAdapter {
        public C12933a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SignInAnimFrame.this.f50131b.removeAllViews();
            fhw.m125605a("[live]sign_in", "View port remove all child");
            bnl0.m105524M(SignInAnimFrame.this.f50130a, false);
            SignInAnimFrame.this.f50130a.setClickable(false);
            SignInAnimFrame.this.f50133d.m74352m4();
            SignInAnimFrame.this.f50134e.remove(animator);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInAnimFrame$b */
    public class C12934b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f50137a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f50138b;

        public C12934b(int i, x20 x20Var) {
            this.f50137a = i;
            this.f50138b = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            for (int i = 0; i < this.f50137a; i++) {
                SignInAnimItem signInAnimItem = (SignInAnimItem) SignInAnimFrame.this.f50131b.getChildAt(i);
                signInAnimItem.setTranslationX(0.0f);
                if (i != this.f50137a - 1) {
                    signInAnimItem.setAlpha(0.0f);
                }
            }
            x20 x20Var = this.f50138b;
            if (x20Var != null) {
                x20Var.call();
            }
            SignInAnimFrame.this.f50134e.remove(animator);
        }
    }

    public SignInAnimFrame(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(116.0f), qa00.m175859d(155.0f));
        this.f50132c = layoutParams;
        this.f50134e = new ArrayList();
        this.f50135f = new Handler();
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m74368c(Animator animator) {
        if (animator.isRunning()) {
            animator.cancel();
            fhw.m125605a("[live]sign_in", "Cancel one running animation");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m74373h(View view) {
        saf0.m185269a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m74374i(C12932a c12932a) {
        this.f50133d = c12932a;
    }

    /* JADX INFO: renamed from: j */
    public final void m74375j() {
        fhw.m125605a("[live]sign_in", "Going to cancel all running animation, mAnimList.size = " + this.f50134e.size());
        this.f50135f.removeCallbacksAndMessages(null);
        jyb.m147537z(this.f50134e, new y20() { // from class: l.naf0
            @Override // p153l.y20
            public final void call(Object obj) {
                SignInAnimFrame.m74368c((Animator) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m74376k(x20 x20Var) {
        final int childCount = this.f50131b.getChildCount();
        final HashMap map = new HashMap();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        for (int i = 0; i < childCount; i++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f50131b.getChildAt(i);
            map.put(signInAnimItem, Float.valueOf(signInAnimItem.getTranslationX()));
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.raf0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f161927a.m74378m(childCount, map, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12934b(childCount, x20Var));
        valueAnimatorOfFloat.start();
        this.f50134e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: l */
    public final void m74377l() {
        final float width = (this.f50131b.getWidth() / 2) - qa00.m175859d(25.0f);
        final float height = (this.f50131b.getHeight() / 2) - qa00.f156328o;
        final float f = (float) (6.283185307179586d / ((double) (4.0f * width)));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        int childCount = this.f50131b.getChildCount();
        final SignInAnimItem signInAnimItem = (SignInAnimItem) this.f50131b.getChildAt(childCount - 1);
        if (signInAnimItem == null) {
            fhw.m125605a("[live]sign_in", "Can no fly, childCount = " + childCount);
            CrashHelper.m82479c(new IllegalStateException("View port has no child"));
            return;
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qaf0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f156376a.m74379n(width, signInAnimItem, height, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12933a());
        valueAnimatorOfFloat.start();
        this.f50134e.add(valueAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m74378m(int i, Map map, ValueAnimator valueAnimator) {
        for (int i2 = 0; i2 < i; i2++) {
            SignInAnimItem signInAnimItem = (SignInAnimItem) this.f50131b.getChildAt(i2);
            signInAnimItem.setTranslationX(((Float) map.get(signInAnimItem)).floatValue() * (1.0f - valueAnimator.getAnimatedFraction()));
            if (i2 != i - 1) {
                signInAnimItem.f50140a.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m74379n(float f, SignInAnimItem signInAnimItem, float f2, float f3, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f4 = f * animatedFraction;
        signInAnimItem.setTranslationX(f4);
        signInAnimItem.setTranslationY((float) (((double) (-f2)) * Math.sin(f3 * f4)));
        signInAnimItem.setRotation(180.0f * animatedFraction);
        float f5 = 1.0f - (0.9f * animatedFraction);
        signInAnimItem.setScaleX(f5);
        signInAnimItem.setScaleY(f5);
        signInAnimItem.setAlpha(1.0f - (0.8f * animatedFraction));
        this.f50130a.setAlpha(1.0f - animatedFraction);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m74380o(int i) {
        if (i > 1) {
            m74376k(new x20() { // from class: l.paf0
                @Override // p153l.x20
                public final void call() {
                    this.f151276a.m74377l();
                }
            });
        } else {
            m74377l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74375j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74373h(this);
    }

    /* JADX INFO: renamed from: p */
    public void m74381p(List<BLiveSignInReward> list) {
        fhw.m125605a("[live]sign_in", "render rewards size: " + list.size());
        m74375j();
        this.f50130a.setAlpha(1.0f);
        this.f50130a.setClickable(true);
        bnl0.m105524M(this.f50130a, true);
        final int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            BLiveSignInReward bLiveSignInReward = list.get(i);
            SignInAnimItem signInAnimItem = (SignInAnimItem) View.inflate(getContext(), yec0.f198733D5, null);
            this.f50131b.addView(signInAnimItem, this.f50132c);
            fhw.m125605a("[live]sign_in", "View port child count after addView: " + this.f50131b.getChildCount());
            signInAnimItem.m74384b(bLiveSignInReward.icon);
            if (size > 1) {
                m74382q(signInAnimItem, size, i);
            }
        }
        this.f50135f.postDelayed(new Runnable() { // from class: l.oaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f145709a.m74380o(size);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: q */
    public final void m74382q(SignInAnimItem signInAnimItem, int i, int i2) {
        int i3 = f50129g;
        int i4 = this.f50132c.width;
        signInAnimItem.setTranslationX((i2 * (i3 + i4)) - (((((i - 1) * i3) + (i * i4)) / 2) - (i4 / 2)));
    }
}
