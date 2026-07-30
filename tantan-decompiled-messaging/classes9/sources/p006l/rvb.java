package p006l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CropperAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.R;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSubscriptionSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.ane0;
import l.cwf0;
import l.d30;
import l.e30;
import l.jq2;
import l.k9j;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.pgm;
import l.qub;
import l.roj0;
import l.w85;
import l.w9j;
import l.yij0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rvb extends jq2<bwb> {

    /* JADX INFO: renamed from: a */
    public String f20811a;

    /* JADX INFO: renamed from: b */
    public boolean f20812b;

    /* JADX INFO: renamed from: c */
    public boolean f20813c;

    /* JADX INFO: renamed from: d */
    public boolean f20814d;

    /* JADX INFO: renamed from: e */
    public boolean f20815e;

    /* JADX INFO: renamed from: f */
    public d30 f20816f;

    /* JADX INFO: renamed from: l.rvb$a */
    public class C1240a implements w9j<Bitmap, Integer> {
        public C1240a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(pgm.a(bitmap));
        }
    }

    public rvb(mcr mcrVar) {
        super(mcrVar);
        this.f20812b = false;
        this.f20813c = false;
        this.f20814d = false;
        this.f20815e = false;
        this.f20816f = new d30() { // from class: l.cvb
            public final void call() {
                this.f9873a.m23290c0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m23286A0(Bundle bundle) {
        m23322r0().setTitle((CharSequence) null);
        ((bwb) ((jq2) this).viewModel).m12928l(this.f20811a);
    }

    /* JADX INFO: renamed from: S0 */
    private void m23287S0() {
        ((bwb) ((jq2) this).viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m27H().toNewMainAct(m23322r0(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((bwb) ((jq2) this).viewModel).act().startActivity(newMainAct);
        ((bwb) ((jq2) this).viewModel).act().finish();
        yij0.S(((bwb) ((jq2) this).viewModel).act());
        w85.INSTANCE.m("Onboarding Completed", (Map) null);
    }

    /* JADX INFO: renamed from: U0 */
    private void m23288U0(SignInGrantType signInGrantType) {
        c<roj0> cVarM14578s;
        final SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        signUpDataM220c1.signUpType = AccountTempApi.SignUpType.media;
        if (h7n.m16063c()) {
            if (!NullChecker.a(signUpDataM220c1.birthdate)) {
                CrashHelper.c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpDataM220c1.phoneNumber));
            }
            cVarM14578s = C0001a.m145q2(signUpDataM220c1, new Runnable() { // from class: l.nvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17885a.m23313I0();
                }
            });
        } else {
            cVarM14578s = eje.m14578s(signUpDataM220c1, new Runnable() { // from class: l.ovb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18396a.m23314J0();
                }
            }, true, false, signInGrantType);
        }
        cVarM14578s.subscribe(mkd0.H(new e30() { // from class: l.pvb
            public final void call(Object obj) {
                this.f19378a.m23315L0(signUpDataM220c1, (roj0) obj);
            }
        }, new e30() { // from class: l.qvb
            public final void call(Object obj) {
                this.f20092a.m23316N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private void m23289V0() {
        if (AccountModule.f26c.m220c1().phoneNumber == null) {
            CrashHelper.c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((bwb) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(m23322r0()));
        this.f20813c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m23290c0() {
        this.f20812b = true;
        AccountModule.f26c.m231h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((bwb) ((jq2) this).viewModel).act()));
        if (AccountModule.f26c.m220c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            ((bwb) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000), false).subscribe(mkd0.G(new e30() { // from class: l.jvb
                public final void call(Object obj) {
                    this.f15451a.m23307C0((MobileRespInfo) obj);
                }
            }));
        } else {
            m23320R0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m23304s0() {
        if (!ane0.w() || lifecycle_() == com.p1.mobile.android.app.c.i) {
            m23287S0();
        } else {
            this.f20814d = true;
        }
    }

    /* JADX INFO: renamed from: t0 */
    private void m23305t0() {
        if (lifecycle_() == com.p1.mobile.android.app.c.i) {
            m23289V0();
        } else {
            this.f20813c = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private qub m23306y0() {
        qub.a aVar = new qub.a(Uri.fromFile(k9j.O(pgm.c() ? "webp" : "jpg")));
        aVar.b(pgm.c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (pgm.c()) {
            aVar.e(new C1240a());
        }
        return aVar.d(1080, 1080).c(100).a();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m23307C0(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f26c.m238l2(mobileRespInfo.token, mobileRespInfo.openId);
            m23288U0(mobileRespInfo.grantType);
        } else {
            this.f20812b = false;
            ((bwb) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.C(R$string.f126T);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m23308D0() {
        ((bwb) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m23309E0(roj0 roj0Var) {
        m23304s0();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m23310F0(Throwable th) {
        this.f20812b = false;
        ((bwb) ((jq2) this).viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m23311G0(SignupStage signupStage) {
        SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM220c1.profilePath;
            signUpData.profileMineType = "image/jpeg";
            signUpData.appsFlyerUID = signUpDataM220c1.appsFlyerUID;
            m23322r0().duringCreated(eje.m14578s(signUpData, new Runnable() { // from class: l.evb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11458a.m23308D0();
                }
            }, true, false, null)).subscribe(mkd0.H(new e30() { // from class: l.fvb
                public final void call(Object obj) {
                    this.f12932a.m23309E0((roj0) obj);
                }
            }, new e30() { // from class: l.gvb
                public final void call(Object obj) {
                    this.f13528a.m23310F0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            eje.m14574h().f11185a.put("finished");
            m23304s0();
        } else {
            eje.m14574h().m14584m();
            ((bwb) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(m23322r0()));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m23312H0(Throwable th) {
        this.f20812b = false;
        ((bwb) ((jq2) this).viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.D(th);
        } else {
            eje.m14574h().m14584m();
            ((bwb) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(m23322r0()));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m23313I0() {
        ((bwb) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m23314J0() {
        ((bwb) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m23315L0(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m22159e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m22159e1("signup_female_hp", new Object[0]);
        }
        if (NullChecker.a(signUpData.others) && IntlCountryCodeController.m8i()) {
            UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
            userSubscriptionSettings.refuseSMS = Boolean.valueOf(signUpData.others.refuseSMS);
            qib0.f19788L.f1139h.put(userSubscriptionSettings);
        }
        m23304s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m23316N0(Throwable th) {
        this.f20812b = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((bwb) ((jq2) this).viewModel).act().progressDismiss();
            m23305t0();
        } else {
            ((bwb) ((jq2) this).viewModel).act().progressDismiss();
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m23317O0(CropperAct cropperAct, cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.f26c.m222d1());
            cwf0Var.o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m23318P0(boolean z) {
        this.f20815e = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m23319Q0(String str) {
        this.f20811a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m23320R0() {
        ((bwb) ((jq2) this).viewModel).act().duringCreated(AccountModule.f26c.m213Y0()).map(new w9j() { // from class: l.kvb
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.lvb
            public final void call(Object obj) {
                this.f16672a.m23311G0((SignupStage) obj);
            }
        }, new e30() { // from class: l.mvb
            public final void call(Object obj) {
                this.f17309a.m23312H0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m23321a0() {
        creates(new e30() { // from class: l.hvb
            public final void call(Object obj) {
                this.f14098a.m23286A0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    public CropperAct m23322r0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: u0 */
    public void m23323u0() {
        ((bwb) ((jq2) this).viewModel).act().progress(R.string.k7);
        ((bwb) ((jq2) this).viewModel).m12927k(m23306y0());
    }

    /* JADX INFO: renamed from: x0 */
    public void m23324x0(String str) {
        AccountModule.f26c.m236k2(str, "image/jpeg");
        if (this.f20812b) {
            return;
        }
        this.f20816f.call();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m23325z0() {
        return this.f20815e;
    }

    public void destroy() {
    }
}
