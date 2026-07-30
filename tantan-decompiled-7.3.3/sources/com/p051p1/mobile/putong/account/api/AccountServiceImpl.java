package com.p051p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.api.AccountServiceImpl;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberInputAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VerifyCodeInputAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CCodeChooseAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CropperAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.SplashAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeBaseAct;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.DownloadDataCheck;
import com.p051p1.mobile.putong.data.EmailVerifyData;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlGenderItem;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.C16322co;
import p153l.C16391cy;
import p153l.C18526m2;
import p153l.C19546qc;
import p153l.C20102sm;
import p153l.C20299tf;
import p153l.InterfaceC16069bo;
import p153l.cpi;
import p153l.fo0;
import p153l.gsj0;
import p153l.gxd0;
import p153l.ino;
import p153l.mdp;
import p153l.qcj;
import p153l.qsf0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v3q0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "account服务", path = "/account_service/service")
public class AccountServiceImpl implements AccountService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f17037a = new C19546qc();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ boolean m29147F(y20 y20Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("ccode")) {
            return false;
        }
        y20Var.call(Marker.ANY_NON_NULL_MARKER + intent.getIntExtra("ccode", 86));
        return true;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Aq */
    public void mo29150Aq(Act act, final y20<String> y20Var) {
        act.startActivityForResult(CCodeChooseAct.m29657Z1(act), new C4468a.a() { // from class: l.yx
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return AccountServiceImpl.m29147F(y20Var, i, i2, intent);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Em */
    public C22421c<uxj0> mo29151Em(ForgetPasswordData forgetPasswordData, Runnable runnable) {
        return C4726a.m29213U0(forgetPasswordData, runnable);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: G6 */
    public String mo29152G6() {
        return WelcomeAct.f17776f;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jm */
    public C22421c<uxj0> mo29153Jm(String str, String str2, String str3, String str4) {
        return AccountModule.f16756c.m29359u2(str, str2, str3, str4);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Jr */
    public boolean mo29154Jr() {
        return AccountModule.f16756c.m29337j1();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: K7 */
    public Class<? extends Activity> mo29155K7() {
        return WelcomeAct.class;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Lr */
    public String mo29156Lr(IntlGender intlGender, String str) {
        return ino.INSTANCE.m141158d(intlGender, str);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Mn */
    public Intent mo29157Mn(Context context) {
        return WelcomeAct.m30223E2(context, true);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: N9 */
    public int mo29158N9() {
        return 6;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Pd */
    public C22421c<uxj0> mo29159Pd(ForgetPasswordData forgetPasswordData) {
        return AccountModule.f16756c.m29309T1(forgetPasswordData);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Qa */
    public Intent mo29160Qa(Context context, VerifyReason verifyReason, String str) {
        return AccountModule.f16756c.m29308S1(context, verifyReason, str);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: Xg */
    public C22507a<Boolean> mo29161Xg() {
        return C16391cy.f84289a;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: a */
    public InterfaceC16069bo mo29162a() {
        return C16322co.m111559d();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<AuthData> accessOutterToken() {
        return AccountModule.f16756c.m29278F0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String accessToken() {
        return AccountModule.f16756c.m29281G0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber) {
        return (phoneNumber == null || phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) ? PhoneNumberInputAct.m29489Z1(context, VerifyReason.get(VerifyReason.ban_appeal)) : VerifyCodeInputAct.m29519Z1(context, VerifyReason.get(VerifyReason.ban_appeal), phoneNumber.countryCode, phoneNumber.number);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<DownloadDataCheck> checkDownloadData() {
        return AccountModule.f16756c.m29287I0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void checkSmartLockSave(Act act) {
        qsf0 qsf0VarM177799d = qsf0.m177799d();
        Pair<String, String> pairM222761e = qsf0VarM177799d.m177801e().m222761e();
        if (pairM222761e != null) {
            qsf0VarM177799d.m177804h(act, (String) pairM222761e.first, (String) pairM222761e.second);
        }
    }

    public void clientNeedsForceUpdate() {
        AccountModule.f16756c.m29290J0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void dialogCCode(Act act, y20<String> y20Var) {
        C20102sm.m186686b0(act, y20Var);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData) {
        return AccountModule.f16756c.m29292K0(emailVerifyData);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: eq */
    public int mo29163eq() {
        return 4;
    }

    @NonNull
    public C18526m2 getAbHooker() {
        return this.f17037a;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public gxd0 getAuthData() {
        return AccountModule.f16756c.m29311V0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public SignUpData getSignUpData() {
        return AccountModule.f16756c.m29324c1();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String getSignUpType() {
        return AccountModule.f16756c.m29326d1();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void handleAccountErrors(Throwable th) {
        C20299tf.m190906b(th);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: hb */
    public List<IntlGenderItem> mo29164hb(IntlGender intlGender) {
        return ino.INSTANCE.m141156b(intlGender);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: il */
    public void mo29165il(String str) {
        AccountModule.f16756c.m29316X1(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    public boolean isWelcomAct(Act act) {
        return act instanceof WelcomeBaseAct;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ji */
    public void mo29166ji(Context context, boolean z, String str, String str2) {
        context.startActivity(EmailLoginOptAct.m29662a2(context, !TextUtils.isEmpty(str2) ? VerifyReason.get(VerifyReason.change_email) : VerifyReason.get(VerifyReason.bind_email), z, str, str2));
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: kg */
    public Intent mo29167kg(Context context, boolean z) {
        return WelcomeAct.m30224F2(context, z);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: mp */
    public C22421c<uxj0> mo29168mp(String str) {
        return AccountModule.f16756c.m29363w2(str);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean onActivityResultForSmartLock(int i, int i2, Intent intent) {
        return qsf0.m177799d().m177802f(i, i2, intent, null);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<uxj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType) {
        return AccountModule.f16756c.m29303P1(str, str2, str3, signInGrantType);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void openLoginUiOptCropAct(Act act, String str, boolean z) {
        act.startActivity(CropperAct.m29660X1(act, str, null, z));
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: p9 */
    public List<IntlProfileInfo> mo29169p9() {
        return mdp.INSTANCE.m157985g();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason) {
        return AccountModule.f16756c.m29307R1(context, verifyReason);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: ql */
    public void mo29170ql(String str) {
        WelcomeAct.f17776f = str;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: rq */
    public boolean mo29171rq(SettingGroups settingGroups) {
        return ino.INSTANCE.m141165k(settingGroups);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<uxj0> send(VerifyData verifyData) {
        Objects.toString(verifyData.action);
        return AccountModule.f16756c.m29323b2(verifyData).map(new qcj() { // from class: l.xx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f16758e.m29182k(i, str);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setAuthData(AuthData authData) {
        AccountModule.f16756c.m29327d2(authData);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void setSignUpData(SignUpData signUpData) {
        AccountModule.f16756c.m29336i2(signUpData);
    }

    public void signOut() {
        AccountModule.f16756c.m29350p2();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<Boolean> signedIn() {
        return TantanApp.f17901e.m142510c().map(new qcj() { // from class: l.wx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AuthData) obj) != null);
            }
        }).observeOn(fo0.m126432a());
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public boolean signedIn_() {
        return uqb0.f180397c0.signedIn_();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public void startSignInAct(Context context, Intent intent) {
        AccountModule.f16756c.m29353r2(context, intent);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: t5 */
    public Class mo29172t5() {
        return SplashAct.class;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: uk */
    public Class<? extends Act> mo29173uk() {
        return WelcomeAct.class;
    }

    public void updateLastUsedCCode(String str) {
        WelcomeAct.f17778h = str;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public String userId() {
        return AccountModule.f16756c.m29369z2();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    public C22421c<uxj0> verify(VerifyData verifyData) {
        return AccountModule.f16756c.m29269A2(verifyData);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: wj */
    public String mo29174wj(Throwable th) {
        return gsj0.m132060d(th);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y7 */
    public C22421c<String> mo29175y7() {
        return cpi.m111764c();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: y8 */
    public void mo29176y8() {
        v3q0.m199335N5();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService
    /* JADX INFO: renamed from: zh */
    public List<IntlProfileInfo> mo29177zh() {
        return mdp.INSTANCE.m157984f();
    }

    public String getSignUpType(SignUpData signUpData) {
        return AccountModule.f16756c.m29328e1(signUpData);
    }
}
