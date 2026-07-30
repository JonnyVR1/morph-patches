package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.verification.age.AgeVerificationAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.f6c0;
import p149l.ic50;
import p149l.lsi0;
import p149l.qib0;
import p149l.s7m;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zbi0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8922a implements s7m<VerificationCenterPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f36654a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f36655b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f36656c;

    /* JADX INFO: renamed from: d */
    public VButton f36657d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f36658e;

    /* JADX INFO: renamed from: f */
    public TextView f36659f;

    /* JADX INFO: renamed from: g */
    public VText f36660g;

    /* JADX INFO: renamed from: h */
    public VText f36661h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f36662i;

    /* JADX INFO: renamed from: j */
    public VButton f36663j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f36664k;

    /* JADX INFO: renamed from: l */
    public TextView f36665l;

    /* JADX INFO: renamed from: m */
    public VText f36666m;

    /* JADX INFO: renamed from: n */
    public VText f36667n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f36668o;

    /* JADX INFO: renamed from: p */
    public VButton f36669p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f36670q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f36671r;

    /* JADX INFO: renamed from: s */
    public VButton f36672s;

    /* JADX INFO: renamed from: t */
    public VText f36673t;

    /* JADX INFO: renamed from: u */
    public VerificationCenterPresenter f36674u;

    /* JADX INFO: renamed from: v */
    public VerificationCenterFrag f36675v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a$a */
    public static class a {
        /* JADX INFO: renamed from: b */
        public static void m56063b(C8922a c8922a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c8922a.f36654a = (VNavigationBar) viewGroup.getChildAt(0);
            c8922a.f36655b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c8922a.f36656c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            c8922a.f36657d = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            c8922a.f36658e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            c8922a.f36659f = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            c8922a.f36660g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            c8922a.f36661h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
            c8922a.f36662i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
            c8922a.f36663j = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            c8922a.f36664k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            c8922a.f36665l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            c8922a.f36666m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            c8922a.f36667n = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            c8922a.f36668o = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(0);
            c8922a.f36669p = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(5);
            c8922a.f36670q = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            c8922a.f36671r = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4)).getChildAt(0);
            c8922a.f36672s = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
            c8922a.f36673t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m56064c(C8922a c8922a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95935of, viewGroup, false);
            m56063b(c8922a, viewInflate);
            return viewInflate;
        }
    }

    public C8922a(VerificationCenterFrag verificationCenterFrag) {
        this.f36675v = verificationCenterFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f36675v.getContext();
    }

    /* JADX INFO: renamed from: F */
    public View m56049F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m56064c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(VerificationCenterPresenter verificationCenterPresenter) {
        this.f36674u = verificationCenterPresenter;
    }

    /* JADX INFO: renamed from: H */
    public final void m56051H() {
        this.f36670q.setOnClickListener(new View.OnClickListener() { // from class: l.stk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166372a.m56052I(view);
            }
        });
        this.f36658e.setOnClickListener(new View.OnClickListener() { // from class: l.ttk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172033a.m56053J(view);
            }
        });
        xdl0.m208329E0(this.f36664k, new View.OnClickListener() { // from class: l.utk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178276a.m56054K(view);
            }
        });
        xdl0.m208329E0(this.f36656c, new View.OnClickListener() { // from class: l.vtk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182978a.m56055L(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m56052I(View view) {
        zvf0.m220396r("e_avatarVerification_student_card_click", "p_verification_center_view");
        StudentVerificationStatus studentVerificationStatus = this.f36674u.f36648b;
        if (studentVerificationStatus == null || !(TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(this.f36674u.f36648b, "verified"))) {
            getAct().startActivity(StudentInfoAct.m44485V1(getAct(), null, false));
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m56053J(View view) {
        zvf0.m220396r("e_avatarverification_avatar_card_click", "p_verification_center_view");
        if (TEnum.equals(this.f36674u.f36649c, "rejected") || TEnum.equals(this.f36674u.f36649c, "pending") || TEnum.equals(this.f36674u.f36649c, "verified")) {
            m56057N();
        } else {
            ic50.m135327j().m135333f().m145258s0(getAct(), OmsDialog.p_verification_center_policy_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m56054K(View view) {
        String str;
        StudentVerificationStatus studentVerificationStatusM56009o0 = this.f36674u.m56009o0();
        if (studentVerificationStatusM56009o0 == null) {
            return;
        }
        if (TEnum.equals(studentVerificationStatusM56009o0, "verified")) {
            str = "success";
        } else if (TEnum.equals(studentVerificationStatusM56009o0, "rejected")) {
            str = "fail";
        } else if (TEnum.equals(studentVerificationStatusM56009o0, "pending")) {
            str = "review";
        } else if (TEnum.equals(studentVerificationStatusM56009o0, "invalid")) {
            str = "invalid";
        } else {
            str = !TEnum.equals(this.f36674u.f36649c, "verified") ? BLiveOperationTitleShowType.off : "on";
        }
        zvf0.m220399u("e_id_verification_card_click", "p_verification_center_view", vwb.m200311Y("id_verification_button_state", str));
        if (TEnum.equals(studentVerificationStatusM56009o0, "verified") || TEnum.equals(studentVerificationStatusM56009o0, "pending") || TEnum.equals(studentVerificationStatusM56009o0, "rejected") || TEnum.equals(studentVerificationStatusM56009o0, "invalid")) {
            zbi0.m217867P(getAct(), studentVerificationStatusM56009o0, this.f36674u.f36649c);
        } else {
            zbi0.m217855D(getAct());
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m56055L(View view) {
        lsi0.m151578h(R$string.f18903s4);
        zvf0.m220399u("e_verification_center_age_verify", this.f36675v.pageId(), vwb.m200311Y("verify_status", "not_certified"));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m56056M(View view) {
        String str;
        if (TEnum.equals(this.f36674u.m56008n0(), "pending")) {
            lsi0.m151593w(R$string.f17836J);
            str = "pending_toast";
        } else if (TEnum.equals(this.f36674u.m56008n0(), "verified")) {
            lsi0.m151593w(R$string.f19046wr);
            str = StateEvent.ProcessResult.SUCCEED;
        } else {
            getAct().startActivity(AgeVerificationAct.m56065Y1(getAct(), "from_verification_center"));
            str = "not_certified";
        }
        zvf0.m220399u("e_verification_center_age_verify", this.f36675v.pageId(), vwb.m200311Y("verify_status", str));
    }

    /* JADX INFO: renamed from: N */
    public final void m56057N() {
        if (TEnum.equals(this.f36674u.f36649c, "rejected")) {
            ic50.m135327j().m135333f().m145258s0(getAct(), OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
        }
        if (TEnum.equals(this.f36674u.f36649c, "verified")) {
            ic50.m135327j().m135333f().m145258s0(getAct(), OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
        }
        if (TEnum.equals(this.f36674u.f36649c, "pending")) {
            ic50.m135327j().m135333f().m145258s0(getAct(), OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m56058O(VerificationCenterPresenter.VerificationType verificationType) {
        StudentVerificationStatus studentVerificationStatus;
        VButton vButton;
        if (verificationType == VerificationCenterPresenter.VerificationType.AGE) {
            studentVerificationStatus = this.f36674u.f36651e;
            vButton = this.f36657d;
            xdl0.m208329E0(this.f36656c, new View.OnClickListener() { // from class: l.wtk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188028a.m56056M(view);
                }
            });
        } else {
            VerificationCenterPresenter.VerificationType verificationType2 = VerificationCenterPresenter.VerificationType.STUDENT;
            VerificationCenterPresenter verificationCenterPresenter = this.f36674u;
            if (verificationType == verificationType2) {
                studentVerificationStatus = verificationCenterPresenter.f36648b;
                vButton = this.f36672s;
            } else {
                studentVerificationStatus = verificationCenterPresenter.f36649c;
                vButton = this.f36663j;
            }
        }
        int i = x2c0.f189340Fq;
        if (!NullChecker.m81303a(studentVerificationStatus)) {
            vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
            vButton.setTextColor(getAct().getResources().getColor(w0c0.f183834b2));
            vButton.setText(getAct().string(R$string.f17804Hr));
            return;
        }
        String string = studentVerificationStatus.toString();
        string.getClass();
        switch (string) {
            case "verified":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(x2c0.f189372Gq));
                vButton.setTextColor(getAct().getResources().getColor(w0c0.f183866m));
                vButton.setText(getAct().string(R$string.f19046wr));
                break;
            case "pending":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(x2c0.f189372Gq));
                vButton.setTextColor(getAct().getResources().getColor(w0c0.f183866m));
                vButton.setText(getAct().string(R$string.f18956tr));
                break;
            case "rejected":
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
                vButton.setTextColor(getAct().getResources().getColor(w0c0.f183834b2));
                vButton.setText(getAct().string(R$string.f19016vr));
                break;
            default:
                vButton.setBackgroundDrawable(getAct().getResources().getDrawable(i));
                vButton.setTextColor(getAct().getResources().getColor(w0c0.f183834b2));
                vButton.setText(getAct().string(R$string.f17804Hr));
                break;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m56059P(boolean z) {
        String str;
        xdl0.m208344M(this.f36656c, z);
        if (z) {
            if (TEnum.equals(this.f36674u.f36651e, "verified")) {
                str = StateEvent.ProcessResult.SUCCEED;
            } else {
                str = TEnum.equals(this.f36674u.f36651e, "pending") ? "pending_toast" : "not_certified";
            }
            zvf0.m220368A("e_verification_center_age_verify", this.f36675v.pageId(), vwb.m200311Y("verify_status", str));
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m56060Q(boolean z) {
        xdl0.m208344M(this.f36670q, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f36675v.act();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56049F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m56061r() {
        this.f36654a.getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        this.f36654a.setLeftIconAsBack(getAct());
        this.f36654a.setTitle(getAct().string(R$string.f18836pr));
        qib0.f154691G.m102331L0(this.f36662i, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        qib0.f154691G.m102331L0(this.f36668o, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        qib0.f154691G.m102331L0(this.f36671r, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        m56051H();
        this.f36675v.setHasOptionsMenu(true);
        xdl0.m208344M(this.f36673t, false);
    }
}
