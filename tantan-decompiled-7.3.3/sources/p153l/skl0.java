package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class skl0 {

    /* JADX INFO: renamed from: a */
    public View f169300a;

    /* JADX INFO: renamed from: b */
    public int f169301b = bnl0.m105588w0();

    /* JADX INFO: renamed from: c */
    public int f169302c = bnl0.m105592y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f169303d;

    /* JADX INFO: renamed from: e */
    public z3h f169304e;

    /* JADX INFO: renamed from: f */
    public y3h f169305f;

    /* JADX INFO: renamed from: l.skl0$b */
    public class C20089b extends AnimatorListenerAdapter {
        public C20089b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (skl0.this.f169300a.getContext() instanceof Act) {
                Act act = (Act) skl0.this.f169300a.getContext();
                skl0.this.m186532m(true);
                act.overridePendingTransition(0, 0);
            }
        }
    }

    public skl0(View view, z3h z3hVar) {
        this.f169300a = view;
        this.f169304e = z3hVar;
    }

    /* JADX INFO: renamed from: d */
    public void m186523d() {
        ValueAnimator valueAnimatorOfInt;
        if (m186528i() == 0) {
            m186532m(true);
            return;
        }
        View view = this.f169300a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f169300a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f169300a, "alpha", 1.0f, 0.0f);
        if (this.f169300a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(((Act) this.f169300a.getContext()).decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.okl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f147762a.m186529j(valueAnimator);
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
        animatorSet.addListener(new C20089b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m186524e(float f, float f2) {
        float f3;
        int i = this.f169301b;
        float f4 = i / (i + f2);
        if (this.f169300a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f169302c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: f */
    public float m186525f(float f, float f2) {
        float f3;
        int i = this.f169301b;
        float f4 = i / (i + f2);
        if (this.f169300a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f169302c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: i */
    public final int m186528i() {
        if (NullChecker.m82486a(this.f169300a) && (this.f169300a.getContext() instanceof FeedVideoFlowAct)) {
            return ((FeedVideoFlowAct) this.f169300a.getContext()).m67373d2();
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m186529j(ValueAnimator valueAnimator) {
        ((Act) this.f169300a.getContext()).decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m186530k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f169300a.setTranslationX(animatedFraction);
        this.f169300a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f169300a.setScaleX(animatedFraction3);
        this.f169300a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m186531l(float f, float f2) {
        if (NullChecker.m82486a(this.f169305f)) {
            this.f169305f.mo66554a(f, f2);
        }
        if (NullChecker.m82486a(this.f169304e)) {
            this.f169304e.mo45666c(f, f2);
        }
        if (NullChecker.m82486a(this.f169300a)) {
            this.f169300a.setTranslationX(m186526g(f, f2));
            this.f169300a.setTranslationY(m186527h(f, f2));
            this.f169300a.setScaleX(Math.max(m186524e(f, f2), 0.6f));
            this.f169300a.setScaleY(Math.max(m186525f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m186532m(boolean z) {
        if (z) {
            if (NullChecker.m82486a(this.f169304e)) {
                this.f169304e.mo45667d();
            }
        } else {
            if (NullChecker.m82486a(this.f169305f)) {
                this.f169305f.mo66555b();
            }
            if (NullChecker.m82486a(this.f169304e)) {
                this.f169304e.mo95927a();
            }
            m186533n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m186533n() {
        if (this.f169300a == null) {
            return;
        }
        if (NullChecker.m82486a(this.f169303d) && this.f169303d.isRunning()) {
            this.f169303d.cancel();
        }
        final float translationX = this.f169300a.getTranslationX();
        final float translationY = this.f169300a.getTranslationY();
        final float scaleX = this.f169300a.getScaleX();
        final float scaleX2 = this.f169300a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qkl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f158147a.m186530k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C20088a());
        this.f169303d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: o */
    public void m186534o(y3h y3hVar) {
        this.f169305f = y3hVar;
    }

    /* JADX INFO: renamed from: l.skl0$a */
    public class C20088a implements Animator.AnimatorListener {
        public C20088a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            skl0.this.f169300a.setTranslationX(0.0f);
            skl0.this.f169300a.setTranslationY(0.0f);
            skl0.this.f169300a.setScaleX(1.0f);
            skl0.this.f169300a.setScaleY(1.0f);
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

    /* JADX INFO: renamed from: g */
    public float m186526g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m186527h(float f, float f2) {
        return f2;
    }
}
