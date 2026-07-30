package com.p000p1.mobile.putong.core.p001ui.popup;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class ProfileThinPopup_MovableImage extends ImageView implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public int[] f682a;

    /* JADX INFO: renamed from: b */
    public float f683b;

    /* JADX INFO: renamed from: c */
    public float f684c;

    /* JADX INFO: renamed from: d */
    public float f685d;

    /* JADX INFO: renamed from: e */
    public float f686e;

    /* JADX INFO: renamed from: f */
    public int f687f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f688g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f689h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f690i;

    /* JADX INFO: renamed from: j */
    public AnimatorSet f691j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f692k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f693l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f694m;

    /* JADX INFO: renamed from: n */
    public boolean f695n;

    /* JADX INFO: renamed from: o */
    public boolean f696o;

    public ProfileThinPopup_MovableImage(Context context) {
        super(context);
        this.f682a = new int[]{0, 0};
        this.f684c = 0.0f;
        this.f686e = 0.0f;
        this.f687f = -1;
        this.f696o = false;
        m900b();
    }

    /* JADX INFO: renamed from: a */
    public final AnimatorSet m899a(int i) {
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
    public void m900b() {
        setVisibility(8);
        getLocationOnScreen(this.f682a);
        this.f691j = new AnimatorSet();
        this.f690i = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "Alpha", 1.0f, 0.0f);
        this.f688g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f688g.setStartDelay(1000L);
        this.f688g.addListener(this);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "Alpha", 0.0f, 1.0f);
        this.f689h = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(0L);
        m901c();
        m902d();
        this.f691j.play(m899a(200)).after(this.f694m);
        this.f692k = m899a(100);
    }

    /* JADX INFO: renamed from: c */
    public final void m901c() {
        this.f693l = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.9f);
        objectAnimatorOfFloat.setDuration(100L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.9f);
        objectAnimatorOfFloat2.setDuration(100L);
        this.f693l.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: d */
    public final void m902d() {
        this.f694m = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.1f);
        objectAnimatorOfFloat.setDuration(200L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.1f);
        objectAnimatorOfFloat2.setDuration(200L);
        this.f694m.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: e */
    public final void m903e() {
        this.f695n = false;
        this.f688g.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f695n = true;
        this.f689h.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f695n) {
            return;
        }
        this.f684c = 0.0f;
        this.f683b = 0.0f;
        setX(this.f682a[0]);
        setY(this.f682a[1]);
        this.f689h.start();
        this.f691j.start();
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
            onAnimationCancel(this.f690i);
            this.f696o = true;
            this.f693l.start();
            this.f687f = motionEvent.getPointerId(0);
            this.f682a[0] = getLeft();
            this.f682a[1] = getTop();
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            this.f685d = x;
            this.f686e = y;
            if (this.f683b == 0.0f) {
                this.f683b = getX();
            }
            if (this.f684c == 0.0f) {
                this.f684c = getY();
            }
            this.f688g.cancel();
        } else if (i == 1) {
            this.f692k.start();
            int i2 = action & 65280;
            if (i2 < motionEvent.getPointerCount() && motionEvent.getPointerId(i2) == this.f687f) {
                if (getX() != this.f682a[0] && getY() != this.f682a[1]) {
                    m903e();
                }
                this.f687f = -1;
            }
        } else if (i != 2) {
            if (i == 3) {
                this.f687f = -1;
            } else {
                if (i != 6) {
                    return false;
                }
                int i3 = action & 65280;
                if (i3 < motionEvent.getPointerCount() && motionEvent.getPointerId(i3) == this.f687f) {
                    this.f692k.start();
                    m903e();
                    this.f687f = -1;
                }
            }
        } else if (this.f687f != -1) {
            float x2 = motionEvent.getX(0);
            float y2 = motionEvent.getY(0);
            float f = x2 - this.f685d;
            float f2 = y2 - this.f686e;
            float f3 = this.f683b + f;
            this.f683b = f3;
            this.f684c += f2;
            setX(f3);
            setY(this.f684c);
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            this.f691j.start();
        }
        super.onVisibilityChanged(view, i);
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f682a = new int[]{0, 0};
        this.f684c = 0.0f;
        this.f686e = 0.0f;
        this.f687f = -1;
        this.f696o = false;
        m900b();
    }

    public ProfileThinPopup_MovableImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f682a = new int[]{0, 0};
        this.f684c = 0.0f;
        this.f686e = 0.0f;
        this.f687f = -1;
        this.f696o = false;
        m900b();
    }
}
