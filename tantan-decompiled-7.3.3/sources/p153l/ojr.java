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
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class ojr extends Act.AbstractC4455w<LikersAct, ProfileAct> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f147698a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f147699b;

    /* JADX INFO: renamed from: c */
    public float f147700c = -1.0f;

    /* JADX INFO: renamed from: l.ojr$a */
    public class C19155a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f147701a = false;

        /* JADX INFO: renamed from: b */
        public int f147702b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f147703c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f147704d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ pf60 f147705e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Animator f147706f;

        public C19155a(int i, int i2, pf60 pf60Var, Animator animator) {
            this.f147703c = i;
            this.f147704d = i2;
            this.f147705e = pf60Var;
            this.f147706f = animator;
            this.f147702b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - this.f147704d;
            RecyclerView recyclerViewMo53378W = ((q3m) this.f147705e.f152157b).mo53378W();
            if (this.f147701a) {
                return;
            }
            recyclerViewMo53378W.scrollBy(0, (-this.f147702b) + iIntValue);
            this.f147702b = iIntValue;
            if (i <= this.f147704d) {
                Animator animatorM167932w = ojr.this.m167932w(this.f147705e);
                Animator animator = this.f147706f;
                Objects.requireNonNull(animator);
                gt0.m132160f(animatorM167932w, new p2h0(animator));
                animatorM167932w.start();
                this.f147701a = true;
            }
        }
    }

    public ojr(VDraweeView vDraweeView, LinearLayout linearLayout) {
        this.f147698a = vDraweeView;
        this.f147699b = linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m167924j(pf60 pf60Var, final PictureView pictureView) {
        ((LikersAct) pf60Var.f152156a).post(new Runnable() { // from class: l.mjr
            @Override // java.lang.Runnable
            public final void run() {
                ojr.m167926l(pictureView);
            }
        });
        ((q3m) pf60Var.f152157b).mo53485o2();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m167925k(int i, PictureView pictureView, ValueAnimator valueAnimator) {
        int animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * i) / ((Float) valueAnimator.getAnimatedValue()).floatValue());
        pictureView.setPadding(animatedFraction, 0, animatedFraction, 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m167926l(PictureView pictureView) {
        if ((pictureView.f28888G instanceof Video) && asj0.m99935d0()) {
            pictureView.m45174V();
        }
    }

    /* JADX INFO: renamed from: q */
    private int m167928q() {
        float f = this.f147700c;
        if (f != -1.0f) {
            return (int) (f * 275.0f);
        }
        return 275;
    }

    /* JADX INFO: renamed from: r */
    private int m167929r() {
        float f = this.f147700c;
        if (f != -1.0f) {
            return (int) (f * 15.0f);
        }
        return 15;
    }

    /* JADX INFO: renamed from: s */
    private int m167930s() {
        float f = this.f147700c;
        if (f != -1.0f) {
            return (int) (f * 235.0f);
        }
        return 235;
    }

    /* JADX INFO: renamed from: t */
    private int m167931t() {
        return 400;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    /* JADX INFO: renamed from: w */
    public Animator m167932w(pf60<LikersAct, q3m> pf60Var) {
        float f;
        float f2;
        pf60Var.f152157b.mo53415c0();
        final PictureView pictureViewMo53362U0 = pf60Var.f152157b.mo53362U0();
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(this.f147698a);
        bnl0.C16067g c16067gM105560i1 = bnl0.m105560i0(pictureViewMo53362U0);
        bnl0.C16067g c16067gM105560i2 = bnl0.m105560i0(pf60Var.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60Var.f152157b.mo53361U();
        bnl0.C16067g c16067gM105560i3 = bnl0.m105560i0(this.f147699b);
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
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.njr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ojr.m167925k(i2, pictureViewMo53362U0, valueAnimator);
            }
        });
        long jM167928q = m167928q();
        View viewMo53347S1 = pf60Var.f152157b.mo53347S1();
        long jM167929r = m167929r();
        long jM167928q2 = m167928q();
        Interpolator interpolator = gt0.f106351f;
        float f6 = iM175859d;
        Animator animatorM132173s = gt0.m132173s(gt0.m132178x(jM167928q, gt0.m132170p(viewMo53347S1, "translationY", jM167929r, jM167928q2, interpolator, f6), gt0.m132170p(pf60Var.f152157b.mo53483o0(), "translationX", m167929r(), m167928q(), interpolator, i), gt0.m132170p(pf60Var.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m167929r(), m167928q(), interpolator, 360.0f), gt0.m132170p(pf60Var.f152157b.mo53286J(), "translationX", m167929r(), m167928q(), interpolator, -i), gt0.m132170p(pf60Var.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m167929r(), m167928q(), interpolator, -360.0f), gt0.m132170p(pf60Var.f152157b.mo53334Q2(), "alpha", 0L, m167930s(), null, 0.0f), pza0.m174353e(pf60Var.f152157b, 0, m167930s(), null, 0, iM175859d), gt0.m132170p(pf60Var.f152157b.mo53548y1(), "translationY", 0L, m167930s(), null, f6), gt0.m132170p(pf60Var.f152157b.mo53498q2(), "translationY", 0L, m167930s(), null, f6), objectAnimator, gt0.m132171q(pictureViewMo53362U0, "translationX", f2), gt0.m132171q(pictureViewMo53362U0, "translationY", f), gt0.m132168n(pf60Var.f152157b.mo53537w3(), gt0.f106354i, (c16067gM105560i3.f77561c * 1.0f) / c16067gM105560i4.f77561c), gt0.m132171q(pf60Var.f152157b.mo53537w3(), "translationX", c16067gM105560i3.f77559a - c16067gM105560i4.f77559a), gt0.m132171q(pf60Var.f152157b.mo53537w3(), "translationY", c16067gM105560i3.f77560b - c16067gM105560i4.f77560b)), gt0.m132164j(10));
        q3m q3mVar = pf60Var.f152157b;
        Objects.requireNonNull(q3mVar);
        gt0.m132176v(animatorM132173s, new o2h0(q3mVar));
        return animatorM132173s;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public View mo21421a(ProfileAct profileAct) {
        return profileAct.m51949a3().mo52310q();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(LikersAct likersAct, ProfileAct profileAct) {
        final pf60<LikersAct, q3m> pf60VarM167936u = m167936u(likersAct, profileAct);
        final PictureView pictureViewMo53505r3 = pf60VarM167936u.f152157b.mo53505r3(0);
        if (!NullChecker.m82486a(pictureViewMo53505r3)) {
            return null;
        }
        bnl0.m105521K0(pictureViewMo53505r3, bnl0.m105560i0(this.f147698a), bnl0.m105560i0(pictureViewMo53505r3));
        bnl0.m105521K0(pf60VarM167936u.f152157b.mo53537w3(), bnl0.m105560i0(this.f147699b), bnl0.m105560i0(pf60VarM167936u.f152157b.mo53537w3()));
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(pf60VarM167936u.f152157b.mo52310q());
        bnl0.C16067g c16067gMo53361U = pf60VarM167936u.f152157b.mo53361U();
        bnl0.m105544a0(pictureViewMo53505r3);
        final int iM175859d = (c16067gM105560i0.f77562d - (c16067gMo53361U.f77560b - c16067gM105560i0.f77560b)) + qa00.m175859d(30.0f);
        int i = bnl0.m105560i0(pf60VarM167936u.f152157b.mo53483o0()).f77559a;
        jyb.m147537z(pf60VarM167936u.f152157b.mo53236B1(), new y20() { // from class: l.kjr
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setTranslationY(iM175859d);
            }
        });
        pf60VarM167936u.f152157b.mo53483o0().setTranslationX(i);
        pf60VarM167936u.f152157b.mo53483o0().setRotation(360.0f);
        pf60VarM167936u.f152157b.mo53286J().setTranslationX(-i);
        pf60VarM167936u.f152157b.mo53286J().setRotation(-360.0f);
        float f = iM175859d;
        pf60VarM167936u.f152157b.mo53347S1().setTranslationY(f);
        pf60VarM167936u.f152157b.mo53548y1().setTranslationY(f);
        pf60VarM167936u.f152157b.mo53498q2().setTranslationY(f);
        pf60VarM167936u.f152157b.mo53334Q2().setAlpha(0.0f);
        Animator animatorM132171q = gt0.m132171q(pf60VarM167936u.f152157b.mo53334Q2(), "alpha", 1.0f);
        View viewMo53347S1 = pf60VarM167936u.f152157b.mo53347S1();
        long jM167929r = m167929r();
        long jM167931t = m167931t();
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132170p = gt0.m132170p(viewMo53347S1, "translationY", jM167929r, jM167931t, interpolator, 0.0f);
        Animator animatorM132170p2 = gt0.m132170p(pf60VarM167936u.f152157b.mo53483o0(), "translationX", m167929r(), m167931t(), interpolator, 0.0f);
        Animator animatorM132170p3 = gt0.m132170p(pf60VarM167936u.f152157b.mo53483o0(), BLiveGiftItem.TYPE_ROTATION, m167929r(), m167931t(), interpolator, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(pf60VarM167936u.f152157b.mo53286J(), "translationX", m167929r(), m167931t(), interpolator, 0.0f);
        Animator animatorM132170p5 = gt0.m132170p(pf60VarM167936u.f152157b.mo53286J(), BLiveGiftItem.TYPE_ROTATION, m167929r(), m167931t(), interpolator, 0.0f);
        q3m q3mVar = pf60VarM167936u.f152157b;
        int iM167929r = m167929r();
        int iM167928q = m167928q();
        Interpolator interpolator2 = gt0.f106348c;
        Animator animatorM174353e = pza0.m174353e(q3mVar, iM167929r, iM167928q, interpolator2, iM175859d, 0);
        Animator animatorM132170p6 = gt0.m132170p(pf60VarM167936u.f152157b.mo53548y1(), "translationY", m167929r(), m167928q(), interpolator2, 0.0f);
        Animator animatorM132170p7 = gt0.m132170p(pf60VarM167936u.f152157b.mo53498q2(), "translationY", m167929r(), m167928q(), interpolator2, 0.0f);
        Property<View, Float> property = gt0.f106354i;
        long jM167928q = m167928q();
        Interpolator interpolator3 = gt0.f106346a;
        Animator animatorM132180z = gt0.m132180z(animatorM132171q, animatorM132170p, animatorM132170p2, animatorM132170p3, animatorM132170p4, animatorM132170p5, animatorM174353e, animatorM132170p6, animatorM132170p7, gt0.m132166l(pictureViewMo53505r3, property, 0L, jM167928q, interpolator3, 1.0f), gt0.m132170p(pictureViewMo53505r3, "translationX", 0L, m167928q(), interpolator3, 0.0f), gt0.m132170p(pictureViewMo53505r3, "translationY", 0L, m167928q(), interpolator3, 0.0f), gt0.m132166l(pf60VarM167936u.f152157b.mo53537w3(), gt0.f106354i, 0L, m167928q(), interpolator3, 1.0f), gt0.m132170p(pf60VarM167936u.f152157b.mo53537w3(), "translationX", 0L, m167928q(), interpolator3, 0.0f), gt0.m132170p(pf60VarM167936u.f152157b.mo53537w3(), "translationY", 0L, m167928q(), interpolator3, 0.0f));
        pf60VarM167936u.f152157b.mo53460k3();
        return gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.ljr
            @Override // java.lang.Runnable
            public final void run() {
                ojr.m167924j(pf60VarM167936u, pictureViewMo53505r3);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(LikersAct likersAct, ProfileAct profileAct) {
        pf60<LikersAct, q3m> pf60VarM167936u = m167936u(likersAct, profileAct);
        VPager_SquaredRefactor vPager_SquaredRefactorMo53523u2 = pf60VarM167936u.f152157b.mo53523u2();
        if (vPager_SquaredRefactorMo53523u2 == null) {
            return null;
        }
        vPager_SquaredRefactorMo53523u2.m224386b0();
        bnl0.m105583u(pf60VarM167936u.f152157b.mo53378W());
        bnl0.m105585v(vPager_SquaredRefactorMo53523u2);
        RecyclerView.AbstractC0579o layoutManager = pf60VarM167936u.f152157b.mo53378W().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && vPager_SquaredRefactorMo53523u2.isAttachedToWindow() && ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
            return m167932w(pf60VarM167936u);
        }
        Animator animatorM132164j = gt0.m132164j(3000);
        int iM105592y0 = (int) (bnl0.m105592y0() / 0.8f);
        int iMo52294i3 = pf60VarM167936u.f152157b.mo52294i3();
        int i = iM105592y0 + iMo52294i3;
        int iM167928q = m167928q();
        float f = iM167928q;
        float f2 = (f - ((int) ((iMo52294i3 / i) * f))) / f;
        this.f147700c = f2;
        if (f2 <= 0.01f) {
            this.f147700c = 0.01f;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        valueAnimatorOfInt.setDuration(iM167928q);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new C19155a(i, iM105592y0, pf60VarM167936u, animatorM132164j));
        gt0.m132176v(animatorM132164j, new l2h0(valueAnimatorOfInt));
        return animatorM132164j;
    }

    /* JADX INFO: renamed from: u */
    public pf60<LikersAct, q3m> m167936u(LikersAct likersAct, ProfileAct profileAct) {
        return jyb.m147494Y(likersAct, profileAct.m51949a3());
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21413h(LikersAct likersAct, ProfileAct profileAct) {
    }
}
