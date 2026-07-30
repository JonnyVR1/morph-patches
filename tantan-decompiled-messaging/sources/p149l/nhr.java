package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class nhr extends Act.AbstractC4304w<LikersAct, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f139015a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f139016b;

    /* JADX INFO: renamed from: c */
    public float f139017c = -1.0f;

    /* JADX INFO: renamed from: l.nhr$a */
    public class C18697a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f139018a = false;

        /* JADX INFO: renamed from: b */
        public int f139019b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f139020c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f139021d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j760 f139022e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f139023f;

        public C18697a(int i, int i2, j760 j760Var, Animator animator) {
            this.f139020c = i;
            this.f139021d = i2;
            this.f139022e = j760Var;
            this.f139023f = animator;
            this.f139019b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f139021d;
            RecyclerView recyclerViewMo52195W = ((x0m) this.f139022e.f116565b).mo52195W();
            if (this.f139018a) {
                return;
            }
            recyclerViewMo52195W.scrollBy(0, (-this.f139019b) + iIntValue);
            this.f139019b = iIntValue;
            if (i <= this.f139021d) {
                Animator animatorM159440w = nhr.this.m159440w(this.f139022e);
                Animator animator = this.f139023f;
                Objects.requireNonNull(animator);
                bt0.m103733f(animatorM159440w, new hug0(animator));
                animatorM159440w.start();
                this.f139018a = true;
            }
        }
    }

    public nhr(VDraweeView vDraweeView, LinearLayout linearLayout) {
        this.f139015a = vDraweeView;
        this.f139016b = linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m159432j(j760 j760Var, final PictureView pictureView) {
        ((LikersAct) j760Var.f116564a).post(new Runnable() { // from class: l.lhr
            @Override // java.lang.Runnable
            public final void run() {
                nhr.m159434l(pictureView);
            }
        });
        ((x0m) j760Var.f116565b).mo52302o2();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m159433k(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m159434l(PictureView pictureView) {
        if ((pictureView.f28040G instanceof Video) && xij0.m209661d0()) {
            pictureView.m43991V();
        }
    }

    /* JADX INFO: renamed from: q */
    private int m159436q() {
        float f = this.f139017c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r */
    private int m159437r() {
        float f = this.f139017c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: s */
    private int m159438s() {
        float f = this.f139017c;
        if (f != -1.0f) {
            return (int) (f * 235.0f);
        }
        return 235;
    }

    /* JADX INFO: renamed from: t */
    private int m159439t() {
        return 400;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: w */
    public Animator m159440w(j760<LikersAct, x0m> j760Var) {
        float f;
        float f2;
        j760Var.f116565b.mo52232c0();
        final PictureView pictureViewMo52179U0 = j760Var.f116565b.mo52179U0();
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(this.f139015a);
        xdl0.C21104g c21104gM208380i1 = xdl0.m208380i0(pictureViewMo52179U0);
        xdl0.C21104g c21104gM208380i2 = xdl0.m208380i0(j760Var.f116565b.mo51125p());
        xdl0.C21104g c21104gMo52178U = j760Var.f116565b.mo52178U();
        xdl0.C21104g c21104gM208380i3 = xdl0.m208380i0(this.f139016b);
        xdl0.C21104g c21104gM208380i4 = xdl0.m208380i0(j760Var.f116565b.mo52354w3());
        int iM186890d = (c21104gM208380i2.f192421d - (c21104gMo52178U.f192419b - c21104gM208380i2.f192419b)) + t100.m186890d(30.0f);
        int i = xdl0.m208380i0(j760Var.f116565b.mo52300o0()).f192418a;
        float f3 = (c21104gM208380i0.f192420c * 1.0f) / c21104gM208380i1.f192420c;
        float f4 = (c21104gM208380i0.f192421d * 1.0f) / c21104gM208380i1.f192421d;
        float fMax = Math.max(f3, f4);
        final int i2 = (int) (((c21104gM208380i1.f192420c * fMax) - c21104gM208380i0.f192420c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103741n(pictureViewMo52179U0, bt0.f77162i, fMax);
        int i3 = c21104gM208380i0.f192418a;
        if (f4 >= f3) {
            f2 = (i3 - c21104gM208380i1.f192418a) - (((c21104gM208380i1.f192420c * fMax) - c21104gM208380i0.f192420c) / 2.0f);
            f = c21104gM208380i0.f192419b - c21104gM208380i1.f192419b;
        } else {
            float f5 = i3 - c21104gM208380i1.f192418a;
            f = (c21104gM208380i0.f192419b - c21104gM208380i1.f192419b) - (((c21104gM208380i1.f192421d * f3) - c21104gM208380i0.f192421d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mhr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nhr.m159433k(i2, pictureViewMo52179U0, valueAnimator);
            }
        });
        long jM159436q = m159436q();
        View viewMo52164S1 = j760Var.f116565b.mo52164S1();
        long jM159437r = m159437r();
        long jM159436q2 = m159436q();
        Interpolator interpolator = bt0.f77159f;
        float f6 = iM186890d;
        Animator animatorM103746s = bt0.m103746s(bt0.m103751x(jM159436q, bt0.m103743p(viewMo52164S1, "translationY", jM159437r, jM159436q2, interpolator, f6), bt0.m103743p(j760Var.f116565b.mo52300o0(), "translationX", m159437r(), m159436q(), interpolator, i), bt0.m103743p(j760Var.f116565b.mo52300o0(), BLiveGiftItem.TYPE_ROTATION, m159437r(), m159436q(), interpolator, 360.0f), bt0.m103743p(j760Var.f116565b.mo52103J(), "translationX", m159437r(), m159436q(), interpolator, -i), bt0.m103743p(j760Var.f116565b.mo52103J(), BLiveGiftItem.TYPE_ROTATION, m159437r(), m159436q(), interpolator, -360.0f), bt0.m103743p(j760Var.f116565b.mo52151Q2(), "alpha", 0L, m159438s(), null, 0.0f), lra0.m151146e(j760Var.f116565b, 0, m159438s(), null, 0, iM186890d), bt0.m103743p(j760Var.f116565b.mo52365y1(), "translationY", 0L, m159438s(), null, f6), bt0.m103743p(j760Var.f116565b.mo52315q2(), "translationY", 0L, m159438s(), null, f6), objectAnimator, bt0.m103744q(pictureViewMo52179U0, "translationX", f2), bt0.m103744q(pictureViewMo52179U0, "translationY", f), bt0.m103741n(j760Var.f116565b.mo52354w3(), bt0.f77162i, (c21104gM208380i3.f192420c * 1.0f) / c21104gM208380i4.f192420c), bt0.m103744q(j760Var.f116565b.mo52354w3(), "translationX", c21104gM208380i3.f192418a - c21104gM208380i4.f192418a), bt0.m103744q(j760Var.f116565b.mo52354w3(), "translationY", c21104gM208380i3.f192419b - c21104gM208380i4.f192419b)), bt0.m103737j(10));
        x0m x0mVar = j760Var.f116565b;
        Objects.requireNonNull(x0mVar);
        bt0.m103749v(animatorM103746s, new gug0(x0mVar));
        return animatorM103746s;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public View mo20422a(ProfileAct profileAct) {
        return profileAct.m50766Y2().mo51125p();
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(LikersAct likersAct, ProfileAct profileAct) {
        final j760<LikersAct, x0m> j760VarM159444u = m159444u(likersAct, profileAct);
        final PictureView pictureViewMo52322r3 = j760VarM159444u.f116565b.mo52322r3(0);
        if (!NullChecker.m81303a(pictureViewMo52322r3)) {
            return null;
        }
        xdl0.m208341K0(pictureViewMo52322r3, xdl0.m208380i0(this.f139015a), xdl0.m208380i0(pictureViewMo52322r3));
        xdl0.m208341K0(j760VarM159444u.f116565b.mo52354w3(), xdl0.m208380i0(this.f139016b), xdl0.m208380i0(j760VarM159444u.f116565b.mo52354w3()));
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(j760VarM159444u.f116565b.mo51125p());
        xdl0.C21104g c21104gMo52178U = j760VarM159444u.f116565b.mo52178U();
        xdl0.m208364a0(pictureViewMo52322r3);
        final int iM186890d = (c21104gM208380i0.f192421d - (c21104gMo52178U.f192419b - c21104gM208380i0.f192419b)) + t100.m186890d(30.0f);
        int i = xdl0.m208380i0(j760VarM159444u.f116565b.mo52300o0()).f192418a;
        vwb.m200354z(j760VarM159444u.f116565b.mo52053B1(), new e30() { // from class: l.jhr
            @Override // p149l.e30
            public final void call(Object obj) {
                ((View) obj).setTranslationY(iM186890d);
            }
        });
        j760VarM159444u.f116565b.mo52300o0().setTranslationX(i);
        j760VarM159444u.f116565b.mo52300o0().setRotation(360.0f);
        j760VarM159444u.f116565b.mo52103J().setTranslationX(-i);
        j760VarM159444u.f116565b.mo52103J().setRotation(-360.0f);
        float f = iM186890d;
        j760VarM159444u.f116565b.mo52164S1().setTranslationY(f);
        j760VarM159444u.f116565b.mo52365y1().setTranslationY(f);
        j760VarM159444u.f116565b.mo52315q2().setTranslationY(f);
        j760VarM159444u.f116565b.mo52151Q2().setAlpha(0.0f);
        Animator animatorM103744q = bt0.m103744q(j760VarM159444u.f116565b.mo52151Q2(), "alpha", 1.0f);
        View viewMo52164S1 = j760VarM159444u.f116565b.mo52164S1();
        long jM159437r = m159437r();
        long jM159439t = m159439t();
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103743p = bt0.m103743p(viewMo52164S1, "translationY", jM159437r, jM159439t, interpolator, 0.0f);
        Animator animatorM103743p2 = bt0.m103743p(j760VarM159444u.f116565b.mo52300o0(), "translationX", m159437r(), m159439t(), interpolator, 0.0f);
        Animator animatorM103743p3 = bt0.m103743p(j760VarM159444u.f116565b.mo52300o0(), BLiveGiftItem.TYPE_ROTATION, m159437r(), m159439t(), interpolator, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(j760VarM159444u.f116565b.mo52103J(), "translationX", m159437r(), m159439t(), interpolator, 0.0f);
        Animator animatorM103743p5 = bt0.m103743p(j760VarM159444u.f116565b.mo52103J(), BLiveGiftItem.TYPE_ROTATION, m159437r(), m159439t(), interpolator, 0.0f);
        x0m x0mVar = j760VarM159444u.f116565b;
        int iM159437r = m159437r();
        int iM159436q = m159436q();
        Interpolator interpolator2 = bt0.f77156c;
        Animator animatorM151146e = lra0.m151146e(x0mVar, iM159437r, iM159436q, interpolator2, iM186890d, 0);
        Animator animatorM103743p6 = bt0.m103743p(j760VarM159444u.f116565b.mo52365y1(), "translationY", m159437r(), m159436q(), interpolator2, 0.0f);
        Animator animatorM103743p7 = bt0.m103743p(j760VarM159444u.f116565b.mo52315q2(), "translationY", m159437r(), m159436q(), interpolator2, 0.0f);
        Property<View, Float> property = bt0.f77162i;
        long jM159436q = m159436q();
        Interpolator interpolator3 = bt0.f77154a;
        Animator animatorM103753z = bt0.m103753z(animatorM103744q, animatorM103743p, animatorM103743p2, animatorM103743p3, animatorM103743p4, animatorM103743p5, animatorM151146e, animatorM103743p6, animatorM103743p7, bt0.m103739l(pictureViewMo52322r3, property, 0L, jM159436q, interpolator3, 1.0f), bt0.m103743p(pictureViewMo52322r3, "translationX", 0L, m159436q(), interpolator3, 0.0f), bt0.m103743p(pictureViewMo52322r3, "translationY", 0L, m159436q(), interpolator3, 0.0f), bt0.m103739l(j760VarM159444u.f116565b.mo52354w3(), bt0.f77162i, 0L, m159436q(), interpolator3, 1.0f), bt0.m103743p(j760VarM159444u.f116565b.mo52354w3(), "translationX", 0L, m159436q(), interpolator3, 0.0f), bt0.m103743p(j760VarM159444u.f116565b.mo52354w3(), "translationY", 0L, m159436q(), interpolator3, 0.0f));
        j760VarM159444u.f116565b.mo52277k3();
        return bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.khr
            @Override // java.lang.Runnable
            public final void run() {
                nhr.m159432j(j760VarM159444u, pictureViewMo52322r3);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(LikersAct likersAct, ProfileAct profileAct) {
        j760<LikersAct, x0m> j760VarM159444u = m159444u(likersAct, profileAct);
        VPager_SquaredRefactor vPager_SquaredRefactorMo52340u2 = j760VarM159444u.f116565b.mo52340u2();
        if (vPager_SquaredRefactorMo52340u2 == null) {
            return null;
        }
        vPager_SquaredRefactorMo52340u2.m223140b0();
        xdl0.m208403u(j760VarM159444u.f116565b.mo52195W());
        xdl0.m208405v(vPager_SquaredRefactorMo52340u2);
        RecyclerView.AbstractC0577o layoutManager = j760VarM159444u.f116565b.mo52195W().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo52340u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
            return m159440w(j760VarM159444u);
        }
        Animator animatorM103737j = bt0.m103737j(3000);
        int iM208412y0 = (int) (xdl0.m208412y0() / 0.8f);
        int iMo51111i3 = j760VarM159444u.f116565b.mo51111i3();
        int i = iM208412y0 + iMo51111i3;
        int iM159436q = m159436q();
        float f = iM159436q;
        float f2 = (f - ((int) ((iMo51111i3 / i) * f))) / f;
        this.f139017c = f2;
        if (f2 <= 0.01f) {
            this.f139017c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM159436q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C18697a(i, iM208412y0, j760VarM159444u, animatorM103737j));
        bt0.m103749v(animatorM103737j, new dug0(valueAnimatorOfInt));
        return animatorM103737j;
    }

    /* JADX INFO: renamed from: u */
    public j760<LikersAct, x0m> m159444u(LikersAct likersAct, ProfileAct profileAct) {
        return vwb.m200311Y(likersAct, profileAct.m50766Y2());
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo20414h(LikersAct likersAct, ProfileAct profileAct) {
    }
}
