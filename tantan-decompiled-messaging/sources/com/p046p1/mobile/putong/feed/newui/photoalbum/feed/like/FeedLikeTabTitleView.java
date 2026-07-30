package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.like;

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
import p147v.VText;
import p149l.e51;
import p149l.qah;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLikeTabTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f41644d;

    /* JADX INFO: renamed from: e */
    public VText f41645e;

    /* JADX INFO: renamed from: f */
    public VText f41646f;

    /* JADX INFO: renamed from: g */
    public VText f41647g;

    /* JADX INFO: renamed from: h */
    public AnimatorSet f41648h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f41649i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f41650j;

    /* JADX INFO: renamed from: k */
    public Animator.AnimatorListener f41651k;

    /* JADX INFO: renamed from: l */
    public boolean f41652l;

    /* JADX INFO: renamed from: m */
    public boolean f41653m;

    /* JADX INFO: renamed from: n */
    public final Runnable f41654n;

    /* JADX INFO: renamed from: o */
    public final Runnable f41655o;

    /* JADX INFO: renamed from: p */
    public boolean f41656p;

    /* JADX INFO: renamed from: q */
    public String f41657q;

    /* JADX INFO: renamed from: r */
    public boolean f41658r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$a */
    public class C11292a implements Animator.AnimatorListener {
        public C11292a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f41656p = true;
            e51.m114743H(FeedLikeTabTitleView.this.getContext(), FeedLikeTabTitleView.this.f41655o, 500L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.like.FeedLikeTabTitleView$b */
    public class C11293b implements Animator.AnimatorListener {
        public C11293b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedLikeTabTitleView.this.f41647g.setVisibility(4);
            FeedLikeTabTitleView.this.f41647g.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FeedLikeTabTitleView.this.f41656p = false;
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41652l = true;
        this.f41653m = false;
        this.f41654n = new Runnable() { // from class: l.oah
            @Override // java.lang.Runnable
            public final void run() {
                this.f142806a.m64405s0();
            }
        };
        this.f41655o = new Runnable() { // from class: l.pah
            @Override // java.lang.Runnable
            public final void run() {
                this.f147978a.m64400n0();
            }
        };
        this.f41656p = false;
        this.f41658r = false;
    }

    public VText getTitleView() {
        return this.f41644d;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m64399m0(View view) {
        qah.m173733a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m64400n0() {
        if (this.f41658r) {
            return;
        }
        e51.m114745J(this.f41655o);
        if (NullChecker.m81303a(this.f41649i) && this.f41649i.isRunning()) {
            return;
        }
        AnimatorSet animatorSetM64401o0 = m64401o0();
        this.f41649i = animatorSetM64401o0;
        animatorSetM64401o0.addListener(this.f41651k);
        this.f41649i.start();
    }

    /* JADX INFO: renamed from: o0 */
    public AnimatorSet m64401o0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41647g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f41646f, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f41647g, "translationY", 0.0f, getHeight() - t100.m186890d(10.0f));
        objectAnimatorOfFloat3.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f41646f, "translationY", (-getHeight()) + t100.m186890d(10.0f), 0.0f);
        objectAnimatorOfFloat4.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        objectAnimatorOfFloat2.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        return animatorSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41653m = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41653m = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64399m0(this);
        this.f41645e.getPaint().setFakeBoldText(true);
        this.f41647g = this.f41645e;
        this.f41646f = this.f41644d;
        this.f41650j = new C11292a();
        this.f41651k = new C11293b();
    }

    /* JADX INFO: renamed from: p0 */
    public AnimatorSet m64402p0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f41646f, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(370L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f41646f, "translationY", 0.0f, (-getHeight()) + t100.m186890d(10.0f));
        objectAnimatorOfFloat2.setDuration(380L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f41647g, "translationY", getHeight() - t100.m186890d(10.0f), 0.0f);
        objectAnimatorOfFloat3.setDuration(380L);
        objectAnimatorOfFloat.setStartDelay(10L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m64403q0() {
        if (this.f41656p) {
            return true;
        }
        if (NullChecker.m81303a(this.f41648h) && this.f41648h.isRunning()) {
            return true;
        }
        return NullChecker.m81303a(this.f41649i) && this.f41649i.isRunning();
    }

    /* JADX INFO: renamed from: r0 */
    public void m64404r0() {
        e51.m114745J(this.f41654n);
        e51.m114743H(getContext(), this.f41654n, 5L);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m64405s0() {
        this.f41658r = false;
        e51.m114745J(this.f41654n);
        if (NullChecker.m81303a(this.f41648h) && this.f41648h.isRunning()) {
            return;
        }
        this.f41647g.setTranslationY(getHeight());
        this.f41647g.setVisibility(0);
        AnimatorSet animatorSetM64402p0 = m64402p0();
        this.f41648h = animatorSetM64402p0;
        animatorSetM64402p0.addListener(this.f41650j);
        this.f41648h.start();
    }

    public void setScrollTv(String str) {
        this.f41657q = str;
        this.f41646f.setText(str);
        this.f41647g.setText("喜欢+1");
    }

    /* JADX INFO: renamed from: t0 */
    public void m64406t0() {
        if (m64403q0()) {
            if (this.f41656p) {
                this.f41658r = true;
            }
            this.f41656p = false;
            AnimatorSet animatorSet = this.f41648h;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f41648h.removeAllListeners();
                this.f41648h.cancel();
            }
            AnimatorSet animatorSet2 = this.f41649i;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.f41649i.removeAllListeners();
                this.f41649i.cancel();
            }
            this.f41646f.setText(this.f41657q);
            this.f41646f.setTranslationY(0.0f);
            this.f41646f.setAlpha(1.0f);
            this.f41646f.setVisibility(0);
            this.f41647g.setVisibility(4);
            this.f41647g.setAlpha(1.0f);
        }
    }

    public FeedLikeTabTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedLikeTabTitleView(@NonNull Context context) {
        this(context, null);
    }
}
