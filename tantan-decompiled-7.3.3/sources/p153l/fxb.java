package p153l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CropperAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSubscriptionSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class fxb extends ar2<pxb> {

    /* JADX INFO: renamed from: a */
    public String f101247a;

    /* JADX INFO: renamed from: b */
    public boolean f101248b;

    /* JADX INFO: renamed from: c */
    public boolean f101249c;

    /* JADX INFO: renamed from: d */
    public boolean f101250d;

    /* JADX INFO: renamed from: e */
    public boolean f101251e;

    /* JADX INFO: renamed from: f */
    public x20 f101252f;

    /* JADX INFO: renamed from: l.fxb$a */
    public class C17089a implements qcj<Bitmap, Integer> {
        public C17089a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(Bitmap bitmap) {
            return Integer.valueOf(sim.m186020a(bitmap));
        }
    }

    public fxb(ner nerVar) {
        super(nerVar);
        this.f101248b = false;
        this.f101249c = false;
        this.f101250d = false;
        this.f101251e = false;
        this.f101252f = new x20() { // from class: l.qwb
            @Override // p153l.x20
            public final void call() {
                this.f159879a.m127935c0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m127931A0(Bundle bundle) {
        m127966r0().setTitle((CharSequence) null);
        ((pxb) this.viewModel).m174210l(this.f101247a);
    }

    /* JADX INFO: renamed from: S0 */
    private void m127932S0() {
        ((pxb) this.viewModel).getAct().progressDismiss();
        Intent newMainAct = AccountModule.m29131H().toNewMainAct(m127966r0(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((pxb) this.viewModel).getAct().startActivity(newMainAct);
        ((pxb) this.viewModel).getAct().m68056e2();
        bsj0.m106261S(((pxb) this.viewModel).getAct());
        x95.INSTANCE.m209793m("Onboarding Completed", null);
    }

    /* JADX INFO: renamed from: U0 */
    private void m127933U0(SignInGrantType signInGrantType) {
        C22421c<uxj0> c22421cM140280s;
        final SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        signUpDataM29324c1.signUpType = AccountTempApi.SignUpType.media;
        if (h9n.m134081c()) {
            if (!NullChecker.m82486a(signUpDataM29324c1.birthdate)) {
                CrashHelper.m82479c(new RuntimeException("BirthDateNullException please ignore, class = " + getClass().getName() + ", phoneNumber = " + signUpDataM29324c1.phoneNumber));
            }
            c22421cM140280s = C4726a.m29249q2(signUpDataM29324c1, new Runnable() { // from class: l.bxb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78857a.m127958I0();
                }
            });
        } else {
            c22421cM140280s = ike.m140280s(signUpDataM29324c1, new Runnable() { // from class: l.cxb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84195a.m127959J0();
                }
            }, true, false, signInGrantType);
        }
        c22421cM140280s.subscribe(psd0.m173597H(new y20() { // from class: l.dxb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91081a.m127960L0(signUpDataM29324c1, (uxj0) obj);
            }
        }, new y20() { // from class: l.exb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96265a.m127961N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    private void m127934V0() {
        if (AccountModule.f16756c.m29324c1().phoneNumber == null) {
            CrashHelper.m82479c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((pxb) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m29678Z1(m127966r0()));
        this.f101249c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m127935c0() {
        this.f101248b = true;
        AccountModule.f16756c.m29335h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((pxb) this.viewModel).getAct()));
        if (AccountModule.f16756c.m29324c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            ((pxb) this.viewModel).getAct().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000), false).subscribe(psd0.m173596G(new y20() { // from class: l.xwb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196482a.m127952C0((MobileRespInfo) obj);
                }
            }));
        } else {
            m127965R0();
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m127949s0() {
        if (!hve0.m137321w() || lifecycle_() == C4470c.f16267i) {
            m127932S0();
        } else {
            this.f101250d = true;
        }
    }

    /* JADX INFO: renamed from: t0 */
    private void m127950t0() {
        if (lifecycle_() == C4470c.f16267i) {
            m127934V0();
        } else {
            this.f101249c = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private ewb m127951y0() {
        ewb.C16850a c16850a = new ewb.C16850a(Uri.fromFile(ecj.m120381O(sim.m186021c() ? "webp" : "jpg")));
        c16850a.m122940b(sim.m186021c() ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG);
        if (sim.m186021c()) {
            c16850a.m122943e(new C17089a());
        }
        return c16850a.m122942d(1080, 1080).m122941c(100).m122939a();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m127952C0(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16756c.m29342l2(mobileRespInfo.token, mobileRespInfo.openId);
            m127933U0(mobileRespInfo.grantType);
        } else {
            this.f101248b = false;
            ((pxb) this.viewModel).getAct().progressDismiss();
            o1j0.m165621C(R$string.f16856T);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m127953D0() {
        ((pxb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m127954E0(uxj0 uxj0Var) {
        m127949s0();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m127955F0(Throwable th) {
        this.f101248b = false;
        ((pxb) this.viewModel).getAct().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m127956G0(SignupStage signupStage) {
        SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM29324c1.profilePath;
            signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            signUpData.appsFlyerUID = signUpDataM29324c1.appsFlyerUID;
            m127966r0().duringCreated(ike.m140280s(signUpData, new Runnable() { // from class: l.swb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170936a.m127953D0();
                }
            }, true, false, null)).subscribe(psd0.m173597H(new y20() { // from class: l.twb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176391a.m127954E0((uxj0) obj);
                }
            }, new y20() { // from class: l.uwb
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181252a.m127955F0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            ike.m140276h().f115355a.put("finished");
            m127949s0();
        } else {
            ike.m140276h().m140286m();
            ((pxb) this.viewModel).getAct().startActivity(SplashProxyAct.m81288l(m127966r0()));
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m127957H0(Throwable th) {
        this.f101248b = false;
        ((pxb) this.viewModel).getAct().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            bsj0.m106246D(th);
        } else {
            ike.m140276h().m140286m();
            ((pxb) this.viewModel).getAct().startActivity(SplashProxyAct.m81288l(m127966r0()));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m127958I0() {
        ((pxb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m127959J0() {
        ((pxb) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m127960L0(SignUpData signUpData, uxj0 uxj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            uqb0.m197269e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            uqb0.m197269e1("signup_female_hp", new Object[0]);
        }
        if (NullChecker.m82486a(signUpData.others) && IntlCountryCodeController.m29112i()) {
            UserSubscriptionSettings userSubscriptionSettings = new UserSubscriptionSettings();
            userSubscriptionSettings.refuseSMS = Boolean.valueOf(signUpData.others.refuseSMS);
            uqb0.f180380L.f17869h.put(userSubscriptionSettings);
        }
        m127949s0();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m127961N0(Throwable th) {
        this.f101248b = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((pxb) this.viewModel).getAct().progressDismiss();
            m127950t0();
        } else {
            ((pxb) this.viewModel).getAct().progressDismiss();
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m127962O0(CropperAct cropperAct, l4g0 l4g0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signup_source", AccountModule.f16756c.m29326d1());
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m127963P0(boolean z) {
        this.f101251e = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m127964Q0(String str) {
        this.f101247a = str;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m127965R0() {
        ((pxb) this.viewModel).getAct().duringCreated(AccountModule.f16756c.m29317Y0()).map(new qcj() { // from class: l.ywb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.zwb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206330a.m127956G0((SignupStage) obj);
            }
        }, new y20() { // from class: l.axb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73836a.m127957H0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.vwb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186119a.m127931A0((Bundle) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: r0 */
    public CropperAct m127966r0() {
        return (CropperAct) super.act();
    }

    /* JADX INFO: renamed from: u0 */
    public void m127967u0() {
        ((pxb) this.viewModel).getAct().progress(com.p051p1.mobile.android.R$string.f15873k7);
        ((pxb) this.viewModel).m174209k(m127951y0());
    }

    /* JADX INFO: renamed from: x0 */
    public void m127968x0(String str) {
        AccountModule.f16756c.m29340k2(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
        if (this.f101248b) {
            return;
        }
        this.f101252f.call();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m127969z0() {
        return this.f101251e;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
