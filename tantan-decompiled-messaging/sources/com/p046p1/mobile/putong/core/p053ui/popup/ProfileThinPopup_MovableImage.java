package com.p046p1.mobile.putong.core.p053ui.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class ProfileThinPopup_MovableImage extends ImageView implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public int[] f32860a;

    /* JADX INFO: renamed from: b */
    public float f32861b;

    /* JADX INFO: renamed from: c */
    public float f32862c;

    /* JADX INFO: renamed from: d */
    public float f32863d;

    /* JADX INFO: renamed from: e */
    public float f32864e;

    /* JADX INFO: renamed from: f */
    public int f32865f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f32866g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f32867h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f32868i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f32869j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f32870k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f32871l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f32872m;

    /* JADX INFO: renamed from: n */
    public boolean f32873n;

    /* JADX INFO: renamed from: o */
    public boolean f32874o;

    public ProfileThinPopup_MovableImage(Context context) {
        super(context);
        this.f32860a = new int[]{0, 0};
        this.f32862c = 0.0f;
        this.f32864e = 0.0f;
        this.f32865f = -1;
        this.f32874o = false;
        m50465b();
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m50464a(int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f);
        long j = i;
        objectAnimatorOfFloat.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f);
        objectAnimatorOfFloat2.setDuration(j);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: b */
    public void m50465b() {
        setVisibility(8);
        getLocationOnScreen(this.f32860a);
        this.f32869j = new AnimatorSet();
        this.f32868i = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "Alpha", 1.0f, 0.0f);
        this.f32866g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f32866g.setStartDelay(1000L);
        this.f32866g.addListener(this);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "Alpha", 0.0f, 1.0f);
        this.f32867h = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(0L);
        m50466c();
        m50467d();
        this.f32869j.play(m50464a(200)).after(this.f32872m);
        this.f32870k = m50464a(100);
    }

    /* JADX INFO: renamed from: c */
    public final void m50466c() {
        this.f32871l = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.9f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.9f);
        objectAnimatorOfFloat2.setDuration(100L);
        this.f32871l.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: d */
    public final void m50467d() {
        this.f32872m = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.1f);
        objectAnimatorOfFloat.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.1f);
        objectAnimatorOfFloat2.setDuration(200L);
        this.f32872m.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: e */
    public final void m50468e() {
        this.f32873n = false;
        this.f32866g.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f32873n = true;
        this.f32867h.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f32873n) {
            return;
        }
        this.f32862c = 0.0f;
        this.f32861b = 0.0f;
        setX(this.f32860a[0]);
        setY(this.f32860a[1]);
        this.f32867h.start();
        this.f32869j.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = action & 255;
        if (i == 0) {
            onAnimationCancel(this.f32868i);
            this.f32874o = true;
            this.f32871l.start();
            this.f32865f = motionEvent.getPointerId(0);
            this.f32860a[0] = getLeft();
            this.f32860a[1] = getTop();
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f32863d = x;
            this.f32864e = y;
            if (this.f32861b == 0.0f) {
                this.f32861b = getX();
            }
            if (this.f32862c == 0.0f) {
                this.f32862c = getY();
            }
            this.f32866g.cancel();
        } else if (i == 1) {
            this.f32870k.start();
            int i2 = action & 65280;
            if (i2 < motionEvent.getPointerCount() && motionEvent.getPointerId(i2) == this.f32865f) {
                if (getX() != this.f32860a[0] && getY() != this.f32860a[1]) {
                    m50468e();
                }
                this.f32865f = -1;
            }
        } else if (i != 2) {
            if (i == 3) {
                this.f32865f = -1;
            } else {
                if (i != 6) {
                    return false;
                }
                int i3 = action & 65280;
                if (i3 < motionEvent.getPointerCount() && motionEvent.getPointerId(i3) == this.f32865f) {
                    this.f32870k.start();
                    m50468e();
                    this.f32865f = -1;
                }
            }
        } else if (this.f32865f != -1) {
            float x2 = motionEvent.getX(0);
            float y2 = motionEvent.getY(0);
            float f = x2 - this.f32863d;
            float f2 = y2 - this.f32864e;
            float f3 = this.f32861b + f;
            this.f32861b = f3;
            this.f32862c += f2;
            setX(f3);
            setY(this.f32862c);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            this.f32869j.start();
        }
        super.onVisibilityChanged(view, i);
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32860a = new int[]{0, 0};
        this.f32862c = 0.0f;
        this.f32864e = 0.0f;
        this.f32865f = -1;
        this.f32874o = false;
        m50465b();
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32860a = new int[]{0, 0};
        this.f32862c = 0.0f;
        this.f32864e = 0.0f;
        this.f32865f = -1;
        this.f32874o = false;
        m50465b();
    }
}
