package com.p000p1.mobile.putong.feed.p005ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sunshine.engine.base.InterpolatorType;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PreviewVideoLikeImageView extends VImage implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: d */
    public AnimatorSet f5085d;

    public PreviewVideoLikeImageView(Context context) {
        super(context);
        this.f5085d = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f5085d = null;
        setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f5085d = null;
        setVisibility(8);
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        boolean z = getVisibility() != 0 && i == 0;
        super/*android.view.View*/.setVisibility(i);
        if (z) {
            this.f5085d = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(400L);
            animatorSet.setInterpolator(InterpolatorType.accelerate.obtain());
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.5f, 0.7f), ObjectAnimator.ofFloat(this, "scaleY", 1.5f, 0.7f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(500L);
            animatorSet2.setInterpolator(InterpolatorType.linear.obtain());
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.7f, 3.5f), ObjectAnimator.ofFloat(this, "scaleY", 0.7f, 3.5f), ObjectAnimator.ofFloat(this, "translationY", (getY() * 4.0f) / 5.0f), ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f));
            this.f5085d.playSequentially(animatorSet, animatorSet2);
            this.f5085d.addListener(this);
            this.f5085d.start();
        }
    }

    public PreviewVideoLikeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5085d = null;
    }

    public PreviewVideoLikeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5085d = null;
    }
}
