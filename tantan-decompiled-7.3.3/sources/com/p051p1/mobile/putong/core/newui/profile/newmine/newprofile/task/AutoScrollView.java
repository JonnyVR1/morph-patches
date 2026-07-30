package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.l51;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class AutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Runnable f27500a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f27501b;

    /* JADX INFO: renamed from: c */
    public Animator.AnimatorListener f27502c;

    /* JADX INFO: renamed from: d */
    public y20<Integer> f27503d;

    /* JADX INFO: renamed from: e */
    public View f27504e;

    /* JADX INFO: renamed from: f */
    public View f27505f;

    /* JADX INFO: renamed from: g */
    public boolean f27506g;

    /* JADX INFO: renamed from: h */
    public int f27507h;

    /* JADX INFO: renamed from: i */
    public boolean f27508i;

    /* JADX INFO: renamed from: j */
    public z20<View, Integer> f27509j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.AutoScrollView$a */
    public class C8392a implements Animator.AnimatorListener {
        public C8392a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AutoScrollView.this.f27504e.setTranslationY(AutoScrollView.this.getHeight());
            AutoScrollView.this.f27504e.setAlpha(1.0f);
            View view = AutoScrollView.this.f27505f;
            AutoScrollView autoScrollView = AutoScrollView.this;
            autoScrollView.f27505f = autoScrollView.f27504e;
            AutoScrollView.this.f27504e = view;
            AutoScrollView.this.f27507h++;
            AutoScrollView.this.m44600l();
            l51.m152890J(AutoScrollView.this.f27500a);
            AutoScrollView autoScrollView2 = AutoScrollView.this;
            if (autoScrollView2.f27508i) {
                return;
            }
            l51.m152888H(autoScrollView2.getContext(), AutoScrollView.this.f27500a, 3000L);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public AutoScrollView(@NonNull Context context) {
        super(context);
        this.f27500a = new Runnable() { // from class: l.pj1
            @Override // java.lang.Runnable
            public final void run() {
                this.f152644a.m44602n();
            }
        };
        this.f27508i = false;
        m44599k();
    }

    /* JADX INFO: renamed from: j */
    public AnimatorSet m44598j() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27504e, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f27505f, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        objectAnimatorOfFloat2.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: k */
    public final void m44599k() {
        this.f27502c = new C8392a();
    }

    /* JADX INFO: renamed from: l */
    public final void m44600l() {
        y20<Integer> y20Var = this.f27503d;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(this.f27507h + 1));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m44601m(z20<View, Integer> z20Var) {
        this.f27506g = false;
        this.f27507h = 0;
        l51.m152890J(this.f27500a);
        this.f27509j = z20Var;
        if (getChildCount() > 1) {
            this.f27504e = getChildAt(1);
            View childAt = getChildAt(0);
            this.f27505f = childAt;
            bnl0.m105525M0(childAt, false);
            z20Var.call(this.f27504e, Integer.valueOf(this.f27507h));
            z20Var.call(this.f27505f, Integer.valueOf(this.f27507h + 1));
            l51.m152888H(getContext(), this.f27500a, 400L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m44602n() {
        l51.m152890J(this.f27500a);
        if (!(NullChecker.m82486a(this.f27501b) && this.f27501b.isRunning()) && getChildCount() > 1) {
            this.f27509j.call(this.f27504e, Integer.valueOf(this.f27507h));
            this.f27509j.call(this.f27505f, Integer.valueOf(this.f27507h + 1));
            this.f27505f.setTranslationY(getHeight());
            this.f27505f.setVisibility(0);
            AnimatorSet animatorSetM44598j = m44598j();
            this.f27501b = animatorSetM44598j;
            animatorSetM44598j.addListener(this.f27502c);
            this.f27501b.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27508i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27508i = true;
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27500a = new Runnable() { // from class: l.pj1
            @Override // java.lang.Runnable
            public final void run() {
                this.f152644a.m44602n();
            }
        };
        this.f27508i = false;
        m44599k();
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27500a = new Runnable() { // from class: l.pj1
            @Override // java.lang.Runnable
            public final void run() {
                this.f152644a.m44602n();
            }
        };
        this.f27508i = false;
        m44599k();
    }
}
