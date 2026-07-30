package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class tkl0 {

    /* JADX INFO: renamed from: a */
    public View f174724a;

    /* JADX INFO: renamed from: b */
    public int f174725b = bnl0.m105588w0();

    /* JADX INFO: renamed from: c */
    public int f174726c = bnl0.m105592y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f174727d;

    /* JADX INFO: renamed from: e */
    public rae f174728e;

    /* JADX INFO: renamed from: l.tkl0$b */
    public class C20339b extends AnimatorListenerAdapter {
        public C20339b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (tkl0.this.f174724a.getContext() instanceof Act) {
                Act act = (Act) tkl0.this.f174724a.getContext();
                tkl0.this.m191577m(true);
                act.overridePendingTransition(0, 0);
            }
        }
    }

    public tkl0(View view, rae raeVar) {
        this.f174724a = view;
        this.f174728e = raeVar;
    }

    /* JADX INFO: renamed from: d */
    public void m191568d() {
        ValueAnimator valueAnimatorOfInt;
        if (m191573i() == 0) {
            m191577m(true);
            return;
        }
        View view = this.f174724a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f174724a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f174724a, "alpha", 1.0f, 0.0f);
        if (this.f174724a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(((Act) this.f174724a.getContext()).decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rkl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f163630a.m191574j(valueAnimator);
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
        if (NullChecker.m82486a(valueAnimatorOfInt)) {
            animatorSet.playTogether(valueAnimatorOfInt);
        }
        animatorSet.addListener(new C20339b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m191569e(float f, float f2) {
        int i = this.f174725b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: f */
    public float m191570f(float f, float f2) {
        int i = this.f174725b;
        return Math.min(i / (i + f2), 2.1474836E9f);
    }

    /* JADX INFO: renamed from: i */
    public final int m191573i() {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m191574j(ValueAnimator valueAnimator) {
        ((Act) this.f174724a.getContext()).decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m191575k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f174724a.setTranslationX(animatedFraction);
        this.f174724a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f174724a.setScaleX(animatedFraction3);
        this.f174724a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m191576l(float f, float f2) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        if (NullChecker.m82486a(this.f174728e)) {
            this.f174728e.mo45666c(f, f2);
        }
        if (NullChecker.m82486a(this.f174724a)) {
            this.f174724a.setTranslationX(m191571g(f, f2));
            this.f174724a.setTranslationY(m191572h(f, f2));
            this.f174724a.setScaleX(Math.max(m191569e(f, f2), 0.6f));
            this.f174724a.setScaleY(Math.max(m191570f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m191577m(boolean z) {
        if (z) {
            if (NullChecker.m82486a(this.f174728e)) {
                this.f174728e.mo45667d();
            }
        } else {
            if (NullChecker.m82486a(null)) {
                throw null;
            }
            if (NullChecker.m82486a(this.f174728e)) {
                this.f174728e.mo173452a();
            }
            m191578n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m191578n() {
        if (this.f174724a == null) {
            return;
        }
        if (NullChecker.m82486a(this.f174727d) && this.f174727d.isRunning()) {
            this.f174727d.cancel();
        }
        final float translationX = this.f174724a.getTranslationX();
        final float translationY = this.f174724a.getTranslationY();
        final float scaleX = this.f174724a.getScaleX();
        final float scaleX2 = this.f174724a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pkl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f152849a.m191575k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C20338a());
        this.f174727d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: l.tkl0$a */
    public class C20338a implements Animator.AnimatorListener {
        public C20338a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            tkl0.this.f174724a.setTranslationX(0.0f);
            tkl0.this.f174724a.setTranslationY(0.0f);
            tkl0.this.f174724a.setScaleX(1.0f);
            tkl0.this.f174724a.setScaleY(1.0f);
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
    public void m191579o(qae qaeVar) {
    }

    /* JADX INFO: renamed from: g */
    public float m191571g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m191572h(float f, float f2) {
        return f2;
    }
}
