package com.p046p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.api.AccountServiceImpl;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberInputAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VerifyCodeInputAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CropperAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.SplashAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeBaseAct;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.DownloadDataCheck;
import com.p046p1.mobile.putong.data.EmailVerifyData;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlGenderItem;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.C17581io;
import p149l.C17643iy;
import p149l.C18367m2;
import p149l.C20611vc;
import p149l.C21176xm;
import p149l.C21383yf;
import p149l.InterfaceC17361ho;
import p149l.djj0;
import p149l.e30;
import p149l.epd0;
import p149l.gmi;
import p149l.hkf0;
import p149l.ilo;
import p149l.jo0;
import p149l.mbp;
import p149l.qib0;
import p149l.roj0;
import p149l.rup0;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "account服务", path = "/account_service/service")
public class AccountServiceImpl implements AccountService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f16318a = new C20611vc();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ boolean m28148F(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Aq */
    public void mo28151Aq(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m28658Y1(act), new C4317a.a() { // from class: l.fy
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return AccountServiceImpl.m28148F(e30Var, i, i2, intent);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Em */
    public C22306c<roj0> mo28152Em(ForgetPasswordData forgetPasswordData, Runnable runnable) {
        return C4575a.m28214U0(forgetPasswordData, runnable);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: G6 */
    public String mo28153G6() {
        return WelcomeAct.f17057f;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jm */
    public C22306c<roj0> mo28154Jm(String str, String str2, String str3, String str4) {
        return AccountModule.f16037c.m28360u2(str, str2, str3, str4);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jr */
    public boolean mo28155Jr() {
        return AccountModule.f16037c.m28338j1();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: K7 */
    public Class<? extends Activity> mo28156K7() {
        return WelcomeAct.class;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Lr */
    public String mo28157Lr(IntlGender intlGender, String str) {
        return ilo.INSTANCE.m137011d(intlGender, str);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Mn */
    public Intent mo28158Mn(Context context) {
        return WelcomeAct.m29224D2(context, true);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: N9 */
    public int mo28159N9() {
        return 6;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Pd */
    public C22306c<roj0> mo28160Pd(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f16037c.m28310T1(forgetPasswordData);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Qa */
    public Intent mo28161Qa(Context context, VerifyReason verifyReason, String str) {
        return AccountModule.f16037c.m28309S1(context, verifyReason, str);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Xg */
    public C22392a<Boolean> mo28162Xg() {
        return C17643iy.f115412a;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: a */
    public InterfaceC17361ho mo28163a() {
        return C17581io.m137253d();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<AuthData> accessOutterToken() {
        return AccountModule.f16037c.m28279F0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String accessToken() {
        return AccountModule.f16037c.m28282G0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber) {
        return (phoneNumber == null || phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) ? PhoneNumberInputAct.m28490Y1(context, VerifyReason.get(VerifyReason.ban_appeal)) : VerifyCodeInputAct.m28520Y1(context, VerifyReason.get(VerifyReason.ban_appeal), phoneNumber.countryCode, phoneNumber.number);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<DownloadDataCheck> checkDownloadData() {
        return AccountModule.f16037c.m28288I0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void checkSmartLockSave(Act act) {
        hkf0 hkf0VarM131486d = hkf0.m131486d();
        Pair<String, String> pairM221515e = hkf0VarM131486d.m131488e().m221515e();
        if (pairM221515e != null) {
            hkf0VarM131486d.m131491h(act, (String) pairM221515e.first, (String) pairM221515e.second);
        }
    }

    public void clientNeedsForceUpdate() {
        AccountModule.f16037c.m28291J0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void dialogCCode(Act act, e30<String> e30Var) {
        C21176xm.m210001b0(act, e30Var);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData) {
        return AccountModule.f16037c.m28293K0(emailVerifyData);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: eq */
    public int mo28164eq() {
        return 4;
    }

    @NonNull
    public C18367m2 getAbHooker() {
        return this.f16318a;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public epd0 getAuthData() {
        return AccountModule.f16037c.m28312V0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public SignUpData getSignUpData() {
        return AccountModule.f16037c.m28325c1();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String getSignUpType() {
        return AccountModule.f16037c.m28327d1();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void handleAccountErrors(Throwable th) {
        C21383yf.m214461b(th);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: hb */
    public List<IntlGenderItem> mo28165hb(IntlGender intlGender) {
        return ilo.INSTANCE.m137009b(intlGender);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: il */
    public void mo28166il(String str) {
        AccountModule.f16037c.m28317X1(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    public boolean isWelcomAct(Act act) {
        return act instanceof WelcomeBaseAct;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ji */
    public void mo28167ji(Context context, boolean z, String str, String str2) {
        context.startActivity(EmailLoginOptAct.m28663Z1(context, !TextUtils.isEmpty(str2) ? VerifyReason.get(VerifyReason.change_email) : VerifyReason.get(VerifyReason.bind_email), z, str, str2));
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: kg */
    public Intent mo28168kg(Context context, boolean z) {
        return WelcomeAct.m29225E2(context, z);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: mp */
    public C22306c<roj0> mo28169mp(String str) {
        return AccountModule.f16037c.m28364w2(str);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean onActivityResultForSmartLock(int i, int i2, Intent intent) {
        return hkf0.m131486d().m131489f(i, i2, intent, null);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<roj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType) {
        return AccountModule.f16037c.m28304P1(str, str2, str3, signInGrantType);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void openLoginUiOptCropAct(Act act, String str, boolean z) {
        act.startActivity(CropperAct.m28661V1(act, str, null, z));
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: p9 */
    public List<IntlProfileInfo> mo28170p9() {
        return mbp.INSTANCE.m153968g();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason) {
        return AccountModule.f16037c.m28308R1(context, verifyReason);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ql */
    public void mo28171ql(String str) {
        WelcomeAct.f17057f = str;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: rq */
    public boolean mo28172rq(SettingGroups settingGroups) {
        return ilo.INSTANCE.m137018k(settingGroups);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<roj0> send(VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return AccountModule.f16037c.m28324b2(verifyData).map(new w9j() { // from class: l.ey
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f16039e.m28183k(i, str);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setAuthData(AuthData authData) {
        AccountModule.f16037c.m28328d2(authData);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setSignUpData(SignUpData signUpData) {
        AccountModule.f16037c.m28337i2(signUpData);
    }

    public void signOut() {
        AccountModule.f16037c.m28351p2();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<Boolean> signedIn() {
        return TantanApp.f17182e.m127348c().map(new w9j() { // from class: l.dy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AuthData) obj) != null);
            }
        }).observeOn(jo0.m142408a());
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean signedIn_() {
        return qib0.f154714c0.signedIn_();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void startSignInAct(Context context, Intent intent) {
        AccountModule.f16037c.m28354r2(context, intent);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: t5 */
    public Class mo28173t5() {
        return SplashAct.class;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: uk */
    public Class<? extends Act> mo28174uk() {
        return WelcomeAct.class;
    }

    public void updateLastUsedCCode(String str) {
        WelcomeAct.f17059h = str;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String userId() {
        return AccountModule.f16037c.m28370z2();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22306c<roj0> verify(VerifyData verifyData) {
        return AccountModule.f16037c.m28270A2(verifyData);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: wj */
    public String mo28175wj(Throwable th) {
        return djj0.m112083d(th);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y7 */
    public C22306c<String> mo28176y7() {
        return gmi.m126981c();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y8 */
    public void mo28177y8() {
        rup0.m180925N5();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: zh */
    public List<IntlProfileInfo> mo28178zh() {
        return mbp.INSTANCE.m153967f();
    }

    public String getSignUpType(SignUpData signUpData) {
        return AccountModule.f16037c.m28329e1(signUpData);
    }
}
