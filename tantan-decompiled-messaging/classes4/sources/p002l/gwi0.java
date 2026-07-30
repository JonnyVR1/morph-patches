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
public class gwi0 extends aq2 {

    /* JADX INFO: renamed from: f */
    public float f11648f;

    /* JADX INFO: renamed from: l.gwi0$a */
    public static class C0598a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f11649a = d8c0.f9106k;

        /* JADX INFO: renamed from: b */
        public boolean f11650b = true;

        /* JADX INFO: renamed from: c */
        public float f11651c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f11652d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f11653e = null;

        /* JADX INFO: renamed from: b */
        public static C0598a m14065b() {
            return new C0598a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m14066a() {
            return new gwi0().m10027i(this.f11651c).m10028j(this.f11650b).m10029k(this.f11652d).m10031m(this.f11653e).m10030l(this.f11649a);
        }

        /* JADX INFO: renamed from: c */
        public C0598a m14067c(e30<Window> e30Var) {
            this.f11653e = e30Var;
            return this;
        }
    }

    public gwi0() {
        this.f11648f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m14063r(View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fMax = Math.max(this.f11648f, -(view.getHeight() == 0 ? xdl0.w0() : view.getHeight()));
        this.f11648f = fMax;
        view.setTranslationY(fFloatValue * fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m14064s(View view) {
        this.f11648f = -xdl0.w0();
        view.setTranslationY(-xdl0.w0());
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo10020b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ewi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                view2.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * view2.getHeight());
            }
        });
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.fwi0
            @Override // java.lang.Runnable
            public final void run() {
                view.setTranslationY(0.0f);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo10021c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cwi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f8961a.m14063r(view, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.dwi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9462a.m14064s(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: f */
    public int mo10024f() {
        return 48;
    }
}
