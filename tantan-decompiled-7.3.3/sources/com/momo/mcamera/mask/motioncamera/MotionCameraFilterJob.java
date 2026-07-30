package com.momo.mcamera.mask.motioncamera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public class MotionCameraFilterJob extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private ValueAnimator mAnimation;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private IMotionFilterJobListener mListener;

    public interface IMotionFilterJobListener {
        void onJobEnd();

        void onScaleChanged(float f);
    }

    public MotionCameraFilterJob(float f, float f2, float f3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        this.mAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration((long) (f * 1000.0f));
        this.mAnimation.setInterpolator(new MotionCameraInterpolator(0.5f, 0.0f, 0.5f, 1.0f));
        this.mAnimation.addUpdateListener(this);
        this.mAnimation.addListener(this);
    }

    public void cancel() {
        this.mHandler.post(new Runnable() { // from class: com.momo.mcamera.mask.motioncamera.MotionCameraFilterJob.2
            @Override // java.lang.Runnable
            public void run() {
                if (MotionCameraFilterJob.this.mAnimation != null) {
                    MotionCameraFilterJob.this.mAnimation.cancel();
                }
            }
        });
    }

    public boolean isRunning() {
        ValueAnimator valueAnimator = this.mAnimation;
        if (valueAnimator != null) {
            return valueAnimator.isRunning() || this.mAnimation.isStarted();
        }
        return false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        IMotionFilterJobListener iMotionFilterJobListener = this.mListener;
        if (iMotionFilterJobListener != null) {
            iMotionFilterJobListener.onJobEnd();
            this.mAnimation.removeAllListeners();
            this.mAnimation = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        IMotionFilterJobListener iMotionFilterJobListener = this.mListener;
        if (iMotionFilterJobListener != null) {
            iMotionFilterJobListener.onJobEnd();
            this.mAnimation.removeAllListeners();
            this.mAnimation = null;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        IMotionFilterJobListener iMotionFilterJobListener = this.mListener;
        if (iMotionFilterJobListener != null) {
            iMotionFilterJobListener.onScaleChanged(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public void setMotionFilterJobListener(IMotionFilterJobListener iMotionFilterJobListener) {
        this.mListener = iMotionFilterJobListener;
    }

    public void start() {
        this.mHandler.post(new Runnable() { // from class: com.momo.mcamera.mask.motioncamera.MotionCameraFilterJob.1
            @Override // java.lang.Runnable
            public void run() {
                if (MotionCameraFilterJob.this.mAnimation != null) {
                    MotionCameraFilterJob.this.mAnimation.start();
                }
            }
        });
    }
}
