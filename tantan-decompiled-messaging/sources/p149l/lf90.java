package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class lf90<V extends View> extends Act.AbstractC4304w<Act, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final V f127846a;

    /* JADX INFO: renamed from: b */
    public final e30<Boolean> f127847b;

    /* JADX INFO: renamed from: c */
    public float f127848c = -1.0f;

    /* JADX INFO: renamed from: l.lf90$a */
    public class C18211a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f127849a = false;

        /* JADX INFO: renamed from: b */
        public int f127850b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f127851c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f127852d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f127853e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f127854f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Animator f127855g;

        public C18211a(int i, int i2, j760 j760Var, int i3, Animator animator) {
            this.f127851c = i;
            this.f127852d = i2;
            this.f127853e = j760Var;
            this.f127854f = i3;
            this.f127855g = animator;
            this.f127850b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f127852d;
            RecyclerView recyclerViewMo52195W = ((x0m) this.f127853e.f116565b).mo52195W();
            if (this.f127849a) {
                return;
            }
            recyclerViewMo52195W.scrollBy(0, (-this.f127850b) + iIntValue);
            this.f127850b = iIntValue;
            if (i <= this.f127852d) {
                Animator animatorM149654C = lf90.this.m149654C(this.f127853e, this.f127854f);
                Animator animator = this.f127855g;
                Objects.requireNonNull(animator);
                bt0.m103733f(animatorM149654C, new hug0(animator));
                animatorM149654C.start();
                this.f127849a = true;
            }
        }
    }

    public lf90(V v2, final e30<Boolean> e30Var) {
        this.f127846a = v2;
        this.f127847b = new e30() { // from class: l.ef90
            @Override // p149l.e30
            public final void call(Object obj) {
                lf90.m149644l(e30Var, (Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m149642j(j760 j760Var) {
        ((x0m) j760Var.f116565b).mo52077F().setScaleX(0.1f);
        ((x0m) j760Var.f116565b).mo52077F().setScaleY(0.1f);
        ((x0m) j760Var.f116565b).mo52077F().setPivotY(0.0f);
        xdl0.m208345M0(((x0m) j760Var.f116565b).mo52077F(), true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m149643k(PictureView pictureView) {
        if ((pictureView.f28040G instanceof Video) && xij0.m209661d0()) {
            pictureView.m43991V();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m149644l(e30 e30Var, Boolean bool) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m149645m(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: s */
    private Animator m149649s(x0m x0mVar) {
        Animator animatorM103737j = bt0.m103737j(0);
        x0mVar.mo52077F();
        return animatorM103737j;
    }

    /* JADX INFO: renamed from: v */
    private int m149650v() {
        float f = this.f127848c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: w */
    private int m149651w() {
        float f = this.f127848c;
        if (f != -1.0f) {
            return (int) (f * 400.0f);
        }
        return 400;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m149652A(final j760 j760Var, final PictureView pictureView) {
        ((Act) j760Var.f116564a).post(new Runnable() { // from class: l.hf90
            @Override // java.lang.Runnable
            public final void run() {
                lf90.m149643k(pictureView);
            }
        });
        ((x0m) j760Var.f116565b).mo52302o2();
        if (((x0m) j760Var.f116565b).mo52150Q()) {
            Animator animatorM103743p = bt0.m103743p(((x0m) j760Var.f116565b).mo52077F(), "alpha", 0L, m149651w(), bt0.f77157d, 0.0f, 1.0f);
            View viewMo52077F = ((x0m) j760Var.f116565b).mo52077F();
            long jM149651w = m149651w();
            Interpolator interpolator = bt0.f77158e;
            bt0.m103749v(bt0.m103753z(bt0.m103743p(viewMo52077F, "scaleX", 0L, jM149651w, interpolator, 0.1f, 1.0f), bt0.m103743p(((x0m) j760Var.f116565b).mo52077F(), "scaleY", 0L, m149651w(), interpolator, 0.1f, 1.0f), animatorM103743p), new Runnable() { // from class: l.if90
                @Override // java.lang.Runnable
                public final void run() {
                    lf90.m149642j(j760Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m149653B() {
        this.f127847b.call(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final Animator m149654C(j760<Act, x0m> j760Var, int i) {
        float f;
        float f2;
        final PictureView pictureViewMo52179U0 = j760Var.f116565b.mo52179U0();
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this.f127846a);
        xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureViewMo52179U0);
        xdl0.C21104g c21104gM208380i2 = xdl0.m208380i0(j760Var.f116565b.mo51125p());
        int iM186890d = (c21104gM208380i2.f192421d - (j760Var.f116565b.mo52178U().f192419b - c21104gM208380i2.f192419b)) + t100.m186890d(30.0f);
        int i2 = xdl0.m208380i0(j760Var.f116565b.mo52300o0()).f192418a;
        float f3 = (c21104gM208380i0.f192420c * 1.0f) / c21104gM208380i1.f192420c;
        float f4 = (c21104gM208380i0.f192421d * 1.0f) / c21104gM208380i1.f192421d;
        float fMax = Math.max(f3, f4);
        final int i3 = (int) (((c21104gM208380i1.f192420c * fMax) - c21104gM208380i0.f192420c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103741n(pictureViewMo52179U0, bt0.f77162i, fMax);
        int i4 = c21104gM208380i0.f192418a;
        if (f4 >= f3) {
            f2 = (i4 - c21104gM208380i1.f192418a) - (((c21104gM208380i1.f192420c * fMax) - c21104gM208380i0.f192420c) / 2.0f);
            f = c21104gM208380i0.f192419b - c21104gM208380i1.f192419b;
        } else {
            float f5 = i4 - c21104gM208380i1.f192418a;
            f = (c21104gM208380i0.f192419b - c21104gM208380i1.f192419b) - (((c21104gM208380i1.f192421d * f3) - c21104gM208380i0.f192421d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jf90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                lf90.m149645m(i3, pictureViewMo52179U0, valueAnimator);
            }
        });
        long jM149655q = m149655q();
        Animator animatorM149659x = m149659x(j760Var.f116565b, m149655q(), iM186890d);
        View viewMo52164S1 = j760Var.f116565b.mo52164S1();
        long jM149650v = m149650v();
        long jM149655q2 = m149655q();
        Interpolator interpolator = bt0.f77159f;
        float f6 = iM186890d;
        Animator animatorM103746s = bt0.m103746s(bt0.m103751x(jM149655q, animatorM149659x, bt0.m103743p(viewMo52164S1, "translationY", jM149650v, jM149655q2, interpolator, f6), bt0.m103743p(j760Var.f116565b.mo52300o0(), "translationX", m149650v(), m149655q(), interpolator, i2), bt0.m103743p(j760Var.f116565b.mo52300o0(), BLiveGiftItem.TYPE_ROTATION, m149650v(), m149655q(), interpolator, 360.0f), bt0.m103743p(j760Var.f116565b.mo52103J(), "translationX", m149650v(), m149655q(), interpolator, -i2), bt0.m103743p(j760Var.f116565b.mo52103J(), BLiveGiftItem.TYPE_ROTATION, m149650v(), m149655q(), interpolator, -360.0f), bt0.m103743p(j760Var.f116565b.mo52151Q2(), "alpha", 0L, 235L, null, 0.0f), lra0.m151146e(j760Var.f116565b, 0, 235, null, 0, iM186890d), bt0.m103743p(j760Var.f116565b.mo52365y1(), "translationY", 0L, 235L, null, f6), bt0.m103743p(j760Var.f116565b.mo52315q2(), "translationY", 0L, 235L, null, f6), objectAnimator, bt0.m103744q(pictureViewMo52179U0, "translationX", f2), bt0.m103744q(pictureViewMo52179U0, "translationY", f), bt0.m103737j(10)));
        x0m x0mVar = j760Var.f116565b;
        Objects.requireNonNull(x0mVar);
        bt0.m103749v(animatorM103746s, new gug0(x0mVar));
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.kf90
            @Override // java.lang.Runnable
            public final void run() {
                this.f122906a.m149653B();
            }
        });
        return animatorM103746s;
    }

    /* JADX INFO: renamed from: q */
    public final int m149655q() {
        float f = this.f127848c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public View mo20422a(ProfileAct profileAct) {
        return profileAct.m50766Y2().mo51125p();
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(Act act, ProfileAct profileAct) {
        final j760<Act, x0m> j760VarM149660y = m149660y(act, profileAct);
        final PictureView pictureViewMo52322r3 = j760VarM149660y.f116565b.mo52322r3(0);
        if (!NullChecker.m81303a(pictureViewMo52322r3)) {
            return null;
        }
        j760VarM149660y.f116564a.post(new Runnable() { // from class: l.ff90
            @Override // java.lang.Runnable
            public final void run() {
                this.f97195a.m149661z();
            }
        });
        xdl0.m208341K0(pictureViewMo52322r3, xdl0.m208380i0(this.f127846a), xdl0.m208380i0(pictureViewMo52322r3));
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(j760VarM149660y.f116565b.mo51125p());
        xdl0.C21104g c21104gMo52178U = j760VarM149660y.f116565b.mo52178U();
        xdl0.m208364a0(pictureViewMo52322r3);
        int iM186890d = (c21104gM208380i0.f192421d - (c21104gMo52178U.f192419b - c21104gM208380i0.f192419b)) + t100.m186890d(30.0f);
        int i = xdl0.m208380i0(j760VarM149660y.f116565b.mo52300o0()).f192418a;
        Iterator<View> it = j760VarM149660y.f116565b.mo52053B1().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(iM186890d);
        }
        j760VarM149660y.f116565b.mo52300o0().setTranslationX(i);
        j760VarM149660y.f116565b.mo52300o0().setRotation(360.0f);
        j760VarM149660y.f116565b.mo52103J().setTranslationX(-i);
        j760VarM149660y.f116565b.mo52103J().setRotation(-360.0f);
        float f = iM186890d;
        j760VarM149660y.f116565b.mo52164S1().setTranslationY(f);
        j760VarM149660y.f116565b.mo52077F().setTranslationY(0.0f);
        j760VarM149660y.f116565b.mo52365y1().setTranslationY(f);
        j760VarM149660y.f116565b.mo52315q2().setTranslationY(f);
        j760VarM149660y.f116565b.mo52151Q2().setAlpha(0.0f);
        Animator animatorM103744q = bt0.m103744q(j760VarM149660y.f116565b.mo52151Q2(), "alpha", 1.0f);
        View viewMo52164S1 = j760VarM149660y.f116565b.mo52164S1();
        long jM149650v = m149650v();
        long jM149651w = m149651w();
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103743p = bt0.m103743p(viewMo52164S1, "translationY", jM149650v, jM149651w, interpolator, 0.0f);
        Animator animatorM149649s = m149649s(j760VarM149660y.f116565b);
        Animator animatorM103743p2 = bt0.m103743p(j760VarM149660y.f116565b.mo52300o0(), "translationX", m149650v(), m149651w(), interpolator, 0.0f);
        Animator animatorM103743p3 = bt0.m103743p(j760VarM149660y.f116565b.mo52300o0(), BLiveGiftItem.TYPE_ROTATION, m149650v(), m149651w(), interpolator, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(j760VarM149660y.f116565b.mo52103J(), "translationX", m149650v(), m149651w(), interpolator, 0.0f);
        Animator animatorM103743p5 = bt0.m103743p(j760VarM149660y.f116565b.mo52103J(), BLiveGiftItem.TYPE_ROTATION, m149650v(), m149651w(), interpolator, 0.0f);
        x0m x0mVar = j760VarM149660y.f116565b;
        int iM149650v = m149650v();
        int iM149655q = m149655q();
        Interpolator interpolator2 = bt0.f77156c;
        Animator animatorM151146e = lra0.m151146e(x0mVar, iM149650v, iM149655q, interpolator2, iM186890d, 0);
        Animator animatorM103743p6 = bt0.m103743p(j760VarM149660y.f116565b.mo52365y1(), "translationY", m149650v(), m149655q(), interpolator2, 0.0f);
        Animator animatorM103743p7 = bt0.m103743p(j760VarM149660y.f116565b.mo52315q2(), "translationY", m149650v(), m149655q(), interpolator2, 0.0f);
        Property<View, Float> property = bt0.f77162i;
        long jM149655q = m149655q();
        Interpolator interpolator3 = bt0.f77154a;
        Animator animatorM103753z = bt0.m103753z(animatorM103744q, animatorM103743p, animatorM149649s, animatorM103743p2, animatorM103743p3, animatorM103743p4, animatorM103743p5, animatorM151146e, animatorM103743p6, animatorM103743p7, bt0.m103739l(pictureViewMo52322r3, property, 0L, jM149655q, interpolator3, 1.0f), bt0.m103743p(pictureViewMo52322r3, "translationX", 0L, m149655q(), interpolator3, 0.0f), bt0.m103743p(pictureViewMo52322r3, "translationY", 0L, m149655q(), interpolator3, 0.0f), bt0.m103739l(j760VarM149660y.f116565b.mo52354w3(), bt0.f77162i, 0L, m149655q(), interpolator3, 1.0f), bt0.m103743p(j760VarM149660y.f116565b.mo52354w3(), "translationX", 0L, m149655q(), interpolator3, 0.0f), bt0.m103743p(j760VarM149660y.f116565b.mo52354w3(), "translationY", 0L, m149655q(), interpolator3, 0.0f));
        if (j760VarM149660y.f116565b.mo52150Q()) {
            j760VarM149660y.f116565b.mo52077F().setAlpha(0.0f);
        }
        j760VarM149660y.f116565b.mo52277k3();
        return bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.gf90
            @Override // java.lang.Runnable
            public final void run() {
                this.f102348a.m149652A(j760VarM149660y, pictureViewMo52322r3);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(Act act, ProfileAct profileAct) {
        j760<Act, x0m> j760VarM149660y = m149660y(act, profileAct);
        int iMo52232c0 = j760VarM149660y.f116565b.mo52232c0();
        VPager_SquaredRefactor vPager_SquaredRefactorMo52340u2 = j760VarM149660y.f116565b.mo52340u2();
        if (vPager_SquaredRefactorMo52340u2 == null) {
            return null;
        }
        j760VarM149660y.f116565b.mo52340u2().m223140b0();
        xdl0.m208403u(j760VarM149660y.f116565b.mo52195W());
        xdl0.m208405v(j760VarM149660y.f116565b.mo52340u2());
        RecyclerView.AbstractC0577o layoutManager = j760VarM149660y.f116565b.mo52195W().getLayoutManager();
        j760VarM149660y.f116565b.mo52195W().setClipChildren(false);
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo52340u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
            return m149654C(j760VarM149660y, iMo52232c0);
        }
        Animator animatorM103737j = bt0.m103737j(3000);
        int iM208412y0 = (int) (xdl0.m208412y0() / 0.8f);
        int iMo51111i3 = j760VarM149660y.f116565b.mo51111i3();
        int i = iM208412y0 + iMo51111i3;
        int iM149655q = m149655q();
        float f = iM149655q;
        float f2 = (f - ((int) ((iMo51111i3 / i) * f))) / f;
        this.f127848c = f2;
        if (f2 <= 0.01f) {
            this.f127848c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM149655q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C18211a(i, iM208412y0, j760VarM149660y, iMo52232c0, animatorM103737j));
        bt0.m103749v(animatorM103737j, new dug0(valueAnimatorOfInt));
        return animatorM103737j;
    }

    /* JADX INFO: renamed from: x */
    public final Animator m149659x(x0m x0mVar, int i, int i2) {
        float f;
        View viewMo52077F = x0mVar.mo52077F();
        Animator animatorM103737j = bt0.m103737j(0);
        if (NullChecker.m81303a(viewMo52077F)) {
            float alpha = viewMo52077F.getAlpha();
            if (alpha < 1.0f) {
                xdl0.m208344M(viewMo52077F, false);
                return bt0.m103737j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewMo52077F.animate();
            if (NullChecker.m81303a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
            f = alpha;
        } else {
            f = 1.0f;
        }
        if (!x0mVar.mo52150Q()) {
            return animatorM103737j;
        }
        long j = i;
        Interpolator interpolator = bt0.f77159f;
        return bt0.m103753z(bt0.m103743p(viewMo52077F, "scaleX", 0L, j, interpolator, f, 0.1f), bt0.m103743p(viewMo52077F, "scaleY", 0L, j, interpolator, f, 0.1f), bt0.m103743p(viewMo52077F, "alpha", 0L, j, interpolator, f, 0.0f));
    }

    /* JADX INFO: renamed from: y */
    public j760<Act, x0m> m149660y(Act act, ProfileAct profileAct) {
        return vwb.m200311Y(act, profileAct.m50766Y2());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m149661z() {
        this.f127847b.call(Boolean.FALSE);
    }
}
