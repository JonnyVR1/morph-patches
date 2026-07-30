package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.AccountTestFactor;
import com.p046p1.mobile.putong.account.data.AccountTestGroup;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
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
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class def0 extends jq2<ief0> {

    /* JADX INFO: renamed from: a */
    public boolean f85784a;

    /* JADX INFO: renamed from: b */
    public boolean f85785b;

    /* JADX INFO: renamed from: c */
    public SignUpData f85786c;

    /* JADX INFO: renamed from: d */
    public C22392a<AccountTestGroup> f85787d;

    /* JADX INFO: renamed from: e */
    public c4g0 f85788e;

    /* JADX INFO: renamed from: f */
    public AccountTestFactor f85789f;

    /* JADX INFO: renamed from: g */
    public e30<AccountTestFactor> f85790g;

    public def0(mcr mcrVar) {
        super(mcrVar);
        this.f85784a = false;
        this.f85785b = false;
        this.f85787d = C22392a.m221512b();
        this.f85788e = null;
        this.f85789f = new AccountTestFactor();
        this.f85790g = new e30() { // from class: l.qdf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153916a.m111229z0((AccountTestFactor) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L0 */
    private void m111200L0() {
        w85.INSTANCE.m202145m("Onboarding Completed", null);
        ((ief0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m28132H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((ief0) this.viewModel).act().startActivity(newMainAct);
        ((ief0) this.viewModel).act().m66873d2();
        yij0.m214941S(((ief0) this.viewModel).act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m111214t0(Bundle bundle) {
        ((ief0) this.viewModel).m135682j(this.f85786c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m111215y0(Throwable th) {
        yij0.m214926D(th);
        ((ief0) this.viewModel).act().progressDismiss();
        this.f85784a = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m111216A0(Throwable th) {
        ((ief0) this.viewModel).act().progressDismiss();
        this.f85784a = false;
        ((ief0) this.viewModel).act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m111217C0(SignupStage signupStage) {
        SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM28325c1.profilePath;
            signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            signUpData.appsFlyerUID = signUpDataM28325c1.appsFlyerUID;
            act().duringCreated(eje.m116828s(signUpData, new Runnable() { // from class: l.rdf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158911a.m111219E0();
                }
            }, true, false, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.sdf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163838a.m111220F0((roj0) obj);
                }
            }, new e30() { // from class: l.tdf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169548a.m111216A0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            ((ief0) this.viewModel).act().progressDismiss();
            eje.m116824h().f91713a.put("finished");
            m111200L0();
        } else {
            ((ief0) this.viewModel).act().progressDismiss();
            eje.m116824h().m116834m();
            ((ief0) this.viewModel).act().startActivity(SplashProxyAct.m80105l(act()));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m111218D0(Throwable th) {
        this.f85784a = false;
        ((ief0) this.viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.m214926D(th);
        } else {
            eje.m116824h().m116834m();
            ((ief0) this.viewModel).act().startActivity(SplashProxyAct.m80105l(act()));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m111219E0() {
        ((ief0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m111220F0(roj0 roj0Var) {
        ((ief0) this.viewModel).act().progressDismiss();
        m111200L0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m111221G0(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber());
            jSONObject.put("signup_source", AccountModule.f16037c.m28327d1());
            jSONObject.put("photo_type", TextUtils.isEmpty(this.f85786c.profilePath) ? "empty" : "uploaded");
            cwf0Var.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public String m111222H0() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: I0 */
    public void m111223I0(Bundle bundle) {
        if (NullChecker.m81305c(this.f85786c, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f85786c);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m111224J0() {
        ((ief0) this.viewModel).act().progress(R$string.f16227j0);
        zvf0.m220399u("e_imagepage_signup_start_button", act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, SignUpData.getNonNullPhoneNumber()), vwb.m200311Y("signup_source", AccountModule.f16037c.m28325c1().signUpType), vwb.m200311Y("upload_image_cnt", 1));
        act().duringCreated(AccountModule.f16037c.m28318Y0()).map(new w9j() { // from class: l.aef0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bef0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75155a.m111217C0((SignupStage) obj);
            }
        }, new e30() { // from class: l.cef0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80458a.m111218D0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.udf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175916a.m111214t0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.vdf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wdf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185797a.m111227u0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m111225r0(Bundle bundle) {
        if (NullChecker.m81303a(bundle) && NullChecker.m81303a(bundle.getSerializable("signup_data"))) {
            this.f85786c = (SignUpData) bundle.getSerializable("signup_data");
        } else {
            if (!NullChecker.m81303a(((ief0) this.viewModel).act().getIntent().getSerializableExtra("signup_data"))) {
                this.f85786c = new SignUpData();
                if (eje.m116824h().m116833k()) {
                    ((ief0) this.viewModel).act().duringCreated(AccountModule.f16037c.m28318Y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.xdf0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f192383a.m111226s0((User) obj);
                        }
                    }, new yaf0()));
                    return;
                }
                return;
            }
            this.f85786c = (SignUpData) ((ief0) this.viewModel).act().getIntent().getSerializableExtra("signup_data");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        AccountTestFactor accountTestFactor = this.f85789f;
        accountTestFactor.name = this.f85786c.name;
        try {
            accountTestFactor.birthdate = simpleDateFormat.format(new Date(this.f85786c.birthdate.longValue()));
        } catch (Exception unused) {
            this.f85789f.birthdate = simpleDateFormat.format(new Date());
        }
        AccountTestFactor accountTestFactor2 = this.f85789f;
        SignUpData signUpData = this.f85786c;
        accountTestFactor2.gender = signUpData.gender;
        accountTestFactor2.password = signUpData.password;
        accountTestFactor2.countryCode = Marker.ANY_NON_NULL_MARKER + this.f85786c.countryCode;
        AccountTestFactor accountTestFactor3 = this.f85789f;
        accountTestFactor3.mobileNumber = this.f85786c.phoneNumber;
        accountTestFactor3.channel = "googleplay";
        this.f85790g.call(accountTestFactor3);
        if (h7n.m129754c()) {
            AccountModule.f16037c.m28337i2(this.f85786c);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m111226s0(User user) {
        IntlGender intlGender;
        SignUpData signUpData = this.f85786c;
        signUpData.name = user.name;
        Settings settings = user.settings;
        signUpData.birthdate = settings.birthdate;
        if (settings.getSettingGroup().gender != null) {
            this.f85786c.profileShowGender = user.settings.getSettingGroup().gender.showOnProfile.booleanValue();
            intlGender = user.settings.getSettingGroup().gender.newGender;
        } else {
            intlGender = null;
        }
        SignUpData signUpData2 = this.f85786c;
        signUpData2.gender = user.gender;
        signUpData2.newGender = intlGender;
        PhoneNumber phoneNumber = user.settings.phoneNumber;
        signUpData2.phoneNumber = phoneNumber.number;
        signUpData2.countryCode = phoneNumber.countryCode;
        String str = AccountModule.f16037c.m28307R0().get();
        if (!TextUtils.isEmpty(str)) {
            SignUpData signUpData3 = this.f85786c;
            signUpData3.profilePath = str;
            signUpData3.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        AccountModule.f16037c.m28337i2(this.f85786c);
        ((ief0) this.viewModel).m135683k(this.f85786c);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m111227u0(C4319c c4319c) {
        ((ief0) this.viewModel).act().alwaysHideInput();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m111228x0(AccountTestGroup accountTestGroup) {
        this.f85787d.onNext(accountTestGroup);
        if ("netease".equals(accountTestGroup.thirdPartyValidation)) {
            ((ief0) this.viewModel).act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m111229z0(AccountTestFactor accountTestFactor) {
        AccountModule.f16037c.m28358t2(accountTestFactor).subscribe(mkd0.m154956H(new e30() { // from class: l.ydf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197560a.m111228x0((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.zdf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202664a.m111215y0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
