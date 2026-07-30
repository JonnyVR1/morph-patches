package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GiveLikeView extends VImage implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: d */
    public long f2370d;

    /* JADX INFO: renamed from: e */
    public String f2371e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f2372f;

    public GiveLikeView(Context context) {
        super(context);
        this.f2370d = 0L;
        this.f2371e = null;
        this.f2372f = null;
    }

    /* JADX INFO: renamed from: h */
    private void m4151h() {
        if (NullChecker.a(this.f2372f)) {
            this.f2372f.cancel();
            this.f2372f = null;
        }
        setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2372f = null;
        m4151h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2372f = null;
        m4151h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setId(String str) {
        if (str == null || !str.equals(this.f2371e)) {
            m4151h();
        }
        this.f2371e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        boolean z = getVisibility() != 0 && i == 0;
        super/*android.view.View*/.setVisibility(i);
        if (z) {
            this.f2372f = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(100L);
            animatorSet.setInterpolator(InterpolatorType.accelerate.obtain());
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.5f, 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 0.5f, 1.0f), ObjectAnimator.ofFloat(this, "alpha", 0.5f, 1.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(400L);
            animatorSet2.setInterpolator(InterpolatorType.shake.obtain());
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.5f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.5f));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(100L);
            animatorSet3.setInterpolator(InterpolatorType.linear.obtain());
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.0f));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(100L);
            animatorSet4.setInterpolator(InterpolatorType.decelerate.obtain());
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.3f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.3f), ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f));
            this.f2372f.playSequentially(animatorSet, animatorSet2, animatorSet3, animatorSet4);
            this.f2372f.addListener(this);
            this.f2372f.start();
        }
    }

    public GiveLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2370d = 0L;
        this.f2371e = null;
        this.f2372f = null;
    }

    public GiveLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2370d = 0L;
        this.f2371e = null;
        this.f2372f = null;
    }
}
