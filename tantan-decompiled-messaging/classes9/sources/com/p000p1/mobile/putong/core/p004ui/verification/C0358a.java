package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.age.AgeVerificationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.ic50;
import l.j760;
import l.lsi0;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.f6c0;
import p006l.qib0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.zbi0;
import v.VButton;
import v.VDraweeView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0358a implements s7m<VerificationCenterPresenter> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f6435a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f6436b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f6437c;

    /* JADX INFO: renamed from: d */
    public VButton f6438d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f6439e;

    /* JADX INFO: renamed from: f */
    public TextView f6440f;

    /* JADX INFO: renamed from: g */
    public VText f6441g;

    /* JADX INFO: renamed from: h */
    public VText f6442h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f6443i;

    /* JADX INFO: renamed from: j */
    public VButton f6444j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f6445k;

    /* JADX INFO: renamed from: l */
    public TextView f6446l;

    /* JADX INFO: renamed from: m */
    public VText f6447m;

    /* JADX INFO: renamed from: n */
    public VText f6448n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f6449o;

    /* JADX INFO: renamed from: p */
    public VButton f6450p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f6451q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f6452r;

    /* JADX INFO: renamed from: s */
    public VButton f6453s;

    /* JADX INFO: renamed from: t */
    public VText f6454t;

    /* JADX INFO: renamed from: u */
    public VerificationCenterPresenter f6455u;

    /* JADX INFO: renamed from: v */
    public VerificationCenterFrag f6456v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.a$a */
    public static class a {
        /* JADX INFO: renamed from: b */
        public static void m9488b(C0358a c0358a, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            c0358a.f6435a = viewGroup.getChildAt(0);
            c0358a.f6436b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            c0358a.f6437c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            c0358a.f6438d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            c0358a.f6439e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            c0358a.f6440f = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            c0358a.f6441g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            c0358a.f6442h = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
            c0358a.f6443i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
            c0358a.f6444j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            c0358a.f6445k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            c0358a.f6446l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            c0358a.f6447m = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            c0358a.f6448n = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            c0358a.f6449o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(0);
            c0358a.f6450p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(5);
            c0358a.f6451q = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            c0358a.f6452r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(4)).getChildAt(0);
            c0358a.f6453s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3)).getChildAt(5);
            c0358a.f6454t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m9489c(C0358a c0358a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f12349of, viewGroup, false);
            m9488b(c0358a, viewInflate);
            return viewInflate;
        }
    }

    public C0358a(VerificationCenterFrag verificationCenterFrag) {
        this.f6456v = verificationCenterFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9472C0() {
        return this.f6456v.getContext();
    }

    /* JADX INFO: renamed from: F */
    public View m9473F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m9489c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m9485i1(VerificationCenterPresenter verificationCenterPresenter) {
        this.f6455u = verificationCenterPresenter;
    }

    /* JADX INFO: renamed from: H */
    public final void m9475H() {
        this.f6451q.setOnClickListener(new View.OnClickListener() { // from class: l.stk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21651a.m9476I(view);
            }
        });
        this.f6439e.setOnClickListener(new View.OnClickListener() { // from class: l.ttk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22273a.m9477J(view);
            }
        });
        xdl0.E0(this.f6445k, new View.OnClickListener() { // from class: l.utk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23749a.m9478K(view);
            }
        });
        xdl0.E0(this.f6437c, new View.OnClickListener() { // from class: l.vtk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24460a.m9479L(view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m9476I(View view) {
        zvf0.r("e_avatarVerification_student_card_click", "p_verification_center_view");
        StudentVerificationStatus studentVerificationStatus = this.f6455u.f6429b;
        if (studentVerificationStatus == null || !(TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(this.f6455u.f6429b, "verified"))) {
            act().startActivity(StudentInfoAct.V1(act(), (String) null, false));
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m9477J(View view) {
        zvf0.r("e_avatarverification_avatar_card_click", "p_verification_center_view");
        if (TEnum.equals(this.f6455u.f6430c, "rejected") || TEnum.equals(this.f6455u.f6430c, "pending") || TEnum.equals(this.f6455u.f6430c, "verified")) {
            m9481N();
        } else {
            ic50.j().f().s0(act(), OmsDialog.p_verification_center_policy_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m9478K(View view) {
        String str;
        StudentVerificationStatus studentVerificationStatusM9432o0 = this.f6455u.m9432o0();
        if (studentVerificationStatusM9432o0 == null) {
            return;
        }
        if (TEnum.equals(studentVerificationStatusM9432o0, "verified")) {
            str = "success";
        } else if (TEnum.equals(studentVerificationStatusM9432o0, "rejected")) {
            str = "fail";
        } else if (TEnum.equals(studentVerificationStatusM9432o0, "pending")) {
            str = "review";
        } else if (TEnum.equals(studentVerificationStatusM9432o0, "invalid")) {
            str = "invalid";
        } else {
            str = !TEnum.equals(this.f6455u.f6430c, "verified") ? "off" : "on";
        }
        zvf0.u("e_id_verification_card_click", "p_verification_center_view", new j760[]{vwb.Y("id_verification_button_state", str)});
        if (TEnum.equals(studentVerificationStatusM9432o0, "verified") || TEnum.equals(studentVerificationStatusM9432o0, "pending") || TEnum.equals(studentVerificationStatusM9432o0, "rejected") || TEnum.equals(studentVerificationStatusM9432o0, "invalid")) {
            zbi0.m28658P(act(), studentVerificationStatusM9432o0, this.f6455u.f6430c);
        } else {
            zbi0.m28646D(act());
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m9479L(View view) {
        lsi0.h(R$string.f2892s4);
        zvf0.u("e_verification_center_age_verify", this.f6456v.pageId(), new j760[]{vwb.Y("verify_status", "not_certified")});
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m9480M(View view) {
        String str;
        if (TEnum.equals(this.f6455u.m9431n0(), "pending")) {
            lsi0.w(R$string.f1825J);
            str = "pending_toast";
        } else if (TEnum.equals(this.f6455u.m9431n0(), "verified")) {
            lsi0.w(R$string.f3035wr);
            str = "succeed";
        } else {
            act().startActivity(AgeVerificationAct.m9490Y1(act(), "from_verification_center"));
            str = "not_certified";
        }
        zvf0.u("e_verification_center_age_verify", this.f6456v.pageId(), new j760[]{vwb.Y("verify_status", str)});
    }

    /* JADX INFO: renamed from: N */
    public final void m9481N() {
        if (TEnum.equals(this.f6455u.f6430c, "rejected")) {
            ic50.j().f().s0(act(), OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
        }
        if (TEnum.equals(this.f6455u.f6430c, "verified")) {
            ic50.j().f().s0(act(), OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
        }
        if (TEnum.equals(this.f6455u.f6430c, "pending")) {
            ic50.j().f().s0(act(), OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m9482O(VerificationCenterPresenter.VerificationType verificationType) {
        StudentVerificationStatus studentVerificationStatus;
        VButton vButton;
        if (verificationType == VerificationCenterPresenter.VerificationType.AGE) {
            studentVerificationStatus = this.f6455u.f6432e;
            vButton = this.f6438d;
            xdl0.E0(this.f6437c, new View.OnClickListener() { // from class: l.wtk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f25406a.m9480M(view);
                }
            });
        } else {
            VerificationCenterPresenter.VerificationType verificationType2 = VerificationCenterPresenter.VerificationType.STUDENT;
            VerificationCenterPresenter verificationCenterPresenter = this.f6455u;
            if (verificationType == verificationType2) {
                studentVerificationStatus = verificationCenterPresenter.f6429b;
                vButton = this.f6453s;
            } else {
                studentVerificationStatus = verificationCenterPresenter.f6430c;
                vButton = this.f6444j;
            }
        }
        int i = x2c0.f25876Fq;
        if (!NullChecker.a(studentVerificationStatus)) {
            vButton.setBackgroundDrawable(act().getResources().getDrawable(i));
            vButton.setTextColor(act().getResources().getColor(w0c0.f24674b2));
            vButton.setText(act().string(R$string.f1793Hr));
            return;
        }
        String string = studentVerificationStatus.toString();
        string.getClass();
        switch (string) {
            case "verified":
                vButton.setBackgroundDrawable(act().getResources().getDrawable(x2c0.f25908Gq));
                vButton.setTextColor(act().getResources().getColor(w0c0.f24706m));
                vButton.setText(act().string(R$string.f3035wr));
                break;
            case "pending":
                vButton.setBackgroundDrawable(act().getResources().getDrawable(x2c0.f25908Gq));
                vButton.setTextColor(act().getResources().getColor(w0c0.f24706m));
                vButton.setText(act().string(R$string.f2945tr));
                break;
            case "rejected":
                vButton.setBackgroundDrawable(act().getResources().getDrawable(i));
                vButton.setTextColor(act().getResources().getColor(w0c0.f24674b2));
                vButton.setText(act().string(R$string.f3005vr));
                break;
            default:
                vButton.setBackgroundDrawable(act().getResources().getDrawable(i));
                vButton.setTextColor(act().getResources().getColor(w0c0.f24674b2));
                vButton.setText(act().string(R$string.f1793Hr));
                break;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9483P(boolean z) {
        String str;
        xdl0.M(this.f6437c, z);
        if (z) {
            if (TEnum.equals(this.f6455u.f6432e, "verified")) {
                str = "succeed";
            } else {
                str = TEnum.equals(this.f6455u.f6432e, "pending") ? "pending_toast" : "not_certified";
            }
            zvf0.A("e_verification_center_age_verify", this.f6456v.pageId(), new j760[]{vwb.Y("verify_status", str)});
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m9484Q(boolean z) {
        xdl0.M(this.f6451q, z);
    }

    @Nullable
    public Act act() {
        return this.f6456v.act();
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9473F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m9486r() {
        this.f6435a.getLeftIconContainer().setBackgroundResource(x2c0.f26978p);
        this.f6435a.setLeftIconAsBack(act());
        this.f6435a.setTitle(act().string(R$string.f2825pr));
        qib0.f19782G.m12744L0(this.f6443i, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
        qib0.f19782G.m12744L0(this.f6449o, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
        qib0.f19782G.m12744L0(this.f6452r, CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted());
        m9475H();
        this.f6456v.setHasOptionsMenu(true);
        xdl0.M(this.f6454t, false);
    }
}
