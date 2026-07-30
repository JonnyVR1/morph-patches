package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

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
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class AutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final Runnable f26652a;

    /* JADX INFO: renamed from: b */
    public AnimatorSet f26653b;

    /* JADX INFO: renamed from: c */
    public Animator.AnimatorListener f26654c;

    /* JADX INFO: renamed from: d */
    public e30<Integer> f26655d;

    /* JADX INFO: renamed from: e */
    public View f26656e;

    /* JADX INFO: renamed from: f */
    public View f26657f;

    /* JADX INFO: renamed from: g */
    public boolean f26658g;

    /* JADX INFO: renamed from: h */
    public int f26659h;

    /* JADX INFO: renamed from: i */
    public boolean f26660i;

    /* JADX INFO: renamed from: j */
    public f30<View, Integer> f26661j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.AutoScrollView$a */
    public class C8229a implements Animator.AnimatorListener {
        public C8229a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AutoScrollView.this.f26656e.setTranslationY(AutoScrollView.this.getHeight());
            AutoScrollView.this.f26656e.setAlpha(1.0f);
            View view = AutoScrollView.this.f26657f;
            AutoScrollView autoScrollView = AutoScrollView.this;
            autoScrollView.f26657f = autoScrollView.f26656e;
            AutoScrollView.this.f26656e = view;
            AutoScrollView.this.f26659h++;
            AutoScrollView.this.m43414l();
            e51.m114745J(AutoScrollView.this.f26652a);
            AutoScrollView autoScrollView2 = AutoScrollView.this;
            if (autoScrollView2.f26660i) {
                return;
            }
            e51.m114743H(autoScrollView2.getContext(), AutoScrollView.this.f26652a, 3000L);
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
        this.f26652a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f113485a.m43416n();
            }
        };
        this.f26660i = false;
        m43413k();
    }

    /* JADX INFO: renamed from: j */
    public AnimatorSet m43412j() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26656e, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f26657f, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        objectAnimatorOfFloat2.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        return animatorSet;
    }

    /* JADX INFO: renamed from: k */
    public final void m43413k() {
        this.f26654c = new C8229a();
    }

    /* JADX INFO: renamed from: l */
    public final void m43414l() {
        e30<Integer> e30Var = this.f26655d;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(this.f26659h + 1));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m43415m(f30<View, Integer> f30Var) {
        this.f26658g = false;
        this.f26659h = 0;
        e51.m114745J(this.f26652a);
        this.f26661j = f30Var;
        if (getChildCount() > 1) {
            this.f26656e = getChildAt(1);
            View childAt = getChildAt(0);
            this.f26657f = childAt;
            xdl0.m208345M0(childAt, false);
            f30Var.call(this.f26656e, Integer.valueOf(this.f26659h));
            f30Var.call(this.f26657f, Integer.valueOf(this.f26659h + 1));
            e51.m114743H(getContext(), this.f26652a, 400L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m43416n() {
        e51.m114745J(this.f26652a);
        if (!(NullChecker.m81303a(this.f26653b) && this.f26653b.isRunning()) && getChildCount() > 1) {
            this.f26661j.call(this.f26656e, Integer.valueOf(this.f26659h));
            this.f26661j.call(this.f26657f, Integer.valueOf(this.f26659h + 1));
            this.f26657f.setTranslationY(getHeight());
            this.f26657f.setVisibility(0);
            AnimatorSet animatorSetM43412j = m43412j();
            this.f26653b = animatorSetM43412j;
            animatorSetM43412j.addListener(this.f26654c);
            this.f26653b.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26660i = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26660i = true;
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26652a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f113485a.m43416n();
            }
        };
        this.f26660i = false;
        m43413k();
    }

    public AutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26652a = new Runnable() { // from class: l.ij1
            @Override // java.lang.Runnable
            public final void run() {
                this.f113485a.m43416n();
            }
        };
        this.f26660i = false;
        m43413k();
    }
}
