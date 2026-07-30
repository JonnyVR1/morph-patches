package p002l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Objects;
import l.bt0;
import l.dug0;
import l.e30;
import l.gug0;
import l.hug0;
import l.j760;
import l.lra0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xij0;
import org.jetbrains.annotations.NotNull;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lf90<V extends View> extends Act.w<Act, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final V f14824a;

    /* JADX INFO: renamed from: b */
    public final e30<Boolean> f14825b;

    /* JADX INFO: renamed from: c */
    public float f14826c = -1.0f;

    /* JADX INFO: renamed from: l.lf90$a */
    public class C0659a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f14827a = false;

        /* JADX INFO: renamed from: b */
        public int f14828b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f14829c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f14830d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f14831e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f14832f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Animator f14833g;

        public C0659a(int i, int i2, j760 j760Var, int i3, Animator animator) {
            this.f14829c = i;
            this.f14830d = i2;
            this.f14831e = j760Var;
            this.f14832f = i3;
            this.f14833g = animator;
            this.f14828b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f14830d;
            RecyclerView recyclerViewMo2724W = ((x0m) this.f14831e.b).mo2724W();
            if (this.f14827a) {
                return;
            }
            recyclerViewMo2724W.scrollBy(0, (-this.f14828b) + iIntValue);
            this.f14828b = iIntValue;
            if (i <= this.f14830d) {
                Animator animatorM17190C = lf90.this.m17190C(this.f14831e, this.f14832f);
                Animator animator = this.f14833g;
                Objects.requireNonNull(animator);
                bt0.f(animatorM17190C, new hug0(animator));
                animatorM17190C.start();
                this.f14827a = true;
            }
        }
    }

    public lf90(V v, final e30<Boolean> e30Var) {
        this.f14824a = v;
        this.f14825b = new e30() { // from class: l.ef90
            public final void call(Object obj) {
                lf90.m17180l(e30Var, (Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m17178j(j760 j760Var) {
        ((x0m) j760Var.b).mo2606F().setScaleX(0.1f);
        ((x0m) j760Var.b).mo2606F().setScaleY(0.1f);
        ((x0m) j760Var.b).mo2606F().setPivotY(0.0f);
        xdl0.M0(((x0m) j760Var.b).mo2606F(), true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m17179k(PictureView pictureView) {
        if ((pictureView.G instanceof Video) && xij0.d0()) {
            pictureView.V();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m17180l(e30 e30Var, Boolean bool) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m17181m(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: s */
    private Animator m17185s(x0m x0mVar) {
        Animator animatorJ = bt0.j(0);
        x0mVar.mo2606F();
        return animatorJ;
    }

    /* JADX INFO: renamed from: v */
    private int m17186v() {
        float f = this.f14826c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: w */
    private int m17187w() {
        float f = this.f14826c;
        if (f != -1.0f) {
            return (int) (f * 400.0f);
        }
        return 400;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m17188A(final j760 j760Var, final PictureView pictureView) {
        ((Act) j760Var.a).post(new Runnable() { // from class: l.hf90
            @Override // java.lang.Runnable
            public final void run() {
                lf90.m17179k(pictureView);
            }
        });
        ((x0m) j760Var.b).mo2835o2();
        if (((x0m) j760Var.b).mo2679Q()) {
            Animator animatorP = bt0.p(((x0m) j760Var.b).mo2606F(), "alpha", 0L, m17187w(), bt0.d, new float[]{0.0f, 1.0f});
            View viewMo2606F = ((x0m) j760Var.b).mo2606F();
            long jM17187w = m17187w();
            Interpolator interpolator = bt0.e;
            bt0.v(bt0.z(new Animator[]{bt0.p(viewMo2606F, "scaleX", 0L, jM17187w, interpolator, new float[]{0.1f, 1.0f}), bt0.p(((x0m) j760Var.b).mo2606F(), "scaleY", 0L, m17187w(), interpolator, new float[]{0.1f, 1.0f}), animatorP}), new Runnable() { // from class: l.if90
                @Override // java.lang.Runnable
                public final void run() {
                    lf90.m17178j(j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m17189B() {
        this.f14825b.call(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final Animator m17190C(j760<Act, x0m> j760Var, int i) {
        float f;
        float f2;
        final PictureView pictureViewMo2708U0 = ((x0m) j760Var.b).mo2708U0();
        xdl0.g gVarI0 = xdl0.i0(this.f14824a);
        xdl0.g gVarI1 = xdl0.i0(pictureViewMo2708U0);
        xdl0.g gVarI2 = xdl0.i0(((x0m) j760Var.b).mo1577p());
        int iD = (gVarI2.d - (((x0m) j760Var.b).mo2707U().b - gVarI2.b)) + t100.d(30.0f);
        int i2 = xdl0.i0(((x0m) j760Var.b).mo2833o0()).a;
        float f3 = (gVarI0.c * 1.0f) / gVarI1.c;
        float f4 = (gVarI0.d * 1.0f) / gVarI1.d;
        float fMax = Math.max(f3, f4);
        final int i3 = (int) (((gVarI1.c * fMax) - gVarI0.c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.n(pictureViewMo2708U0, bt0.i, new float[]{fMax});
        int i4 = gVarI0.a;
        if (f4 >= f3) {
            f2 = (i4 - gVarI1.a) - (((gVarI1.c * fMax) - gVarI0.c) / 2.0f);
            f = gVarI0.b - gVarI1.b;
        } else {
            float f5 = i4 - gVarI1.a;
            f = (gVarI0.b - gVarI1.b) - (((gVarI1.d * f3) - gVarI0.d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jf90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                lf90.m17181m(i3, pictureViewMo2708U0, valueAnimator);
            }
        });
        long jM17194q = m17194q();
        Animator animatorM17198x = m17198x((x0m) j760Var.b, m17194q(), iD);
        View viewMo2693S1 = ((x0m) j760Var.b).mo2693S1();
        long jM17186v = m17186v();
        long jM17194q2 = m17194q();
        Interpolator interpolator = bt0.f;
        float f6 = iD;
        Animator animatorS = bt0.s(new Animator[]{bt0.x(jM17194q, new Animator[]{animatorM17198x, bt0.p(viewMo2693S1, "translationY", jM17186v, jM17194q2, interpolator, new float[]{f6}), bt0.p(((x0m) j760Var.b).mo2833o0(), "translationX", m17186v(), m17194q(), interpolator, new float[]{i2}), bt0.p(((x0m) j760Var.b).mo2833o0(), "rotation", m17186v(), m17194q(), interpolator, new float[]{360.0f}), bt0.p(((x0m) j760Var.b).mo2632J(), "translationX", m17186v(), m17194q(), interpolator, new float[]{-i2}), bt0.p(((x0m) j760Var.b).mo2632J(), "rotation", m17186v(), m17194q(), interpolator, new float[]{-360.0f}), bt0.p(((x0m) j760Var.b).mo2680Q2(), "alpha", 0L, 235L, (Interpolator) null, new float[]{0.0f}), lra0.e((x0m) j760Var.b, 0, 235, (Interpolator) null, 0, iD), bt0.p(((x0m) j760Var.b).mo2898y1(), "translationY", 0L, 235L, (Interpolator) null, new float[]{f6}), bt0.p(((x0m) j760Var.b).mo2848q2(), "translationY", 0L, 235L, (Interpolator) null, new float[]{f6}), objectAnimator, bt0.q(pictureViewMo2708U0, "translationX", new float[]{f2}), bt0.q(pictureViewMo2708U0, "translationY", new float[]{f}), bt0.j(10)})});
        x0m x0mVar = (x0m) j760Var.b;
        Objects.requireNonNull(x0mVar);
        bt0.v(animatorS, new gug0(x0mVar));
        bt0.f(animatorS, new Runnable() { // from class: l.kf90
            @Override // java.lang.Runnable
            public final void run() {
                this.f14306a.m17189B();
            }
        });
        return animatorS;
    }

    /* JADX INFO: renamed from: q */
    public final int m17194q() {
        float f = this.f14826c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public View m17191a(ProfileAct profileAct) {
        return profileAct.m1204Y2().mo1577p();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Animator m17192c(Act act, ProfileAct profileAct) {
        final j760<Act, x0m> j760VarM17199y = m17199y(act, profileAct);
        final PictureView pictureViewMo2855r3 = ((x0m) j760VarM17199y.b).mo2855r3(0);
        if (!NullChecker.a(pictureViewMo2855r3)) {
            return null;
        }
        ((Act) j760VarM17199y.a).post(new Runnable() { // from class: l.ff90
            @Override // java.lang.Runnable
            public final void run() {
                this.f10310a.m17200z();
            }
        });
        xdl0.K0(pictureViewMo2855r3, xdl0.i0(this.f14824a), xdl0.i0(pictureViewMo2855r3));
        xdl0.g gVarI0 = xdl0.i0(((x0m) j760VarM17199y.b).mo1577p());
        xdl0.g gVarMo2707U = ((x0m) j760VarM17199y.b).mo2707U();
        xdl0.a0(pictureViewMo2855r3);
        int iD = (gVarI0.d - (gVarMo2707U.b - gVarI0.b)) + t100.d(30.0f);
        int i = xdl0.i0(((x0m) j760VarM17199y.b).mo2833o0()).a;
        Iterator<View> it = ((x0m) j760VarM17199y.b).mo2581B1().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(iD);
        }
        ((x0m) j760VarM17199y.b).mo2833o0().setTranslationX(i);
        ((x0m) j760VarM17199y.b).mo2833o0().setRotation(360.0f);
        ((x0m) j760VarM17199y.b).mo2632J().setTranslationX(-i);
        ((x0m) j760VarM17199y.b).mo2632J().setRotation(-360.0f);
        float f = iD;
        ((x0m) j760VarM17199y.b).mo2693S1().setTranslationY(f);
        ((x0m) j760VarM17199y.b).mo2606F().setTranslationY(0.0f);
        ((x0m) j760VarM17199y.b).mo2898y1().setTranslationY(f);
        ((x0m) j760VarM17199y.b).mo2848q2().setTranslationY(f);
        ((x0m) j760VarM17199y.b).mo2680Q2().setAlpha(0.0f);
        Animator animatorQ = bt0.q(((x0m) j760VarM17199y.b).mo2680Q2(), "alpha", new float[]{1.0f});
        View viewMo2693S1 = ((x0m) j760VarM17199y.b).mo2693S1();
        long jM17186v = m17186v();
        long jM17187w = m17187w();
        Interpolator interpolator = bt0.d;
        Animator animatorP = bt0.p(viewMo2693S1, "translationY", jM17186v, jM17187w, interpolator, new float[]{0.0f});
        Animator animatorM17185s = m17185s((x0m) j760VarM17199y.b);
        Animator animatorP2 = bt0.p(((x0m) j760VarM17199y.b).mo2833o0(), "translationX", m17186v(), m17187w(), interpolator, new float[]{0.0f});
        Animator animatorP3 = bt0.p(((x0m) j760VarM17199y.b).mo2833o0(), "rotation", m17186v(), m17187w(), interpolator, new float[]{0.0f});
        Animator animatorP4 = bt0.p(((x0m) j760VarM17199y.b).mo2632J(), "translationX", m17186v(), m17187w(), interpolator, new float[]{0.0f});
        Animator animatorP5 = bt0.p(((x0m) j760VarM17199y.b).mo2632J(), "rotation", m17186v(), m17187w(), interpolator, new float[]{0.0f});
        x0m x0mVar = (x0m) j760VarM17199y.b;
        int iM17186v = m17186v();
        int iM17194q = m17194q();
        Interpolator interpolator2 = bt0.c;
        Animator animatorE = lra0.e(x0mVar, iM17186v, iM17194q, interpolator2, iD, 0);
        Animator animatorP6 = bt0.p(((x0m) j760VarM17199y.b).mo2898y1(), "translationY", m17186v(), m17194q(), interpolator2, new float[]{0.0f});
        Animator animatorP7 = bt0.p(((x0m) j760VarM17199y.b).mo2848q2(), "translationY", m17186v(), m17194q(), interpolator2, new float[]{0.0f});
        Property property = bt0.i;
        long jM17194q = m17194q();
        Interpolator interpolator3 = bt0.a;
        Animator animatorZ = bt0.z(new Animator[]{animatorQ, animatorP, animatorM17185s, animatorP2, animatorP3, animatorP4, animatorP5, animatorE, animatorP6, animatorP7, bt0.l(pictureViewMo2855r3, property, 0L, jM17194q, interpolator3, new float[]{1.0f}), bt0.p(pictureViewMo2855r3, "translationX", 0L, m17194q(), interpolator3, new float[]{0.0f}), bt0.p(pictureViewMo2855r3, "translationY", 0L, m17194q(), interpolator3, new float[]{0.0f}), bt0.l(((x0m) j760VarM17199y.b).mo2887w3(), bt0.i, 0L, m17194q(), interpolator3, new float[]{1.0f}), bt0.p(((x0m) j760VarM17199y.b).mo2887w3(), "translationX", 0L, m17194q(), interpolator3, new float[]{0.0f}), bt0.p(((x0m) j760VarM17199y.b).mo2887w3(), "translationY", 0L, m17194q(), interpolator3, new float[]{0.0f})});
        if (((x0m) j760VarM17199y.b).mo2679Q()) {
            ((x0m) j760VarM17199y.b).mo2606F().setAlpha(0.0f);
        }
        ((x0m) j760VarM17199y.b).mo2809k3();
        return bt0.f(animatorZ, new Runnable() { // from class: l.gf90
            @Override // java.lang.Runnable
            public final void run() {
                this.f11394a.m17188A(j760VarM17199y, pictureViewMo2855r3);
            }
        });
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Animator m17193d(Act act, ProfileAct profileAct) {
        j760<Act, x0m> j760VarM17199y = m17199y(act, profileAct);
        int iMo2761c0 = ((x0m) j760VarM17199y.b).mo2761c0();
        VPager vPagerMo2873u2 = ((x0m) j760VarM17199y.b).mo2873u2();
        if (vPagerMo2873u2 == null) {
            return null;
        }
        ((x0m) j760VarM17199y.b).mo2873u2().b0();
        xdl0.u(((x0m) j760VarM17199y.b).mo2724W());
        xdl0.v(((x0m) j760VarM17199y.b).mo2873u2());
        LinearLayoutManager layoutManager = ((x0m) j760VarM17199y.b).mo2724W().getLayoutManager();
        ((x0m) j760VarM17199y.b).mo2724W().setClipChildren(false);
        if ((layoutManager instanceof LinearLayoutManager) && vPagerMo2873u2.isAttachedToWindow() && layoutManager.findFirstVisibleItemPosition() == 0) {
            return m17190C(j760VarM17199y, iMo2761c0);
        }
        Animator animatorJ = bt0.j(3000);
        int iY0 = (int) (xdl0.y0() / 0.8f);
        int iMo1562i3 = ((x0m) j760VarM17199y.b).mo1562i3();
        int i = iY0 + iMo1562i3;
        int iM17194q = m17194q();
        float f = iM17194q;
        float f2 = (f - ((int) ((iMo1562i3 / i) * f))) / f;
        this.f14826c = f2;
        if (f2 <= 0.01f) {
            this.f14826c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM17194q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C0659a(i, iY0, j760VarM17199y, iMo2761c0, animatorJ));
        bt0.v(animatorJ, new dug0(valueAnimatorOfInt));
        return animatorJ;
    }

    /* JADX INFO: renamed from: x */
    public final Animator m17198x(x0m x0mVar, int i, int i2) {
        float f;
        View viewMo2606F = x0mVar.mo2606F();
        Animator animatorJ = bt0.j(0);
        if (NullChecker.a(viewMo2606F)) {
            float alpha = viewMo2606F.getAlpha();
            if (alpha < 1.0f) {
                xdl0.M(viewMo2606F, false);
                return bt0.j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewMo2606F.animate();
            if (NullChecker.a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
            f = alpha;
        } else {
            f = 1.0f;
        }
        if (!x0mVar.mo2679Q()) {
            return animatorJ;
        }
        long j = i;
        Interpolator interpolator = bt0.f;
        return bt0.z(new Animator[]{bt0.p(viewMo2606F, "scaleX", 0L, j, interpolator, new float[]{f, 0.1f}), bt0.p(viewMo2606F, "scaleY", 0L, j, interpolator, new float[]{f, 0.1f}), bt0.p(viewMo2606F, "alpha", 0L, j, interpolator, new float[]{f, 0.0f})});
    }

    /* JADX INFO: renamed from: y */
    public j760<Act, x0m> m17199y(Act act, ProfileAct profileAct) {
        return vwb.Y(act, profileAct.m1204Y2());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m17200z() {
        this.f14825b.call(Boolean.FALSE);
    }
}
