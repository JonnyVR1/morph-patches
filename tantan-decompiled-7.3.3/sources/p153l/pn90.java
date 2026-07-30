package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class pn90<V extends View> extends Act.AbstractC4455w<Act, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final V f153268a;

    /* JADX INFO: renamed from: b */
    public final y20<Boolean> f153269b;

    /* JADX INFO: renamed from: c */
    public float f153270c = -1.0f;

    /* JADX INFO: renamed from: l.pn90$a */
    public class C19407a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f153271a = false;

        /* JADX INFO: renamed from: b */
        public int f153272b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f153273c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f153274d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ pf60 f153275e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f153276f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Animator f153277g;

        public C19407a(int i, int i2, pf60 pf60Var, int i3, Animator animator) {
            this.f153273c = i;
            this.f153274d = i2;
            this.f153275e = pf60Var;
            this.f153276f = i3;
            this.f153277g = animator;
            this.f153272b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f153274d;
            RecyclerView recyclerViewMo53378W = ((q3m) this.f153275e.f152157b).mo53378W();
            if (this.f153271a) {
                return;
            }
            recyclerViewMo53378W.scrollBy(0, (-this.f153272b) + iIntValue);
            this.f153272b = iIntValue;
            if (i <= this.f153274d) {
                Animator animatorM173052C = pn90.this.m173052C(this.f153275e, this.f153276f);
                Animator animator = this.f153277g;
                Objects.requireNonNull(animator);
                gt0.m132160f(animatorM173052C, new p2h0(animator));
                animatorM173052C.start();
                this.f153271a = true;
            }
        }
    }

    public pn90(V v2, final y20<Boolean> y20Var) {
        this.f153268a = v2;
        this.f153269b = new y20() { // from class: l.in90
            @Override // p153l.y20
            public final void call(Object obj) {
                pn90.m173042l(y20Var, (Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m173040j(pf60 pf60Var) {
        ((q3m) pf60Var.f152157b).mo53260F().setScaleX(0.1f);
        ((q3m) pf60Var.f152157b).mo53260F().setScaleY(0.1f);
        ((q3m) pf60Var.f152157b).mo53260F().setPivotY(0.0f);
        bnl0.m105525M0(((q3m) pf60Var.f152157b).mo53260F(), true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m173041k(PictureView pictureView) {
        if ((pictureView.f28888G instanceof Video) && asj0.m99935d0()) {
            pictureView.m45174V();
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m173042l(y20 y20Var, Boolean bool) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m173043m(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: s */
    private Animator m173047s(q3m q3mVar) {
        Animator animatorM132164j = gt0.m132164j(0);
        q3mVar.mo53260F();
        return animatorM132164j;
    }

    /* JADX INFO: renamed from: v */
    private int m173048v() {
        float f = this.f153270c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: w */
    private int m173049w() {
        float f = this.f153270c;
        if (f != -1.0f) {
            return (int) (f * 400.0f);
        }
        return 400;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m173050A(final pf60 pf60Var, final PictureView pictureView) {
        ((Act) pf60Var.f152156a).post(new Runnable() { // from class: l.ln90
            @Override // java.lang.Runnable
            public final void run() {
                pn90.m173041k(pictureView);
            }
        });
        ((q3m) pf60Var.f152157b).mo53485o2();
        if (((q3m) pf60Var.f152157b).mo53333Q()) {
            Animator animatorM132170p = gt0.m132170p(((q3m) pf60Var.f152157b).mo53260F(), "alpha", 0L, m173049w(), gt0.f106349d, 0.0f, 1.0f);
            View viewMo53260F = ((q3m) pf60Var.f152157b).mo53260F();
            long jM173049w = m173049w();
            Interpolator interpolator = gt0.f106350e;
            gt0.m132176v(gt0.m132180z(gt0.m132170p(viewMo53260F, "scaleX", 0L, jM173049w, interpolator, 0.1f, 1.0f), gt0.m132170p(((q3m) pf60Var.f152157b).mo53260F(), "scaleY", 0L, m173049w(), interpolator, 0.1f, 1.0f), animatorM132170p), new Runnable() { // from class: l.mn90
                @Override // java.lang.Runnable
                public final void run() {
                    pn90.m173040j(pf60Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m173051B() {
        this.f153269b.call(Boolean.TRUE);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final Animator m173052C(pf60<Act, q3m> pf60Var, int i) {
        float f;
        float f2;
        final PictureView pictureViewMo53362U0 = pf60Var.f152157b.mo53362U0();
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.f153268a);
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureViewMo53362U0);
        bnl0.C16067g c16067gM105560i2 = bnl0.m105560i0(pf60Var.f152157b.mo52310q());
        int iM175859d = (c16067gM105560i2.f77562d - (pf60Var.f152157b.mo53361U().f77560b - c16067gM105560i2.f77560b)) + qa00.m175859d(30.0f);
        int i2 = bnl0.m105560i0(pf60Var.f152157b.mo53483o0()).f77559a;
        float f3 = (c16067gM105560i0.f77561c * 1.0f) / c16067gM105560i1.f77561c;
        float f4 = (c16067gM105560i0.f77562d * 1.0f) / c16067gM105560i1.f77562d;
        float fMax = Math.max(f3, f4);
        final int i3 = (int) (((c16067gM105560i1.f77561c * fMax) - c16067gM105560i0.f77561c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132168n(pictureViewMo53362U0, gt0.f106354i, fMax);
        int i4 = c16067gM105560i0.f77559a;
        if (f4 >= f3) {
            f2 = (i4 - c16067gM105560i1.f77559a) - (((c16067gM105560i1.f77561c * fMax) - c16067gM105560i0.f77561c) / 2.0f);
            f = c16067gM105560i0.f77560b - c16067gM105560i1.f77560b;
        } else {
            float f5 = i4 - c16067gM105560i1.f77559a;
            f = (c16067gM105560i0.f77560b - c16067gM105560i1.f77560b) - (((c16067gM105560i1.f77562d * f3) - c16067gM105560i0.f77562d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nn90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pn90.m173043m(i3, pictureViewMo53362U0, valueAnimator);
            }
        });
        long jM173053q = m173053q();
        Animator animatorM173057x = m173057x(pf60Var.f152157b, m173053q(), iM175859d);
        View viewMo53347S1 = pf60Var.f152157b.mo53347S1();
        long jM173048v = m173048v();
        long jM173053q2 = m173053q();
        Interpolator interpolator = gt0.f106351f;
        float f6 = iM175859d;
        Animator animatorM132173s = gt0.m132173s(gt0.m132178x(jM173053q, animatorM173057x, gt0.m132170p(viewMo53347S1, "translationY", jM173048v, jM173053q2, interpolator, f6), gt0.m132170p(pf60Var.f152157b.mo53483o0(), "translationX", m173048v(), m173053q(), interpolator, i2), gt0.m132170p(pf60Var.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m173048v(), m173053q(), interpolator, 360.0f), gt0.m132170p(pf60Var.f152157b.mo53286J(), "translationX", m173048v(), m173053q(), interpolator, -i2), gt0.m132170p(pf60Var.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m173048v(), m173053q(), interpolator, -360.0f), gt0.m132170p(pf60Var.f152157b.mo53334Q2(), "alpha", 0L, 235L, null, 0.0f), pza0.m174353e(pf60Var.f152157b, 0, 235, null, 0, iM175859d), gt0.m132170p(pf60Var.f152157b.mo53548y1(), "translationY", 0L, 235L, null, f6), gt0.m132170p(pf60Var.f152157b.mo53498q2(), "translationY", 0L, 235L, null, f6), objectAnimator, gt0.m132171q(pictureViewMo53362U0, "translationX", f2), gt0.m132171q(pictureViewMo53362U0, "translationY", f), gt0.m132164j(10)));
        q3m q3mVar = pf60Var.f152157b;
        Objects.requireNonNull(q3mVar);
        gt0.m132176v(animatorM132173s, new o2h0(q3mVar));
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.on90
            @Override // java.lang.Runnable
            public final void run() {
                this.f148072a.m173051B();
            }
        });
        return animatorM132173s;
    }

    /* JADX INFO: renamed from: q */
    public final int m173053q() {
        float f = this.f153270c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public View mo21421a(ProfileAct profileAct) {
        return profileAct.m51949a3().mo52310q();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(Act act, ProfileAct profileAct) {
        final pf60<Act, q3m> pf60VarM173058y = m173058y(act, profileAct);
        final PictureView pictureViewMo53505r3 = pf60VarM173058y.f152157b.mo53505r3(0);
        if (!NullChecker.m82486a(pictureViewMo53505r3)) {
            return null;
        }
        pf60VarM173058y.f152156a.post(new Runnable() { // from class: l.jn90
            @Override // java.lang.Runnable
            public final void run() {
                this.f121760a.m173059z();
            }
        });
        bnl0.m105521K0(pictureViewMo53505r3, bnl0.m105560i0(this.f153268a), bnl0.m105560i0(pictureViewMo53505r3));
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(pf60VarM173058y.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60VarM173058y.f152157b.mo53361U();
        bnl0.m105544a0(pictureViewMo53505r3);
        int iM175859d = (c16067gM105560i0.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i0.f77560b)) + qa00.m175859d(30.0f);
        int i = bnl0.m105560i0(pf60VarM173058y.f152157b.mo53483o0()).f77559a;
        Iterator<View> it = pf60VarM173058y.f152157b.mo53236B1().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(iM175859d);
        }
        pf60VarM173058y.f152157b.mo53483o0().setTranslationX(i);
        pf60VarM173058y.f152157b.mo53483o0().setRotation(360.0f);
        pf60VarM173058y.f152157b.mo53286J().setTranslationX(-i);
        pf60VarM173058y.f152157b.mo53286J().setRotation(-360.0f);
        float f = iM175859d;
        pf60VarM173058y.f152157b.mo53347S1().setTranslationY(f);
        pf60VarM173058y.f152157b.mo53260F().setTranslationY(0.0f);
        pf60VarM173058y.f152157b.mo53548y1().setTranslationY(f);
        pf60VarM173058y.f152157b.mo53498q2().setTranslationY(f);
        pf60VarM173058y.f152157b.mo53334Q2().setAlpha(0.0f);
        Animator animatorM132171q = gt0.m132171q(pf60VarM173058y.f152157b.mo53334Q2(), "alpha", 1.0f);
        View viewMo53347S1 = pf60VarM173058y.f152157b.mo53347S1();
        long jM173048v = m173048v();
        long jM173049w = m173049w();
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132170p = gt0.m132170p(viewMo53347S1, "translationY", jM173048v, jM173049w, interpolator, 0.0f);
        Animator animatorM173047s = m173047s(pf60VarM173058y.f152157b);
        Animator animatorM132170p2 = gt0.m132170p(pf60VarM173058y.f152157b.mo53483o0(), "translationX", m173048v(), m173049w(), interpolator, 0.0f);
        Animator animatorM132170p3 = gt0.m132170p(pf60VarM173058y.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m173048v(), m173049w(), interpolator, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(pf60VarM173058y.f152157b.mo53286J(), "translationX", m173048v(), m173049w(), interpolator, 0.0f);
        Animator animatorM132170p5 = gt0.m132170p(pf60VarM173058y.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m173048v(), m173049w(), interpolator, 0.0f);
        q3m q3mVar = pf60VarM173058y.f152157b;
        int iM173048v = m173048v();
        int iM173053q = m173053q();
        Interpolator interpolator2 = gt0.f106348c;
        Animator animatorM174353e = pza0.m174353e(q3mVar, iM173048v, iM173053q, interpolator2, iM175859d, 0);
        Animator animatorM132170p6 = gt0.m132170p(pf60VarM173058y.f152157b.mo53548y1(), "translationY", m173048v(), m173053q(), interpolator2, 0.0f);
        Animator animatorM132170p7 = gt0.m132170p(pf60VarM173058y.f152157b.mo53498q2(), "translationY", m173048v(), m173053q(), interpolator2, 0.0f);
        Property<View, Float> property = gt0.f106354i;
        long jM173053q = m173053q();
        Interpolator interpolator3 = gt0.f106346a;
        Animator animatorM132180z = gt0.m132180z(animatorM132171q, animatorM132170p, animatorM173047s, animatorM132170p2, animatorM132170p3, animatorM132170p4, animatorM132170p5, animatorM174353e, animatorM132170p6, animatorM132170p7, gt0.m132166l(pictureViewMo53505r3, property, 0L, jM173053q, interpolator3, 1.0f), gt0.m132170p(pictureViewMo53505r3, "translationX", 0L, m173053q(), interpolator3, 0.0f), gt0.m132170p(pictureViewMo53505r3, "translationY", 0L, m173053q(), interpolator3, 0.0f), gt0.m132166l(pf60VarM173058y.f152157b.mo53537w3(), gt0.f106354i, 0L, m173053q(), interpolator3, 1.0f), gt0.m132170p(pf60VarM173058y.f152157b.mo53537w3(), "translationX", 0L, m173053q(), interpolator3, 0.0f), gt0.m132170p(pf60VarM173058y.f152157b.mo53537w3(), "translationY", 0L, m173053q(), interpolator3, 0.0f));
        if (pf60VarM173058y.f152157b.mo53333Q()) {
            pf60VarM173058y.f152157b.mo53260F().setAlpha(0.0f);
        }
        pf60VarM173058y.f152157b.mo53460k3();
        return gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.kn90
            @Override // java.lang.Runnable
            public final void run() {
                this.f127566a.m173050A(pf60VarM173058y, pictureViewMo53505r3);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(Act act, ProfileAct profileAct) {
        pf60<Act, q3m> pf60VarM173058y = m173058y(act, profileAct);
        int iMo53415c0 = pf60VarM173058y.f152157b.mo53415c0();
        VPager_SquaredRefactor vPager_SquaredRefactorMo53523u2 = pf60VarM173058y.f152157b.mo53523u2();
        if (vPager_SquaredRefactorMo53523u2 == null) {
            return null;
        }
        pf60VarM173058y.f152157b.mo53523u2().m224386b0();
        bnl0.m105583u(pf60VarM173058y.f152157b.mo53378W());
        bnl0.m105585v(pf60VarM173058y.f152157b.mo53523u2());
        RecyclerView.AbstractC0579o layoutManager = pf60VarM173058y.f152157b.mo53378W().getLayoutManager();
        pf60VarM173058y.f152157b.mo53378W().setClipChildren(false);
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo53523u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
            return m173052C(pf60VarM173058y, iMo53415c0);
        }
        Animator animatorM132164j = gt0.m132164j(3000);
        int iM105592y0 = (int) (bnl0.m105592y0() / 0.8f);
        int iMo52294i3 = pf60VarM173058y.f152157b.mo52294i3();
        int i = iM105592y0 + iMo52294i3;
        int iM173053q = m173053q();
        float f = iM173053q;
        float f2 = (f - ((int) ((iMo52294i3 / i) * f))) / f;
        this.f153270c = f2;
        if (f2 <= 0.01f) {
            this.f153270c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM173053q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C19407a(i, iM105592y0, pf60VarM173058y, iMo53415c0, animatorM132164j));
        gt0.m132176v(animatorM132164j, new l2h0(valueAnimatorOfInt));
        return animatorM132164j;
    }

    /* JADX INFO: renamed from: x */
    public final Animator m173057x(q3m q3mVar, int i, int i2) {
        float f;
        View viewMo53260F = q3mVar.mo53260F();
        Animator animatorM132164j = gt0.m132164j(0);
        if (NullChecker.m82486a(viewMo53260F)) {
            float alpha = viewMo53260F.getAlpha();
            if (alpha < 1.0f) {
                bnl0.m105524M(viewMo53260F, false);
                return gt0.m132164j(0);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewMo53260F.animate();
            if (NullChecker.m82486a(viewPropertyAnimatorAnimate)) {
                viewPropertyAnimatorAnimate.cancel();
            }
            f = alpha;
        } else {
            f = 1.0f;
        }
        if (!q3mVar.mo53333Q()) {
            return animatorM132164j;
        }
        long j = i;
        Interpolator interpolator = gt0.f106351f;
        return gt0.m132180z(gt0.m132170p(viewMo53260F, "scaleX", 0L, j, interpolator, f, 0.1f), gt0.m132170p(viewMo53260F, "scaleY", 0L, j, interpolator, f, 0.1f), gt0.m132170p(viewMo53260F, "alpha", 0L, j, interpolator, f, 0.0f));
    }

    /* JADX INFO: renamed from: y */
    public pf60<Act, q3m> m173058y(Act act, ProfileAct profileAct) {
        return jyb.m147494Y(act, profileAct.m51949a3());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m173059z() {
        this.f153269b.call(Boolean.FALSE);
    }
}
