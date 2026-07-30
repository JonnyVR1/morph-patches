package p007l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class obl0 {

    /* JADX INFO: renamed from: a */
    public View f11410a;

    /* JADX INFO: renamed from: b */
    public int f11411b = xdl0.w0();

    /* JADX INFO: renamed from: c */
    public int f11412c = xdl0.y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f11413d;

    /* JADX INFO: renamed from: e */
    public k2h f11414e;

    /* JADX INFO: renamed from: f */
    public j2h f11415f;

    /* JADX INFO: renamed from: l.obl0$b */
    public class C2449b extends AnimatorListenerAdapter {
        public C2449b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (obl0.this.f11410a.getContext() instanceof Act) {
                Act context = obl0.this.f11410a.getContext();
                obl0.this.m12524m(true);
                context.overridePendingTransition(0, 0);
            }
        }
    }

    public obl0(View view, k2h k2hVar) {
        this.f11410a = view;
        this.f11414e = k2hVar;
    }

    /* JADX INFO: renamed from: d */
    public void m12515d() {
        ValueAnimator valueAnimatorOfInt;
        if (m12520i() == 0) {
            m12524m(true);
            return;
        }
        View view = this.f11410a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f11410a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f11410a, "alpha", 1.0f, 0.0f);
        if (this.f11410a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(this.f11410a.getContext().decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kbl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9670a.m12521j(valueAnimator);
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
        animatorSet.addListener(new C2449b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m12516e(float f, float f2) {
        float f3;
        int i = this.f11411b;
        float f4 = i / (i + f2);
        if (this.f11410a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f11412c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: f */
    public float m12517f(float f, float f2) {
        float f3;
        int i = this.f11411b;
        float f4 = i / (i + f2);
        if (this.f11410a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f11412c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: i */
    public final int m12520i() {
        if (NullChecker.a(this.f11410a) && (this.f11410a.getContext() instanceof FeedVideoFlowAct)) {
            return ((FeedVideoFlowAct) this.f11410a.getContext()).m7348c2();
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m12521j(ValueAnimator valueAnimator) {
        this.f11410a.getContext().decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m12522k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f11410a.setTranslationX(animatedFraction);
        this.f11410a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f11410a.setScaleX(animatedFraction3);
        this.f11410a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m12523l(float f, float f2) {
        if (NullChecker.a(this.f11415f)) {
            this.f11415f.mo6479a(f, f2);
        }
        if (NullChecker.a(this.f11414e)) {
            this.f11414e.c(f, f2);
        }
        if (NullChecker.a(this.f11410a)) {
            this.f11410a.setTranslationX(m12518g(f, f2));
            this.f11410a.setTranslationY(m12519h(f, f2));
            this.f11410a.setScaleX(Math.max(m12516e(f, f2), 0.6f));
            this.f11410a.setScaleY(Math.max(m12517f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12524m(boolean z) {
        if (z) {
            if (NullChecker.a(this.f11414e)) {
                this.f11414e.d();
            }
        } else {
            if (NullChecker.a(this.f11415f)) {
                this.f11415f.mo6480b();
            }
            if (NullChecker.a(this.f11414e)) {
                this.f11414e.mo11385a();
            }
            m12525n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12525n() {
        if (this.f11410a == null) {
            return;
        }
        if (NullChecker.a(this.f11413d) && this.f11413d.isRunning()) {
            this.f11413d.cancel();
        }
        final float translationX = this.f11410a.getTranslationX();
        final float translationY = this.f11410a.getTranslationY();
        final float scaleX = this.f11410a.getScaleX();
        final float scaleX2 = this.f11410a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mbl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10416a.m12522k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C2448a());
        this.f11413d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: o */
    public void m12526o(j2h j2hVar) {
        this.f11415f = j2hVar;
    }

    /* JADX INFO: renamed from: l.obl0$a */
    public class C2448a implements Animator.AnimatorListener {
        public C2448a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            obl0.this.f11410a.setTranslationX(0.0f);
            obl0.this.f11410a.setTranslationY(0.0f);
            obl0.this.f11410a.setScaleX(1.0f);
            obl0.this.f11410a.setScaleY(1.0f);
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
    public float m12518g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m12519h(float f, float f2) {
        return f2;
    }
}
