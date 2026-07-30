package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.audit.MarryInfoAuditStatusAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryProfileEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.ark;
import l.qp4;
import l.rzw;
import l.s7m;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p028v.VButton;
import p028v.VImage;
import p028v.VText;
import p028v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qzw implements s7m<jzw> {

    /* JADX INFO: renamed from: a */
    public VImage f6736a;

    /* JADX INFO: renamed from: b */
    public VText f6737b;

    /* JADX INFO: renamed from: c */
    public VText f6738c;

    /* JADX INFO: renamed from: d */
    public VButton f6739d;

    /* JADX INFO: renamed from: e */
    public VText f6740e;

    /* JADX INFO: renamed from: f */
    public VButton f6741f;

    /* JADX INFO: renamed from: g */
    public VText f6742g;

    /* JADX INFO: renamed from: h */
    public VButton f6743h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f6744i;

    /* JADX INFO: renamed from: j */
    public MarryInfoAuditStatusAct f6745j;

    /* JADX INFO: renamed from: k */
    public jzw f6746k;

    /* JADX INFO: renamed from: l */
    public int f6747l = -1;

    /* JADX INFO: renamed from: m */
    public int f6748m = -1;

    /* JADX INFO: renamed from: n */
    public int f6749n = -1;

    public qzw(MarryInfoAuditStatusAct marryInfoAuditStatusAct) {
        this.f6745j = marryInfoAuditStatusAct;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7103a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m7109l(View view) {
        zvf0.r("e_marry_profile", "p_marriage_intro");
        act().startActivity(MarryProfileEditAct.m462Z1(act(), "jump_loop_type_default"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m7110m(View view) {
        zvf0.r("e_go_verify", "p_marriage_intro");
        if (this.f6748m < 0 || this.f6747l < 0) {
            qp4.n(this.f6745j);
        } else if (this.f6749n == -1) {
            ark.P0(act(), "", new d30() { // from class: l.nzw
                @Override // p003l.d30
                public final void call() {
                    qzw.m7103a();
                }
            }, false, false, new d30() { // from class: l.ozw
                @Override // p003l.d30
                public final void call() {
                    CoreModule.c.e0.W9(CoreModule.H().userId());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m7111p(View view) {
        if (((Boolean) CoreModule.c.e0.F4.get()).booleanValue()) {
            this.f6746k.m5468g0();
        } else {
            new j2x(this.f6745j, new Runnable() { // from class: l.pzw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6558a.m7117n();
                }
            }).show();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7112C0() {
        return this.f6745j;
    }

    /* JADX INFO: renamed from: i */
    public View m7113i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rzw.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7113i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m7114i1(jzw jzwVar) {
        this.f6746k = jzwVar;
    }

    /* JADX INFO: renamed from: k */
    public boolean m7116k(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.settings)) {
            return (TextUtils.isEmpty(user.settings.phoneNumber.number) && TextUtils.isEmpty(user.settings.linkedPhoneNumber.number)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7117n() {
        this.f6746k.m5468g0();
    }

    /* JADX INFO: renamed from: q */
    public void m7118q(User user) {
        xdl0.M(this.f6742g, false);
        this.f6741f.setEnabled(false);
        String userInfoForMarryStatus = user.getUserInfoForMarryStatus();
        if (user.isAudit() || TextUtils.equals("audit", userInfoForMarryStatus) || TextUtils.equals("auditing", userInfoForMarryStatus) || TextUtils.equals("pending", userInfoForMarryStatus)) {
            this.f6741f.setBackgroundColor(0);
            this.f6741f.setText("审核中");
            this.f6741f.setTextColor(act().getResources().getColor(w0c0.g));
            return;
        }
        if (!TextUtils.equals("", userInfoForMarryStatus) && !TextUtils.equals(userInfoForMarryStatus, "denied")) {
            if (TextUtils.equals(userInfoForMarryStatus, "passed")) {
                this.f6741f.setBackgroundColor(0);
                this.f6741f.setText("已完善");
                this.f6741f.setTextColor(act().getResources().getColor(w0c0.g));
                return;
            }
            return;
        }
        this.f6741f.setText("去完善");
        this.f6741f.setEnabled(true);
        this.f6741f.setTextColor(-1);
        this.f6741f.setBackgroundResource(x2c0.u);
        if (TextUtils.equals(userInfoForMarryStatus, "denied")) {
            xdl0.M(this.f6742g, true);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public void m7119r() {
        this.f6737b.setTypeface(eqh0.m3924c(3), 1);
        this.f6738c.setTypeface(eqh0.m3924c(3), 1);
        this.f6740e.setTypeface(eqh0.m3924c(3), 1);
        this.f6739d.setTypeface(eqh0.m3924c(3), 1);
        this.f6741f.setTypeface(eqh0.m3924c(3), 1);
        this.f6744i.setLeftIconAsBack(this.f6745j);
        xdl0.Z(new View[]{this.f6744i});
        this.f6744i.setBackgroundColor(0);
        xdl0.E0(this.f6741f, new View.OnClickListener() { // from class: l.kzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5145a.m7109l(view);
            }
        });
        xdl0.E0(this.f6739d, new View.OnClickListener() { // from class: l.lzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5486a.m7110m(view);
            }
        });
        xdl0.E0(this.f6743h, new View.OnClickListener() { // from class: l.mzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5815a.m7111p(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m7120s(VerificationCenter verificationCenter, User user) {
        int i;
        m7118q(user);
        this.f6747l = -1;
        this.f6748m = -1;
        this.f6749n = 1;
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo)) {
            if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified")) {
                this.f6747l = 1;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "prePending")) {
                this.f6747l = 0;
            } else if (TEnum.equals(verificationCenter.picVerificationInfo.status, "rejected")) {
                this.f6747l = -2;
            }
        }
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.idCard)) {
            if (TEnum.equals(verificationCenter.idCard.status, "verified")) {
                this.f6748m = 1;
            } else if (TEnum.equals(verificationCenter.idCard.status, "pending") || TEnum.equals(verificationCenter.idCard.status, "prePending")) {
                this.f6748m = 0;
            } else if (TEnum.equals(verificationCenter.idCard.status, "rejected")) {
                this.f6748m = -2;
            } else if (TEnum.equals(verificationCenter.idCard.status, "invalid")) {
                this.f6748m = -3;
            }
        }
        if (m7116k(user)) {
            this.f6749n = 1;
        }
        this.f6739d.setEnabled(false);
        int i2 = this.f6747l;
        if (i2 < 0 || (i = this.f6748m) < 0 || this.f6749n < 0) {
            this.f6739d.setEnabled(true);
            this.f6739d.setText("去认证");
            this.f6739d.setEnabled(true);
            this.f6739d.setTextColor(-1);
            this.f6739d.setBackgroundResource(x2c0.u);
            zvf0.x("e_go_verify", "p_marriage_intro");
        } else if (i2 == 0 || i == 0) {
            this.f6739d.setBackgroundColor(0);
            this.f6739d.setText("审核中");
            this.f6739d.setTextColor(act().getResources().getColor(w0c0.g));
        } else {
            this.f6739d.setText("已认证");
            this.f6739d.setEnabled(true);
            this.f6739d.setTextColor(-1);
            this.f6739d.setBackgroundColor(0);
            this.f6739d.setTextColor(act().getResources().getColor(w0c0.g));
        }
        boolean z = TextUtils.equals("passed", user.getUserInfoForMarryStatus()) && this.f6747l == 1 && this.f6748m == 1 && this.f6749n == 1;
        this.f6743h.setEnabled(z);
        this.f6743h.setBackgroundResource(z ? x2c0.S : x2c0.r);
    }

    public void destroy() {
    }
}
