package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes7.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {
    protected static final int ENTER_ANIMATION_DURATION = 225;
    protected static final int EXIT_ANIMATION_DURATION = 175;
    private static final int STATE_SCROLLED_DOWN = 1;
    private static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int height;

    public HideBottomViewOnScrollBehavior() {
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    private void animateChildTo(@NonNull V v2, int i, long j, TimeInterpolator timeInterpolator) {
        this.currentAnimator = v2.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, int i) {
        this.height = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v2, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            slideDown(v2);
        } else if (i2 < 0) {
            slideUp(v2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i) {
        return i == 2;
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v2, @Dimension int i) {
        this.additionalHiddenOffsetY = i;
        if (this.currentState == 1) {
            v2.setTranslationY(this.height + i);
        }
    }

    public void slideDown(@NonNull V v2) {
        if (this.currentState == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.currentState = 1;
        animateChildTo(v2, this.height + this.additionalHiddenOffsetY, 175L, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
    }

    public void slideUp(@NonNull V v2) {
        if (this.currentState == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.currentState = 2;
        animateChildTo(v2, 0, 225L, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }
}
