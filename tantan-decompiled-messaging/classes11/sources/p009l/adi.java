package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.e51;
import l.f6c0;
import l.j760;
import l.ke7;
import l.mkd0;
import l.ool0;
import l.t7m;
import l.u4c0;
import l.w9j;
import l.xma;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class adi implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f9416a;

    /* JADX INFO: renamed from: b */
    public FemaleVerificationGuideCardView f9417b;

    /* JADX INFO: renamed from: c */
    public VText f9418c;

    /* JADX INFO: renamed from: d */
    public Boolean f9419d = Boolean.FALSE;

    /* JADX INFO: renamed from: e */
    public int f9420e = -1;

    /* JADX INFO: renamed from: f */
    public c4g0 f9421f = null;

    /* JADX INFO: renamed from: g */
    public c4g0 f9422g = null;

    public adi(NewNewHomeFrag newNewHomeFrag) {
        this.f9416a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: d */
    public View m11333d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewInflate = layoutInflater.inflate(f6c0.p3, viewGroup, false);
        this.f9418c = viewInflate.findViewById(u4c0.Yb);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m11334e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (NullChecker.a(this.f9416a) && NullChecker.a(this.f9416a.f456C)) {
            this.f9416a.f456C.m1172P2();
            if (view instanceof FemaleVerificationGuideCardView) {
                this.f9420e = i;
                FemaleVerificationGuideCardView femaleVerificationGuideCardView = (FemaleVerificationGuideCardView) view;
                this.f9417b = femaleVerificationGuideCardView;
                femaleVerificationGuideCardView.m377h(this.f9416a, this, CoreModule.c.z2.l3());
            }
        }
        m11341r();
    }

    /* JADX INFO: renamed from: f */
    public boolean m11335f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m11336g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        if (!xma.L3() && z && ke7.u()) {
            this.f9416a.act().startActivity(VerificationCenterAct.Y1(this.f9416a.act(), false, "button"));
        }
        zvf0.w("e_trial_end_card", "p_suggest_users_home_view", new j760[]{j760.a("swipe_direction", z ? "right" : "left")});
        mkd0.z(this.f9421f);
        mkd0.z(this.f9422g);
        e51.I(this.f9416a, new Runnable() { // from class: l.uci
            @Override // java.lang.Runnable
            public final void run() {
                this.f21067a.m11338o();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m11338o() {
        if (CoreModule.c.m0.o6() == 0) {
            CoreModule.c.m0.m8();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11339p(Boolean bool) {
        if (bool.booleanValue() && this.f9420e == 0) {
            this.f9416a.mo698V(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11340q(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified") && this.f9420e == 0) {
            this.f9416a.mo698V(SwipeDirection.RIGHT);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "prePending") || TEnum.equals(studentVerificationStatus, "pending")) {
            if (NullChecker.a(this.f9418c)) {
                this.f9418c.setText("认证审核中");
            }
        } else if (NullChecker.a(this.f9418c)) {
            this.f9418c.setText("去认证");
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11341r() {
        if (this.f9416a == null) {
            return;
        }
        c4g0 c4g0Var = this.f9421f;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f9421f = this.f9416a.duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.vci
                public final Object call(Object obj) {
                    return Boolean.valueOf(xma.L3());
                }
            })).distinctUntilChanged().skip(1).take(1).subscribe(mkd0.G(new e30() { // from class: l.wci
                public final void call(Object obj) {
                    this.f22000a.m11339p((Boolean) obj);
                }
            }));
        }
        c4g0 c4g0Var2 = this.f9422g;
        if (c4g0Var2 == null || c4g0Var2.isUnsubscribed()) {
            this.f9422g = this.f9416a.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged()).filter(new w9j() { // from class: l.xci
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf((verificationCenter == null || (picVerificationInfo = verificationCenter.picVerificationInfo) == null || verificationCenter.status == null) ? false : true);
                }
            }).map(new w9j() { // from class: l.yci
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo.status;
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.zci
                public final void call(Object obj) {
                    this.f23565a.m11340q((StudentVerificationStatus) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11331b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m11332c(View view) {
    }
}
