package com.p051p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
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
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.InterfaceC16069bo;
import p153l.gxd0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public interface AccountService extends IProvider {
    /* JADX INFO: renamed from: Aq */
    void mo29150Aq(Act act, y20<String> y20Var);

    /* JADX INFO: renamed from: Em */
    C22421c<uxj0> mo29151Em(ForgetPasswordData forgetPasswordData, Runnable runnable);

    /* JADX INFO: renamed from: G6 */
    String mo29152G6();

    /* JADX INFO: renamed from: Jm */
    C22421c<uxj0> mo29153Jm(String str, String str2, String str3, String str4);

    /* JADX INFO: renamed from: Jr */
    boolean mo29154Jr();

    /* JADX INFO: renamed from: K7 */
    Class<? extends Activity> mo29155K7();

    /* JADX INFO: renamed from: Lr */
    String mo29156Lr(IntlGender intlGender, String str);

    /* JADX INFO: renamed from: Mn */
    Intent mo29157Mn(Context context);

    /* JADX INFO: renamed from: N9 */
    int mo29158N9();

    /* JADX INFO: renamed from: Pd */
    C22421c<uxj0> mo29159Pd(ForgetPasswordData forgetPasswordData);

    /* JADX INFO: renamed from: Qa */
    Intent mo29160Qa(Context context, VerifyReason verifyReason, String str);

    /* JADX INFO: renamed from: Xg */
    C22507a<Boolean> mo29161Xg();

    /* JADX INFO: renamed from: a */
    InterfaceC16069bo mo29162a();

    C22421c<AuthData> accessOutterToken();

    String accessToken();

    Intent buildBanReleaseVerifyIntent(Context context, PhoneNumber phoneNumber);

    C22421c<DownloadDataCheck> checkDownloadData();

    void checkSmartLockSave(Act act);

    void dialogCCode(Act act, y20<String> y20Var);

    C22421c<AccountErrorResponse> downloadDataVerifyEmail(EmailVerifyData emailVerifyData);

    /* JADX INFO: renamed from: eq */
    int mo29163eq();

    gxd0 getAuthData();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    String getSignUpType();

    void handleAccountErrors(Throwable th);

    /* JADX INFO: renamed from: hb */
    List<IntlGenderItem> mo29164hb(IntlGender intlGender);

    /* JADX INFO: renamed from: il */
    void mo29165il(String str);

    /* JADX INFO: renamed from: ji */
    void mo29166ji(Context context, boolean z, String str, String str2);

    /* JADX INFO: renamed from: kg */
    Intent mo29167kg(Context context, boolean z);

    /* JADX INFO: renamed from: mp */
    C22421c<uxj0> mo29168mp(String str);

    boolean onActivityResultForSmartLock(int i, int i2, Intent intent);

    C22421c<uxj0> oneClickBindPhone(String str, String str2, String str3, SignInGrantType signInGrantType);

    void openLoginUiOptCropAct(Act act, String str, boolean z);

    /* JADX INFO: renamed from: p9 */
    List<IntlProfileInfo> mo29169p9();

    Intent phoneVerificationActArgs(Context context, VerifyReason verifyReason);

    /* JADX INFO: renamed from: ql */
    void mo29170ql(String str);

    /* JADX INFO: renamed from: rq */
    boolean mo29171rq(SettingGroups settingGroups);

    C22421c<uxj0> send(VerifyData verifyData);

    void setAuthData(AuthData authData);

    void setSignUpData(SignUpData signUpData);

    C22421c<Boolean> signedIn();

    boolean signedIn_();

    void startSignInAct(Context context, Intent intent);

    /* JADX INFO: renamed from: t5 */
    Class mo29172t5();

    /* JADX INFO: renamed from: uk */
    Class<? extends Act> mo29173uk();

    String userId();

    C22421c<uxj0> verify(VerifyData verifyData);

    /* JADX INFO: renamed from: wj */
    String mo29174wj(Throwable th);

    /* JADX INFO: renamed from: y7 */
    C22421c<String> mo29175y7();

    /* JADX INFO: renamed from: y8 */
    void mo29176y8();

    /* JADX INFO: renamed from: zh */
    List<IntlProfileInfo> mo29177zh();
}
