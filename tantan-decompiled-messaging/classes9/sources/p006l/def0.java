package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.AccountTestFactor;
import com.p000p1.mobile.putong.account.data.AccountTestGroup;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class def0 extends jq2<ief0> {

    /* JADX INFO: renamed from: a */
    public boolean f10353a;

    /* JADX INFO: renamed from: b */
    public boolean f10354b;

    /* JADX INFO: renamed from: c */
    public SignUpData f10355c;

    /* JADX INFO: renamed from: d */
    public a<AccountTestGroup> f10356d;

    /* JADX INFO: renamed from: e */
    public c4g0 f10357e;

    /* JADX INFO: renamed from: f */
    public AccountTestFactor f10358f;

    /* JADX INFO: renamed from: g */
    public e30<AccountTestFactor> f10359g;

    public def0(mcr mcrVar) {
        super(mcrVar);
        this.f10353a = false;
        this.f10354b = false;
        this.f10356d = a.b();
        this.f10357e = null;
        this.f10358f = new AccountTestFactor();
        this.f10359g = new e30() { // from class: l.qdf0
            public final void call(Object obj) {
                this.f19722a.m14006z0((AccountTestFactor) obj);
            }
        };
    }

    /* JADX INFO: renamed from: L0 */
    private void m13976L0() {
        w85.INSTANCE.m("Onboarding Completed", (Map) null);
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m27H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((ief0) ((jq2) this).viewModel).act().startActivity(newMainAct);
        ((ief0) ((jq2) this).viewModel).act().finish();
        yij0.S(((ief0) ((jq2) this).viewModel).act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m13990t0(Bundle bundle) {
        ((ief0) ((jq2) this).viewModel).m16640j(this.f10355c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m13991y0(Throwable th) {
        yij0.D(th);
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        this.f10353a = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m13992A0(Throwable th) {
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        this.f10353a = false;
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m13993C0(SignupStage signupStage) {
        SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        String string = signupStage.toString();
        string.getClass();
        if (string.equals("verified")) {
            SignUpData signUpData = new SignUpData();
            signUpData.signUpType = AccountTempApi.SignUpType.media;
            signUpData.profilePath = signUpDataM220c1.profilePath;
            signUpData.profileMineType = "image/jpeg";
            signUpData.appsFlyerUID = signUpDataM220c1.appsFlyerUID;
            act().duringCreated(eje.m14578s(signUpData, new Runnable() { // from class: l.rdf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20526a.m13995E0();
                }
            }, true, false, null)).subscribe(mkd0.H(new e30() { // from class: l.sdf0
                public final void call(Object obj) {
                    this.f21268a.m13996F0((roj0) obj);
                }
            }, new e30() { // from class: l.tdf0
                public final void call(Object obj) {
                    this.f22048a.m13992A0((Throwable) obj);
                }
            }));
            return;
        }
        if (string.equals("finished")) {
            ((ief0) ((jq2) this).viewModel).act().progressDismiss();
            eje.m14574h().f11185a.put("finished");
            m13976L0();
        } else {
            ((ief0) ((jq2) this).viewModel).act().progressDismiss();
            eje.m14574h().m14584m();
            ((ief0) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(act()));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m13994D0(Throwable th) {
        this.f10353a = false;
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        if (!(th instanceof ApiExcep.Client.NotFound) && !(th instanceof ApiExcep.Client.Unauthorized) && (!(th instanceof App.HandledGlobally) || !(((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            yij0.D(th);
        } else {
            eje.m14574h().m14584m();
            ((ief0) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(act()));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m13995E0() {
        ((ief0) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m13996F0(roj0 roj0Var) {
        ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        m13976L0();
    }

    /* JADX INFO: renamed from: G0 */
    public void m13997G0(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phone_num", SignUpData.getNonNullPhoneNumber());
            jSONObject.put("signup_source", AccountModule.f26c.m222d1());
            jSONObject.put("photo_type", TextUtils.isEmpty(this.f10355c.profilePath) ? "empty" : "uploaded");
            cwf0Var.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public String m13998H0() {
        return SignUpData.getNonNullPhoneNumber();
    }

    /* JADX INFO: renamed from: I0 */
    public void m13999I0(Bundle bundle) {
        if (NullChecker.c(this.f10355c, "account", CrashHelper.ReportLevel.p9)) {
            bundle.putSerializable("signup_data", this.f10355c);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m14000J0() {
        ((ief0) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        zvf0.u("e_imagepage_signup_start_button", act().pageId(), new j760[]{vwb.Y("phone_num", SignUpData.getNonNullPhoneNumber()), vwb.Y("signup_source", AccountModule.f26c.m220c1().signUpType), vwb.Y("upload_image_cnt", 1)});
        act().duringCreated(AccountModule.f26c.m213Y0()).map(new w9j() { // from class: l.aef0
            public final Object call(Object obj) {
                return ((User) obj).signupStage;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bef0
            public final void call(Object obj) {
                this.f8848a.m13993C0((SignupStage) obj);
            }
        }, new e30() { // from class: l.cef0
            public final void call(Object obj) {
                this.f9611a.m13994D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m14001a0() {
        creates(new e30() { // from class: l.udf0
            public final void call(Object obj) {
                this.f23497a.m13990t0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.vdf0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wdf0
            public final void call(Object obj) {
                this.f25112a.m14004u0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m14002r0(Bundle bundle) {
        if (NullChecker.a(bundle) && NullChecker.a(bundle.getSerializable("signup_data"))) {
            this.f10355c = bundle.getSerializable("signup_data");
        } else {
            if (!NullChecker.a(((ief0) ((jq2) this).viewModel).act().getIntent().getSerializableExtra("signup_data"))) {
                this.f10355c = new SignUpData();
                if (eje.m14574h().m14583k()) {
                    ((ief0) ((jq2) this).viewModel).act().duringCreated(AccountModule.f26c.m213Y0()).subscribe(mkd0.H(new e30() { // from class: l.xdf0
                        public final void call(Object obj) {
                            this.f27459a.m14003s0((User) obj);
                        }
                    }, new yaf0()));
                    return;
                }
                return;
            }
            this.f10355c = ((ief0) ((jq2) this).viewModel).act().getIntent().getSerializableExtra("signup_data");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        AccountTestFactor accountTestFactor = this.f10358f;
        accountTestFactor.name = this.f10355c.name;
        try {
            accountTestFactor.birthdate = simpleDateFormat.format(new Date(this.f10355c.birthdate.longValue()));
        } catch (Exception unused) {
            this.f10358f.birthdate = simpleDateFormat.format(new Date());
        }
        AccountTestFactor accountTestFactor2 = this.f10358f;
        SignUpData signUpData = this.f10355c;
        accountTestFactor2.gender = signUpData.gender;
        accountTestFactor2.password = signUpData.password;
        accountTestFactor2.countryCode = "+" + this.f10355c.countryCode;
        AccountTestFactor accountTestFactor3 = this.f10358f;
        accountTestFactor3.mobileNumber = this.f10355c.phoneNumber;
        accountTestFactor3.channel = "googleplay";
        this.f10359g.call(accountTestFactor3);
        if (h7n.m16063c()) {
            AccountModule.f26c.m232i2(this.f10355c);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m14003s0(User user) {
        IntlGender intlGender;
        SignUpData signUpData = this.f10355c;
        signUpData.name = user.name;
        Settings settings = user.settings;
        signUpData.birthdate = settings.birthdate;
        if (settings.getSettingGroup().gender != null) {
            this.f10355c.profileShowGender = user.settings.getSettingGroup().gender.showOnProfile.booleanValue();
            intlGender = user.settings.getSettingGroup().gender.newGender;
        } else {
            intlGender = null;
        }
        SignUpData signUpData2 = this.f10355c;
        signUpData2.gender = user.gender;
        signUpData2.newGender = intlGender;
        PhoneNumber phoneNumber = user.settings.phoneNumber;
        signUpData2.phoneNumber = phoneNumber.number;
        signUpData2.countryCode = phoneNumber.countryCode;
        String str = (String) AccountModule.f26c.m202R0().get();
        if (!TextUtils.isEmpty(str)) {
            SignUpData signUpData3 = this.f10355c;
            signUpData3.profilePath = str;
            signUpData3.profileMineType = "image/jpeg";
        }
        AccountModule.f26c.m232i2(this.f10355c);
        ((ief0) ((jq2) this).viewModel).m16641k(this.f10355c);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m14004u0(c cVar) {
        ((ief0) ((jq2) this).viewModel).act().alwaysHideInput();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m14005x0(AccountTestGroup accountTestGroup) {
        this.f10356d.onNext(accountTestGroup);
        if ("netease".equals(accountTestGroup.thirdPartyValidation)) {
            ((ief0) ((jq2) this).viewModel).act().progressDismiss();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m14006z0(AccountTestFactor accountTestFactor) {
        AccountModule.f26c.m253t2(accountTestFactor).subscribe(mkd0.H(new e30() { // from class: l.ydf0
            public final void call(Object obj) {
                this.f28164a.m14005x0((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.zdf0
            public final void call(Object obj) {
                this.f28716a.m13991y0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
