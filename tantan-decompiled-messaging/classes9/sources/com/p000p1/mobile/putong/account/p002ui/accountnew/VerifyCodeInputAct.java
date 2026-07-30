package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import l.i0g0;
import p006l.pxk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyCodeInputAct extends SignInBaseActMVP<pxk0, C0055a> {

    /* JADX INFO: renamed from: c */
    public pxk0 f442c;

    /* JADX INFO: renamed from: d */
    public C0055a f443d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m416Y1(Context context, VerifyReason verifyReason, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", (Serializable) verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", "");
        intent.putExtra("IS_NEW_DEVICE", false);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m417Z1(Act act, VerifyReason verifyReason, int i, String str) {
        return m419b2(act, verifyReason, i, str, false);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m418a2(Act act, VerifyReason verifyReason, int i, String str, String str2, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) VerifyCodeInputAct.class);
        intent.putExtra("REASON", (Serializable) verifyReason);
        intent.putExtra("COUNTRY_CODE", i);
        intent.putExtra("PHONE_NUMBER", str);
        intent.putExtra("PASSWORD", str2);
        intent.putExtra("IS_NEW_DEVICE", z);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m419b2(Act act, VerifyReason verifyReason, int i, String str, boolean z) {
        return m418a2(act, verifyReason, i, str, "", z);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pxk0 generateSignInPresenter() {
        return this.f442c;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public C0055a generateSignInViewModel() {
        return this.f443d;
    }

    public void finish() {
        super.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f443d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        this.f443d = new C0055a(this);
        pxk0 pxk0Var = new pxk0(this);
        this.f442c = pxk0Var;
        pxk0Var.C(this.f443d);
        super.initDataOnCreate();
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f442c.mo12401a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f442c.m21808P1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f442c.m21809Q1(menu)) {
            return true;
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f442c.m21810R1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestart() {
        super/*android.app.Activity*/.onRestart();
        C0055a c0055a = this.f443d;
        if (c0055a != null) {
            c0055a.f469e.setText("");
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f442c.m21813U1(bundle);
    }

    public void onStartLifecycle() {
        this.f442c.m21811S1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return this.f442c.pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        VerifyData verifyData = new VerifyData();
        VerifyReason serializableExtra = getIntent().getSerializableExtra("REASON");
        int intExtra = getIntent().getIntExtra("COUNTRY_CODE", 0);
        String stringExtra = getIntent().getStringExtra("PHONE_NUMBER");
        String stringExtra2 = getIntent().getStringExtra("PASSWORD");
        boolean booleanExtra = getIntent().getBooleanExtra("IS_NEW_DEVICE", false);
        if (NullChecker.a(bundle)) {
            serializableExtra = (VerifyReason) bundle.getSerializable("REASON");
            intExtra = bundle.getInt("COUNTRY_CODE");
            stringExtra = bundle.getString("PHONE_NUMBER", "");
            stringExtra2 = bundle.getString("PASSWORD", "");
            booleanExtra = bundle.getBoolean("IS_NEW_DEVICE");
        }
        VerifyReason verifyReason = serializableExtra;
        String str = stringExtra;
        String str2 = stringExtra2;
        boolean z = booleanExtra;
        verifyData.language = i0g0.y();
        verifyData.countryCode = intExtra;
        verifyData.mobileNumber = str;
        verifyData.action = verifyReason;
        verifyData.codeLength = 4;
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            verifyData.clientId = "100032";
            verifyData.category = "Text";
            this.f443d.m474h0(true);
        }
        this.f442c.m21822r1(verifyReason, intExtra, str, str2, verifyData, z);
        this.f443d.m472f0(str, verifyReason);
        super.preCreateView(bundle);
        this.f443d.m477j0(verifyReason, z);
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            setSwipeBackEnable(false);
        }
    }
}
