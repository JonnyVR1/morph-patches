package com.p000p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
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
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.List;
import l.e30;
import l.epd0;
import l.roj0;
import p006l.InterfaceC0810ho;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface AccountService extends IProvider {
    /* JADX INFO: renamed from: Aq */
    void mo46Aq(Act act, e30<String> e30Var);

    /* JADX INFO: renamed from: Em */
    c<roj0> mo47Em(ForgetPasswordData forgetPasswordData, Runnable runnable);

    /* JADX INFO: renamed from: G6 */
    String mo48G6();

    /* JADX INFO: renamed from: Jm */
    c<roj0> mo49Jm(String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Jr */
    boolean mo50Jr();

    /* JADX INFO: renamed from: K7 */
    Class<? extends Activity> mo51K7();

    /* JADX INFO: renamed from: Lr */
    String mo52Lr(IntlGender intlGender, String str);

    /* JADX INFO: renamed from: Mn */
    Intent mo53Mn(Context context);

    /* JADX INFO: renamed from: N9 */
    int mo54N9();

    /* JADX INFO: renamed from: Pd */
    c<roj0> mo55Pd(ForgetPasswordData forgetPasswordData);

    /* JADX INFO: renamed from: Qa */
    Intent mo56Qa(Context context, VerifyReason verifyReason, String str);

    /* JADX INFO: renamed from: Xg */
    a<Boolean> mo57Xg();

    /* JADX INFO: renamed from: a */
    InterfaceC0810ho mo58a();

    c<AuthData> accessOutterToken();

    String accessToken();

    Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber);

    c<DownloadDataCheck> checkDownloadData();

    void checkSmartLockSave(Act act);

    void dialogCCode(Act act, e30<String> e30Var);

    c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData);

    /* JADX INFO: renamed from: eq */
    int mo59eq();

    epd0 getAuthData();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    String getSignUpType();

    void handleAccountErrors(Throwable th);

    /* JADX INFO: renamed from: hb */
    List<IntlGenderItem> mo60hb(IntlGender intlGender);

    /* JADX INFO: renamed from: il */
    void mo61il(String str);

    /* JADX INFO: renamed from: ji */
    void mo62ji(Context context, boolean z, String str, String str2);

    /* JADX INFO: renamed from: kg */
    Intent mo63kg(Context context, boolean z);

    /* JADX INFO: renamed from: mp */
    c<roj0> mo64mp(String str);

    boolean onActivityResultForSmartLock(int i, int i2, Intent intent);

    c<roj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType);

    void openLoginUiOptCropAct(Act act, String str, boolean z);

    /* JADX INFO: renamed from: p9 */
    List<IntlProfileInfo> mo65p9();

    Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason);

    /* JADX INFO: renamed from: ql */
    void mo66ql(String str);

    /* JADX INFO: renamed from: rq */
    boolean mo67rq(SettingGroups settingGroups);

    c<roj0> send(VerifyData verifyData);

    void setAuthData(AuthData authData);

    void setSignUpData(SignUpData signUpData);

    c<Boolean> signedIn();

    boolean signedIn_();

    void startSignInAct(Context context, Intent intent);

    /* JADX INFO: renamed from: t5 */
    Class mo68t5();

    /* JADX INFO: renamed from: uk */
    Class<? extends Act> mo69uk();

    String userId();

    c<roj0> verify(VerifyData verifyData);

    /* JADX INFO: renamed from: wj */
    String mo70wj(Throwable th);

    /* JADX INFO: renamed from: y7 */
    c<String> mo71y7();

    /* JADX INFO: renamed from: y8 */
    void mo72y8();

    /* JADX INFO: renamed from: zh */
    List<IntlProfileInfo> mo73zh();
}
