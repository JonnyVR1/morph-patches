package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class p2x implements iam<i2x> {

    /* JADX INFO: renamed from: a */
    public VImage f150316a;

    /* JADX INFO: renamed from: b */
    public VText f150317b;

    /* JADX INFO: renamed from: c */
    public VText f150318c;

    /* JADX INFO: renamed from: d */
    public VButton f150319d;

    /* JADX INFO: renamed from: e */
    public VText f150320e;

    /* JADX INFO: renamed from: f */
    public VButton f150321f;

    /* JADX INFO: renamed from: g */
    public VText f150322g;

    /* JADX INFO: renamed from: h */
    public VButton f150323h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f150324i;

    /* JADX INFO: renamed from: j */
    public MarryInfoAuditStatusAct f150325j;

    /* JADX INFO: renamed from: k */
    public i2x f150326k;

    /* JADX INFO: renamed from: l */
    public int f150327l = -1;

    /* JADX INFO: renamed from: m */
    public int f150328m = -1;

    /* JADX INFO: renamed from: n */
    public int f150329n = -1;

    public p2x(MarryInfoAuditStatusAct marryInfoAuditStatusAct) {
        this.f150325j = marryInfoAuditStatusAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m170406a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m170412l(View view) {
        i4g0.m138520r("e_marry_profile", "p_marriage_intro");
        act().startActivity(MarryProfileEditAct.m48602a2(act(), "jump_loop_type_default"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m170413m(View view) {
        i4g0.m138520r("e_go_verify", "p_marriage_intro");
        if (this.f150328m < 0 || this.f150327l < 0) {
            pq4.m173306n(this.f150325j);
        } else if (this.f150329n == -1) {
            qtk.m177991P0(act(), "", new x20() { // from class: l.m2x
                @Override // p153l.x20
                public final void call() {
                    p2x.m170406a();
                }
            }, false, false, new x20() { // from class: l.n2x
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m170414p(View view) {
        if (CoreModule.f18264c.f20381e0.f89030F4.get().booleanValue()) {
            this.f150326k.m138245g0();
        } else {
            new i5x(this.f150325j, new Runnable() { // from class: l.o2x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144804a.m170418n();
                }
            }).show();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f150325j;
    }

    /* JADX INFO: renamed from: i */
    public View m170415i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q2x.m175098b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m170415i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i2x i2xVar) {
        this.f150326k = i2xVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m170417k(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.settings)) {
            return (TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m170418n() {
        this.f150326k.m138245g0();
    }

    /* JADX INFO: renamed from: q */
    public void m170419q(User user) {
        bnl0.m105524M(this.f150322g, false);
        this.f150321f.setEnabled(false);
        String userInfoForMarryStatus = user.getUserInfoForMarryStatus();
        if (user.isAudit() || TextUtils.equals(UserStatus.audit, userInfoForMarryStatus) || TextUtils.equals("auditing", userInfoForMarryStatus) || TextUtils.equals("pending", userInfoForMarryStatus)) {
            this.f150321f.setBackgroundColor(0);
            this.f150321f.setText("审核中");
            this.f150321f.setTextColor(act().getResources().getColor(c9c0.f80418g));
            return;
        }
        if (!TextUtils.equals("", userInfoForMarryStatus) && !TextUtils.equals(userInfoForMarryStatus, "denied")) {
            if (TextUtils.equals(userInfoForMarryStatus, "passed")) {
                this.f150321f.setBackgroundColor(0);
                this.f150321f.setText("已完善");
                this.f150321f.setTextColor(act().getResources().getColor(c9c0.f80418g));
                return;
            }
            return;
        }
        this.f150321f.setText("去完善");
        this.f150321f.setEnabled(true);
        this.f150321f.setTextColor(-1);
        this.f150321f.setBackgroundResource(dbc0.f87497v);
        if (TextUtils.equals(userInfoForMarryStatus, "denied")) {
            bnl0.m105524M(this.f150322g, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m170420r() {
        this.f150317b.setTypeface(lyh0.m156283c(3), 1);
        this.f150318c.setTypeface(lyh0.m156283c(3), 1);
        this.f150320e.setTypeface(lyh0.m156283c(3), 1);
        this.f150319d.setTypeface(lyh0.m156283c(3), 1);
        this.f150321f.setTypeface(lyh0.m156283c(3), 1);
        this.f150324i.setLeftIconAsBack(this.f150325j);
        bnl0.m105542Z(this.f150324i);
        this.f150324i.setBackgroundColor(0);
        bnl0.m105509E0(this.f150321f, new View.OnClickListener() { // from class: l.j2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118128a.m170412l(view);
            }
        });
        bnl0.m105509E0(this.f150319d, new View.OnClickListener() { // from class: l.k2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123664a.m170413m(view);
            }
        });
        bnl0.m105509E0(this.f150323h, new View.OnClickListener() { // from class: l.l2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129817a.m170414p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m170421s(VerificationCenter verificationCenter, User user) {
        int i;
        m170419q(user);
        this.f150327l = -1;
        this.f150328m = -1;
        this.f150329n = 1;
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo)) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
                this.f150327l = 1;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
                this.f150327l = 0;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "rejected")) {
                this.f150327l = -2;
            }
        }
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.idCard)) {
            if (TEnum.equals(verificationCenter.idCard.status, "verified")) {
                this.f150328m = 1;
            } else if (TEnum.equals(verificationCenter.idCard.status, "pending") || TEnum.equals(verificationCenter.idCard.status, StudentVerificationStatus.prePending)) {
                this.f150328m = 0;
            } else if (TEnum.equals(verificationCenter.idCard.status, "rejected")) {
                this.f150328m = -2;
            } else if (TEnum.equals(verificationCenter.idCard.status, "invalid")) {
                this.f150328m = -3;
            }
        }
        if (m170417k(user)) {
            this.f150329n = 1;
        }
        this.f150319d.setEnabled(false);
        int i2 = this.f150327l;
        if (i2 < 0 || (i = this.f150328m) < 0 || this.f150329n < 0) {
            this.f150319d.setEnabled(true);
            this.f150319d.setText("去认证");
            this.f150319d.setEnabled(true);
            this.f150319d.setTextColor(-1);
            this.f150319d.setBackgroundResource(dbc0.f87497v);
            i4g0.m138526x("e_go_verify", "p_marriage_intro");
        } else if (i2 == 0 || i == 0) {
            this.f150319d.setBackgroundColor(0);
            this.f150319d.setText("审核中");
            this.f150319d.setTextColor(act().getResources().getColor(c9c0.f80418g));
        } else {
            this.f150319d.setText("已认证");
            this.f150319d.setEnabled(true);
            this.f150319d.setTextColor(-1);
            this.f150319d.setBackgroundColor(0);
            this.f150319d.setTextColor(act().getResources().getColor(c9c0.f80418g));
        }
        boolean z = TextUtils.equals("passed", user.getUserInfoForMarryStatus()) && this.f150327l == 1 && this.f150328m == 1 && this.f150329n == 1;
        this.f150323h.setEnabled(z);
        this.f150323h.setBackgroundResource(z ? dbc0.f86584T : dbc0.f87399s);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
