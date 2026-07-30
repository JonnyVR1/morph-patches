package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class pbl0 {

    /* JADX INFO: renamed from: a */
    public View f148092a;

    /* JADX INFO: renamed from: b */
    public int f148093b = xdl0.m208408w0();

    /* JADX INFO: renamed from: c */
    public int f148094c = xdl0.m208412y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f148095d;

    /* JADX INFO: renamed from: e */
    public n9e f148096e;

    /* JADX INFO: renamed from: l.pbl0$b */
    public class C19183b extends AnimatorListenerAdapter {
        public C19183b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (pbl0.this.f148092a.getContext() instanceof Act) {
                Act act = (Act) pbl0.this.f148092a.getContext();
                pbl0.this.m168238m(true);
                act.overridePendingTransition(0, 0);
            }
        }
    }

    public pbl0(View view, n9e n9eVar) {
        this.f148092a = view;
        this.f148096e = n9eVar;
    }

    /* JADX INFO: renamed from: d */
    public void m168229d() {
        ValueAnimator valueAnimatorOfInt;
        if (m168234i() == 0) {
            m168238m(true);
            return;
        }
        View view = this.f148092a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f148092a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f148092a, "alpha", 1.0f, 0.0f);
        if (this.f148092a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(((Act) this.f148092a.getContext()).decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nbl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f138046a.m168235j(valueAnimator);
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
        if (NullChecker.m81303a(valueAnimatorOfInt)) {
            animatorSet.playTogether(valueAnimatorOfInt);
        }
        animatorSet.addListener(new C19183b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m168230e(float f, float f2) {
        int i = this.f148093b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: f */
    public float m168231f(float f, float f2) {
        int i = this.f148093b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: i */
    public final int m168234i() {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m168235j(ValueAnimator valueAnimator) {
        ((Act) this.f148092a.getContext()).decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m168236k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f148092a.setTranslationX(animatedFraction);
        this.f148092a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f148092a.setScaleX(animatedFraction3);
        this.f148092a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m168237l(float f, float f2) {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        if (NullChecker.m81303a(this.f148096e)) {
            this.f148096e.mo44483c(f, f2);
        }
        if (NullChecker.m81303a(this.f148092a)) {
            this.f148092a.setTranslationX(m168232g(f, f2));
            this.f148092a.setTranslationY(m168233h(f, f2));
            this.f148092a.setScaleX(Math.max(m168230e(f, f2), 0.6f));
            this.f148092a.setScaleY(Math.max(m168231f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m168238m(boolean z) {
        if (z) {
            if (NullChecker.m81303a(this.f148096e)) {
                this.f148096e.mo44484d();
            }
        } else {
            if (NullChecker.m81303a(null)) {
                throw null;
            }
            if (NullChecker.m81303a(this.f148096e)) {
                this.f148096e.mo158538a();
            }
            m168239n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m168239n() {
        if (this.f148092a == null) {
            return;
        }
        if (NullChecker.m81303a(this.f148095d) && this.f148095d.isRunning()) {
            this.f148095d.cancel();
        }
        final float translationX = this.f148092a.getTranslationX();
        final float translationY = this.f148092a.getTranslationY();
        final float scaleX = this.f148092a.getScaleX();
        final float scaleX2 = this.f148092a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lbl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f127305a.m168236k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C19182a());
        this.f148095d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: l.pbl0$a */
    public class C19182a implements Animator.AnimatorListener {
        public C19182a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            pbl0.this.f148092a.setTranslationX(0.0f);
            pbl0.this.f148092a.setTranslationY(0.0f);
            pbl0.this.f148092a.setScaleX(1.0f);
            pbl0.this.f148092a.setScaleY(1.0f);
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
    public void m168240o(m9e m9eVar) {
    }

    /* JADX INFO: renamed from: g */
    public float m168232g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m168233h(float f, float f2) {
        return f2;
    }
}
