package p153l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.suggest.SuggestersAct;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class q2h0 extends Act.AbstractC4455w<SuggestersAct, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f155335a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f155336b;

    /* JADX INFO: renamed from: c */
    public float f155337c = -1.0f;

    /* JADX INFO: renamed from: l.q2h0$a */
    public class C19509a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f155338a = false;

        /* JADX INFO: renamed from: b */
        public int f155339b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f155340c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f155341d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ pf60 f155342e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f155343f;

        public C19509a(int i, int i2, pf60 pf60Var, Animator animator) {
            this.f155340c = i;
            this.f155341d = i2;
            this.f155342e = pf60Var;
            this.f155343f = animator;
            this.f155339b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f155341d;
            RecyclerView recyclerViewMo53378W = ((q3m) this.f155342e.f152157b).mo53378W();
            if (this.f155338a) {
                return;
            }
            recyclerViewMo53378W.scrollBy(0, (-this.f155339b) + iIntValue);
            this.f155339b = iIntValue;
            if (i <= this.f155341d) {
                Animator animatorM175041w = q2h0.this.m175041w(this.f155342e);
                Animator animator = this.f155343f;
                Objects.requireNonNull(animator);
                gt0.m132160f(animatorM175041w, new p2h0(animator));
                animatorM175041w.start();
                this.f155338a = true;
            }
        }
    }

    public q2h0(VDraweeView vDraweeView, LinearLayout linearLayout) {
        this.f155335a = vDraweeView;
        this.f155336b = linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m175028j(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m175029k(PictureView pictureView) {
        if ((pictureView.f28888G instanceof Video) && asj0.m99935d0()) {
            pictureView.m45174V();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m175030l(pf60 pf60Var, final PictureView pictureView) {
        ((SuggestersAct) pf60Var.f152156a).post(new Runnable() { // from class: l.m2h0
            @Override // java.lang.Runnable
            public final void run() {
                q2h0.m175029k(pictureView);
            }
        });
        ((q3m) pf60Var.f152157b).mo53485o2();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public View mo21421a(ProfileAct profileAct) {
        return profileAct.m51949a3().mo52310q();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(SuggestersAct suggestersAct, ProfileAct profileAct) {
        final pf60<SuggestersAct, q3m> pf60VarM175039u = m175039u(suggestersAct, profileAct);
        final PictureView pictureViewMo53505r3 = pf60VarM175039u.f152157b.mo53505r3(0);
        if (!NullChecker.m82486a(pictureViewMo53505r3)) {
            return null;
        }
        bnl0.m105521K0(pictureViewMo53505r3, bnl0.m105560i0(this.f155335a), bnl0.m105560i0(pictureViewMo53505r3));
        bnl0.m105521K0(pf60VarM175039u.f152157b.mo53537w3(), bnl0.m105560i0(this.f155336b), bnl0.m105560i0(pf60VarM175039u.f152157b.mo53537w3()));
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(pf60VarM175039u.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60VarM175039u.f152157b.mo53361U();
        bnl0.m105544a0(pictureViewMo53505r3);
        final int iM175859d = (c16067gM105560i0.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i0.f77560b)) + qa00.m175859d(30.0f);
        int i = bnl0.m105560i0(pf60VarM175039u.f152157b.mo53483o0()).f77559a;
        jyb.m147537z(pf60VarM175039u.f152157b.mo53236B1(), new y20() { // from class: l.j2h0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setTranslationY(iM175859d);
            }
        });
        pf60VarM175039u.f152157b.mo53483o0().setTranslationX(i);
        pf60VarM175039u.f152157b.mo53483o0().setRotation(360.0f);
        pf60VarM175039u.f152157b.mo53286J().setTranslationX(-i);
        pf60VarM175039u.f152157b.mo53286J().setRotation(-360.0f);
        float f = iM175859d;
        pf60VarM175039u.f152157b.mo53347S1().setTranslationY(f);
        pf60VarM175039u.f152157b.mo53548y1().setTranslationY(f);
        pf60VarM175039u.f152157b.mo53498q2().setTranslationY(f);
        pf60VarM175039u.f152157b.mo53334Q2().setAlpha(0.0f);
        Animator animatorM132171q = gt0.m132171q(pf60VarM175039u.f152157b.mo53334Q2(), "alpha", 1.0f);
        View viewMo53347S1 = pf60VarM175039u.f152157b.mo53347S1();
        long jM175036r = m175036r();
        long jM175038t = m175038t();
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132170p = gt0.m132170p(viewMo53347S1, "translationY", jM175036r, jM175038t, interpolator, 0.0f);
        Animator animatorM132170p2 = gt0.m132170p(pf60VarM175039u.f152157b.mo53483o0(), "translationX", m175036r(), m175038t(), interpolator, 0.0f);
        Animator animatorM132170p3 = gt0.m132170p(pf60VarM175039u.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m175036r(), m175038t(), interpolator, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(pf60VarM175039u.f152157b.mo53286J(), "translationX", m175036r(), m175038t(), interpolator, 0.0f);
        Animator animatorM132170p5 = gt0.m132170p(pf60VarM175039u.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m175036r(), m175038t(), interpolator, 0.0f);
        q3m q3mVar = pf60VarM175039u.f152157b;
        int iM175036r = m175036r();
        int iM175035q = m175035q();
        Interpolator interpolator2 = gt0.f106348c;
        Animator animatorM174353e = pza0.m174353e(q3mVar, iM175036r, iM175035q, interpolator2, iM175859d, 0);
        Animator animatorM132170p6 = gt0.m132170p(pf60VarM175039u.f152157b.mo53548y1(), "translationY", m175036r(), m175035q(), interpolator2, 0.0f);
        Animator animatorM132170p7 = gt0.m132170p(pf60VarM175039u.f152157b.mo53498q2(), "translationY", m175036r(), m175035q(), interpolator2, 0.0f);
        Property<View, Float> property = gt0.f106354i;
        long jM175035q = m175035q();
        Interpolator interpolator3 = gt0.f106346a;
        Animator animatorM132180z = gt0.m132180z(animatorM132171q, animatorM132170p, animatorM132170p2, animatorM132170p3, animatorM132170p4, animatorM132170p5, animatorM174353e, animatorM132170p6, animatorM132170p7, gt0.m132166l(pictureViewMo53505r3, property, 0L, jM175035q, interpolator3, 1.0f), gt0.m132170p(pictureViewMo53505r3, "translationX", 0L, m175035q(), interpolator3, 0.0f), gt0.m132170p(pictureViewMo53505r3, "translationY", 0L, m175035q(), interpolator3, 0.0f), gt0.m132166l(pf60VarM175039u.f152157b.mo53537w3(), gt0.f106354i, 0L, m175035q(), interpolator3, 1.0f), gt0.m132170p(pf60VarM175039u.f152157b.mo53537w3(), "translationX", 0L, m175035q(), interpolator3, 0.0f), gt0.m132170p(pf60VarM175039u.f152157b.mo53537w3(), "translationY", 0L, m175035q(), interpolator3, 0.0f));
        pf60VarM175039u.f152157b.mo53460k3();
        return gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.k2h0
            @Override // java.lang.Runnable
            public final void run() {
                q2h0.m175030l(pf60VarM175039u, pictureViewMo53505r3);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(SuggestersAct suggestersAct, ProfileAct profileAct) {
        pf60<SuggestersAct, q3m> pf60VarM175039u = m175039u(suggestersAct, profileAct);
        VPager_SquaredRefactor vPager_SquaredRefactorMo53523u2 = pf60VarM175039u.f152157b.mo53523u2();
        if (vPager_SquaredRefactorMo53523u2 == null) {
            return null;
        }
        vPager_SquaredRefactorMo53523u2.m224386b0();
        bnl0.m105583u(pf60VarM175039u.f152157b.mo53378W());
        bnl0.m105585v(vPager_SquaredRefactorMo53523u2);
        RecyclerView.AbstractC0579o layoutManager = pf60VarM175039u.f152157b.mo53378W().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo53523u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
            return m175041w(pf60VarM175039u);
        }
        Animator animatorM132164j = gt0.m132164j(3000);
        int iM105592y0 = (int) (bnl0.m105592y0() / 0.8f);
        int iMo52294i3 = pf60VarM175039u.f152157b.mo52294i3();
        int i = iM105592y0 + iMo52294i3;
        int iM175035q = m175035q();
        float f = iM175035q;
        float f2 = (f - ((int) ((iMo52294i3 / i) * f))) / f;
        this.f155337c = f2;
        if (f2 <= 0.01f) {
            this.f155337c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM175035q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C19509a(i, iM105592y0, pf60VarM175039u, animatorM132164j));
        gt0.m132176v(animatorM132164j, new l2h0(valueAnimatorOfInt));
        return animatorM132164j;
    }

    /* JADX INFO: renamed from: q */
    public final int m175035q() {
        float f = this.f155337c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r */
    public final int m175036r() {
        float f = this.f155337c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: s */
    public final int m175037s() {
        float f = this.f155337c;
        if (f != -1.0f) {
            return (int) (f * 235.0f);
        }
        return 235;
    }

    /* JADX INFO: renamed from: t */
    public final int m175038t() {
        return 400;
    }

    /* JADX INFO: renamed from: u */
    public pf60<SuggestersAct, q3m> m175039u(SuggestersAct suggestersAct, ProfileAct profileAct) {
        return jyb.m147494Y(suggestersAct, profileAct.m51949a3());
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final Animator m175041w(pf60<SuggestersAct, q3m> pf60Var) {
        float f;
        float f2;
        pf60Var.f152157b.mo53415c0();
        final PictureView pictureViewMo53362U0 = pf60Var.f152157b.mo53362U0();
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.f155335a);
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureViewMo53362U0);
        bnl0.C16067g c16067gM105560i2 = bnl0.m105560i0(pf60Var.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60Var.f152157b.mo53361U();
        bnl0.C16067g c16067gM105560i3 = bnl0.m105560i0(this.f155336b);
        bnl0.C16067g c16067gM105560i4 = bnl0.m105560i0(pf60Var.f152157b.mo53537w3());
        int iM175859d = (c16067gM105560i2.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i2.f77560b)) + qa00.m175859d(30.0f);
        int i = bnl0.m105560i0(pf60Var.f152157b.mo53483o0()).f77559a;
        float f3 = (c16067gM105560i0.f77561c * 1.0f) / c16067gM105560i1.f77561c;
        float f4 = (c16067gM105560i0.f77562d * 1.0f) / c16067gM105560i1.f77562d;
        float fMax = Math.max(f3, f4);
        final int i2 = (int) (((c16067gM105560i1.f77561c * fMax) - c16067gM105560i0.f77561c) / 2.0f);
        ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132168n(pictureViewMo53362U0, gt0.f106354i, fMax);
        int i3 = c16067gM105560i0.f77559a;
        if (f4 >= f3) {
            f2 = (i3 - c16067gM105560i1.f77559a) - (((c16067gM105560i1.f77561c * fMax) - c16067gM105560i0.f77561c) / 2.0f);
            f = c16067gM105560i0.f77560b - c16067gM105560i1.f77560b;
        } else {
            float f5 = i3 - c16067gM105560i1.f77559a;
            f = (c16067gM105560i0.f77560b - c16067gM105560i1.f77560b) - (((c16067gM105560i1.f77562d * f3) - c16067gM105560i0.f77562d) / 2.0f);
            f2 = f5;
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n2h0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q2h0.m175028j(i2, pictureViewMo53362U0, valueAnimator);
            }
        });
        long jM175035q = m175035q();
        View viewMo53347S1 = pf60Var.f152157b.mo53347S1();
        long jM175036r = m175036r();
        long jM175035q2 = m175035q();
        Interpolator interpolator = gt0.f106351f;
        float f6 = iM175859d;
        Animator animatorM132173s = gt0.m132173s(gt0.m132178x(jM175035q, gt0.m132170p(viewMo53347S1, "translationY", jM175036r, jM175035q2, interpolator, f6), gt0.m132170p(pf60Var.f152157b.mo53483o0(), "translationX", m175036r(), m175035q(), interpolator, i), gt0.m132170p(pf60Var.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m175036r(), m175035q(), interpolator, 360.0f), gt0.m132170p(pf60Var.f152157b.mo53286J(), "translationX", m175036r(), m175035q(), interpolator, -i), gt0.m132170p(pf60Var.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m175036r(), m175035q(), interpolator, -360.0f), gt0.m132170p(pf60Var.f152157b.mo53334Q2(), "alpha", 0L, m175037s(), null, 0.0f), pza0.m174353e(pf60Var.f152157b, 0, m175037s(), null, 0, iM175859d), gt0.m132170p(pf60Var.f152157b.mo53548y1(), "translationY", 0L, m175037s(), null, f6), gt0.m132170p(pf60Var.f152157b.mo53498q2(), "translationY", 0L, m175037s(), null, f6), objectAnimator, gt0.m132171q(pictureViewMo53362U0, "translationX", f2), gt0.m132171q(pictureViewMo53362U0, "translationY", f), gt0.m132168n(pf60Var.f152157b.mo53537w3(), gt0.f106354i, (c16067gM105560i3.f77561c * 1.0f) / c16067gM105560i4.f77561c), gt0.m132171q(pf60Var.f152157b.mo53537w3(), "translationX", c16067gM105560i3.f77559a - c16067gM105560i4.f77559a), gt0.m132171q(pf60Var.f152157b.mo53537w3(), "translationY", c16067gM105560i3.f77560b - c16067gM105560i4.f77560b)), gt0.m132164j(10));
        q3m q3mVar = pf60Var.f152157b;
        Objects.requireNonNull(q3mVar);
        gt0.m132176v(animatorM132173s, new o2h0(q3mVar));
        return animatorM132173s;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21413h(SuggestersAct suggestersAct, ProfileAct profileAct) {
    }
}
