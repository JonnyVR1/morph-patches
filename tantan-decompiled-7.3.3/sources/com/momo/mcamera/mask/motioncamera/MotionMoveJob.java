package com.momo.mcamera.mask.motioncamera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes8.dex */
public class MotionMoveJob extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private ValueAnimator animationB;
    private ValueAnimator animationL;
    private ValueAnimator animationR;
    private ValueAnimator animationT;
    private MotionCameraFilterAdapter.OnCropRegionChangedListener regionChangedListener;
    private Handler handler = new Handler(Looper.getMainLooper());
    private RectF dstRectF = new RectF(-1.0f, -1.0f, -1.0f, -1.0f);
    private AnimatorSet set = new AnimatorSet();

    private void removeAnimAllListener() {
        ValueAnimator valueAnimator = this.animationT;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.animationL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.animationR;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
        }
        ValueAnimator valueAnimator4 = this.animationB;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        AnimatorSet animatorSet = this.set;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
    }

    public void cancel() {
        this.handler.post(new Runnable() { // from class: com.momo.mcamera.mask.motioncamera.MotionMoveJob.2
            @Override // java.lang.Runnable
            public void run() {
                MotionMoveJob.this.set.cancel();
                MotionMoveJob.this.handler.removeCallbacksAndMessages(null);
            }
        });
        this.regionChangedListener = null;
    }

    public boolean isRunning() {
        return this.set.isRunning();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        MDLog.m7443d(MotionCameraFilterAdapter.MotionFilterTAG, "onAnimationCancel.");
        removeAnimAllListener();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        MDLog.m7443d(MotionCameraFilterAdapter.MotionFilterTAG, "onAnimationEnd.");
        removeAnimAllListener();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        MDLog.m7443d(MotionCameraFilterAdapter.MotionFilterTAG, "onAnimationStart.");
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (valueAnimator == this.animationT) {
            this.dstRectF.top = fFloatValue;
        } else if (valueAnimator == this.animationL) {
            this.dstRectF.left = fFloatValue;
        } else if (valueAnimator == this.animationR) {
            this.dstRectF.right = fFloatValue;
        } else if (valueAnimator == this.animationB) {
            this.dstRectF.bottom = fFloatValue;
        }
        RectF rectF = this.dstRectF;
        if (rectF.top == -1.0f || rectF.left == -1.0f || rectF.right == -1.0f || rectF.bottom == -1.0f) {
            return;
        }
        MDLog.m7443d(MotionCameraFilterAdapter.MotionFilterTAG, "onAnimationUpdate 四个值都更新完，可以做一次绘制. rectF=" + this.dstRectF.toShortString());
        MotionCameraFilterAdapter.OnCropRegionChangedListener onCropRegionChangedListener = this.regionChangedListener;
        if (onCropRegionChangedListener != null) {
            RectF rectF2 = this.dstRectF;
            onCropRegionChangedListener.onCropRegionChanged(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        }
        this.dstRectF.set(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    public void setCropRegionChangedListener(MotionCameraFilterAdapter.OnCropRegionChangedListener onCropRegionChangedListener) {
        this.regionChangedListener = onCropRegionChangedListener;
    }

    public void start(float f, RectF rectF, RectF rectF2) {
        this.animationT = ValueAnimator.ofFloat(rectF.top, rectF2.top);
        this.animationL = ValueAnimator.ofFloat(rectF.left, rectF2.left);
        this.animationR = ValueAnimator.ofFloat(rectF.right, rectF2.right);
        this.animationB = ValueAnimator.ofFloat(rectF.bottom, rectF2.bottom);
        this.animationT.addUpdateListener(this);
        this.animationL.addUpdateListener(this);
        this.animationR.addUpdateListener(this);
        this.animationB.addUpdateListener(this);
        float f2 = f * 1000.0f;
        this.set.setDuration((long) f2);
        this.set.setInterpolator(new MotionCameraInterpolator(0.5f, 0.0f, 0.5f, 1.0f));
        this.set.addListener(this);
        this.set.playTogether(this.animationT, this.animationL, this.animationR, this.animationB);
        MDLog.m7443d(MotionCameraFilterAdapter.MotionFilterTAG, "MotionMoveJob start, duration=" + f2 + ", rect=" + rectF.toShortString() + ", dstRect=" + rectF2.toShortString());
        this.handler.post(new Runnable() { // from class: com.momo.mcamera.mask.motioncamera.MotionMoveJob.1
            @Override // java.lang.Runnable
            public void run() {
                MotionMoveJob.this.set.start();
            }
        });
    }
}
