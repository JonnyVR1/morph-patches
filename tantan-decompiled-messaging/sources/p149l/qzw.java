package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class qzw implements s7m<jzw> {

    /* JADX INFO: renamed from: a */
    public VImage f157103a;

    /* JADX INFO: renamed from: b */
    public VText f157104b;

    /* JADX INFO: renamed from: c */
    public VText f157105c;

    /* JADX INFO: renamed from: d */
    public VButton f157106d;

    /* JADX INFO: renamed from: e */
    public VText f157107e;

    /* JADX INFO: renamed from: f */
    public VButton f157108f;

    /* JADX INFO: renamed from: g */
    public VText f157109g;

    /* JADX INFO: renamed from: h */
    public VButton f157110h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f157111i;

    /* JADX INFO: renamed from: j */
    public MarryInfoAuditStatusAct f157112j;

    /* JADX INFO: renamed from: k */
    public jzw f157113k;

    /* JADX INFO: renamed from: l */
    public int f157114l = -1;

    /* JADX INFO: renamed from: m */
    public int f157115m = -1;

    /* JADX INFO: renamed from: n */
    public int f157116n = -1;

    public qzw(MarryInfoAuditStatusAct marryInfoAuditStatusAct) {
        this.f157112j = marryInfoAuditStatusAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m177296a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m177302l(View view) {
        zvf0.m220396r("e_marry_profile", "p_marriage_intro");
        act().startActivity(MarryProfileEditAct.m47419Z1(act(), "jump_loop_type_default"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m177303m(View view) {
        zvf0.m220396r("e_go_verify", "p_marriage_intro");
        if (this.f157115m < 0 || this.f157114l < 0) {
            qp4.m175808n(this.f157112j);
        } else if (this.f157116n == -1) {
            ark.m98441P0(act(), "", new d30() { // from class: l.nzw
                @Override // p149l.d30
                public final void call() {
                    qzw.m177296a();
                }
            }, false, false, new d30() { // from class: l.ozw
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m177304p(View view) {
        if (CoreModule.f17545c.f19639e0.f149173F4.get().booleanValue()) {
            this.f157113k.m143962g0();
        } else {
            new j2x(this.f157112j, new Runnable() { // from class: l.pzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151978a.m177308n();
                }
            }).show();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157112j;
    }

    /* JADX INFO: renamed from: i */
    public View m177305i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzw.m181800b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177305i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jzw jzwVar) {
        this.f157113k = jzwVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m177307k(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.settings)) {
            return (TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m177308n() {
        this.f157113k.m143962g0();
    }

    /* JADX INFO: renamed from: q */
    public void m177309q(User user) {
        xdl0.m208344M(this.f157109g, false);
        this.f157108f.setEnabled(false);
        String userInfoForMarryStatus = user.getUserInfoForMarryStatus();
        if (user.isAudit() || TextUtils.equals(UserStatus.audit, userInfoForMarryStatus) || TextUtils.equals("auditing", userInfoForMarryStatus) || TextUtils.equals("pending", userInfoForMarryStatus)) {
            this.f157108f.setBackgroundColor(0);
            this.f157108f.setText("审核中");
            this.f157108f.setTextColor(act().getResources().getColor(w0c0.f183848g));
            return;
        }
        if (!TextUtils.equals("", userInfoForMarryStatus) && !TextUtils.equals(userInfoForMarryStatus, "denied")) {
            if (TextUtils.equals(userInfoForMarryStatus, "passed")) {
                this.f157108f.setBackgroundColor(0);
                this.f157108f.setText("已完善");
                this.f157108f.setTextColor(act().getResources().getColor(w0c0.f183848g));
                return;
            }
            return;
        }
        this.f157108f.setText("去完善");
        this.f157108f.setEnabled(true);
        this.f157108f.setTextColor(-1);
        this.f157108f.setBackgroundResource(x2c0.f190602u);
        if (TextUtils.equals(userInfoForMarryStatus, "denied")) {
            xdl0.m208344M(this.f157109g, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m177310r() {
        this.f157104b.setTypeface(eqh0.m117752c(3), 1);
        this.f157105c.setTypeface(eqh0.m117752c(3), 1);
        this.f157107e.setTypeface(eqh0.m117752c(3), 1);
        this.f157106d.setTypeface(eqh0.m117752c(3), 1);
        this.f157108f.setTypeface(eqh0.m117752c(3), 1);
        this.f157111i.setLeftIconAsBack(this.f157112j);
        xdl0.m208362Z(this.f157111i);
        this.f157111i.setBackgroundColor(0);
        xdl0.m208329E0(this.f157108f, new View.OnClickListener() { // from class: l.kzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125425a.m177302l(view);
            }
        });
        xdl0.m208329E0(this.f157106d, new View.OnClickListener() { // from class: l.lzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130683a.m177303m(view);
            }
        });
        xdl0.m208329E0(this.f157110h, new View.OnClickListener() { // from class: l.mzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136445a.m177304p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m177311s(VerificationCenter verificationCenter, User user) {
        int i;
        m177309q(user);
        this.f157114l = -1;
        this.f157115m = -1;
        this.f157116n = 1;
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo)) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
                this.f157114l = 1;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
                this.f157114l = 0;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "rejected")) {
                this.f157114l = -2;
            }
        }
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.idCard)) {
            if (TEnum.equals(verificationCenter.idCard.status, "verified")) {
                this.f157115m = 1;
            } else if (TEnum.equals(verificationCenter.idCard.status, "pending") || TEnum.equals(verificationCenter.idCard.status, StudentVerificationStatus.prePending)) {
                this.f157115m = 0;
            } else if (TEnum.equals(verificationCenter.idCard.status, "rejected")) {
                this.f157115m = -2;
            } else if (TEnum.equals(verificationCenter.idCard.status, "invalid")) {
                this.f157115m = -3;
            }
        }
        if (m177307k(user)) {
            this.f157116n = 1;
        }
        this.f157106d.setEnabled(false);
        int i2 = this.f157114l;
        if (i2 < 0 || (i = this.f157115m) < 0 || this.f157116n < 0) {
            this.f157106d.setEnabled(true);
            this.f157106d.setText("去认证");
            this.f157106d.setEnabled(true);
            this.f157106d.setTextColor(-1);
            this.f157106d.setBackgroundResource(x2c0.f190602u);
            zvf0.m220402x("e_go_verify", "p_marriage_intro");
        } else if (i2 == 0 || i == 0) {
            this.f157106d.setBackgroundColor(0);
            this.f157106d.setText("审核中");
            this.f157106d.setTextColor(act().getResources().getColor(w0c0.f183848g));
        } else {
            this.f157106d.setText("已认证");
            this.f157106d.setEnabled(true);
            this.f157106d.setTextColor(-1);
            this.f157106d.setBackgroundColor(0);
            this.f157106d.setTextColor(act().getResources().getColor(w0c0.f183848g));
        }
        boolean z = TextUtils.equals("passed", user.getUserInfoForMarryStatus()) && this.f157114l == 1 && this.f157115m == 1 && this.f157116n == 1;
        this.f157110h.setEnabled(z);
        this.f157110h.setBackgroundResource(z ? x2c0.f189717S : x2c0.f190506r);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
