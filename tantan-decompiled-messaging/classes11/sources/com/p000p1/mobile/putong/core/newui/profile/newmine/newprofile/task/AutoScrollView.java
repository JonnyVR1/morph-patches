package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

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
import l.e30;
import l.e51;
import l.f30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Runnable f5430a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f5431b;

    /* JADX INFO: renamed from: c */
    public Animator.AnimatorListener f5432c;

    /* JADX INFO: renamed from: d */
    public e30<Integer> f5433d;

    /* JADX INFO: renamed from: e */
    public View f5434e;

    /* JADX INFO: renamed from: f */
    public View f5435f;

    /* JADX INFO: renamed from: g */
    public boolean f5436g;

    /* JADX INFO: renamed from: h */
    public int f5437h;

    /* JADX INFO: renamed from: i */
    public boolean f5438i;

    /* JADX INFO: renamed from: j */
    public f30<View, Integer> f5439j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.AutoScrollView$a */
    public class C0393a implements Animator.AnimatorListener {
        public C0393a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AutoScrollView.this.f5434e.setTranslationY(AutoScrollView.this.getHeight());
            AutoScrollView.this.f5434e.setAlpha(1.0f);
            View view = AutoScrollView.this.f5435f;
            AutoScrollView autoScrollView = AutoScrollView.this;
            autoScrollView.f5435f = autoScrollView.f5434e;
            AutoScrollView.this.f5434e = view;
            AutoScrollView.this.f5437h++;
            AutoScrollView.this.m7653l();
            e51.J(AutoScrollView.this.f5430a);
            AutoScrollView autoScrollView2 = AutoScrollView.this;
            if (autoScrollView2.f5438i) {
                return;
            }
            e51.H(autoScrollView2.getContext(), AutoScrollView.this.f5430a, 3000L);
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
        this.f5430a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f14659a.m7655n();
            }
        };
        this.f5438i = false;
        m7652k();
    }

    /* JADX INFO: renamed from: j */
    public AnimatorSet m7651j() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5434e, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f5435f, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        objectAnimatorOfFloat2.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: k */
    public final void m7652k() {
        this.f5432c = new C0393a();
    }

    /* JADX INFO: renamed from: l */
    public final void m7653l() {
        e30<Integer> e30Var = this.f5433d;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f5437h + 1));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7654m(f30<View, Integer> f30Var) {
        this.f5436g = false;
        this.f5437h = 0;
        e51.J(this.f5430a);
        this.f5439j = f30Var;
        if (getChildCount() > 1) {
            this.f5434e = getChildAt(1);
            View childAt = getChildAt(0);
            this.f5435f = childAt;
            xdl0.M0(childAt, false);
            f30Var.call(this.f5434e, Integer.valueOf(this.f5437h));
            f30Var.call(this.f5435f, Integer.valueOf(this.f5437h + 1));
            e51.H(getContext(), this.f5430a, 400L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7655n() {
        e51.J(this.f5430a);
        if (!(NullChecker.a(this.f5431b) && this.f5431b.isRunning()) && getChildCount() > 1) {
            this.f5439j.call(this.f5434e, Integer.valueOf(this.f5437h));
            this.f5439j.call(this.f5435f, Integer.valueOf(this.f5437h + 1));
            this.f5435f.setTranslationY(getHeight());
            this.f5435f.setVisibility(0);
            AnimatorSet animatorSetM7651j = m7651j();
            this.f5431b = animatorSetM7651j;
            animatorSetM7651j.addListener(this.f5432c);
            this.f5431b.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5438i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5438i = true;
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5430a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f14659a.m7655n();
            }
        };
        this.f5438i = false;
        m7652k();
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5430a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f14659a.m7655n();
            }
        };
        this.f5438i = false;
        m7652k();
    }
}
