package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class k5j0 extends rq2 {

    /* JADX INFO: renamed from: f */
    public float f124071f;

    /* JADX INFO: renamed from: l.k5j0$a */
    public static class C18103a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f124072a = jgc0.f120704k;

        /* JADX INFO: renamed from: b */
        public boolean f124073b = true;

        /* JADX INFO: renamed from: c */
        public float f124074c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f124075d = false;

        /* JADX INFO: renamed from: e */
        public y20<Window> f124076e = null;

        /* JADX INFO: renamed from: b */
        public static C18103a m148408b() {
            return new C18103a();
        }

        /* JADX INFO: renamed from: a */
        public rq2 m148409a() {
            return new k5j0().m182595i(this.f124074c).m182596j(this.f124073b).m182597k(this.f124075d).m182599m(this.f124076e).m182598l(this.f124072a);
        }

        /* JADX INFO: renamed from: c */
        public C18103a m148410c(y20<Window> y20Var) {
            this.f124076e = y20Var;
            return this;
        }
    }

    public k5j0() {
        this.f124071f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m148403r(View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fMax = Math.max(this.f124071f, -(view.getHeight() == 0 ? bnl0.m105588w0() : view.getHeight()));
        this.f124071f = fMax;
        view.setTranslationY(fFloatValue * fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m148404s(View view) {
        this.f124071f = -bnl0.m105588w0();
        view.setTranslationY(-bnl0.m105588w0());
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo148405b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i5j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                view2.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * view2.getHeight());
            }
        });
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.j5j0
            @Override // java.lang.Runnable
            public final void run() {
                view.setTranslationY(0.0f);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo148406c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.g5j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f102334a.m148403r(view, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.h5j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107948a.m148404s(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: f */
    public int mo148407f() {
        return 48;
    }
}
