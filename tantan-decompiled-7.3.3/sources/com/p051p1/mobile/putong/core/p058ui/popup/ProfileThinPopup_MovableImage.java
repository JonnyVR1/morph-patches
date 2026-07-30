package com.p051p1.mobile.putong.core.p058ui.popup;

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
    public int[] f33708a;

    /* JADX INFO: renamed from: b */
    public float f33709b;

    /* JADX INFO: renamed from: c */
    public float f33710c;

    /* JADX INFO: renamed from: d */
    public float f33711d;

    /* JADX INFO: renamed from: e */
    public float f33712e;

    /* JADX INFO: renamed from: f */
    public int f33713f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f33714g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f33715h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f33716i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f33717j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f33718k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f33719l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f33720m;

    /* JADX INFO: renamed from: n */
    public boolean f33721n;

    /* JADX INFO: renamed from: o */
    public boolean f33722o;

    public ProfileThinPopup_MovableImage(Context context) {
        super(context);
        this.f33708a = new int[]{0, 0};
        this.f33710c = 0.0f;
        this.f33712e = 0.0f;
        this.f33713f = -1;
        this.f33722o = false;
        m51648b();
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m51647a(int i) {
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
    public void m51648b() {
        setVisibility(8);
        getLocationOnScreen(this.f33708a);
        this.f33717j = new AnimatorSet();
        this.f33716i = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "Alpha", 1.0f, 0.0f);
        this.f33714g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f33714g.setStartDelay(1000L);
        this.f33714g.addListener(this);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "Alpha", 0.0f, 1.0f);
        this.f33715h = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(0L);
        m51649c();
        m51650d();
        this.f33717j.play(m51647a(200)).after(this.f33720m);
        this.f33718k = m51647a(100);
    }

    /* JADX INFO: renamed from: c */
    public final void m51649c() {
        this.f33719l = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.9f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.9f);
        objectAnimatorOfFloat2.setDuration(100L);
        this.f33719l.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: d */
    public final void m51650d() {
        this.f33720m = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.1f);
        objectAnimatorOfFloat.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.1f);
        objectAnimatorOfFloat2.setDuration(200L);
        this.f33720m.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: e */
    public final void m51651e() {
        this.f33721n = false;
        this.f33714g.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f33721n = true;
        this.f33715h.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f33721n) {
            return;
        }
        this.f33710c = 0.0f;
        this.f33709b = 0.0f;
        setX(this.f33708a[0]);
        setY(this.f33708a[1]);
        this.f33715h.start();
        this.f33717j.start();
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
            onAnimationCancel(this.f33716i);
            this.f33722o = true;
            this.f33719l.start();
            this.f33713f = motionEvent.getPointerId(0);
            this.f33708a[0] = getLeft();
            this.f33708a[1] = getTop();
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f33711d = x;
            this.f33712e = y;
            if (this.f33709b == 0.0f) {
                this.f33709b = getX();
            }
            if (this.f33710c == 0.0f) {
                this.f33710c = getY();
            }
            this.f33714g.cancel();
        } else if (i == 1) {
            this.f33718k.start();
            int i2 = action & 65280;
            if (i2 < motionEvent.getPointerCount() && motionEvent.getPointerId(i2) == this.f33713f) {
                if (getX() != this.f33708a[0] && getY() != this.f33708a[1]) {
                    m51651e();
                }
                this.f33713f = -1;
            }
        } else if (i != 2) {
            if (i == 3) {
                this.f33713f = -1;
            } else {
                if (i != 6) {
                    return false;
                }
                int i3 = action & 65280;
                if (i3 < motionEvent.getPointerCount() && motionEvent.getPointerId(i3) == this.f33713f) {
                    this.f33718k.start();
                    m51651e();
                    this.f33713f = -1;
                }
            }
        } else if (this.f33713f != -1) {
            float x2 = motionEvent.getX(0);
            float y2 = motionEvent.getY(0);
            float f = x2 - this.f33711d;
            float f2 = y2 - this.f33712e;
            float f3 = this.f33709b + f;
            this.f33709b = f3;
            this.f33710c += f2;
            setX(f3);
            setY(this.f33710c);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            this.f33717j.start();
        }
        super.onVisibilityChanged(view, i);
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33708a = new int[]{0, 0};
        this.f33710c = 0.0f;
        this.f33712e = 0.0f;
        this.f33713f = -1;
        this.f33722o = false;
        m51648b();
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33708a = new int[]{0, 0};
        this.f33710c = 0.0f;
        this.f33712e = 0.0f;
        this.f33713f = -1;
        this.f33722o = false;
        m51648b();
    }
}
