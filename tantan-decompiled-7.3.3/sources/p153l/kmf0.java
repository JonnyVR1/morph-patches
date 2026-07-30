package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.AccountTestFactor;
import com.p051p1.mobile.putong.account.data.AccountTestGroup;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class kmf0 extends ar2<pmf0> {

    /* JADX INFO: renamed from: a */
    public boolean f127470a;

    /* JADX INFO: renamed from: b */
    public boolean f127471b;

    /* JADX INFO: renamed from: c */
    public SignUpData f127472c;

    /* JADX INFO: renamed from: d */
    public C22507a<AccountTestGroup> f127473d;

    /* JADX INFO: renamed from: e */
    public kcg0 f127474e;

    /* JADX INFO: renamed from: f */
    public AccountTestFactor f127475f;

    /* JADX INFO: renamed from: g */
    public y20<AccountTestFactor> f127476g;

    public kmf0(ner nerVar) {
        super(nerVar);
        this.f127470a = false;
        this.f127471b = false;
        this.f127473d = C22507a.m222758b();
        this.f127474e = null;
        this.f127475f = new AccountTestFactor();
        this.f127476g = new y20() { // from class: l.xlf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194963a.m150462z0((AccountTestFactor) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L0 */
    private void m150433L0() {
        x95.INSTANCE.m209793m("Onboarding Completed", null);
        ((pmf0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m29131H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((pmf0) this.viewModel).act().startActivity(newMainAct);
        ((pmf0) this.viewModel).act().m68056e2();
        bsj0.m106261S(((pmf0) this.viewModel).act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m150447t0(Bundle bundle) {
        ((pmf0) this.viewModel).m172943j(this.f127472c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m150448y0(Throwable th) {
        bsj0.m106246D(th);
        ((pmf0) this.viewModel).act().progressDismiss();
        this.f127470a = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m150449A0(Throwable th) {
        ((pmf0) this.viewModel).act().progressDismiss();
        this.f127470a = false;
        ((pmf0) this.viewModel).act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m150450C0(SignupStage signupStage) {
        SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM29324c1.profilePath;
            signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            signUpData.appsFlyerUID = signUpDataM29324c1.appsFlyerUID;
            act().duringCreated(ike.m140280s(signUpData, new Runnable() { // from class: l.ylf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200551a.m150452E0();
                }
            }, true, false, null)).subscribe(psd0.m173597H(new y20() { // from class: l.zlf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204917a.m150453F0((uxj0) obj);
                }
            }, new y20() { // from class: l.amf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72222a.m150449A0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            ((pmf0) this.viewModel).act().progressDismiss();
            ike.m140276h().f115355a.put("finished");
            m150433L0();
        } else {
            ((pmf0) this.viewModel).act().progressDismiss();
            ike.m140276h().m140286m();
            ((pmf0) this.viewModel).act().startActivity(SplashProxyAct.m81288l(act()));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m150451D0(Throwable th) {
        this.f127470a = false;
        ((pmf0) this.viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            bsj0.m106246D(th);
        } else {
            ike.m140276h().m140286m();
            ((pmf0) this.viewModel).act().startActivity(SplashProxyAct.m81288l(act()));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m150452E0() {
        ((pmf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m150453F0(uxj0 uxj0Var) {
        ((pmf0) this.viewModel).act().progressDismiss();
        m150433L0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m150454G0(l4g0 l4g0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber());
            jSONObject.put("signup_source", AccountModule.f16756c.m29326d1());
            jSONObject.put("photo_type", TextUtils.isEmpty(this.f127472c.profilePath) ? "empty" : "uploaded");
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public String m150455H0() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: I0 */
    public void m150456I0(Bundle bundle) {
        if (NullChecker.m82488c(this.f127472c, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f127472c);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m150457J0() {
        ((pmf0) this.viewModel).act().progress(R$string.f16946j0);
        i4g0.m138523u("e_imagepage_signup_start_button", act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), jyb.m147494Y("signup_source", AccountModule.f16756c.m29324c1().signUpType), jyb.m147494Y("upload_image_cnt", 1));
        act().duringCreated(AccountModule.f16756c.m29317Y0()).map(new qcj() { // from class: l.hmf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.imf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115772a.m150450C0((SignupStage) obj);
            }
        }, new y20() { // from class: l.jmf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121668a.m150451D0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.bmf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77303a.m150447t0((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.cmf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dmf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89624a.m150460u0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m150458r0(Bundle bundle) {
        if (NullChecker.m82486a(bundle) && NullChecker.m82486a(bundle.getSerializable("signup_data"))) {
            this.f127472c = (SignUpData) bundle.getSerializable("signup_data");
        } else {
            if (!NullChecker.m82486a(((pmf0) this.viewModel).act().getIntent().getSerializableExtra("signup_data"))) {
                this.f127472c = new SignUpData();
                if (ike.m140276h().m140285k()) {
                    ((pmf0) this.viewModel).act().duringCreated(AccountModule.f16756c.m29317Y0()).subscribe(psd0.m173597H(new y20() { // from class: l.emf0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f94648a.m150459s0((User) obj);
                        }
                    }, new fjf0()));
                    return;
                }
                return;
            }
            this.f127472c = (SignUpData) ((pmf0) this.viewModel).act().getIntent().getSerializableExtra("signup_data");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        AccountTestFactor accountTestFactor = this.f127475f;
        accountTestFactor.name = this.f127472c.name;
        try {
            accountTestFactor.birthdate = simpleDateFormat.format(new Date(this.f127472c.birthdate.longValue()));
        } catch (Exception unused) {
            this.f127475f.birthdate = simpleDateFormat.format(new Date());
        }
        AccountTestFactor accountTestFactor2 = this.f127475f;
        SignUpData signUpData = this.f127472c;
        accountTestFactor2.gender = signUpData.gender;
        accountTestFactor2.password = signUpData.password;
        accountTestFactor2.countryCode = Marker.ANY_NON_NULL_MARKER + this.f127472c.countryCode;
        AccountTestFactor accountTestFactor3 = this.f127475f;
        accountTestFactor3.mobileNumber = this.f127472c.phoneNumber;
        accountTestFactor3.channel = "googleplay";
        this.f127476g.call(accountTestFactor3);
        if (h9n.m134081c()) {
            AccountModule.f16756c.m29336i2(this.f127472c);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m150459s0(User user) {
        IntlGender intlGender;
        SignUpData signUpData = this.f127472c;
        signUpData.name = user.name;
        Settings settings = user.settings;
        signUpData.birthdate = settings.birthdate;
        if (settings.getSettingGroup().gender != null) {
            this.f127472c.profileShowGender = user.settings.getSettingGroup().gender.showOnProfile.booleanValue();
            intlGender = user.settings.getSettingGroup().gender.newGender;
        } else {
            intlGender = null;
        }
        SignUpData signUpData2 = this.f127472c;
        signUpData2.gender = user.gender;
        signUpData2.newGender = intlGender;
        PhoneNumber phoneNumber = user.settings.phoneNumber;
        signUpData2.phoneNumber = phoneNumber.number;
        signUpData2.countryCode = phoneNumber.countryCode;
        String str = AccountModule.f16756c.m29306R0().get();
        if (!TextUtils.isEmpty(str)) {
            SignUpData signUpData3 = this.f127472c;
            signUpData3.profilePath = str;
            signUpData3.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        AccountModule.f16756c.m29336i2(this.f127472c);
        ((pmf0) this.viewModel).m172944k(this.f127472c);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m150460u0(C4470c c4470c) {
        ((pmf0) this.viewModel).act().alwaysHideInput();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m150461x0(AccountTestGroup accountTestGroup) {
        this.f127473d.onNext(accountTestGroup);
        if ("netease".equals(accountTestGroup.thirdPartyValidation)) {
            ((pmf0) this.viewModel).act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m150462z0(AccountTestFactor accountTestFactor) {
        AccountModule.f16756c.m29357t2(accountTestFactor).subscribe(psd0.m173597H(new y20() { // from class: l.fmf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99776a.m150461x0((AccountTestGroup) obj);
            }
        }, new y20() { // from class: l.gmf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104974a.m150448y0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
