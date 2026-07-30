package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class obl0 {

    /* JADX INFO: renamed from: a */
    public View f142958a;

    /* JADX INFO: renamed from: b */
    public int f142959b = xdl0.m208408w0();

    /* JADX INFO: renamed from: c */
    public int f142960c = xdl0.m208412y0();

    /* JADX INFO: renamed from: d */
    public ValueAnimator f142961d;

    /* JADX INFO: renamed from: e */
    public k2h f142962e;

    /* JADX INFO: renamed from: f */
    public j2h f142963f;

    /* JADX INFO: renamed from: l.obl0$b */
    public class C18888b extends AnimatorListenerAdapter {
        public C18888b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (obl0.this.f142958a.getContext() instanceof Act) {
                Act act = (Act) obl0.this.f142958a.getContext();
                obl0.this.m163458m(true);
                act.overridePendingTransition(0, 0);
            }
        }
    }

    public obl0(View view, k2h k2hVar) {
        this.f142958a = view;
        this.f142962e = k2hVar;
    }

    /* JADX INFO: renamed from: d */
    public void m163449d() {
        ValueAnimator valueAnimatorOfInt;
        if (m163454i() == 0) {
            m163458m(true);
            return;
        }
        View view = this.f142958a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 0.0f);
        View view2 = this.f142958a;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", view2.getScaleY(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f142958a, "alpha", 1.0f, 0.0f);
        if (this.f142958a.getContext() instanceof Act) {
            valueAnimatorOfInt = ValueAnimator.ofInt(((Act) this.f142958a.getContext()).decorOrSwipingDecorView().getBackground().getAlpha(), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kbl0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f122251a.m163455j(valueAnimator);
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
        animatorSet.addListener(new C18888b());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e */
    public float m163450e(float f, float f2) {
        float f3;
        int i = this.f142959b;
        float f4 = i / (i + f2);
        if (this.f142958a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f142960c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: f */
    public float m163451f(float f, float f2) {
        float f3;
        int i = this.f142959b;
        float f4 = i / (i + f2);
        if (this.f142958a.getContext() instanceof FeedVideoFlowAct) {
            int i2 = this.f142960c;
            f3 = i2 / (i2 + (f * 2.0f));
        } else {
            f3 = 2.1474836E9f;
        }
        return Math.min(f4, f3);
    }

    /* JADX INFO: renamed from: i */
    public final int m163454i() {
        if (NullChecker.m81303a(this.f142958a) && (this.f142958a.getContext() instanceof FeedVideoFlowAct)) {
            return ((FeedVideoFlowAct) this.f142958a.getContext()).m66190c2();
        }
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m163455j(ValueAnimator valueAnimator) {
        ((Act) this.f142958a.getContext()).decorOrSwipingDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m163456k(float f, float f2, float f3, ValueAnimator valueAnimator, float f4, ValueAnimator valueAnimator2) {
        float animatedFraction = f - (valueAnimator2.getAnimatedFraction() * f);
        float animatedFraction2 = f2 - (valueAnimator2.getAnimatedFraction() * f2);
        this.f142958a.setTranslationX(animatedFraction);
        this.f142958a.setTranslationY(animatedFraction2);
        float animatedFraction3 = f3 + ((1.0f - f3) * valueAnimator.getAnimatedFraction());
        float animatedFraction4 = f4 + ((1.0f - f4) * valueAnimator.getAnimatedFraction());
        this.f142958a.setScaleX(animatedFraction3);
        this.f142958a.setScaleY(animatedFraction4);
    }

    /* JADX INFO: renamed from: l */
    public void m163457l(float f, float f2) {
        if (NullChecker.m81303a(this.f142963f)) {
            this.f142963f.mo65371a(f, f2);
        }
        if (NullChecker.m81303a(this.f142962e)) {
            this.f142962e.mo44483c(f, f2);
        }
        if (NullChecker.m81303a(this.f142958a)) {
            this.f142958a.setTranslationX(m163452g(f, f2));
            this.f142958a.setTranslationY(m163453h(f, f2));
            this.f142958a.setScaleX(Math.max(m163450e(f, f2), 0.6f));
            this.f142958a.setScaleY(Math.max(m163451f(f, f2), 0.6f));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m163458m(boolean z) {
        if (z) {
            if (NullChecker.m81303a(this.f142962e)) {
                this.f142962e.mo44484d();
            }
        } else {
            if (NullChecker.m81303a(this.f142963f)) {
                this.f142963f.mo65372b();
            }
            if (NullChecker.m81303a(this.f142962e)) {
                this.f142962e.mo144302a();
            }
            m163459n();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m163459n() {
        if (this.f142958a == null) {
            return;
        }
        if (NullChecker.m81303a(this.f142961d) && this.f142961d.isRunning()) {
            this.f142961d.cancel();
        }
        final float translationX = this.f142958a.getTranslationX();
        final float translationY = this.f142958a.getTranslationY();
        final float scaleX = this.f142958a.getScaleX();
        final float scaleX2 = this.f142958a.getScaleX();
        if (translationX == 0.0f && translationY == 0.0f) {
            return;
        }
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(100L);
        duration.setInterpolator(new AccelerateInterpolator(2.0f));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mbl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f133036a.m163456k(translationX, translationY, scaleX, duration, scaleX2, valueAnimator);
            }
        });
        duration.addListener(new C18887a());
        this.f142961d = duration;
        duration.start();
    }

    /* JADX INFO: renamed from: o */
    public void m163460o(j2h j2hVar) {
        this.f142963f = j2hVar;
    }

    /* JADX INFO: renamed from: l.obl0$a */
    public class C18887a implements Animator.AnimatorListener {
        public C18887a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            obl0.this.f142958a.setTranslationX(0.0f);
            obl0.this.f142958a.setTranslationY(0.0f);
            obl0.this.f142958a.setScaleX(1.0f);
            obl0.this.f142958a.setScaleY(1.0f);
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
    public float m163452g(float f, float f2) {
        return f;
    }

    /* JADX INFO: renamed from: h */
    public float m163453h(float f, float f2) {
        return f2;
    }
}
