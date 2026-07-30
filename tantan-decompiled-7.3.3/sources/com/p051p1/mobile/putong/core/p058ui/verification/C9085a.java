package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.verification.age.AgeVerificationAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;
import p153l.kec0;
import p153l.o1j0;
import p153l.pk50;
import p153l.uqb0;
import p153l.zki0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9085a implements iam<VerificationCenterPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f37502a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f37503b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f37504c;

    /* JADX INFO: renamed from: d */
    public VButton f37505d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f37506e;

    /* JADX INFO: renamed from: f */
    public TextView f37507f;

    /* JADX INFO: renamed from: g */
    public VText f37508g;

    /* JADX INFO: renamed from: h */
    public VText f37509h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f37510i;

    /* JADX INFO: renamed from: j */
    public VButton f37511j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f37512k;

    /* JADX INFO: renamed from: l */
    public TextView f37513l;

    /* JADX INFO: renamed from: m */
    public VText f37514m;

    /* JADX INFO: renamed from: n */
    public VText f37515n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f37516o;

    /* JADX INFO: renamed from: p */
    public VButton f37517p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f37518q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f37519r;

    /* JADX INFO: renamed from: s */
    public VButton f37520s;

    /* JADX INFO: renamed from: t */
    public VText f37521t;

    /* JADX INFO: renamed from: u */
    public VerificationCenterPresenter f37522u;

    /* JADX INFO: renamed from: v */
    public VerificationCenterFrag f37523v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a$a */
    public static class a {
        /* JADX INFO: renamed from: b */
        public static void m57246b(C9085a c9085a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c9085a.f37502a = (VNavigationBar) viewGroup.getChildAt(0);
            c9085a.f37503b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c9085a.f37504c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            c9085a.f37505d = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            c9085a.f37506e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            c9085a.f37507f = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            c9085a.f37508g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            c9085a.f37509h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
            c9085a.f37510i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
            c9085a.f37511j = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            c9085a.f37512k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            c9085a.f37513l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            c9085a.f37514m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            c9085a.f37515n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            c9085a.f37516o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(0);
            c9085a.f37517p = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(5);
            c9085a.f37518q = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            c9085a.f37519r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4)).getChildAt(0);
            c9085a.f37520s = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
            c9085a.f37521t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m57247c(C9085a c9085a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f126108vf, viewGroup, false);
            m57246b(c9085a, viewInflate);
            return viewInflate;
        }
    }

    public C9085a(VerificationCenterFrag verificationCenterFrag) {
        this.f37523v = verificationCenterFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f37523v.getContext();
    }

    /* JADX INFO: renamed from: F */
    public View m57232F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m57247c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(VerificationCenterPresenter verificationCenterPresenter) {
        this.f37522u = verificationCenterPresenter;
    }

    /* JADX INFO: renamed from: H */
    public final void m57234H() {
        this.f37518q.setOnClickListener(new View.OnClickListener() { // from class: l.y2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197267a.m57235I(view);
            }
        });
        this.f37506e.setOnClickListener(new View.OnClickListener() { // from class: l.z2l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202713a.m57236J(view);
            }
        });
        bnl0.m105509E0(this.f37512k, new View.OnClickListener() { // from class: l.a3l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68297a.m57237K(view);
            }
        });
        bnl0.m105509E0(this.f37504c, new View.OnClickListener() { // from class: l.b3l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74786a.m57238L(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m57235I(View view) {
        i4g0.m138520r("e_avatarVerification_student_card_click", "p_verification_center_view");
        StudentVerificationStatus studentVerificationStatus = this.f37522u.f37496b;
        if (studentVerificationStatus == null || !(TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(this.f37522u.f37496b, "verified"))) {
            getAct().startActivity(StudentInfoAct.m45668X1(getAct(), null, false));
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m57236J(View view) {
        i4g0.m138520r("e_avatarverification_avatar_card_click", "p_verification_center_view");
        if (TEnum.equals(this.f37522u.f37497c, "rejected") || TEnum.equals(this.f37522u.f37497c, "pending") || TEnum.equals(this.f37522u.f37497c, "verified")) {
            m57240N();
        } else {
            pk50.m172568j().m172574f().m181681s0(getAct(), OmsDialog.p_verification_center_policy_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m57237K(View view) {
        String str;
        StudentVerificationStatus studentVerificationStatusM57192o0 = this.f37522u.m57192o0();
        if (studentVerificationStatusM57192o0 == null) {
            return;
        }
        if (TEnum.equals(studentVerificationStatusM57192o0, "verified")) {
            str = "success";
        } else if (TEnum.equals(studentVerificationStatusM57192o0, "rejected")) {
            str = "fail";
        } else if (TEnum.equals(studentVerificationStatusM57192o0, "pending")) {
            str = "review";
        } else if (TEnum.equals(studentVerificationStatusM57192o0, "invalid")) {
            str = "invalid";
        } else {
            str = !TEnum.equals(this.f37522u.f37497c, "verified") ? BLiveOperationTitleShowType.off : "on";
        }
        i4g0.m138523u("e_id_verification_card_click", "p_verification_center_view", jyb.m147494Y("id_verification_button_state", str));
        if (TEnum.equals(studentVerificationStatusM57192o0, "verified") || TEnum.equals(studentVerificationStatusM57192o0, "pending") || TEnum.equals(studentVerificationStatusM57192o0, "rejected") || TEnum.equals(studentVerificationStatusM57192o0, "invalid")) {
            zki0.m220087P(getAct(), studentVerificationStatusM57192o0, this.f37522u.f37497c);
        } else {
            zki0.m220075D(getAct());
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m57238L(View view) {
        o1j0.m165634h(R$string.f19698u4);
        i4g0.m138523u("e_verification_center_age_verify", this.f37523v.pageId(), jyb.m147494Y("verify_status", "not_certified"));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m57239M(View view) {
        String str;
        if (TEnum.equals(this.f37522u.m57191n0(), "pending")) {
            o1j0.m165649w(R$string.f18564J);
            str = "pending_toast";
        } else if (TEnum.equals(this.f37522u.m57191n0(), "verified")) {
            o1j0.m165649w(R$string.f18864Sr);
            str = StateEvent.ProcessResult.SUCCEED;
        } else {
            getAct().startActivity(AgeVerificationAct.m57248Z1(getAct(), "from_verification_center"));
            str = "not_certified";
        }
        i4g0.m138523u("e_verification_center_age_verify", this.f37523v.pageId(), jyb.m147494Y("verify_status", str));
    }

    /* JADX INFO: renamed from: N */
    public final void m57240N() {
        if (TEnum.equals(this.f37522u.f37497c, "rejected")) {
            pk50.m172568j().m172574f().m181681s0(getAct(), OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
        }
        if (TEnum.equals(this.f37522u.f37497c, "verified")) {
            pk50.m172568j().m172574f().m181681s0(getAct(), OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
        }
        if (TEnum.equals(this.f37522u.f37497c, "pending")) {
            pk50.m172568j().m172574f().m181681s0(getAct(), OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m57241O(VerificationCenterPresenter.VerificationType verificationType) {
        StudentVerificationStatus studentVerificationStatus;
        VButton vButton;
        if (verificationType == VerificationCenterPresenter.VerificationType.AGE) {
            studentVerificationStatus = this.f37522u.f37499e;
            vButton = this.f37505d;
            bnl0.m105509E0(this.f37504c, new View.OnClickListener() { // from class: l.c3l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79631a.m57239M(view);
                }
            });
        } else {
            VerificationCenterPresenter.VerificationType verificationType2 = VerificationCenterPresenter.VerificationType.STUDENT;
            VerificationCenterPresenter verificationCenterPresenter = this.f37522u;
            if (verificationType == verificationType2) {
                studentVerificationStatus = verificationCenterPresenter.f37496b;
                vButton = this.f37520s;
            } else {
                studentVerificationStatus = verificationCenterPresenter.f37497c;
                vButton = this.f37511j;
            }
        }
        int i = dbc0.f87460tr;
        if (!NullChecker.m82486a(studentVerificationStatus)) {
            vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
            vButton.setTextColor(getAct().getResources().getColor(c9c0.f80407c2));
            vButton.setText(getAct().string(R$string.f19197ds));
            return;
        }
        String string = studentVerificationStatus.toString();
        string.getClass();
        switch (string) {
            case "verified":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(dbc0.f87493ur));
                vButton.setTextColor(getAct().getResources().getColor(c9c0.f80436m));
                vButton.setText(getAct().string(R$string.f18864Sr));
                break;
            case "pending":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(dbc0.f87493ur));
                vButton.setTextColor(getAct().getResources().getColor(c9c0.f80436m));
                vButton.setText(getAct().string(R$string.f18774Pr));
                break;
            case "rejected":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
                vButton.setTextColor(getAct().getResources().getColor(c9c0.f80407c2));
                vButton.setText(getAct().string(R$string.f18834Rr));
                break;
            default:
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
                vButton.setTextColor(getAct().getResources().getColor(c9c0.f80407c2));
                vButton.setText(getAct().string(R$string.f19197ds));
                break;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m57242P(boolean z) {
        String str;
        bnl0.m105524M(this.f37504c, z);
        if (z) {
            if (TEnum.equals(this.f37522u.f37499e, "verified")) {
                str = StateEvent.ProcessResult.SUCCEED;
            } else {
                str = TEnum.equals(this.f37522u.f37499e, "pending") ? "pending_toast" : "not_certified";
            }
            i4g0.m138492A("e_verification_center_age_verify", this.f37523v.pageId(), jyb.m147494Y("verify_status", str));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m57243Q(boolean z) {
        bnl0.m105524M(this.f37518q, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f37523v.act();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m57232F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m57244r() {
        this.f37502a.getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        this.f37502a.setLeftIconAsBack(getAct());
        this.f37502a.setTitle(getAct().string(R$string.f18654Lr));
        uqb0.f180374G.m127115L0(this.f37510i, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127115L0(this.f37516o, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127115L0(this.f37519r, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        m57234H();
        this.f37523v.setHasOptionsMenu(true);
        bnl0.m105524M(this.f37521t, false);
    }
}
