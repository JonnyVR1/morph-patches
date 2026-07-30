package com.p046p1.mobile.putong.feed.p060ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sunshine.engine.base.InterpolatorType;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class PreviewVideoLikeImageView extends VImage implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: d */
    public AnimatorSet f43624d;

    public PreviewVideoLikeImageView(Context context) {
        super(context);
        this.f43624d = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f43624d = null;
        setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f43624d = null;
        setVisibility(8);
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

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        boolean z = getVisibility() != 0 && i == 0;
        super.setVisibility(i);
        if (z) {
            this.f43624d = new AnimatorSet();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(400L);
            animatorSet.setInterpolator(InterpolatorType.accelerate.obtain());
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.5f, 0.7f), ObjectAnimator.ofFloat(this, "scaleY", 1.5f, 0.7f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(500L);
            animatorSet2.setInterpolator(InterpolatorType.linear.obtain());
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.7f, 3.5f), ObjectAnimator.ofFloat(this, "scaleY", 0.7f, 3.5f), ObjectAnimator.ofFloat(this, "translationY", (getY() * 4.0f) / 5.0f), ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f));
            this.f43624d.playSequentially(animatorSet, animatorSet2);
            this.f43624d.addListener(this);
            this.f43624d.start();
        }
    }

    public PreviewVideoLikeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43624d = null;
    }

    public PreviewVideoLikeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43624d = null;
    }
}
