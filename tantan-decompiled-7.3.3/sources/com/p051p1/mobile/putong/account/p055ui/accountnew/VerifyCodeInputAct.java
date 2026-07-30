package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.q8g0;
import p153l.v6l0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeInputAct extends SignInBaseActMVP<v6l0, C4780a> {

    /* JADX INFO: renamed from: c */
    public v6l0 f17172c;

    /* JADX INFO: renamed from: d */
    public C4780a f17173d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29519Z1(Context context, VerifyReason verifyReason, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", "");
        intent.putExtra("IS_NEW_DEVICE", false);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m29520a2(Act act, VerifyReason verifyReason, int i, String str) {
        return m29522c2(act, verifyReason, i, str, false);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m29521b2(Act act, VerifyReason verifyReason, int i, String str, String str2, boolean z) {
        Intent intent = new Intent(act, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", str2);
        intent.putExtra("IS_NEW_DEVICE", z);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m29522c2(Act act, VerifyReason verifyReason, int i, String str, boolean z) {
        return m29521b2(act, verifyReason, i, str, "", z);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public v6l0 generateSignInPresenter() {
        return this.f17172c;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public C4780a generateSignInViewModel() {
        return this.f17173d;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17173d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17173d = new C4780a(this);
        v6l0 v6l0Var = new v6l0(this);
        this.f17172c = v6l0Var;
        v6l0Var.mo52715C(this.f17173d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17172c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f17172c.m200110P1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f17172c.m200111Q1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f17172c.m200112R1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        C4780a c4780a = this.f17173d;
        if (c4780a != null) {
            c4780a.f17199e.setText("");
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f17172c.m200115U1(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17172c.m200113S1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return this.f17172c.pageId();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        VerifyData verifyData = new VerifyData();
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra("REASON");
        int intExtra = getIntent().getIntExtra("COUNTRY_CODE", 0);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        String stringExtra2 = getIntent().getStringExtra("PASSWORD");
        boolean booleanExtra = getIntent().getBooleanExtra("IS_NEW_DEVICE", false);
        if (NullChecker.m82486a(bundle)) {
            verifyReason = (VerifyReason) bundle.getSerializable("REASON");
            intExtra = bundle.getInt("COUNTRY_CODE");
            stringExtra = bundle.getString("PHONE_NUMBER", "");
            stringExtra2 = bundle.getString("PASSWORD", "");
            booleanExtra = bundle.getBoolean("IS_NEW_DEVICE");
        }
        VerifyReason verifyReason2 = verifyReason;
        String str = stringExtra;
        String str2 = stringExtra2;
        boolean z = booleanExtra;
        verifyData.language = q8g0.m175820y();
        verifyData.countryCode = intExtra;
        verifyData.mobileNumber = str;
        verifyData.action = verifyReason2;
        verifyData.codeLength = 4;
        if (TEnum.equals(verifyReason2, VerifyReason.ban_appeal)) {
            verifyData.clientId = "100032";
            verifyData.category = "Text";
            this.f17173d.m29577h0(true);
        }
        this.f17172c.m200124r1(verifyReason2, intExtra, str, str2, verifyData, z);
        this.f17173d.m29575f0(str, verifyReason2);
        super.preCreateView(bundle);
        this.f17173d.m29579j0(verifyReason2, z);
        if (TEnum.equals(verifyReason2, VerifyReason.ban_appeal)) {
            setSwipeBackEnable(false);
        }
    }
}
