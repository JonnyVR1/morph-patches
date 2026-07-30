package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pbl0 {

    /* JADX INFO: renamed from: a */
    public View f6348a;

    /* JADX INFO: renamed from: b */
    public int f6349b = xdl0.w0();

    /* JADX INFO: renamed from: c */
    public int f6350c = xdl0.y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f6351d;

    /* JADX INFO: renamed from: e */
    public n9e f6352e;

    /* JADX INFO: renamed from: l.pbl0$b */
    public class C0471b extends AnimatorListenerAdapter {
        public C0471b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (pbl0.this.f6348a.getContext() instanceof Act) {
                Act context = pbl0.this.f6348a.getContext();
                pbl0.this.m6830m(true);
                context.overridePendingTransition(0, 0);
            }
        }
    }

    public pbl0(View view, n9e n9eVar) {
        this.f6348a = view;
        this.f6352e = n9eVar;
    }

    /* JADX INFO: renamed from: d */
    public void m6821d() {
        ValueAnimator valueAnimatorOfInt;
        if (m6826i() == 0) {
            m6830m(true);
            return;
        }
        View view = this.f6348a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f6348a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f6348a, "alpha", 1.0f, 0.0f);
        if (this.f6348a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(this.f6348a.getContext().decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nbl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f5866a.m6827j(valueAnimator);
                }
            });
        } else {
            valueAnimatorOfInt = null;
        }
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        if (NullChecker.a(valueAnimatorOfInt)) {
            animatorSet.playTogether(valueAnimatorOfInt);
        }
        animatorSet.addListener(new C0471b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m6822e(float f, float f2) {
        int i = this.f6349b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: f */
    public float m6823f(float f, float f2) {
        int i = this.f6349b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: i */
    public final int m6826i() {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6827j(ValueAnimator valueAnimator) {
        this.f6348a.getContext().decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6828k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f6348a.setTranslationX(animatedFraction);
        this.f6348a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f6348a.setScaleX(animatedFraction3);
        this.f6348a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m6829l(float f, float f2) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        if (NullChecker.a(this.f6352e)) {
            this.f6352e.mo929c(f, f2);
        }
        if (NullChecker.a(this.f6348a)) {
            this.f6348a.setTranslationX(m6824g(f, f2));
            this.f6348a.setTranslationY(m6825h(f, f2));
            this.f6348a.setScaleX(Math.max(m6822e(f, f2), 0.6f));
            this.f6348a.setScaleY(Math.max(m6823f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m6830m(boolean z) {
        if (z) {
            if (NullChecker.a(this.f6352e)) {
                this.f6352e.mo930d();
            }
        } else {
            if (NullChecker.a((Object) null)) {
                throw null;
            }
            if (NullChecker.a(this.f6352e)) {
                this.f6352e.mo6529a();
            }
            m6831n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6831n() {
        if (this.f6348a == null) {
            return;
        }
        if (NullChecker.a(this.f6351d) && this.f6351d.isRunning()) {
            this.f6351d.cancel();
        }
        final float translationX = this.f6348a.getTranslationX();
        final float translationY = this.f6348a.getTranslationY();
        final float scaleX = this.f6348a.getScaleX();
        final float scaleX2 = this.f6348a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lbl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5243a.m6828k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C0470a());
        this.f6351d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: l.pbl0$a */
    public class C0470a implements Animator.AnimatorListener {
        public C0470a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            pbl0.this.f6348a.setTranslationX(0.0f);
            pbl0.this.f6348a.setTranslationY(0.0f);
            pbl0.this.f6348a.setScaleX(1.0f);
            pbl0.this.f6348a.setScaleY(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6832o(m9e m9eVar) {
    }

    /* JADX INFO: renamed from: g */
    public float m6824g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m6825h(float f, float f2) {
        return f2;
    }
}
