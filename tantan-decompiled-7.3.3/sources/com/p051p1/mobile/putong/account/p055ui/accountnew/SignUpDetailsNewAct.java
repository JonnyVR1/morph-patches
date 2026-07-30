package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.a9c0;
import p153l.fjf0;
import p153l.ino;
import p153l.psd0;
import p153l.rkf0;
import p153l.ujf0;
import p153l.x95;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpDetailsNewAct extends SignInBaseActMVP<ujf0, rkf0> {

    /* JADX INFO: renamed from: c */
    public ujf0 f17160c;

    /* JADX INFO: renamed from: d */
    public rkf0 f17161d;

    /* JADX INFO: renamed from: a2 */
    public static Intent m29495a2(Context context) {
        return new Intent(context, (Class<?>) SignUpDetailsNewAct.class);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m29496b2(Act act, SignUpData signUpData) {
        Intent intent = new Intent(act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("signup_data", signUpData);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m29497c2(Act act, VerifyData verifyData, boolean z, boolean z2) {
        Intent intent = new Intent(act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("data", verifyData);
        intent.putExtra("b1", z);
        intent.putExtra("b2", z2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public ujf0 generateSignInPresenter() {
        return this.f17160c;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public rkf0 generateSignInViewModel() {
        return this.f17161d;
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m29500g2(SignUpData signUpData, User user) {
        String str = AccountModule.f16756c.m29304Q0().get();
        Double d = AccountModule.f16756c.m29300O0().get();
        double dDoubleValue = d.doubleValue();
        String str2 = AccountModule.f16756c.m29302P0().get();
        if (ino.INSTANCE.m141164j()) {
            String str3 = AccountModule.f16756c.m29299N1().get();
            if (!TextUtils.isEmpty(str3)) {
                signUpData.subGenderOption = str3;
            }
            signUpData.profileShowGender = AccountModule.f16756c.m29301O1().get().booleanValue();
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
            String str4 = AccountModule.f16756c.m29306R0().get();
            if (!TextUtils.isEmpty(str4)) {
                signUpData.profilePath = str4;
                signUpData.profileMineType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
            }
        }
        if (TEnum.equals(user.source, "google")) {
            signUpData.signUpType = AccountTempApi.SignUpType.google;
        }
        this.f17160c.m196358l1(signUpData, false, false);
        this.f17161d.m181851y0(user.source.toString());
        x95.INSTANCE.m209792k(user.publicId);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17161d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17161d = new rkf0(this);
        ujf0 ujf0Var = new ujf0(this);
        this.f17160c = ujf0Var;
        ujf0Var.mo52715C(this.f17161d);
        super.initDataOnCreate();
        x95.INSTANCE.m209793m("Onboarding Started", null);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17160c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f17161d.m181841o0(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f17160c.m196347D1(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17160c.m196348E1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_profile_signup_view";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        boolean z;
        SignUpData signUpData;
        setStatusBarColorResId(a9c0.f69034s);
        setLightStatusBar(16);
        boolean z2 = false;
        if (!NullChecker.m82486a(bundle) || !NullChecker.m82486a(bundle.getSerializable("signup_data"))) {
            if (NullChecker.m82486a(getIntent().getSerializableExtra("signup_data"))) {
                signUpData = (SignUpData) getIntent().getSerializableExtra("signup_data");
            } else {
                if (!NullChecker.m82486a(getIntent().getSerializableExtra("data"))) {
                    final SignUpData signUpData2 = new SignUpData();
                    this.f17161d.act().duringCreated(AccountModule.f16756c.m29317Y0()).subscribe(psd0.m173597H(new y20() { // from class: l.ejf0
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f94296a.m29500g2(signUpData2, (User) obj);
                        }
                    }, new fjf0()));
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
            this.f17160c.m196358l1(signUpData, z2, z);
            super.preCreateView(bundle);
        }
        signUpData = (SignUpData) bundle.getSerializable("signup_data");
        z = false;
        this.f17160c.m196358l1(signUpData, z2, z);
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
