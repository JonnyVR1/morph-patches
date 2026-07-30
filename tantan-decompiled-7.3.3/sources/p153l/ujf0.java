package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ujf0 extends ibf0<rkf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f179213e;

    /* JADX INFO: renamed from: f */
    public boolean f179214f;

    /* JADX INFO: renamed from: g */
    public boolean f179215g;

    /* JADX INFO: renamed from: h */
    public String f179216h;

    /* JADX INFO: renamed from: i */
    public y20<Boolean> f179217i;

    public ujf0(ner nerVar) {
        super(nerVar);
        this.f179213e = new SignUpData();
        this.f179215g = false;
        this.f179216h = "";
        this.f179217i = new y20() { // from class: l.ljf0
            @Override // p153l.y20
            public final void call(Object obj) {
                ujf0.m196337Y0((Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m196337Y0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m196344x1(Bundle bundle) {
        ((rkf0) this.viewModel).m181811A3(this.f179216h);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m196345B1(QualificationType qualificationType) {
        this.f179213e.qualificationType = qualificationType;
        ((rkf0) this.viewModel).m181844r0();
    }

    /* JADX INFO: renamed from: C1 */
    public void m196346C1() {
        ((rkf0) this.viewModel).m181840n0(this.f179213e, this.f179214f, this.f179215g, this.f179216h);
    }

    /* JADX INFO: renamed from: D1 */
    public void m196347D1(Bundle bundle) {
        if (NullChecker.m82488c(this.f179213e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f179213e);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m196348E1(l4g0 l4g0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", this.f179216h);
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, m196349F1());
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public String m196349F1() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: H1 */
    public void m196350H1() {
        C20102sm.m186692g0(((rkf0) this.viewModel).act(), new y20() { // from class: l.jjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121173a.m196369z1((BloodType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m196351I1() {
        C20102sm.m186694h0(((rkf0) this.viewModel).act(), new y20() { // from class: l.ojf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147661a.m196345B1((QualificationType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final void m196352J1(String str) {
        rfj0.m181215c("e_signup_age_tips", "p_profile_signup_view", rfj0.C19825a.m181221f("signup_source", AccountModule.f16756c.m29326d1()), rfj0.C19825a.m181221f(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.equals(AccountModule.f16756c.m29326d1(), "wechat") ? "" : AccountModule.f16756c.m29324c1().phoneNumber), rfj0.C19825a.m181221f("error_type", str));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.gjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104629a.m196344x1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m196361o1(Double d) {
        this.f179213e.birthdate = d;
        ((rkf0) this.viewModel).m181848v0();
        ((rkf0) this.viewModel).m181844r0();
    }

    /* JADX INFO: renamed from: h1 */
    public void m196354h1() {
        final Double d = this.f179213e.birthdate;
        final boolean z = d == null;
        i4g0.m138492A("e_profilepage_birthday_alert", ((rkf0) this.viewModel).act().pageId(), jyb.m147494Y("signup_source", this.f179216h), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, m196349F1()));
        C20102sm.m186690f0(((rkf0) this.viewModel).act(), new pcj() { // from class: l.pjf0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f152690a.m196359m1();
            }
        }, new y20() { // from class: l.qjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157966a.m196360n1((Double) obj);
            }
        }, new y20() { // from class: l.rjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163451a.m196361o1((Double) obj);
            }
        }, new y20() { // from class: l.sjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168963a.m196362p1((Boolean) obj);
            }
        }, new x20() { // from class: l.tjf0
            @Override // p153l.x20
            public final void call() {
                this.f174583a.m196363q1(z, d);
            }
        });
        ((rkf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: i1 */
    public void m196355i1(final SignUpData signUpData) {
        ((rkf0) this.viewModel).act().duringCreated(AccountModule.f16756c.m29317Y0()).subscribe(psd0.m173597H(new y20() { // from class: l.mjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137072a.m196366t1(signUpData, (User) obj);
            }
        }, new y20() { // from class: l.njf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142291a.m196367u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public void m196356j1(final Runnable runnable) {
        i4g0.m138492A("e_profilepage_gender_alert", ((rkf0) this.viewModel).act().pageId(), jyb.m147494Y("signup_source", this.f179216h), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, m196349F1()));
        ((rkf0) this.viewModel).act().dialog().m21499D(R$string.f17005t3).m21555t0(R$string.f16769B2, new Runnable() { // from class: l.kjf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127097a.m196368v1(runnable);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: k1 */
    public SignUpData m196357k1() {
        return this.f179213e;
    }

    /* JADX INFO: renamed from: l1 */
    public void m196358l1(SignUpData signUpData, boolean z, boolean z2) {
        this.f179213e = signUpData;
        this.f179214f = z;
        this.f179215g = z2;
        if (signUpData.signUpType != AccountTempApi.SignUpType.cosmos) {
            AccountModule.m29130F().setSignUpData(signUpData);
        }
        this.f179216h = AccountModule.m29130F().getSignUpType();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Double m196359m1() {
        Double d = this.f179213e.birthdate;
        if (d != null) {
            return d;
        }
        double time = bsj0.m106264V().getTime();
        m196361o1(Double.valueOf(time));
        return Double.valueOf(time);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m196360n1(Double d) {
        m196361o1(d);
        AccountModule.f16756c.m29300O0().put(this.f179213e.birthdate);
        i4g0.m138523u("e_profilepage_birthday_alert", ((rkf0) this.viewModel).act().pageId(), jyb.m147494Y("signup_source", this.f179216h), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, m196349F1()));
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m196362p1(Boolean bool) {
        if (bool.booleanValue()) {
            m196352J1("tooYoung");
        } else {
            m196352J1("tooOld");
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m196363q1(boolean z, Double d) {
        if (!z) {
            m196361o1(d);
        } else {
            this.f179213e.birthdate = null;
            ((rkf0) this.viewModel).m181842p0();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m196364r1(SignUpData signUpData, uxj0 uxj0Var) {
        ((rkf0) this.viewModel).act().progressDismiss();
        ((rkf0) this.viewModel).act().startActivity(C16330cp.m111725k(((rkf0) this.viewModel).act(), signUpData));
        act().m68056e2();
        bsj0.m106261S(act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m196365s1(Throwable th) {
        ((rkf0) this.viewModel).act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m196366t1(final SignUpData signUpData, User user) {
        String string = user.signupStage.toString();
        string.getClass();
        if (!string.equals("verified")) {
            if (string.equals("finished")) {
                ike.m140276h().f115355a.put("finished");
                ((rkf0) this.viewModel).m181849w0();
                return;
            } else {
                ike.m140276h().m140286m();
                ((rkf0) this.viewModel).act().startActivity(SplashProxyAct.m81288l(((rkf0) this.viewModel).act()));
                return;
            }
        }
        if (ike.m140276h().m140284j(user.finishedStages)) {
            ((rkf0) this.viewModel).act().progressDismiss();
            ((rkf0) this.viewModel).act().startActivity(C16330cp.m111725k(((rkf0) this.viewModel).act(), signUpData));
            act().m68056e2();
            bsj0.m106261S(act());
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
        ((rkf0) this.viewModel).act().duringCreated(ike.m140278q(signUpData2, null)).subscribe(psd0.m173597H(new y20() { // from class: l.hjf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110200a.m196364r1(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.ijf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115217a.m196365s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m196367u1(Throwable th) {
        ((rkf0) this.viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            bsj0.m106246D(th);
        } else {
            ike.m140276h().m140286m();
            ((rkf0) this.viewModel).act().startActivity(SplashProxyAct.m81288l(((rkf0) this.viewModel).act()));
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m196368v1(Runnable runnable) {
        i4g0.m138523u("e_profilepage_gender_alert", ((rkf0) this.viewModel).act().pageId(), jyb.m147494Y("signup_source", this.f179216h), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, m196349F1()));
        runnable.run();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m196369z1(BloodType bloodType) {
        this.f179213e.bloodType = bloodType;
        ((rkf0) this.viewModel).m181844r0();
    }
}
