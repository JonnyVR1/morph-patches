package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.like;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.t100;
import p007l.qah;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLikeTabTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f3105d;

    /* JADX INFO: renamed from: e */
    public VText f3106e;

    /* JADX INFO: renamed from: f */
    public VText f3107f;

    /* JADX INFO: renamed from: g */
    public VText f3108g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f3109h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f3110i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f3111j;

    /* JADX INFO: renamed from: k */
    public Animator.AnimatorListener f3112k;

    /* JADX INFO: renamed from: l */
    public boolean f3113l;

    /* JADX INFO: renamed from: m */
    public boolean f3114m;

    /* JADX INFO: renamed from: n */
    public final Runnable f3115n;

    /* JADX INFO: renamed from: o */
    public final Runnable f3116o;

    /* JADX INFO: renamed from: p */
    public boolean f3117p;

    /* JADX INFO: renamed from: q */
    public String f3118q;

    /* JADX INFO: renamed from: r */
    public boolean f3119r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$a */
    public class C2136a implements Animator.AnimatorListener {
        public C2136a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f3117p = true;
            e51.H(FeedLikeTabTitleView.this.getContext(), FeedLikeTabTitleView.this.f3116o, 500L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$b */
    public class C2137b implements Animator.AnimatorListener {
        public C2137b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f3108g.setVisibility(4);
            FeedLikeTabTitleView.this.f3108g.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FeedLikeTabTitleView.this.f3117p = false;
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3113l = true;
        this.f3114m = false;
        this.f3115n = new Runnable() { // from class: l.oah
            @Override // java.lang.Runnable
            public final void run() {
                this.f11405a.m5483s0();
            }
        };
        this.f3116o = new Runnable() { // from class: l.pah
            @Override // java.lang.Runnable
            public final void run() {
                this.f11753a.m5478n0();
            }
        };
        this.f3117p = false;
        this.f3119r = false;
    }

    public VText getTitleView() {
        return this.f3105d;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5477m0(View view) {
        qah.m13496a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m5478n0() {
        if (this.f3119r) {
            return;
        }
        e51.J(this.f3116o);
        if (NullChecker.a(this.f3110i) && this.f3110i.isRunning()) {
            return;
        }
        AnimatorSet animatorSetM5479o0 = m5479o0();
        this.f3110i = animatorSetM5479o0;
        animatorSetM5479o0.addListener(this.f3112k);
        this.f3110i.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public AnimatorSet m5479o0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3108g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f3107f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f3108g, "translationY", 0.0f, getHeight() - t100.d(10.0f));
        objectAnimatorOfFloat3.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f3107f, "translationY", (-getHeight()) + t100.d(10.0f), 0.0f);
        objectAnimatorOfFloat4.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        objectAnimatorOfFloat2.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        this.f3114m = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f3114m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5477m0(this);
        this.f3106e.getPaint().setFakeBoldText(true);
        this.f3108g = this.f3106e;
        this.f3107f = this.f3105d;
        this.f3111j = new C2136a();
        this.f3112k = new C2137b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public AnimatorSet m5480p0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f3107f, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f3107f, "translationY", 0.0f, (-getHeight()) + t100.d(10.0f));
        objectAnimatorOfFloat2.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f3108g, "translationY", getHeight() - t100.d(10.0f), 0.0f);
        objectAnimatorOfFloat3.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m5481q0() {
        if (this.f3117p) {
            return true;
        }
        if (NullChecker.a(this.f3109h) && this.f3109h.isRunning()) {
            return true;
        }
        return NullChecker.a(this.f3110i) && this.f3110i.isRunning();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public void m5482r0() {
        e51.J(this.f3115n);
        e51.H(getContext(), this.f3115n, 5L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final void m5483s0() {
        this.f3119r = false;
        e51.J(this.f3115n);
        if (NullChecker.a(this.f3109h) && this.f3109h.isRunning()) {
            return;
        }
        this.f3108g.setTranslationY(getHeight());
        this.f3108g.setVisibility(0);
        AnimatorSet animatorSetM5480p0 = m5480p0();
        this.f3109h = animatorSetM5480p0;
        animatorSetM5480p0.addListener(this.f3111j);
        this.f3109h.start();
    }

    public void setScrollTv(String str) {
        this.f3118q = str;
        this.f3107f.setText(str);
        this.f3108g.setText("喜欢+1");
    }

    /* JADX INFO: renamed from: t0 */
    public void m5484t0() {
        if (m5481q0()) {
            if (this.f3117p) {
                this.f3119r = true;
            }
            this.f3117p = false;
            AnimatorSet animatorSet = this.f3109h;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f3109h.removeAllListeners();
                this.f3109h.cancel();
            }
            AnimatorSet animatorSet2 = this.f3110i;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.f3110i.removeAllListeners();
                this.f3110i.cancel();
            }
            this.f3107f.setText(this.f3118q);
            this.f3107f.setTranslationY(0.0f);
            this.f3107f.setAlpha(1.0f);
            this.f3107f.setVisibility(0);
            this.f3108g.setVisibility(4);
            this.f3108g.setAlpha(1.0f);
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedLikeTabTitleView(@NonNull Context context) {
        this(context, null);
    }
}
