package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pei implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f152080a;

    /* JADX INFO: renamed from: b */
    public FemaleVerificationGuideCardView f152081b;

    /* JADX INFO: renamed from: c */
    public VText f152082c;

    /* JADX INFO: renamed from: d */
    public Boolean f152083d = Boolean.FALSE;

    /* JADX INFO: renamed from: e */
    public int f152084e = -1;

    /* JADX INFO: renamed from: f */
    public kcg0 f152085f = null;

    /* JADX INFO: renamed from: g */
    public kcg0 f152086g = null;

    public pei(NewNewHomeFrag newNewHomeFrag) {
        this.f152080a = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(kec0.f125994p3, viewGroup, false);
        this.f152082c = (VText) viewInflate.findViewById(adc0.f70255ac);
        return viewInflate;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.m82486a(this.f152080a) && NullChecker.m82486a(this.f152080a.f22420C)) {
            this.f152080a.f22420C.m38207P2();
            if (view instanceof FemaleVerificationGuideCardView) {
                this.f152084e = i;
                FemaleVerificationGuideCardView femaleVerificationGuideCardView = (FemaleVerificationGuideCardView) view;
                this.f152081b = femaleVerificationGuideCardView;
                femaleVerificationGuideCardView.m37451h(this.f152080a, this, CoreModule.f18264c.f20446z2.m31247l3());
            }
        }
        m172016r();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (!joa.m146361M3() && z && of7.m167424u()) {
            this.f152080a.act().startActivity(VerificationCenterAct.m57175Z1(this.f152080a.act(), false, "button"));
        }
        i4g0.m138525w("e_trial_end_card", "p_suggest_users_home_view", pf60.m172085a("swipe_direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left));
        psd0.m173633z(this.f152085f);
        psd0.m173633z(this.f152086g);
        l51.m152889I(this.f152080a, new Runnable() { // from class: l.jei
            @Override // java.lang.Runnable
            public final void run() {
                this.f120501a.m172013o();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m172013o() {
        if (CoreModule.f18264c.f20405m0.m32134o6() == 0) {
            CoreModule.f18264c.f20405m0.m32130m8();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m172014p(Boolean bool) {
        if (bool.booleanValue() && this.f152084e == 0) {
            this.f152080a.mo37749V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m172015q(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified") && this.f152084e == 0) {
            this.f152080a.mo37749V(SwipeDirection.RIGHT);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending) || TEnum.equals(studentVerificationStatus, "pending")) {
            if (NullChecker.m82486a(this.f152082c)) {
                this.f152082c.setText("认证审核中");
            }
        } else if (NullChecker.m82486a(this.f152082c)) {
            this.f152082c.setText("去认证");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m172016r() {
        if (this.f152080a == null) {
            return;
        }
        kcg0 kcg0Var = this.f152085f;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f152085f = this.f152080a.duringCreated((C22421c) CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.kei
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(joa.m146361M3());
                }
            })).distinctUntilChanged().skip(1).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.lei
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f131749a.m172014p((Boolean) obj);
                }
            }));
        }
        kcg0 kcg0Var2 = this.f152086g;
        if (kcg0Var2 == null || kcg0Var2.isUnsubscribed()) {
            this.f152086g = this.f152080a.duringCreated(CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged()).filter(new qcj() { // from class: l.mei
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf((verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null || verificationCenter.status == null) ? false : true);
                }
            }).map(new qcj() { // from class: l.nei
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.oei
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146993a.m172015q((StudentVerificationStatus) obj);
                }
            }));
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
