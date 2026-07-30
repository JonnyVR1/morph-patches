package p002l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;
import l.bt0;
import l.e30;
import l.kxb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wd3 extends aq2 {

    /* JADX INFO: renamed from: f */
    public long f21644f;

    /* JADX INFO: renamed from: g */
    public long f21645g;

    /* JADX INFO: renamed from: h */
    public float f21646h;

    /* JADX INFO: renamed from: l.wd3$a */
    public static class C0879a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f21647a = d8c0.f9106k;

        /* JADX INFO: renamed from: b */
        public boolean f21648b = true;

        /* JADX INFO: renamed from: c */
        public float f21649c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f21650d = false;

        /* JADX INFO: renamed from: e */
        public e30<Window> f21651e = null;

        /* JADX INFO: renamed from: f */
        public long f21652f = 220;

        /* JADX INFO: renamed from: g */
        public long f21653g = 180;

        /* JADX INFO: renamed from: b */
        public static C0879a m24518b() {
            return new C0879a();
        }

        /* JADX INFO: renamed from: a */
        public aq2 m24519a() {
            wd3 wd3Var = new wd3();
            long j = this.f21652f;
            if (j > 0) {
                wd3Var.f21644f = j;
            }
            long j2 = this.f21653g;
            if (j2 > 0) {
                wd3Var.f21645g = j2;
            }
            return wd3Var.m10027i(this.f21649c).m10028j(this.f21648b).m10029k(this.f21650d).m10031m(this.f21651e).m10030l(this.f21647a);
        }

        /* JADX INFO: renamed from: c */
        public C0879a m24520c(float f) {
            this.f21649c = f;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0879a m24521d(boolean z) {
            this.f21648b = z;
            return this;
        }
    }

    public wd3() {
        this.f21644f = 220L;
        this.f21645g = 180L;
        this.f21646h = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m24510n(View view, ValueAnimator valueAnimator) {
        if (view != null) {
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * view.getHeight());
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24512p(View view) {
        if (view != null) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo10020b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f21645g);
        valueAnimatorOfFloat.setInterpolator(new kxb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sd3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                wd3.m24510n(view, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.td3
            @Override // java.lang.Runnable
            public final void run() {
                wd3.m24512p(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo10021c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(this.f21644f);
        valueAnimatorOfFloat.setInterpolator(new kxb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ud3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20591a.m24516t(view, valueAnimator);
            }
        });
        bt0.v(valueAnimatorOfFloat, new Runnable() { // from class: l.vd3
            @Override // java.lang.Runnable
            public final void run() {
                this.f21076a.m24517u(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p002l.aq2
    /* JADX INFO: renamed from: f */
    public int mo10024f() {
        return 80;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m24516t(View view, ValueAnimator valueAnimator) {
        int height;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getHeight() == 0) {
            height = xdl0.w0() == 0 ? xdl0.w(500.0f) : xdl0.w0() / 2;
        } else {
            height = view.getHeight();
        }
        float fMin = Math.min(this.f21646h, height);
        this.f21646h = fMin;
        view.setTranslationY(fFloatValue * fMin);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m24517u(View view) {
        this.f21646h = xdl0.w0();
        view.setTranslationY(xdl0.w0());
    }
}
