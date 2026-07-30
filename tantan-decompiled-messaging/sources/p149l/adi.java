package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class adi implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f68935a;

    /* JADX INFO: renamed from: b */
    public FemaleVerificationGuideCardView f68936b;

    /* JADX INFO: renamed from: c */
    public VText f68937c;

    /* JADX INFO: renamed from: d */
    public Boolean f68938d = Boolean.FALSE;

    /* JADX INFO: renamed from: e */
    public int f68939e = -1;

    /* JADX INFO: renamed from: f */
    public c4g0 f68940f = null;

    /* JADX INFO: renamed from: g */
    public c4g0 f68941g = null;

    public adi(NewNewHomeFrag newNewHomeFrag) {
        this.f68935a = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(f6c0.f95940p3, viewGroup, false);
        this.f68937c = (VText) viewInflate.findViewById(u4c0.f174131Yb);
        return viewInflate;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.m81303a(this.f68935a) && NullChecker.m81303a(this.f68935a.f21678C)) {
            this.f68935a.f21678C.m37204P2();
            if (view instanceof FemaleVerificationGuideCardView) {
                this.f68939e = i;
                FemaleVerificationGuideCardView femaleVerificationGuideCardView = (FemaleVerificationGuideCardView) view;
                this.f68936b = femaleVerificationGuideCardView;
                femaleVerificationGuideCardView.m36448h(this.f68935a, this, CoreModule.f17545c.f19704z2.m30249l3());
            }
        }
        m95891r();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (!xma.m210047L3() && z && ke7.m145736u()) {
            this.f68935a.act().startActivity(VerificationCenterAct.m55992Y1(this.f68935a.act(), false, "button"));
        }
        zvf0.m220401w("e_trial_end_card", "p_suggest_users_home_view", j760.m140076a("swipe_direction", z ? "right" : BLiveGiftBubblePopupTitlePosition.left));
        mkd0.m154992z(this.f68940f);
        mkd0.m154992z(this.f68941g);
        e51.m114744I(this.f68935a, new Runnable() { // from class: l.uci
            @Override // java.lang.Runnable
            public final void run() {
                this.f175827a.m95888o();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m95888o() {
        if (CoreModule.f17545c.f19663m0.m31131o6() == 0) {
            CoreModule.f17545c.f19663m0.m31127m8();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m95889p(Boolean bool) {
        if (bool.booleanValue() && this.f68939e == 0) {
            this.f68935a.mo36746V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m95890q(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified") && this.f68939e == 0) {
            this.f68935a.mo36746V(SwipeDirection.RIGHT);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending) || TEnum.equals(studentVerificationStatus, "pending")) {
            if (NullChecker.m81303a(this.f68937c)) {
                this.f68937c.setText("认证审核中");
            }
        } else if (NullChecker.m81303a(this.f68937c)) {
            this.f68937c.setText("去认证");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m95891r() {
        if (this.f68935a == null) {
            return;
        }
        c4g0 c4g0Var = this.f68940f;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f68940f = this.f68935a.duringCreated((C22306c) CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.vci
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.m210047L3());
                }
            })).distinctUntilChanged().skip(1).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.wci
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185692a.m95889p((Boolean) obj);
                }
            }));
        }
        c4g0 c4g0Var2 = this.f68941g;
        if (c4g0Var2 == null || c4g0Var2.isUnsubscribed()) {
            this.f68941g = this.f68935a.duringCreated(CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged()).filter(new w9j() { // from class: l.xci
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf((verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null || verificationCenter.status == null) ? false : true);
                }
            }).map(new w9j() { // from class: l.yci
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.zci
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202540a.m95890q((StudentVerificationStatus) obj);
                }
            }));
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
