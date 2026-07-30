package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public interface g0v {

    /* JADX INFO: renamed from: t0 */
    public static final ValueAnimator f100089t0 = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* JADX INFO: renamed from: u0 */
    public static final ValueAnimator f100090u0 = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* JADX INFO: renamed from: l.g0v$a */
    public class C16973a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f100091a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f100092b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e30 f100093c;

        public C16973a(e30 e30Var, int i, e30 e30Var2) {
            this.f100091a = e30Var;
            this.f100092b = i;
            this.f100093c = e30Var2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f100091a.call(Integer.valueOf(this.f100092b));
            this.f100093c.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: l.g0v$b */
    public class C16974b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f100095a;

        public C16974b(e30 e30Var) {
            this.f100095a = e30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f100095a.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m124007G(e30 e30Var, e30 e30Var2, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        e30Var.call(Float.valueOf(1.0f - animatedFraction));
        e30Var2.call(Integer.valueOf(i - ((int) (i2 * animatedFraction))));
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ void m124008N(e30 e30Var, e30 e30Var2, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        e30Var.call(Float.valueOf(animatedFraction));
        e30Var2.call(Integer.valueOf(i + ((int) (i2 * animatedFraction))));
    }

    /* JADX INFO: renamed from: C */
    Animator mo71037C(g0v g0vVar, boolean z);

    /* JADX INFO: renamed from: E */
    Animator mo71038E(g0v g0vVar, boolean z);

    /* JADX INFO: renamed from: F */
    void mo71039F();

    /* JADX INFO: renamed from: K */
    int mo71040K(boolean z);

    /* JADX INFO: renamed from: j */
    void mo71045j();

    /* JADX INFO: renamed from: l */
    default void m124009l(int i, final int i2, final e30<Float> e30Var, final e30<Integer> e30Var2, e30<Boolean> e30Var3) {
        final int i3 = i - i2;
        if (i3 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = f100090u0;
        if (valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator2 = f100089t0;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f0v
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    g0v.m124008N(e30Var, e30Var2, i2, i3, valueAnimator3);
                }
            });
            valueAnimator.addListener(new C16974b(e30Var3));
            valueAnimator.setInterpolator(new AccelerateInterpolator());
            valueAnimator.setDuration(350L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: u */
    int mo71046u(boolean z);

    /* JADX INFO: renamed from: w */
    default void m124010w(final int i, int i2, final e30<Float> e30Var, final e30<Integer> e30Var2, e30<Boolean> e30Var3) {
        final int i3 = i - i2;
        if (i3 <= 0) {
            return;
        }
        ValueAnimator valueAnimator = f100089t0;
        if (valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator2 = f100090u0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.e0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                g0v.m124007G(e30Var, e30Var2, i, i3, valueAnimator3);
            }
        });
        valueAnimator.addListener(new C16973a(e30Var2, i2, e30Var3));
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(350L);
        valueAnimator.start();
    }
}
