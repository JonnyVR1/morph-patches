package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sunshine.engine.base.InterpolatorType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class GiveLikeView extends VImage implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: d */
    public long f41757d;

    /* JADX INFO: renamed from: e */
    public String f41758e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f41759f;

    public GiveLikeView(Context context) {
        super(context);
        this.f41757d = 0L;
        this.f41758e = null;
        this.f41759f = null;
    }

    /* JADX INFO: renamed from: h */
    private void m64318h() {
        if (NullChecker.m82486a(this.f41759f)) {
            this.f41759f.cancel();
            this.f41759f = null;
        }
        setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f41759f = null;
        m64318h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f41759f = null;
        m64318h();
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
        if (str == null || !str.equals(this.f41758e)) {
            m64318h();
        }
        this.f41758e = str;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        boolean z = getVisibility() != 0 && i == 0;
        super.setVisibility(i);
        if (z) {
            this.f41759f = new AnimatorSet();
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
            this.f41759f.playSequentially(animatorSet, animatorSet2, animatorSet3, animatorSet4);
            this.f41759f.addListener(this);
            this.f41759f.start();
        }
    }

    public GiveLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41757d = 0L;
        this.f41758e = null;
        this.f41759f = null;
    }

    public GiveLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41757d = 0L;
        this.f41758e = null;
        this.f41759f = null;
    }
}
