package p009l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.bt0;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.x0m;
import l.xdl0;
import l.xij0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class iug0 extends Act.w<SuggestersAct, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f14815a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f14816b;

    /* JADX INFO: renamed from: c */
    public float f14817c = -1.0f;

    /* JADX INFO: renamed from: l.iug0$a */
    public class C0964a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f14818a = false;

        /* JADX INFO: renamed from: b */
        public int f14819b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f14820c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f14821d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f14822e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f14823f;

        public C0964a(int i, int i2, j760 j760Var, Animator animator) {
            this.f14820c = i;
            this.f14821d = i2;
            this.f14822e = j760Var;
            this.f14823f = animator;
            this.f14819b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f14821d;
            RecyclerView recyclerViewW = ((x0m) this.f14822e.b).W();
            if (this.f14818a) {
                return;
            }
            recyclerViewW.scrollBy(0, (-this.f14819b) + iIntValue);
            this.f14819b = iIntValue;
            if (i <= this.f14821d) {
                Animator animatorM16744w = iug0.this.m16744w(this.f14822e);
                Animator animator = this.f14823f;
                Objects.requireNonNull(animator);
                bt0.f(animatorM16744w, new hug0(animator));
                animatorM16744w.start();
                this.f14818a = true;
            }
        }
    }

    public iug0(VDraweeView vDraweeView, LinearLayout linearLayout) {
        this.f14815a = vDraweeView;
        this.f14816b = linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m16727j(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m16728k(PictureView pictureView) {
        if ((pictureView.G instanceof Video) && xij0.d0()) {
            pictureView.V();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m16729l(j760 j760Var, final PictureView pictureView) {
        ((SuggestersAct) j760Var.a).post(new Runnable() { // from class: l.eug0
            @Override // java.lang.Runnable
            public final void run() {
                iug0.m16728k(pictureView);
            }
        });
        ((x0m) j760Var.b).o2();
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public View m16731a(ProfileAct profileAct) {
        return profileAct.Y2().p();
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Animator m16732c(SuggestersAct suggestersAct, ProfileAct profileAct) {
        final j760<SuggestersAct, x0m> j760VarM16742u = m16742u(suggestersAct, profileAct);
        final PictureView pictureViewR3 = ((x0m) j760VarM16742u.b).r3(0);
        if (!NullChecker.a(pictureViewR3)) {
            return null;
        }
        xdl0.K0(pictureViewR3, xdl0.i0(this.f14815a), xdl0.i0(pictureViewR3));
        xdl0.K0(((x0m) j760VarM16742u.b).w3(), xdl0.i0(this.f14816b), xdl0.i0(((x0m) j760VarM16742u.b).w3()));
        xdl0.g gVarI0 = xdl0.i0(((x0m) j760VarM16742u.b).p());
        xdl0.g gVarU = ((x0m) j760VarM16742u.b).U();
        xdl0.a0(pictureViewR3);
        final int iD = (gVarI0.d - (gVarU.b - gVarI0.b)) + t100.d(30.0f);
        int i = xdl0.i0(((x0m) j760VarM16742u.b).o0()).a;
        vwb.z(((x0m) j760VarM16742u.b).B1(), new e30() { // from class: l.bug0
            public final void call(Object obj) {
                ((View) obj).setTranslationY(iD);
            }
        });
        ((x0m) j760VarM16742u.b).o0().setTranslationX(i);
        ((x0m) j760VarM16742u.b).o0().setRotation(360.0f);
        ((x0m) j760VarM16742u.b).J().setTranslationX(-i);
        ((x0m) j760VarM16742u.b).J().setRotation(-360.0f);
        float f = iD;
        ((x0m) j760VarM16742u.b).S1().setTranslationY(f);
        ((x0m) j760VarM16742u.b).y1().setTranslationY(f);
        ((x0m) j760VarM16742u.b).q2().setTranslationY(f);
        ((x0m) j760VarM16742u.b).Q2().setAlpha(0.0f);
        Animator animatorQ = bt0.q(((x0m) j760VarM16742u.b).Q2(), "alpha", new float[]{1.0f});
        View viewS1 = ((x0m) j760VarM16742u.b).S1();
        long jM16739r = m16739r();
        long jM16741t = m16741t();
        Interpolator interpolator = bt0.d;
        Animator animatorP = bt0.p(viewS1, "translationY", jM16739r, jM16741t, interpolator, new float[]{0.0f});
        Animator animatorP2 = bt0.p(((x0m) j760VarM16742u.b).o0(), "translationX", m16739r(), m16741t(), interpolator, new float[]{0.0f});
        Animator animatorP3 = bt0.p(((x0m) j760VarM16742u.b).o0(), "rotation", m16739r(), m16741t(), interpolator, new float[]{0.0f});
        Animator animatorP4 = bt0.p(((x0m) j760VarM16742u.b).J(), "translationX", m16739r(), m16741t(), interpolator, new float[]{0.0f});
        Animator animatorP5 = bt0.p(((x0m) j760VarM16742u.b).J(), "rotation", m16739r(), m16741t(), interpolator, new float[]{0.0f});
        x0m x0mVar = (x0m) j760VarM16742u.b;
        int iM16739r = m16739r();
        int iM16738q = m16738q();
        Interpolator interpolator2 = bt0.c;
        Animator animatorM17991e = lra0.m17991e(x0mVar, iM16739r, iM16738q, interpolator2, iD, 0);
        Animator animatorP6 = bt0.p(((x0m) j760VarM16742u.b).y1(), "translationY", m16739r(), m16738q(), interpolator2, new float[]{0.0f});
        Animator animatorP7 = bt0.p(((x0m) j760VarM16742u.b).q2(), "translationY", m16739r(), m16738q(), interpolator2, new float[]{0.0f});
        Property property = bt0.i;
        long jM16738q = m16738q();
        Interpolator interpolator3 = bt0.a;
        Animator animatorZ = bt0.z(new Animator[]{animatorQ, animatorP, animatorP2, animatorP3, animatorP4, animatorP5, animatorM17991e, animatorP6, animatorP7, bt0.l(pictureViewR3, property, 0L, jM16738q, interpolator3, new float[]{1.0f}), bt0.p(pictureViewR3, "translationX", 0L, m16738q(), interpolator3, new float[]{0.0f}), bt0.p(pictureViewR3, "translationY", 0L, m16738q(), interpolator3, new float[]{0.0f}), bt0.l(((x0m) j760VarM16742u.b).w3(), bt0.i, 0L, m16738q(), interpolator3, new float[]{1.0f}), bt0.p(((x0m) j760VarM16742u.b).w3(), "translationX", 0L, m16738q(), interpolator3, new float[]{0.0f}), bt0.p(((x0m) j760VarM16742u.b).w3(), "translationY", 0L, m16738q(), interpolator3, new float[]{0.0f})});
        ((x0m) j760VarM16742u.b).k3();
        return bt0.f(animatorZ, new Runnable() { // from class: l.cug0
            @Override // java.lang.Runnable
            public final void run() {
                iug0.m16729l(j760VarM16742u, pictureViewR3);
            }
        });
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Animator m16733d(SuggestersAct suggestersAct, ProfileAct profileAct) {
        j760<SuggestersAct, x0m> j760VarM16742u = m16742u(suggestersAct, profileAct);
        VPager_SquaredRefactor vPager_SquaredRefactorU2 = ((x0m) j760VarM16742u.b).u2();
        if (vPager_SquaredRefactorU2 == null) {
            return null;
        }
        vPager_SquaredRefactorU2.b0();
        xdl0.u(((x0m) j760VarM16742u.b).W());
        xdl0.v(vPager_SquaredRefactorU2);
        LinearLayoutManager layoutManager = ((x0m) j760VarM16742u.b).W().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorU2.isAttachedToWindow() && layoutManager.findFirstVisibleItemPosition() == 0) {
            return m16744w(j760VarM16742u);
        }
        Animator animatorJ = bt0.j(3000);
        int iY0 = (int) (xdl0.y0() / 0.8f);
        int iI3 = ((x0m) j760VarM16742u.b).i3();
        int i = iY0 + iI3;
        int iM16738q = m16738q();
        float f = iM16738q;
        float f2 = (f - ((int) ((iI3 / i) * f))) / f;
        this.f14817c = f2;
        if (f2 <= 0.01f) {
            this.f14817c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM16738q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C0964a(i, iY0, j760VarM16742u, animatorJ));
        bt0.v(animatorJ, new dug0(valueAnimatorOfInt));
        return animatorJ;
    }

    /* JADX INFO: renamed from: q */
    public final int m16738q() {
        float f = this.f14817c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r */
    public final int m16739r() {
        float f = this.f14817c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: s */
    public final int m16740s() {
        float f = this.f14817c;
        if (f != -1.0f) {
            return (int) (f * 235.0f);
        }
        return 235;
    }

    /* JADX INFO: renamed from: t */
    public final int m16741t() {
        return 400;
    }

    /* JADX INFO: renamed from: u */
    public j760<SuggestersAct, x0m> m16742u(SuggestersAct suggestersAct, ProfileAct profileAct) {
        return vwb.Y(suggestersAct, profileAct.Y2());
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final Animator m16744w(j760<SuggestersAct, x0m> j760Var) {
        float f;
        float f2;
        ((x0m) j760Var.b).c0();
        final PictureView pictureViewU0 = ((x0m) j760Var.b).U0();
        xdl0.g gVarI0 = xdl0.i0(this.f14815a);
        xdl0.g gVarI1 = xdl0.i0(pictureViewU0);
        xdl0.g gVarI2 = xdl0.i0(((x0m) j760Var.b).p());
        xdl0.g gVarU = ((x0m) j760Var.b).U();
        xdl0.g gVarI3 = xdl0.i0(this.f14816b);
        xdl0.g gVarI4 = xdl0.i0(((x0m) j760Var.b).w3());
        int iD = (gVarI2.d - (gVarU.b - gVarI2.b)) + t100.d(30.0f);
        int i = xdl0.i0(((x0m) j760Var.b).o0()).a;
        float f3 = (gVarI0.c * 1.0f) / gVarI1.c;
        float f4 = (gVarI0.d * 1.0f) / gVarI1.d;
        float fMax = Math.max(f3, f4);
        final int i2 = (int) (((gVarI1.c * fMax) - gVarI0.c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.n(pictureViewU0, bt0.i, new float[]{fMax});
        int i3 = gVarI0.a;
        if (f4 >= f3) {
            f2 = (i3 - gVarI1.a) - (((gVarI1.c * fMax) - gVarI0.c) / 2.0f);
            f = gVarI0.b - gVarI1.b;
        } else {
            float f5 = i3 - gVarI1.a;
            f = (gVarI0.b - gVarI1.b) - (((gVarI1.d * f3) - gVarI0.d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fug0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                iug0.m16727j(i2, pictureViewU0, valueAnimator);
            }
        });
        long jM16738q = m16738q();
        View viewS1 = ((x0m) j760Var.b).S1();
        long jM16739r = m16739r();
        long jM16738q2 = m16738q();
        Interpolator interpolator = bt0.f;
        float f6 = iD;
        Animator animatorS = bt0.s(new Animator[]{bt0.x(jM16738q, new Animator[]{bt0.p(viewS1, "translationY", jM16739r, jM16738q2, interpolator, new float[]{f6}), bt0.p(((x0m) j760Var.b).o0(), "translationX", m16739r(), m16738q(), interpolator, new float[]{i}), bt0.p(((x0m) j760Var.b).o0(), "rotation", m16739r(), m16738q(), interpolator, new float[]{360.0f}), bt0.p(((x0m) j760Var.b).J(), "translationX", m16739r(), m16738q(), interpolator, new float[]{-i}), bt0.p(((x0m) j760Var.b).J(), "rotation", m16739r(), m16738q(), interpolator, new float[]{-360.0f}), bt0.p(((x0m) j760Var.b).Q2(), "alpha", 0L, m16740s(), (Interpolator) null, new float[]{0.0f}), lra0.m17991e((x0m) j760Var.b, 0, m16740s(), null, 0, iD), bt0.p(((x0m) j760Var.b).y1(), "translationY", 0L, m16740s(), (Interpolator) null, new float[]{f6}), bt0.p(((x0m) j760Var.b).q2(), "translationY", 0L, m16740s(), (Interpolator) null, new float[]{f6}), objectAnimator, bt0.q(pictureViewU0, "translationX", new float[]{f2}), bt0.q(pictureViewU0, "translationY", new float[]{f}), bt0.n(((x0m) j760Var.b).w3(), bt0.i, new float[]{(gVarI3.c * 1.0f) / gVarI4.c}), bt0.q(((x0m) j760Var.b).w3(), "translationX", new float[]{gVarI3.a - gVarI4.a}), bt0.q(((x0m) j760Var.b).w3(), "translationY", new float[]{gVarI3.b - gVarI4.b})}), bt0.j(10)});
        x0m x0mVar = (x0m) j760Var.b;
        Objects.requireNonNull(x0mVar);
        bt0.v(animatorS, new gug0(x0mVar));
        return animatorS;
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m16734h(SuggestersAct suggestersAct, ProfileAct profileAct) {
    }
}
