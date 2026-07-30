package p153l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes4.dex */
public class le3 extends rq2 {

    /* JADX INFO: renamed from: f */
    public long f131701f;

    /* JADX INFO: renamed from: g */
    public long f131702g;

    /* JADX INFO: renamed from: h */
    public float f131703h;

    /* JADX INFO: renamed from: l.le3$a */
    public static class C18383a {

        /* JADX INFO: renamed from: a */
        @StyleRes
        public int f131704a = jgc0.f120704k;

        /* JADX INFO: renamed from: b */
        public boolean f131705b = true;

        /* JADX INFO: renamed from: c */
        public float f131706c = -1.0f;

        /* JADX INFO: renamed from: d */
        public boolean f131707d = false;

        /* JADX INFO: renamed from: e */
        public y20<Window> f131708e = null;

        /* JADX INFO: renamed from: f */
        public long f131709f = 220;

        /* JADX INFO: renamed from: g */
        public long f131710g = 180;

        /* JADX INFO: renamed from: b */
        public static C18383a m153874b() {
            return new C18383a();
        }

        /* JADX INFO: renamed from: a */
        public rq2 m153875a() {
            le3 le3Var = new le3();
            long j = this.f131709f;
            if (j > 0) {
                le3Var.f131701f = j;
            }
            long j2 = this.f131710g;
            if (j2 > 0) {
                le3Var.f131702g = j2;
            }
            return le3Var.m182595i(this.f131706c).m182596j(this.f131705b).m182597k(this.f131707d).m182599m(this.f131708e).m182598l(this.f131704a);
        }

        /* JADX INFO: renamed from: c */
        public C18383a m153876c(float f) {
            this.f131706c = f;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18383a m153877d(boolean z) {
            this.f131705b = z;
            return this;
        }
    }

    public le3() {
        this.f131701f = 220L;
        this.f131702g = 180L;
        this.f131703h = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m153866n(View view, ValueAnimator valueAnimator) {
        if (view != null) {
            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * view.getHeight());
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m153868p(View view) {
        if (view != null) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: b */
    public ValueAnimator mo148405b(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f131702g);
        valueAnimatorOfFloat.setInterpolator(new yyb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.he3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                le3.m153866n(view, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.ie3
            @Override // java.lang.Runnable
            public final void run() {
                le3.m153868p(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: c */
    public ValueAnimator mo148406c(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(this.f131701f);
        valueAnimatorOfFloat.setInterpolator(new yyb());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.je3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f120388a.m153872t(view, valueAnimator);
            }
        });
        gt0.m132176v(valueAnimatorOfFloat, new Runnable() { // from class: l.ke3
            @Override // java.lang.Runnable
            public final void run() {
                this.f125292a.m153873u(view);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.rq2
    /* JADX INFO: renamed from: f */
    public int mo148407f() {
        return 80;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m153872t(View view, ValueAnimator valueAnimator) {
        int height;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getHeight() == 0) {
            height = bnl0.m105588w0() == 0 ? bnl0.m105587w(500.0f) : bnl0.m105588w0() / 2;
        } else {
            height = view.getHeight();
        }
        float fMin = Math.min(this.f131703h, height);
        this.f131703h = fMin;
        view.setTranslationY(fFloatValue * fMin);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m153873u(View view) {
        this.f131703h = bnl0.m105588w0();
        view.setTranslationY(bnl0.m105588w0());
    }
}
