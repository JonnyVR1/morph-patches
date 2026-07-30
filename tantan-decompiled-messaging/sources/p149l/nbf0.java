package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class nbf0 extends b3f0<kcf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f138030e;

    /* JADX INFO: renamed from: f */
    public boolean f138031f;

    /* JADX INFO: renamed from: g */
    public boolean f138032g;

    /* JADX INFO: renamed from: h */
    public String f138033h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f138034i;

    public nbf0(mcr mcrVar) {
        super(mcrVar);
        this.f138030e = new SignUpData();
        this.f138032g = false;
        this.f138033h = "";
        this.f138034i = new e30() { // from class: l.ebf0
            @Override // p149l.e30
            public final void call(Object obj) {
                nbf0.m158783Y0((Boolean) obj);
            }
        };
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m158783Y0(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m158790x1(Bundle bundle) {
        ((kcf0) this.viewModel).m145402A3(this.f138033h);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m158791B1(QualificationType qualificationType) {
        this.f138030e.qualificationType = qualificationType;
        ((kcf0) this.viewModel).m145435r0();
    }

    /* JADX INFO: renamed from: C1 */
    public void m158792C1() {
        ((kcf0) this.viewModel).m145431n0(this.f138030e, this.f138031f, this.f138032g, this.f138033h);
    }

    /* JADX INFO: renamed from: D1 */
    public void m158793D1(Bundle bundle) {
        if (NullChecker.m81305c(this.f138030e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f138030e);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m158794E1(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", this.f138033h);
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, m158795F1());
            cwf0Var.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public String m158795F1() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: H1 */
    public void m158796H1() {
        C21176xm.m210007g0(((kcf0) this.viewModel).act(), new e30() { // from class: l.cbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80137a.m158815z1((BloodType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public void m158797I1() {
        C21176xm.m210009h0(((kcf0) this.viewModel).act(), new e30() { // from class: l.hbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106929a.m158791B1((QualificationType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final void m158798J1(String str) {
        n6j0.m158049c("e_signup_age_tips", "p_profile_signup_view", n6j0.C18629a.m158055f("signup_source", AccountModule.f16037c.m28327d1()), n6j0.C18629a.m158055f(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.equals(AccountModule.f16037c.m28327d1(), "wechat") ? "" : AccountModule.f16037c.m28325c1().phoneNumber), n6j0.C18629a.m158055f("error_type", str));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.zaf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202345a.m158790x1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final void m158807o1(Double d) {
        this.f138030e.birthdate = d;
        ((kcf0) this.viewModel).m145439v0();
        ((kcf0) this.viewModel).m145435r0();
    }

    /* JADX INFO: renamed from: h1 */
    public void m158800h1() {
        final Double d = this.f138030e.birthdate;
        final boolean z = d == null;
        zvf0.m220368A("e_profilepage_birthday_alert", ((kcf0) this.viewModel).act().pageId(), vwb.m200311Y("signup_source", this.f138033h), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, m158795F1()));
        C21176xm.m210005f0(((kcf0) this.viewModel).act(), new v9j() { // from class: l.ibf0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f112362a.m158805m1();
            }
        }, new e30() { // from class: l.jbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117189a.m158806n1((Double) obj);
            }
        }, new e30() { // from class: l.kbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122234a.m158807o1((Double) obj);
            }
        }, new e30() { // from class: l.lbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127291a.m158808p1((Boolean) obj);
            }
        }, new d30() { // from class: l.mbf0
            @Override // p149l.d30
            public final void call() {
                this.f133017a.m158809q1(z, d);
            }
        });
        ((kcf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: i1 */
    public void m158801i1(final SignUpData signUpData) {
        ((kcf0) this.viewModel).act().duringCreated(AccountModule.f16037c.m28318Y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.fbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96710a.m158812t1(signUpData, (User) obj);
            }
        }, new e30() { // from class: l.gbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101844a.m158813u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public void m158802j1(final Runnable runnable) {
        zvf0.m220368A("e_profilepage_gender_alert", ((kcf0) this.viewModel).act().pageId(), vwb.m200311Y("signup_source", this.f138033h), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, m158795F1()));
        ((kcf0) this.viewModel).act().dialog().m20500D(R$string.f16286t3).m20556t0(R$string.f16050B2, new Runnable() { // from class: l.dbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f85313a.m158814v1(runnable);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: k1 */
    public SignUpData m158803k1() {
        return this.f138030e;
    }

    /* JADX INFO: renamed from: l1 */
    public void m158804l1(SignUpData signUpData, boolean z, boolean z2) {
        this.f138030e = signUpData;
        this.f138031f = z;
        this.f138032g = z2;
        if (signUpData.signUpType != AccountTempApi.SignUpType.cosmos) {
            AccountModule.m28131F().setSignUpData(signUpData);
        }
        this.f138033h = AccountModule.m28131F().getSignUpType();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ Double m158805m1() {
        Double d = this.f138030e.birthdate;
        if (d != null) {
            return d;
        }
        double time = yij0.m214944V().getTime();
        m158807o1(Double.valueOf(time));
        return Double.valueOf(time);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m158806n1(Double d) {
        m158807o1(d);
        AccountModule.f16037c.m28301O0().put(this.f138030e.birthdate);
        zvf0.m220399u("e_profilepage_birthday_alert", ((kcf0) this.viewModel).act().pageId(), vwb.m200311Y("signup_source", this.f138033h), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, m158795F1()));
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m158808p1(Boolean bool) {
        if (bool.booleanValue()) {
            m158798J1("tooYoung");
        } else {
            m158798J1("tooOld");
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m158809q1(boolean z, Double d) {
        if (!z) {
            m158807o1(d);
        } else {
            this.f138030e.birthdate = null;
            ((kcf0) this.viewModel).m145433p0();
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m158810r1(SignUpData signUpData, roj0 roj0Var) {
        ((kcf0) this.viewModel).act().progressDismiss();
        ((kcf0) this.viewModel).act().startActivity(C17367hp.m132327k(((kcf0) this.viewModel).act(), signUpData));
        act().m66873d2();
        yij0.m214941S(act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m158811s1(Throwable th) {
        ((kcf0) this.viewModel).act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m158812t1(final SignUpData signUpData, User user) {
        String string = user.signupStage.toString();
        string.getClass();
        if (!string.equals("verified")) {
            if (string.equals("finished")) {
                eje.m116824h().f91713a.put("finished");
                ((kcf0) this.viewModel).m145440w0();
                return;
            } else {
                eje.m116824h().m116834m();
                ((kcf0) this.viewModel).act().startActivity(SplashProxyAct.m80105l(((kcf0) this.viewModel).act()));
                return;
            }
        }
        if (eje.m116824h().m116832j(user.finishedStages)) {
            ((kcf0) this.viewModel).act().progressDismiss();
            ((kcf0) this.viewModel).act().startActivity(C17367hp.m132327k(((kcf0) this.viewModel).act(), signUpData));
            act().m66873d2();
            yij0.m214941S(act());
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
        ((kcf0) this.viewModel).act().duringCreated(eje.m116826q(signUpData2, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.abf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68657a.m158810r1(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.bbf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74804a.m158811s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m158813u1(Throwable th) {
        ((kcf0) this.viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.m214926D(th);
        } else {
            eje.m116824h().m116834m();
            ((kcf0) this.viewModel).act().startActivity(SplashProxyAct.m80105l(((kcf0) this.viewModel).act()));
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m158814v1(Runnable runnable) {
        zvf0.m220399u("e_profilepage_gender_alert", ((kcf0) this.viewModel).act().pageId(), vwb.m200311Y("signup_source", this.f138033h), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, m158795F1()));
        runnable.run();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m158815z1(BloodType bloodType) {
        this.f138030e.bloodType = bloodType;
        ((kcf0) this.viewModel).m145435r0();
    }
}
