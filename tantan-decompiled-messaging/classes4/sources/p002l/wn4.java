package p002l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.annotation.StyleRes;
import l.bt0;
import l.e30;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wn4 extends aq2 {

    /* JADX INFO: renamed from: l.wn4$a */
    public static class C0887a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f21876a = d8c0.f9106k;

        /* JADX INFO: renamed from: b */
        public boolean f21877b = true;

        /* JADX INFO: renamed from: c */
        public float f21878c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f21879d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f21880e = null;

        /* JADX INFO: renamed from: b */
        public static C0887a m25251b() {
            return new C0887a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m25252a() {
            return new wn4().m10027i(this.f21878c).m10028j(this.f21877b).m10029k(this.f21879d).m10031m(this.f21880e).m10030l(this.f21876a);
        }

        /* JADX INFO: renamed from: c */
        public C0887a m25253c(float f) {
            this.f21878c = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m25249o(View view, ValueAnimator valueAnimator) {
        if (view.getVisibility() != 0) {
            xdl0.M(view, true);
        }
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo10020b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vn4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo10021c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tn4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wn4.m25249o(view, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.un4
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, false);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: f */
    public int mo10024f() {
        return 17;
    }

    public wn4() {
    }
}
