package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class vo4 extends rq2 {

    /* JADX INFO: renamed from: l.vo4$a */
    public static class C20872a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f184993a = jgc0.f120704k;

        /* JADX INFO: renamed from: b */
        public boolean f184994b = true;

        /* JADX INFO: renamed from: c */
        public float f184995c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f184996d = false;

        /* JADX INFO: renamed from: e */
        public y20<Window> f184997e = null;

        /* JADX INFO: renamed from: b */
        public static C20872a m202073b() {
            return new C20872a();
        }

        /* JADX INFO: renamed from: a */
        public rq2 m202074a() {
            return new vo4().m182595i(this.f184995c).m182596j(this.f184994b).m182597k(this.f184996d).m182599m(this.f184997e).m182598l(this.f184993a);
        }

        /* JADX INFO: renamed from: c */
        public C20872a m202075c(float f) {
            this.f184995c = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m202071o(View view, ValueAnimator valueAnimator) {
        if (view.getVisibility() != 0) {
            bnl0.m105524M(view, true);
        }
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo148405b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.uo4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo148406c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.so4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                vo4.m202071o(view, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.to4
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, false);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: f */
    public int mo148407f() {
        return 17;
    }

    public vo4() {
    }
}
