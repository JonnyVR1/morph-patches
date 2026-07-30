package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.like;

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
import p151v.VText;
import p153l.fch;
import p153l.l51;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLikeTabTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f42492d;

    /* JADX INFO: renamed from: e */
    public VText f42493e;

    /* JADX INFO: renamed from: f */
    public VText f42494f;

    /* JADX INFO: renamed from: g */
    public VText f42495g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f42496h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f42497i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f42498j;

    /* JADX INFO: renamed from: k */
    public Animator.AnimatorListener f42499k;

    /* JADX INFO: renamed from: l */
    public boolean f42500l;

    /* JADX INFO: renamed from: m */
    public boolean f42501m;

    /* JADX INFO: renamed from: n */
    public final Runnable f42502n;

    /* JADX INFO: renamed from: o */
    public final Runnable f42503o;

    /* JADX INFO: renamed from: p */
    public boolean f42504p;

    /* JADX INFO: renamed from: q */
    public String f42505q;

    /* JADX INFO: renamed from: r */
    public boolean f42506r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$a */
    public class C11455a implements Animator.AnimatorListener {
        public C11455a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f42504p = true;
            l51.m152888H(FeedLikeTabTitleView.this.getContext(), FeedLikeTabTitleView.this.f42503o, 500L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$b */
    public class C11456b implements Animator.AnimatorListener {
        public C11456b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f42495g.setVisibility(4);
            FeedLikeTabTitleView.this.f42495g.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FeedLikeTabTitleView.this.f42504p = false;
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42500l = true;
        this.f42501m = false;
        this.f42502n = new Runnable() { // from class: l.dch
            @Override // java.lang.Runnable
            public final void run() {
                this.f87785a.m65588s0();
            }
        };
        this.f42503o = new Runnable() { // from class: l.ech
            @Override // java.lang.Runnable
            public final void run() {
                this.f93058a.m65583n0();
            }
        };
        this.f42504p = false;
        this.f42506r = false;
    }

    public VText getTitleView() {
        return this.f42492d;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65582m0(View view) {
        fch.m125009a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m65583n0() {
        if (this.f42506r) {
            return;
        }
        l51.m152890J(this.f42503o);
        if (NullChecker.m82486a(this.f42497i) && this.f42497i.isRunning()) {
            return;
        }
        AnimatorSet animatorSetM65584o0 = m65584o0();
        this.f42497i = animatorSetM65584o0;
        animatorSetM65584o0.addListener(this.f42499k);
        this.f42497i.start();
    }

    /* JADX INFO: renamed from: o0 */
    public AnimatorSet m65584o0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f42495g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f42494f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f42495g, "translationY", 0.0f, getHeight() - qa00.m175859d(10.0f));
        objectAnimatorOfFloat3.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f42494f, "translationY", (-getHeight()) + qa00.m175859d(10.0f), 0.0f);
        objectAnimatorOfFloat4.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        objectAnimatorOfFloat2.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        return animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42501m = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42501m = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65582m0(this);
        this.f42493e.getPaint().setFakeBoldText(true);
        this.f42495g = this.f42493e;
        this.f42494f = this.f42492d;
        this.f42498j = new C11455a();
        this.f42499k = new C11456b();
    }

    /* JADX INFO: renamed from: p0 */
    public AnimatorSet m65585p0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f42494f, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f42494f, "translationY", 0.0f, (-getHeight()) + qa00.m175859d(10.0f));
        objectAnimatorOfFloat2.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f42495g, "translationY", getHeight() - qa00.m175859d(10.0f), 0.0f);
        objectAnimatorOfFloat3.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m65586q0() {
        if (this.f42504p) {
            return true;
        }
        if (NullChecker.m82486a(this.f42496h) && this.f42496h.isRunning()) {
            return true;
        }
        return NullChecker.m82486a(this.f42497i) && this.f42497i.isRunning();
    }

    /* JADX INFO: renamed from: r0 */
    public void m65587r0() {
        l51.m152890J(this.f42502n);
        l51.m152888H(getContext(), this.f42502n, 5L);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m65588s0() {
        this.f42506r = false;
        l51.m152890J(this.f42502n);
        if (NullChecker.m82486a(this.f42496h) && this.f42496h.isRunning()) {
            return;
        }
        this.f42495g.setTranslationY(getHeight());
        this.f42495g.setVisibility(0);
        AnimatorSet animatorSetM65585p0 = m65585p0();
        this.f42496h = animatorSetM65585p0;
        animatorSetM65585p0.addListener(this.f42498j);
        this.f42496h.start();
    }

    public void setScrollTv(String str) {
        this.f42505q = str;
        this.f42494f.setText(str);
        this.f42495g.setText("喜欢+1");
    }

    /* JADX INFO: renamed from: t0 */
    public void m65589t0() {
        if (m65586q0()) {
            if (this.f42504p) {
                this.f42506r = true;
            }
            this.f42504p = false;
            AnimatorSet animatorSet = this.f42496h;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f42496h.removeAllListeners();
                this.f42496h.cancel();
            }
            AnimatorSet animatorSet2 = this.f42497i;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.f42497i.removeAllListeners();
                this.f42497i.cancel();
            }
            this.f42494f.setText(this.f42505q);
            this.f42494f.setTranslationY(0.0f);
            this.f42494f.setAlpha(1.0f);
            this.f42494f.setVisibility(0);
            this.f42495g.setVisibility(4);
            this.f42495g.setAlpha(1.0f);
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedLikeTabTitleView(@NonNull Context context) {
        this(context, null);
    }
}
