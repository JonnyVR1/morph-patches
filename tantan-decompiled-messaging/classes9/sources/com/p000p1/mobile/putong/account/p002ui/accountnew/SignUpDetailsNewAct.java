package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Map;
import l.e30;
import l.mkd0;
import l.w85;
import p006l.ilo;
import p006l.kcf0;
import p006l.nbf0;
import p006l.u0c0;
import p006l.yaf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpDetailsNewAct extends SignInBaseActMVP<nbf0, kcf0> {

    /* JADX INFO: renamed from: c */
    public nbf0 f430c;

    /* JADX INFO: renamed from: d */
    public kcf0 f431d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m392Z1(Context context) {
        return new Intent(context, (Class<?>) SignUpDetailsNewAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m393a2(Act act, SignUpData signUpData) {
        Intent intent = new Intent((Context) act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("signup_data", (Serializable) signUpData);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m394b2(Act act, VerifyData verifyData, boolean z, boolean z2) {
        Intent intent = new Intent((Context) act, (Class<?>) SignUpDetailsNewAct.class);
        intent.putExtra("data", (Serializable) verifyData);
        intent.putExtra("b1", z);
        intent.putExtra("b2", z2);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public nbf0 generateSignInPresenter() {
        return this.f430c;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public kcf0 generateSignInViewModel() {
        return this.f431d;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m397e2(SignUpData signUpData, User user) {
        String str = (String) AccountModule.f26c.m200Q0().get();
        Double d = (Double) AccountModule.f26c.m196O0().get();
        double dDoubleValue = d.doubleValue();
        String str2 = (String) AccountModule.f26c.m198P0().get();
        if (ilo.INSTANCE.m16739j()) {
            String str3 = (String) AccountModule.f26c.m195N1().get();
            if (!TextUtils.isEmpty(str3)) {
                signUpData.subGenderOption = str3;
            }
            signUpData.profileShowGender = ((Boolean) AccountModule.f26c.m197O1().get()).booleanValue();
            if (!TextUtils.isEmpty(str2)) {
                signUpData.newGender = IntlGender.get(str2);
            }
        } else if (!TextUtils.isEmpty(str2) && !"nonbinary".equals(str2) && !TextUtils.isEmpty(str2)) {
            signUpData.gender = Gender.get(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            signUpData.name = str;
        }
        if (dDoubleValue != 0.0d) {
            signUpData.birthdate = d;
        }
        if (TEnum.equals(user.source, "facebook")) {
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            String str4 = (String) AccountModule.f26c.m202R0().get();
            if (!TextUtils.isEmpty(str4)) {
                signUpData.profilePath = str4;
                signUpData.profileMineType = "image/jpeg";
            }
        }
        if (TEnum.equals(user.source, "google")) {
            signUpData.signUpType = AccountTempApi.SignUpType.google;
        }
        this.f430c.m20035l1(signUpData, false, false);
        this.f431d.m18071y0(user.source.toString());
        w85.INSTANCE.k(user.publicId);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f431d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        this.f431d = new kcf0(this);
        nbf0 nbf0Var = new nbf0(this);
        this.f430c = nbf0Var;
        nbf0Var.C(this.f431d);
        super.initDataOnCreate();
        w85.INSTANCE.m("Onboarding Started", (Map) null);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f430c.mo12401a0();
    }

    public void onBackPressed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f431d.m18061o0(menu)) {
            return true;
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f430c.m20024D1(bundle);
    }

    public void onStartLifecycle() {
        this.f430c.m20025E1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_profile_signup_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        boolean z;
        SignUpData signUpData;
        setStatusBarColorResId(u0c0.f22412s);
        setLightStatusBar(16);
        boolean z2 = false;
        if (!NullChecker.a(bundle) || !NullChecker.a(bundle.getSerializable("signup_data"))) {
            if (NullChecker.a(getIntent().getSerializableExtra("signup_data"))) {
                signUpData = (SignUpData) getIntent().getSerializableExtra("signup_data");
            } else {
                if (!NullChecker.a(getIntent().getSerializableExtra("data"))) {
                    final SignUpData signUpData2 = new SignUpData();
                    this.f431d.act().duringCreated(AccountModule.f26c.m213Y0()).subscribe(mkd0.H(new e30() { // from class: l.xaf0
                        public final void call(Object obj) {
                            this.f27404a.m397e2(signUpData2, (User) obj);
                        }
                    }, new yaf0()));
                    return;
                }
                VerifyData serializableExtra = getIntent().getSerializableExtra("data");
                boolean booleanExtra = getIntent().getBooleanExtra("b1", false);
                boolean booleanExtra2 = getIntent().getBooleanExtra("b2", false);
                SignUpData signUpData3 = new SignUpData();
                signUpData3.phoneNumber = serializableExtra.mobileNumber;
                signUpData3.countryCode = serializableExtra.countryCode;
                signUpData3.code = serializableExtra.code;
                signUpData3.signUpType = AccountTempApi.SignUpType.phone;
                z2 = booleanExtra;
                z = booleanExtra2;
                signUpData = signUpData3;
            }
            this.f430c.m20035l1(signUpData, z2, z);
            super.preCreateView(bundle);
        }
        signUpData = (SignUpData) bundle.getSerializable("signup_data");
        z = false;
        this.f430c.m20035l1(signUpData, z2, z);
        super.preCreateView(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
