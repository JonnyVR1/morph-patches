package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class wn4 extends aq2 {

    /* JADX INFO: renamed from: l.wn4$a */
    public static class C20920a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f187246a = d8c0.f84856k;

        /* JADX INFO: renamed from: b */
        public boolean f187247b = true;

        /* JADX INFO: renamed from: c */
        public float f187248c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f187249d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f187250e = null;

        /* JADX INFO: renamed from: b */
        public static C20920a m204599b() {
            return new C20920a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m204600a() {
            return new wn4().m98223i(this.f187248c).m98224j(this.f187247b).m98225k(this.f187249d).m98227m(this.f187250e).m98226l(this.f187246a);
        }

        /* JADX INFO: renamed from: c */
        public C20920a m204601c(float f) {
            this.f187248c = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m204597o(View view, ValueAnimator valueAnimator) {
        if (view.getVisibility() != 0) {
            xdl0.m208344M(view, true);
        }
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo98216b(final View view) {
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

    @Override // p149l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo98217c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tn4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wn4.m204597o(view, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.un4
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, false);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: f */
    public int mo98220f() {
        return 17;
    }

    public wn4() {
    }
}
