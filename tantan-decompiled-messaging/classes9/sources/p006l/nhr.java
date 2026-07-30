package p006l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
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
import l.x0m;
import l.xdl0;
import l.xij0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nhr extends Act.w<LikersAct, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f17686a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f17687b;

    /* JADX INFO: renamed from: c */
    public float f17688c = -1.0f;

    /* JADX INFO: renamed from: l.nhr$a */
    public class C1051a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f17689a = false;

        /* JADX INFO: renamed from: b */
        public int f17690b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f17691c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f17692d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f17693e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f17694f;

        public C1051a(int i, int i2, j760 j760Var, Animator animator) {
            this.f17691c = i;
            this.f17692d = i2;
            this.f17693e = j760Var;
            this.f17694f = animator;
            this.f17690b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f17692d;
            RecyclerView recyclerViewW = ((x0m) this.f17693e.b).W();
            if (this.f17689a) {
                return;
            }
            recyclerViewW.scrollBy(0, (-this.f17690b) + iIntValue);
            this.f17690b = iIntValue;
            if (i <= this.f17692d) {
                Animator animatorM20133w = nhr.this.m20133w(this.f17693e);
                Animator animator = this.f17694f;
                Objects.requireNonNull(animator);
                bt0.f(animatorM20133w, new hug0(animator));
                animatorM20133w.start();
                this.f17689a = true;
            }
        }
    }

    public nhr(VDraweeView vDraweeView, LinearLayout linearLayout) {
        this.f17686a = vDraweeView;
        this.f17687b = linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m20125j(j760 j760Var, final PictureView pictureView) {
        ((LikersAct) j760Var.a).post(new Runnable() { // from class: l.lhr
            @Override // java.lang.Runnable
            public final void run() {
                nhr.m20127l(pictureView);
            }
        });
        ((x0m) j760Var.b).o2();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m20126k(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m20127l(PictureView pictureView) {
        if ((pictureView.G instanceof Video) && xij0.d0()) {
            pictureView.V();
        }
    }

    /* JADX INFO: renamed from: q */
    private int m20129q() {
        float f = this.f17688c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r */
    private int m20130r() {
        float f = this.f17688c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: s */
    private int m20131s() {
        float f = this.f17688c;
        if (f != -1.0f) {
            return (int) (f * 235.0f);
        }
        return 235;
    }

    /* JADX INFO: renamed from: t */
    private int m20132t() {
        return 400;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: w */
    public Animator m20133w(j760<LikersAct, x0m> j760Var) {
        float f;
        float f2;
        ((x0m) j760Var.b).c0();
        final PictureView pictureViewU0 = ((x0m) j760Var.b).U0();
        xdl0.g gVarI0 = xdl0.i0(this.f17686a);
        xdl0.g gVarI1 = xdl0.i0(pictureViewU0);
        xdl0.g gVarI2 = xdl0.i0(((x0m) j760Var.b).p());
        xdl0.g gVarU = ((x0m) j760Var.b).U();
        xdl0.g gVarI3 = xdl0.i0(this.f17687b);
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
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mhr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nhr.m20126k(i2, pictureViewU0, valueAnimator);
            }
        });
        long jM20129q = m20129q();
        View viewS1 = ((x0m) j760Var.b).S1();
        long jM20130r = m20130r();
        long jM20129q2 = m20129q();
        Interpolator interpolator = bt0.f;
        float f6 = iD;
        Animator animatorS = bt0.s(new Animator[]{bt0.x(jM20129q, new Animator[]{bt0.p(viewS1, "translationY", jM20130r, jM20129q2, interpolator, new float[]{f6}), bt0.p(((x0m) j760Var.b).o0(), "translationX", m20130r(), m20129q(), interpolator, new float[]{i}), bt0.p(((x0m) j760Var.b).o0(), "rotation", m20130r(), m20129q(), interpolator, new float[]{360.0f}), bt0.p(((x0m) j760Var.b).J(), "translationX", m20130r(), m20129q(), interpolator, new float[]{-i}), bt0.p(((x0m) j760Var.b).J(), "rotation", m20130r(), m20129q(), interpolator, new float[]{-360.0f}), bt0.p(((x0m) j760Var.b).Q2(), "alpha", 0L, m20131s(), (Interpolator) null, new float[]{0.0f}), lra0.e((x0m) j760Var.b, 0, m20131s(), (Interpolator) null, 0, iD), bt0.p(((x0m) j760Var.b).y1(), "translationY", 0L, m20131s(), (Interpolator) null, new float[]{f6}), bt0.p(((x0m) j760Var.b).q2(), "translationY", 0L, m20131s(), (Interpolator) null, new float[]{f6}), objectAnimator, bt0.q(pictureViewU0, "translationX", new float[]{f2}), bt0.q(pictureViewU0, "translationY", new float[]{f}), bt0.n(((x0m) j760Var.b).w3(), bt0.i, new float[]{(gVarI3.c * 1.0f) / gVarI4.c}), bt0.q(((x0m) j760Var.b).w3(), "translationX", new float[]{gVarI3.a - gVarI4.a}), bt0.q(((x0m) j760Var.b).w3(), "translationY", new float[]{gVarI3.b - gVarI4.b})}), bt0.j(10)});
        x0m x0mVar = (x0m) j760Var.b;
        Objects.requireNonNull(x0mVar);
        bt0.v(animatorS, new gug0(x0mVar));
        return animatorS;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public View m20134a(ProfileAct profileAct) {
        return profileAct.Y2().p();
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Animator m20135c(LikersAct likersAct, ProfileAct profileAct) {
        final j760<LikersAct, x0m> j760VarM20141u = m20141u(likersAct, profileAct);
        final PictureView pictureViewR3 = ((x0m) j760VarM20141u.b).r3(0);
        if (!NullChecker.a(pictureViewR3)) {
            return null;
        }
        xdl0.K0(pictureViewR3, xdl0.i0(this.f17686a), xdl0.i0(pictureViewR3));
        xdl0.K0(((x0m) j760VarM20141u.b).w3(), xdl0.i0(this.f17687b), xdl0.i0(((x0m) j760VarM20141u.b).w3()));
        xdl0.g gVarI0 = xdl0.i0(((x0m) j760VarM20141u.b).p());
        xdl0.g gVarU = ((x0m) j760VarM20141u.b).U();
        xdl0.a0(pictureViewR3);
        final int iD = (gVarI0.d - (gVarU.b - gVarI0.b)) + t100.d(30.0f);
        int i = xdl0.i0(((x0m) j760VarM20141u.b).o0()).a;
        vwb.z(((x0m) j760VarM20141u.b).B1(), new e30() { // from class: l.jhr
            public final void call(Object obj) {
                ((View) obj).setTranslationY(iD);
            }
        });
        ((x0m) j760VarM20141u.b).o0().setTranslationX(i);
        ((x0m) j760VarM20141u.b).o0().setRotation(360.0f);
        ((x0m) j760VarM20141u.b).J().setTranslationX(-i);
        ((x0m) j760VarM20141u.b).J().setRotation(-360.0f);
        float f = iD;
        ((x0m) j760VarM20141u.b).S1().setTranslationY(f);
        ((x0m) j760VarM20141u.b).y1().setTranslationY(f);
        ((x0m) j760VarM20141u.b).q2().setTranslationY(f);
        ((x0m) j760VarM20141u.b).Q2().setAlpha(0.0f);
        Animator animatorQ = bt0.q(((x0m) j760VarM20141u.b).Q2(), "alpha", new float[]{1.0f});
        View viewS1 = ((x0m) j760VarM20141u.b).S1();
        long jM20130r = m20130r();
        long jM20132t = m20132t();
        Interpolator interpolator = bt0.d;
        Animator animatorP = bt0.p(viewS1, "translationY", jM20130r, jM20132t, interpolator, new float[]{0.0f});
        Animator animatorP2 = bt0.p(((x0m) j760VarM20141u.b).o0(), "translationX", m20130r(), m20132t(), interpolator, new float[]{0.0f});
        Animator animatorP3 = bt0.p(((x0m) j760VarM20141u.b).o0(), "rotation", m20130r(), m20132t(), interpolator, new float[]{0.0f});
        Animator animatorP4 = bt0.p(((x0m) j760VarM20141u.b).J(), "translationX", m20130r(), m20132t(), interpolator, new float[]{0.0f});
        Animator animatorP5 = bt0.p(((x0m) j760VarM20141u.b).J(), "rotation", m20130r(), m20132t(), interpolator, new float[]{0.0f});
        x0m x0mVar = (x0m) j760VarM20141u.b;
        int iM20130r = m20130r();
        int iM20129q = m20129q();
        Interpolator interpolator2 = bt0.c;
        Animator animatorE = lra0.e(x0mVar, iM20130r, iM20129q, interpolator2, iD, 0);
        Animator animatorP6 = bt0.p(((x0m) j760VarM20141u.b).y1(), "translationY", m20130r(), m20129q(), interpolator2, new float[]{0.0f});
        Animator animatorP7 = bt0.p(((x0m) j760VarM20141u.b).q2(), "translationY", m20130r(), m20129q(), interpolator2, new float[]{0.0f});
        Property property = bt0.i;
        long jM20129q = m20129q();
        Interpolator interpolator3 = bt0.a;
        Animator animatorZ = bt0.z(new Animator[]{animatorQ, animatorP, animatorP2, animatorP3, animatorP4, animatorP5, animatorE, animatorP6, animatorP7, bt0.l(pictureViewR3, property, 0L, jM20129q, interpolator3, new float[]{1.0f}), bt0.p(pictureViewR3, "translationX", 0L, m20129q(), interpolator3, new float[]{0.0f}), bt0.p(pictureViewR3, "translationY", 0L, m20129q(), interpolator3, new float[]{0.0f}), bt0.l(((x0m) j760VarM20141u.b).w3(), bt0.i, 0L, m20129q(), interpolator3, new float[]{1.0f}), bt0.p(((x0m) j760VarM20141u.b).w3(), "translationX", 0L, m20129q(), interpolator3, new float[]{0.0f}), bt0.p(((x0m) j760VarM20141u.b).w3(), "translationY", 0L, m20129q(), interpolator3, new float[]{0.0f})});
        ((x0m) j760VarM20141u.b).k3();
        return bt0.f(animatorZ, new Runnable() { // from class: l.khr
            @Override // java.lang.Runnable
            public final void run() {
                nhr.m20125j(j760VarM20141u, pictureViewR3);
            }
        });
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Animator m20136d(LikersAct likersAct, ProfileAct profileAct) {
        j760<LikersAct, x0m> j760VarM20141u = m20141u(likersAct, profileAct);
        VPager_SquaredRefactor vPager_SquaredRefactorU2 = ((x0m) j760VarM20141u.b).u2();
        if (vPager_SquaredRefactorU2 == null) {
            return null;
        }
        vPager_SquaredRefactorU2.b0();
        xdl0.u(((x0m) j760VarM20141u.b).W());
        xdl0.v(vPager_SquaredRefactorU2);
        LinearLayoutManager layoutManager = ((x0m) j760VarM20141u.b).W().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorU2.isAttachedToWindow() && layoutManager.findFirstVisibleItemPosition() == 0) {
            return m20133w(j760VarM20141u);
        }
        Animator animatorJ = bt0.j(3000);
        int iY0 = (int) (xdl0.y0() / 0.8f);
        int iI3 = ((x0m) j760VarM20141u.b).i3();
        int i = iY0 + iI3;
        int iM20129q = m20129q();
        float f = iM20129q;
        float f2 = (f - ((int) ((iI3 / i) * f))) / f;
        this.f17688c = f2;
        if (f2 <= 0.01f) {
            this.f17688c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM20129q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C1051a(i, iY0, j760VarM20141u, animatorJ));
        bt0.v(animatorJ, new dug0(valueAnimatorOfInt));
        return animatorJ;
    }

    /* JADX INFO: renamed from: u */
    public j760<LikersAct, x0m> m20141u(LikersAct likersAct, ProfileAct profileAct) {
        return vwb.Y(likersAct, profileAct.Y2());
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m20137h(LikersAct likersAct, ProfileAct profileAct) {
    }
}
