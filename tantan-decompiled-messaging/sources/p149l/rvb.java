package p149l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CropperAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSubscriptionSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class rvb extends jq2<bwb> {

    /* JADX INFO: renamed from: a */
    public String f161185a;

    /* JADX INFO: renamed from: b */
    public boolean f161186b;

    /* JADX INFO: renamed from: c */
    public boolean f161187c;

    /* JADX INFO: renamed from: d */
    public boolean f161188d;

    /* JADX INFO: renamed from: e */
    public boolean f161189e;

    /* JADX INFO: renamed from: f */
    public d30 f161190f;

    /* JADX INFO: renamed from: l.rvb$a */
    public class C19798a implements w9j<Bitmap, Integer> {
        public C19798a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(pgm.m168759a(bitmap));
        }
    }

    public rvb(mcr mcrVar) {
        super(mcrVar);
        this.f161186b = false;
        this.f161187c = false;
        this.f161188d = false;
        this.f161189e = false;
        this.f161190f = new d30() { // from class: l.cvb
            @Override // p149l.d30
            public final void call() {
                this.f82654a.m181243c0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m181239A0(Bundle bundle) {
        m181274r0().setTitle((CharSequence) null);
        ((bwb) this.viewModel).m104143l(this.f161185a);
    }

    /* JADX INFO: renamed from: S0 */
    private void m181240S0() {
        ((bwb) this.viewModel).getAct().progressDismiss();
        Intent newMainAct = AccountModule.m28132H().toNewMainAct(m181274r0(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((bwb) this.viewModel).getAct().startActivity(newMainAct);
        ((bwb) this.viewModel).getAct().m66873d2();
        yij0.m214941S(((bwb) this.viewModel).getAct());
        w85.INSTANCE.m202145m("Onboarding Completed", null);
    }

    /* JADX INFO: renamed from: U0 */
    private void m181241U0(SignInGrantType signInGrantType) {
        C22306c<roj0> c22306cM116828s;
        final SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        signUpDataM28325c1.signUpType = AccountTempApi.SignUpType.media;
        if (h7n.m129754c()) {
            if (!NullChecker.m81303a(signUpDataM28325c1.birthdate)) {
                CrashHelper.m81296c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpDataM28325c1.phoneNumber));
            }
            c22306cM116828s = C4575a.m28250q2(signUpDataM28325c1, new Runnable() { // from class: l.nvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140699a.m181266I0();
                }
            });
        } else {
            c22306cM116828s = eje.m116828s(signUpDataM28325c1, new Runnable() { // from class: l.ovb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145794a.m181267J0();
                }
            }, true, false, signInGrantType);
        }
        c22306cM116828s.subscribe(mkd0.m154956H(new e30() { // from class: l.pvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151437a.m181268L0(signUpDataM28325c1, (roj0) obj);
            }
        }, new e30() { // from class: l.qvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156597a.m181269N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private void m181242V0() {
        if (AccountModule.f16037c.m28325c1().phoneNumber == null) {
            CrashHelper.m81296c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((bwb) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m28679Y1(m181274r0()));
        this.f161187c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m181243c0() {
        this.f161186b = true;
        AccountModule.f16037c.m28336h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((bwb) this.viewModel).getAct()));
        if (AccountModule.f16037c.m28325c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            ((bwb) this.viewModel).getAct().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000), false).subscribe(mkd0.m154955G(new e30() { // from class: l.jvb
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119927a.m181260C0((MobileRespInfo) obj);
                }
            }));
        } else {
            m181273R0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m181257s0() {
        if (!ane0.m97751w() || lifecycle_() == C4319c.f15548i) {
            m181240S0();
        } else {
            this.f161188d = true;
        }
    }

    /* JADX INFO: renamed from: t0 */
    private void m181258t0() {
        if (lifecycle_() == C4319c.f15548i) {
            m181242V0();
        } else {
            this.f161187c = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private qub m181259y0() {
        qub.C19581a c19581a = new qub.C19581a(Uri.fromFile(k9j.m145083O(pgm.m168760c() ? "webp" : "jpg")));
        c19581a.m176593b(pgm.m168760c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (pgm.m168760c()) {
            c19581a.m176596e(new C19798a());
        }
        return c19581a.m176595d(1080, 1080).m176594c(100).m176592a();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m181260C0(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16037c.m28343l2(mobileRespInfo.token, mobileRespInfo.openId);
            m181241U0(mobileRespInfo.grantType);
        } else {
            this.f161186b = false;
            ((bwb) this.viewModel).getAct().progressDismiss();
            lsi0.m151565C(R$string.f16137T);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m181261D0() {
        ((bwb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m181262E0(roj0 roj0Var) {
        m181257s0();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m181263F0(Throwable th) {
        this.f161186b = false;
        ((bwb) this.viewModel).getAct().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m181264G0(SignupStage signupStage) {
        SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM28325c1.profilePath;
            signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            signUpData.appsFlyerUID = signUpDataM28325c1.appsFlyerUID;
            m181274r0().duringCreated(eje.m116828s(signUpData, new Runnable() { // from class: l.evb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93327a.m181261D0();
                }
            }, true, false, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.fvb
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99415a.m181262E0((roj0) obj);
                }
            }, new e30() { // from class: l.gvb
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104550a.m181263F0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            eje.m116824h().f91713a.put("finished");
            m181257s0();
        } else {
            eje.m116824h().m116834m();
            ((bwb) this.viewModel).getAct().startActivity(SplashProxyAct.m80105l(m181274r0()));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m181265H0(Throwable th) {
        this.f161186b = false;
        ((bwb) this.viewModel).getAct().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.m214926D(th);
        } else {
            eje.m116824h().m116834m();
            ((bwb) this.viewModel).getAct().startActivity(SplashProxyAct.m80105l(m181274r0()));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m181266I0() {
        ((bwb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m181267J0() {
        ((bwb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m181268L0(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m174815e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m174815e1("signup_female_hp", new Object[0]);
        }
        if (NullChecker.m81303a(signUpData.others) && IntlCountryCodeController.m28113i()) {
            UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
            userSubscriptionSettings.refuseSMS = Boolean.valueOf(signUpData.others.refuseSMS);
            qib0.f154697L.f17150h.put(userSubscriptionSettings);
        }
        m181257s0();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m181269N0(Throwable th) {
        this.f161186b = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((bwb) this.viewModel).getAct().progressDismiss();
            m181258t0();
        } else {
            ((bwb) this.viewModel).getAct().progressDismiss();
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m181270O0(CropperAct cropperAct, cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.f16037c.m28327d1());
            cwf0Var.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m181271P0(boolean z) {
        this.f161189e = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m181272Q0(String str) {
        this.f161185a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m181273R0() {
        ((bwb) this.viewModel).getAct().duringCreated(AccountModule.f16037c.m28318Y0()).map(new w9j() { // from class: l.kvb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.lvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130150a.m181264G0((SignupStage) obj);
            }
        }, new e30() { // from class: l.mvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135893a.m181265H0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.hvb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109636a.m181239A0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    public CropperAct m181274r0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: u0 */
    public void m181275u0() {
        ((bwb) this.viewModel).getAct().progress(com.p046p1.mobile.android.R$string.f15154k7);
        ((bwb) this.viewModel).m104142k(m181259y0());
    }

    /* JADX INFO: renamed from: x0 */
    public void m181276x0(String str) {
        AccountModule.f16037c.m28341k2(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
        if (this.f161186b) {
            return;
        }
        this.f161190f.call();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m181277z0() {
        return this.f161189e;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
