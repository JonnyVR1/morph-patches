package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes9.dex */
public interface h2v {

    /* JADX INFO: renamed from: t0 */
    public static final ValueAnimator f107593t0 = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* JADX INFO: renamed from: u0 */
    public static final ValueAnimator f107594u0 = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* JADX INFO: renamed from: l.h2v$a */
    public class C17375a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f107595a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f107596b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ y20 f107597c;

        public C17375a(y20 y20Var, int i, y20 y20Var2) {
            this.f107595a = y20Var;
            this.f107596b = i;
            this.f107597c = y20Var2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f107595a.call(Integer.valueOf(this.f107596b));
            this.f107597c.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: l.h2v$b */
    public class C17376b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f107599a;

        public C17376b(y20 y20Var) {
            this.f107599a = y20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f107599a.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m133406G(y20 y20Var, y20 y20Var2, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        y20Var.call(Float.valueOf(1.0f - animatedFraction));
        y20Var2.call(Integer.valueOf(i - ((int) (i2 * animatedFraction))));
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ void m133407N(y20 y20Var, y20 y20Var2, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        y20Var.call(Float.valueOf(animatedFraction));
        y20Var2.call(Integer.valueOf(i + ((int) (i2 * animatedFraction))));
    }

    /* JADX INFO: renamed from: C */
    Animator mo72220C(h2v h2vVar, boolean z);

    /* JADX INFO: renamed from: E */
    Animator mo72221E(h2v h2vVar, boolean z);

    /* JADX INFO: renamed from: F */
    void mo72222F();

    /* JADX INFO: renamed from: K */
    int mo72223K(boolean z);

    /* JADX INFO: renamed from: j */
    void mo72228j();

    /* JADX INFO: renamed from: l */
    default void m133408l(int i, final int i2, final y20<Float> y20Var, final y20<Integer> y20Var2, y20<Boolean> y20Var3) {
        final int i3 = i - i2;
        if (i3 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = f107594u0;
        if (valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator2 = f107593t0;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g2v
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    h2v.m133407N(y20Var, y20Var2, i2, i3, valueAnimator3);
                }
            });
            valueAnimator.addListener(new C17376b(y20Var3));
            valueAnimator.setInterpolator(new AccelerateInterpolator());
            valueAnimator.setDuration(350L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: u */
    int mo72229u(boolean z);

    /* JADX INFO: renamed from: w */
    default void m133409w(final int i, int i2, final y20<Float> y20Var, final y20<Integer> y20Var2, y20<Boolean> y20Var3) {
        final int i3 = i - i2;
        if (i3 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = f107593t0;
        if (valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator2 = f107594u0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f2v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                h2v.m133406G(y20Var, y20Var2, i, i3, valueAnimator3);
            }
        });
        valueAnimator.addListener(new C17375a(y20Var2, i2, y20Var3));
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(350L);
        valueAnimator.start();
    }
}
