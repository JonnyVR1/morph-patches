package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.e30;
import p149l.ilo;
import p149l.kcf0;
import p149l.mkd0;
import p149l.nbf0;
import p149l.u0c0;
import p149l.w85;
import p149l.yaf0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpDetailsNewAct extends SignInBaseActMVP<nbf0, kcf0> {

    /* JADX INFO: renamed from: c */
    public nbf0 f16441c;

    /* JADX INFO: renamed from: d */
    public kcf0 f16442d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m28496Z1(Context context) {
        return new Intent(context, (Class<?>) SignUpDetailsNewAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m28497a2(Act act, SignUpData signUpData) {
        Intent intent = new Intent(act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("signup_data", signUpData);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m28498b2(Act act, VerifyData verifyData, boolean z, boolean z2) {
        Intent intent = new Intent(act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("data", verifyData);
        intent.putExtra("b1", z);
        intent.putExtra("b2", z2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public nbf0 generateSignInPresenter() {
        return this.f16441c;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public kcf0 generateSignInViewModel() {
        return this.f16442d;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m28501e2(SignUpData signUpData, User user) {
        String str = AccountModule.f16037c.m28305Q0().get();
        Double d = AccountModule.f16037c.m28301O0().get();
        double dDoubleValue = d.doubleValue();
        String str2 = AccountModule.f16037c.m28303P0().get();
        if (ilo.INSTANCE.m137017j()) {
            String str3 = AccountModule.f16037c.m28300N1().get();
            if (!TextUtils.isEmpty(str3)) {
                signUpData.subGenderOption = str3;
            }
            signUpData.profileShowGender = AccountModule.f16037c.m28302O1().get().booleanValue();
            if (!TextUtils.isEmpty(str2)) {
                signUpData.newGender = IntlGender.get(str2);
            }
        } else if (!TextUtils.isEmpty(str2) && !"nonbinary".equals(str2) && !TextUtils.isEmpty(str2)) {
            signUpData.gender = Gender.get(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            signUpData.name = str;
        }
        if (dDoubleValue != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            signUpData.birthdate = d;
        }
        if (TEnum.equals(user.source, "facebook")) {
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            String str4 = AccountModule.f16037c.m28307R0().get();
            if (!TextUtils.isEmpty(str4)) {
                signUpData.profilePath = str4;
                signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
        }
        if (TEnum.equals(user.source, "google")) {
            signUpData.signUpType = AccountTempApi.SignUpType.google;
        }
        this.f16441c.m158804l1(signUpData, false, false);
        this.f16442d.m145442y0(user.source.toString());
        w85.INSTANCE.m202144k(user.publicId);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16442d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f16442d = new kcf0(this);
        nbf0 nbf0Var = new nbf0(this);
        this.f16441c = nbf0Var;
        nbf0Var.mo51532C(this.f16442d);
        super.initDataOnCreate();
        w85.INSTANCE.m202145m("Onboarding Started", null);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16441c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f16442d.m145432o0(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16441c.m158793D1(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16441c.m158794E1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_profile_signup_view";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        boolean z;
        SignUpData signUpData;
        setStatusBarColorResId(u0c0.f172898s);
        setLightStatusBar(16);
        boolean z2 = false;
        if (!NullChecker.m81303a(bundle) || !NullChecker.m81303a(bundle.getSerializable("signup_data"))) {
            if (NullChecker.m81303a(getIntent().getSerializableExtra("signup_data"))) {
                signUpData = (SignUpData) getIntent().getSerializableExtra("signup_data");
            } else {
                if (!NullChecker.m81303a(getIntent().getSerializableExtra("data"))) {
                    final SignUpData signUpData2 = new SignUpData();
                    this.f16442d.act().duringCreated(AccountModule.f16037c.m28318Y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.xaf0
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f191735a.m28501e2(signUpData2, (User) obj);
                        }
                    }, new yaf0()));
                    return;
                }
                VerifyData verifyData = (VerifyData) getIntent().getSerializableExtra("data");
                boolean booleanExtra = getIntent().getBooleanExtra("b1", false);
                boolean booleanExtra2 = getIntent().getBooleanExtra("b2", false);
                SignUpData signUpData3 = new SignUpData();
                signUpData3.phoneNumber = verifyData.mobileNumber;
                signUpData3.countryCode = verifyData.countryCode;
                signUpData3.code = verifyData.code;
                signUpData3.signUpType = AccountTempApi.SignUpType.phone;
                z2 = booleanExtra;
                z = booleanExtra2;
                signUpData = signUpData3;
            }
            this.f16441c.m158804l1(signUpData, z2, z);
            super.preCreateView(bundle);
        }
        signUpData = (SignUpData) bundle.getSerializable("signup_data");
        z = false;
        this.f16441c.m158804l1(signUpData, z2, z);
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
