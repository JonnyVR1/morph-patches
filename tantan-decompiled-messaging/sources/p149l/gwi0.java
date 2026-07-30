package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class gwi0 extends aq2 {

    /* JADX INFO: renamed from: f */
    public float f104709f;

    /* JADX INFO: renamed from: l.gwi0$a */
    public static class C17180a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f104710a = d8c0.f84856k;

        /* JADX INFO: renamed from: b */
        public boolean f104711b = true;

        /* JADX INFO: renamed from: c */
        public float f104712c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f104713d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f104714e = null;

        /* JADX INFO: renamed from: b */
        public static C17180a m128420b() {
            return new C17180a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m128421a() {
            return new gwi0().m98223i(this.f104712c).m98224j(this.f104711b).m98225k(this.f104713d).m98227m(this.f104714e).m98226l(this.f104710a);
        }

        /* JADX INFO: renamed from: c */
        public C17180a m128422c(e30<Window> e30Var) {
            this.f104714e = e30Var;
            return this;
        }
    }

    public gwi0() {
        this.f104709f = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m128418r(View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fMax = Math.max(this.f104709f, -(view.getHeight() == 0 ? xdl0.m208408w0() : view.getHeight()));
        this.f104709f = fMax;
        view.setTranslationY(fFloatValue * fMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m128419s(View view) {
        this.f104709f = -xdl0.m208408w0();
        view.setTranslationY(-xdl0.m208408w0());
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo98216b(final View view) {
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
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.fwi0
            @Override // java.lang.Runnable
            public final void run() {
                view.setTranslationY(0.0f);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo98217c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cwi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f82796a.m128418r(view, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.dwi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88181a.m128419s(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: f */
    public int mo98220f() {
        return 48;
    }
}
