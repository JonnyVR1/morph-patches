package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class GiveLikeView extends VImage implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: d */
    public long f40909d;

    /* JADX INFO: renamed from: e */
    public String f40910e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f40911f;

    public GiveLikeView(Context context) {
        super(context);
        this.f40909d = 0L;
        this.f40910e = null;
        this.f40911f = null;
    }

    /* JADX INFO: renamed from: h */
    private void m63135h() {
        if (NullChecker.m81303a(this.f40911f)) {
            this.f40911f.cancel();
            this.f40911f = null;
        }
        setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f40911f = null;
        m63135h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f40911f = null;
        m63135h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setId(String str) {
        if (str == null || !str.equals(this.f40910e)) {
            m63135h();
        }
        this.f40910e = str;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        boolean z = getVisibility() != 0 && i == 0;
        super.setVisibility(i);
        if (z) {
            this.f40911f = new AnimatorSet();
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
            this.f40911f.playSequentially(animatorSet, animatorSet2, animatorSet3, animatorSet4);
            this.f40911f.addListener(this);
            this.f40911f.start();
        }
    }

    public GiveLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40909d = 0L;
        this.f40910e = null;
        this.f40911f = null;
    }

    public GiveLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40909d = 0L;
        this.f40910e = null;
        this.f40911f = null;
    }
}
