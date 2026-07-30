package com.p046p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
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
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.InterfaceC17361ho;
import p149l.e30;
import p149l.epd0;
import p149l.roj0;

/* JADX INFO: loaded from: classes9.dex */
public interface AccountService extends IProvider {
    /* JADX INFO: renamed from: Aq */
    void mo28151Aq(Act act, e30<String> e30Var);

    /* JADX INFO: renamed from: Em */
    C22306c<roj0> mo28152Em(ForgetPasswordData forgetPasswordData, Runnable runnable);

    /* JADX INFO: renamed from: G6 */
    String mo28153G6();

    /* JADX INFO: renamed from: Jm */
    C22306c<roj0> mo28154Jm(String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Jr */
    boolean mo28155Jr();

    /* JADX INFO: renamed from: K7 */
    Class<? extends Activity> mo28156K7();

    /* JADX INFO: renamed from: Lr */
    String mo28157Lr(IntlGender intlGender, String str);

    /* JADX INFO: renamed from: Mn */
    Intent mo28158Mn(Context context);

    /* JADX INFO: renamed from: N9 */
    int mo28159N9();

    /* JADX INFO: renamed from: Pd */
    C22306c<roj0> mo28160Pd(ForgetPasswordData forgetPasswordData);

    /* JADX INFO: renamed from: Qa */
    Intent mo28161Qa(Context context, VerifyReason verifyReason, String str);

    /* JADX INFO: renamed from: Xg */
    C22392a<Boolean> mo28162Xg();

    /* JADX INFO: renamed from: a */
    InterfaceC17361ho mo28163a();

    C22306c<AuthData> accessOutterToken();

    String accessToken();

    Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber);

    C22306c<DownloadDataCheck> checkDownloadData();

    void checkSmartLockSave(Act act);

    void dialogCCode(Act act, e30<String> e30Var);

    C22306c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData);

    /* JADX INFO: renamed from: eq */
    int mo28164eq();

    epd0 getAuthData();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    String getSignUpType();

    void handleAccountErrors(Throwable th);

    /* JADX INFO: renamed from: hb */
    List<IntlGenderItem> mo28165hb(IntlGender intlGender);

    /* JADX INFO: renamed from: il */
    void mo28166il(String str);

    /* JADX INFO: renamed from: ji */
    void mo28167ji(Context context, boolean z, String str, String str2);

    /* JADX INFO: renamed from: kg */
    Intent mo28168kg(Context context, boolean z);

    /* JADX INFO: renamed from: mp */
    C22306c<roj0> mo28169mp(String str);

    boolean onActivityResultForSmartLock(int i, int i2, Intent intent);

    C22306c<roj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType);

    void openLoginUiOptCropAct(Act act, String str, boolean z);

    /* JADX INFO: renamed from: p9 */
    List<IntlProfileInfo> mo28170p9();

    Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason);

    /* JADX INFO: renamed from: ql */
    void mo28171ql(String str);

    /* JADX INFO: renamed from: rq */
    boolean mo28172rq(SettingGroups settingGroups);

    C22306c<roj0> send(VerifyData verifyData);

    void setAuthData(AuthData authData);

    void setSignUpData(SignUpData signUpData);

    C22306c<Boolean> signedIn();

    boolean signedIn_();

    void startSignInAct(Context context, Intent intent);

    /* JADX INFO: renamed from: t5 */
    Class mo28173t5();

    /* JADX INFO: renamed from: uk */
    Class<? extends Act> mo28174uk();

    String userId();

    C22306c<roj0> verify(VerifyData verifyData);

    /* JADX INFO: renamed from: wj */
    String mo28175wj(Throwable th);

    /* JADX INFO: renamed from: y7 */
    C22306c<String> mo28176y7();

    /* JADX INFO: renamed from: y8 */
    void mo28177y8();

    /* JADX INFO: renamed from: zh */
    List<IntlProfileInfo> mo28178zh();
}
