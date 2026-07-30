package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.i0g0;
import p149l.pxk0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeInputAct extends SignInBaseActMVP<pxk0, C4629a> {

    /* JADX INFO: renamed from: c */
    public pxk0 f16453c;

    /* JADX INFO: renamed from: d */
    public C4629a f16454d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28520Y1(Context context, VerifyReason verifyReason, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", "");
        intent.putExtra("IS_NEW_DEVICE", false);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m28521Z1(Act act, VerifyReason verifyReason, int i, String str) {
        return m28523b2(act, verifyReason, i, str, false);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m28522a2(Act act, VerifyReason verifyReason, int i, String str, String str2, boolean z) {
        Intent intent = new Intent(act, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", str2);
        intent.putExtra("IS_NEW_DEVICE", z);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m28523b2(Act act, VerifyReason verifyReason, int i, String str, boolean z) {
        return m28522a2(act, verifyReason, i, str, "", z);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pxk0 generateSignInPresenter() {
        return this.f16453c;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public C4629a generateSignInViewModel() {
        return this.f16454d;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16454d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f16454d = new C4629a(this);
        pxk0 pxk0Var = new pxk0(this);
        this.f16453c = pxk0Var;
        pxk0Var.mo51532C(this.f16454d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16453c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f16453c.m171889P1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f16453c.m171890Q1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f16453c.m171891R1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        C4629a c4629a = this.f16454d;
        if (c4629a != null) {
            c4629a.f16480e.setText("");
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16453c.m171894U1(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16453c.m171892S1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return this.f16453c.pageId();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        VerifyData verifyData = new VerifyData();
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra("REASON");
        int intExtra = getIntent().getIntExtra("COUNTRY_CODE", 0);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        String stringExtra2 = getIntent().getStringExtra("PASSWORD");
        boolean booleanExtra = getIntent().getBooleanExtra("IS_NEW_DEVICE", false);
        if (NullChecker.m81303a(bundle)) {
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
        verifyData.language = i0g0.m133885y();
        verifyData.countryCode = intExtra;
        verifyData.mobileNumber = str;
        verifyData.action = verifyReason2;
        verifyData.codeLength = 4;
        if (TEnum.equals(verifyReason2, VerifyReason.ban_appeal)) {
            verifyData.clientId = "100032";
            verifyData.category = "Text";
            this.f16454d.m28578h0(true);
        }
        this.f16453c.m171903r1(verifyReason2, intExtra, str, str2, verifyData, z);
        this.f16454d.m28576f0(str, verifyReason2);
        super.preCreateView(bundle);
        this.f16454d.m28580j0(verifyReason2, z);
        if (TEnum.equals(verifyReason2, VerifyReason.ban_appeal)) {
            setSwipeBackEnable(false);
        }
    }
}
