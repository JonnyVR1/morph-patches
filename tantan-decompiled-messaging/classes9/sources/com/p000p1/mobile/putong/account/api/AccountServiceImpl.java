package com.p000p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.api.AccountServiceImpl;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberInputAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VerifyCodeInputAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CropperAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.SplashAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeBaseAct;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.DownloadDataCheck;
import com.p1.mobile.putong.data.EmailVerifyData;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.IntlProfileInfo;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.epd0;
import l.jo0;
import l.roj0;
import l.w9j;
import p006l.C0848io;
import p006l.C0861iy;
import p006l.C1000m2;
import p006l.C1373vc;
import p006l.C1444xm;
import p006l.C1478yf;
import p006l.InterfaceC0810ho;
import p006l.djj0;
import p006l.gmi;
import p006l.hkf0;
import p006l.ilo;
import p006l.mbp;
import p006l.qib0;
import p006l.rup0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "account服务", path = "/account_service/service")
public class AccountServiceImpl implements AccountService {

    /* JADX INFO: renamed from: a */
    public C1000m2 f307a = new C1373vc();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ boolean m43F(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        e30Var.call("+" + intent.getIntExtra("ccode", 86));
        return true;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Aq */
    public void mo46Aq(Act act, final e30<String> e30Var) {
        act.startActivityForResult(CCodeChooseAct.m557Y1(act), new a.a() { // from class: l.fy
            /* JADX INFO: renamed from: a */
            public final boolean m15512a(int i, int i2, Intent intent) {
                return AccountServiceImpl.m43F(e30Var, i, i2, intent);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Em */
    public c<roj0> mo47Em(ForgetPasswordData forgetPasswordData, Runnable runnable) {
        return C0001a.m109U0(forgetPasswordData, runnable);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: G6 */
    public String mo48G6() {
        return WelcomeAct.f1046f;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jm */
    public c<roj0> mo49Jm(String str, String str2, String str3, String str4) {
        return AccountModule.f26c.m255u2(str, str2, str3, str4);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jr */
    public boolean mo50Jr() {
        return AccountModule.f26c.m233j1();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: K7 */
    public Class<? extends Activity> mo51K7() {
        return WelcomeAct.class;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Lr */
    public String mo52Lr(IntlGender intlGender, String str) {
        return ilo.INSTANCE.m16733d(intlGender, str);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Mn */
    public Intent mo53Mn(Context context) {
        return WelcomeAct.m1130D2(context, true);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: N9 */
    public int mo54N9() {
        return 6;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Pd */
    public c<roj0> mo55Pd(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f26c.m205T1(forgetPasswordData);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Qa */
    public Intent mo56Qa(Context context, VerifyReason verifyReason, String str) {
        return AccountModule.f26c.m204S1(context, verifyReason, str);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Xg */
    public rx.subjects.a<Boolean> mo57Xg() {
        return C0861iy.f14871a;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: a */
    public InterfaceC0810ho mo58a() {
        return C0848io.m16749d();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<AuthData> accessOutterToken() {
        return AccountModule.f26c.m174F0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String accessToken() {
        return AccountModule.f26c.m177G0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber) {
        return (phoneNumber == null || phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) ? PhoneNumberInputAct.m386Y1(context, VerifyReason.get("ban-appeal")) : VerifyCodeInputAct.m416Y1(context, VerifyReason.get("ban-appeal"), phoneNumber.countryCode, phoneNumber.number);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<DownloadDataCheck> checkDownloadData() {
        return AccountModule.f26c.m183I0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void checkSmartLockSave(Act act) {
        hkf0 hkf0VarM16233d = hkf0.m16233d();
        Pair pair = (Pair) hkf0VarM16233d.m16235e().e();
        if (pair != null) {
            hkf0VarM16233d.m16238h(act, (String) pair.first, (String) pair.second);
        }
    }

    public void clientNeedsForceUpdate() {
        AccountModule.f26c.m186J0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void dialogCCode(Act act, e30<String> e30Var) {
        C1444xm.m27308b0(act, e30Var);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData) {
        return AccountModule.f26c.m188K0(emailVerifyData);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: eq */
    public int mo59eq() {
        return 4;
    }

    @NonNull
    public C1000m2 getAbHooker() {
        return this.f307a;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public epd0 getAuthData() {
        return AccountModule.f26c.m207V0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public SignUpData getSignUpData() {
        return AccountModule.f26c.m220c1();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String getSignUpType() {
        return AccountModule.f26c.m222d1();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void handleAccountErrors(Throwable th) {
        C1478yf.m28232b(th);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: hb */
    public List<IntlGenderItem> mo60hb(IntlGender intlGender) {
        return ilo.INSTANCE.m16731b(intlGender);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: il */
    public void mo61il(String str) {
        AccountModule.f26c.m212X1(str);
    }

    public void init(Context context) {
    }

    public boolean isWelcomAct(Act act) {
        return act instanceof WelcomeBaseAct;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ji */
    public void mo62ji(Context context, boolean z, String str, String str2) {
        context.startActivity(EmailLoginOptAct.m562Z1(context, !TextUtils.isEmpty(str2) ? VerifyReason.get("change-email") : VerifyReason.get("bind-email"), z, str, str2));
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: kg */
    public Intent mo63kg(Context context, boolean z) {
        return WelcomeAct.m1131E2(context, z);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: mp */
    public c<roj0> mo64mp(String str) {
        return AccountModule.f26c.m259w2(str);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean onActivityResultForSmartLock(int i, int i2, Intent intent) {
        return hkf0.m16233d().m16236f(i, i2, intent, null);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<roj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType) {
        return AccountModule.f26c.m199P1(str, str2, str3, signInGrantType);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void openLoginUiOptCropAct(Act act, String str, boolean z) {
        act.startActivity(CropperAct.m560V1(act, str, null, z));
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: p9 */
    public List<IntlProfileInfo> mo65p9() {
        return mbp.INSTANCE.m19200g();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason) {
        return AccountModule.f26c.m203R1(context, verifyReason);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ql */
    public void mo66ql(String str) {
        WelcomeAct.f1046f = str;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: rq */
    public boolean mo67rq(SettingGroups settingGroups) {
        return ilo.INSTANCE.m16740k(settingGroups);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<roj0> send(VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return AccountModule.f26c.m219b2(verifyData).map(new w9j() { // from class: l.ey
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f28e.m78k(i, str);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setAuthData(AuthData authData) {
        AccountModule.f26c.m223d2(authData);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setSignUpData(SignUpData signUpData) {
        AccountModule.f26c.m232i2(signUpData);
    }

    public void signOut() {
        AccountModule.f26c.m246p2();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<Boolean> signedIn() {
        return TantanApp.f1171e.c().map(new w9j() { // from class: l.dy
            public final Object call(Object obj) {
                return Boolean.valueOf(((AuthData) obj) != null);
            }
        }).observeOn(jo0.a());
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean signedIn_() {
        return qib0.f19805c0.signedIn_();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void startSignInAct(Context context, Intent intent) {
        AccountModule.f26c.m249r2(context, intent);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: t5 */
    public Class mo68t5() {
        return SplashAct.class;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: uk */
    public Class<? extends Act> mo69uk() {
        return WelcomeAct.class;
    }

    public void updateLastUsedCCode(String str) {
        WelcomeAct.f1048h = str;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String userId() {
        return AccountModule.f26c.m265z2();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public c<roj0> verify(VerifyData verifyData) {
        return AccountModule.f26c.m165A2(verifyData);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: wj */
    public String mo70wj(Throwable th) {
        return djj0.m14046d(th);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y7 */
    public c<String> mo71y7() {
        return gmi.m15894c();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y8 */
    public void mo72y8() {
        rup0.m23001N5();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: zh */
    public List<IntlProfileInfo> mo73zh() {
        return mbp.INSTANCE.m19199f();
    }

    public String getSignUpType(SignUpData signUpData) {
        return AccountModule.f26c.m224e1(signUpData);
    }
}
