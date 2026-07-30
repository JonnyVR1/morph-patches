package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nbf0 extends b3f0<kcf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f17575e;

    /* JADX INFO: renamed from: f */
    public boolean f17576f;

    /* JADX INFO: renamed from: g */
    public boolean f17577g;

    /* JADX INFO: renamed from: h */
    public String f17578h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f17579i;

    public nbf0(mcr mcrVar) {
        super(mcrVar);
        this.f17575e = new SignUpData();
        this.f17577g = false;
        this.f17578h = "";
        this.f17579i = new e30() { // from class: l.ebf0
            public final void call(Object obj) {
                nbf0.m20014Y0((Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m20014Y0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m20021x1(Bundle bundle) {
        ((kcf0) ((jq2) this).viewModel).m18031A3(this.f17578h);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m20022B1(QualificationType qualificationType) {
        this.f17575e.qualificationType = qualificationType;
        ((kcf0) ((jq2) this).viewModel).m18064r0();
    }

    /* JADX INFO: renamed from: C1 */
    public void m20023C1() {
        ((kcf0) ((jq2) this).viewModel).m18060n0(this.f17575e, this.f17576f, this.f17577g, this.f17578h);
    }

    /* JADX INFO: renamed from: D1 */
    public void m20024D1(Bundle bundle) {
        if (NullChecker.c(this.f17575e, "account", CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f17575e);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m20025E1(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", this.f17578h);
            jSONObject.put("phone_num", m20026F1());
            cwf0Var.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public String m20026F1() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: H1 */
    public void m20027H1() {
        C1444xm.m27314g0(((kcf0) ((jq2) this).viewModel).act(), new e30() { // from class: l.cbf0
            public final void call(Object obj) {
                this.f9583a.m20046z1((BloodType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m20028I1() {
        C1444xm.m27316h0(((kcf0) ((jq2) this).viewModel).act(), new e30() { // from class: l.hbf0
            public final void call(Object obj) {
                this.f13786a.m20022B1((QualificationType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final void m20029J1(String str) {
        n6j0.m19690c("e_signup_age_tips", "p_profile_signup_view", n6j0.C1041a.m19696f("signup_source", AccountModule.f26c.m222d1()), n6j0.C1041a.m19696f("phone_num", TextUtils.equals(AccountModule.f26c.m222d1(), "wechat") ? "" : AccountModule.f26c.m220c1().phoneNumber), n6j0.C1041a.m19696f("error_type", str));
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.zaf0
            public final void call(Object obj) {
                this.f28686a.m20021x1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m20038o1(Double d) {
        this.f17575e.birthdate = d;
        ((kcf0) ((jq2) this).viewModel).m18068v0();
        ((kcf0) ((jq2) this).viewModel).m18064r0();
    }

    /* JADX INFO: renamed from: h1 */
    public void m20031h1() {
        final Double d = this.f17575e.birthdate;
        final boolean z = d == null;
        zvf0.A("e_profilepage_birthday_alert", ((kcf0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("signup_source", this.f17578h), vwb.Y("phone_num", m20026F1())});
        C1444xm.m27312f0(((kcf0) ((jq2) this).viewModel).act(), new v9j() { // from class: l.ibf0
            public final Object call() {
                return this.f14349a.m20036m1();
            }
        }, new e30() { // from class: l.jbf0
            public final void call(Object obj) {
                this.f15102a.m20037n1((Double) obj);
            }
        }, new e30() { // from class: l.kbf0
            public final void call(Object obj) {
                this.f15686a.m20038o1((Double) obj);
            }
        }, new e30() { // from class: l.lbf0
            public final void call(Object obj) {
                this.f16316a.m20039p1((Boolean) obj);
            }
        }, new d30() { // from class: l.mbf0
            public final void call() {
                this.f16888a.m20040q1(z, d);
            }
        });
        ((kcf0) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: i1 */
    public void m20032i1(final SignUpData signUpData) {
        ((kcf0) ((jq2) this).viewModel).act().duringCreated(AccountModule.f26c.m213Y0()).subscribe(mkd0.H(new e30() { // from class: l.fbf0
            public final void call(Object obj) {
                this.f12637a.m20043t1(signUpData, (User) obj);
            }
        }, new e30() { // from class: l.gbf0
            public final void call(Object obj) {
                this.f13204a.m20044u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public void m20033j1(final Runnable runnable) {
        zvf0.A("e_profilepage_gender_alert", ((kcf0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("signup_source", this.f17578h), vwb.Y("phone_num", m20026F1())});
        ((kcf0) ((jq2) this).viewModel).act().dialog().D(R$string.f275t3).t0(R$string.f39B2, new Runnable() { // from class: l.dbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10279a.m20045v1(runnable);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: k1 */
    public SignUpData m20034k1() {
        return this.f17575e;
    }

    /* JADX INFO: renamed from: l1 */
    public void m20035l1(SignUpData signUpData, boolean z, boolean z2) {
        this.f17575e = signUpData;
        this.f17576f = z;
        this.f17577g = z2;
        if (signUpData.signUpType != AccountTempApi.SignUpType.cosmos) {
            AccountModule.m26F().setSignUpData(signUpData);
        }
        this.f17578h = AccountModule.m26F().getSignUpType();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Double m20036m1() {
        Double d = this.f17575e.birthdate;
        if (d != null) {
            return d;
        }
        double time = yij0.V().getTime();
        m20038o1(Double.valueOf(time));
        return Double.valueOf(time);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m20037n1(Double d) {
        m20038o1(d);
        AccountModule.f26c.m196O0().put(this.f17575e.birthdate);
        zvf0.u("e_profilepage_birthday_alert", ((kcf0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("signup_source", this.f17578h), vwb.Y("phone_num", m20026F1())});
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m20039p1(Boolean bool) {
        if (bool.booleanValue()) {
            m20029J1("tooYoung");
        } else {
            m20029J1("tooOld");
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m20040q1(boolean z, Double d) {
        if (!z) {
            m20038o1(d);
        } else {
            this.f17575e.birthdate = null;
            ((kcf0) ((jq2) this).viewModel).m18062p0();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m20041r1(SignUpData signUpData, roj0 roj0Var) {
        ((kcf0) ((jq2) this).viewModel).act().progressDismiss();
        ((kcf0) ((jq2) this).viewModel).act().startActivity(C0811hp.m16311k(((kcf0) ((jq2) this).viewModel).act(), signUpData));
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m20042s1(Throwable th) {
        ((kcf0) ((jq2) this).viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m20043t1(final SignUpData signUpData, User user) {
        String string = user.signupStage.toString();
        string.getClass();
        if (!string.equals("verified")) {
            if (string.equals("finished")) {
                eje.m14574h().f11185a.put("finished");
                ((kcf0) ((jq2) this).viewModel).m18069w0();
                return;
            } else {
                eje.m14574h().m14584m();
                ((kcf0) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(((kcf0) ((jq2) this).viewModel).act()));
                return;
            }
        }
        if (eje.m14574h().m14582j(user.finishedStages)) {
            ((kcf0) ((jq2) this).viewModel).act().progressDismiss();
            ((kcf0) ((jq2) this).viewModel).act().startActivity(C0811hp.m16311k(((kcf0) ((jq2) this).viewModel).act(), signUpData));
            act().finish();
            yij0.S(act());
            return;
        }
        SignUpData signUpData2 = new SignUpData();
        signUpData2.signUpType = AccountTempApi.SignUpType.basic;
        signUpData2.name = signUpData.name;
        signUpData2.birthdate = signUpData.birthdate;
        signUpData2.gender = signUpData.gender;
        signUpData2.newGender = signUpData.newGender;
        signUpData2.password = signUpData.password;
        signUpData2.subGenderOption = signUpData.subGenderOption;
        signUpData2.profileShowGender = signUpData.profileShowGender;
        signUpData2.bloodType = signUpData.bloodType;
        ((kcf0) ((jq2) this).viewModel).act().duringCreated(eje.m14576q(signUpData2, null)).subscribe(mkd0.H(new e30() { // from class: l.abf0
            public final void call(Object obj) {
                this.f8204a.m20041r1(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.bbf0
            public final void call(Object obj) {
                this.f8807a.m20042s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m20044u1(Throwable th) {
        ((kcf0) ((jq2) this).viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.D(th);
        } else {
            eje.m14574h().m14584m();
            ((kcf0) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(((kcf0) ((jq2) this).viewModel).act()));
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m20045v1(Runnable runnable) {
        zvf0.u("e_profilepage_gender_alert", ((kcf0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("signup_source", this.f17578h), vwb.Y("phone_num", m20026F1())});
        runnable.run();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m20046z1(BloodType bloodType) {
        this.f17575e.bloodType = bloodType;
        ((kcf0) ((jq2) this).viewModel).m18064r0();
    }
}
