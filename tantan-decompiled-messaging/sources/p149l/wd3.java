package p149l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class wd3 extends aq2 {

    /* JADX INFO: renamed from: f */
    public long f185754f;

    /* JADX INFO: renamed from: g */
    public long f185755g;

    /* JADX INFO: renamed from: h */
    public float f185756h;

    /* JADX INFO: renamed from: l.wd3$a */
    public static class C20853a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f185757a = d8c0.f84856k;

        /* JADX INFO: renamed from: b */
        public boolean f185758b = true;

        /* JADX INFO: renamed from: c */
        public float f185759c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f185760d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f185761e = null;

        /* JADX INFO: renamed from: f */
        public long f185762f = 220;

        /* JADX INFO: renamed from: g */
        public long f185763g = 180;

        /* JADX INFO: renamed from: b */
        public static C20853a m202709b() {
            return new C20853a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m202710a() {
            wd3 wd3Var = new wd3();
            long j = this.f185762f;
            if (j > 0) {
                wd3Var.f185754f = j;
            }
            long j2 = this.f185763g;
            if (j2 > 0) {
                wd3Var.f185755g = j2;
            }
            return wd3Var.m98223i(this.f185759c).m98224j(this.f185758b).m98225k(this.f185760d).m98227m(this.f185761e).m98226l(this.f185757a);
        }

        /* JADX INFO: renamed from: c */
        public C20853a m202711c(float f) {
            this.f185759c = f;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20853a m202712d(boolean z) {
            this.f185758b = z;
            return this;
        }
    }

    public wd3() {
        this.f185754f = 220L;
        this.f185755g = 180L;
        this.f185756h = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m202701n(View view, ValueAnimator valueAnimator) {
        if (view != null) {
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * view.getHeight());
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m202703p(View view) {
        if (view != null) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo98216b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f185755g);
        valueAnimatorOfFloat.setInterpolator(new kxb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sd3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wd3.m202701n(view, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.td3
            @Override // java.lang.Runnable
            public final void run() {
                wd3.m202703p(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo98217c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(this.f185754f);
        valueAnimatorOfFloat.setInterpolator(new kxb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ud3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f175893a.m202707t(view, valueAnimator);
            }
        });
        bt0.m103749v(valueAnimatorOfFloat, new Runnable() { // from class: l.vd3
            @Override // java.lang.Runnable
            public final void run() {
                this.f181010a.m202708u(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.aq2
    /* JADX INFO: renamed from: f */
    public int mo98220f() {
        return 80;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m202707t(View view, ValueAnimator valueAnimator) {
        int height;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getHeight() == 0) {
            height = xdl0.m208408w0() == 0 ? xdl0.m208407w(500.0f) : xdl0.m208408w0() / 2;
        } else {
            height = view.getHeight();
        }
        float fMin = Math.min(this.f185756h, height);
        this.f185756h = fMin;
        view.setTranslationY(fFloatValue * fMin);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m202708u(View view) {
        this.f185756h = xdl0.m208408w0();
        view.setTranslationY(xdl0.m208408w0());
    }
}
