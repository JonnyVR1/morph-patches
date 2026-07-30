package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import p149l.eje;
import p149l.ive;
import p149l.njm;
import p149l.oue;
import p149l.qib0;

/* JADX INFO: loaded from: classes9.dex */
public class EmailLoginOptAct extends SignInBaseActMVP<oue, ive> {

    /* JADX INFO: renamed from: c */
    public ive f16599c;

    /* JADX INFO: renamed from: d */
    public oue f16600d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28662Y1(Context context, VerifyReason verifyReason, String str) {
        Intent intent = new Intent(context, (Class<?>) EmailLoginOptAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m28663Z1(Context context, VerifyReason verifyReason, boolean z, String str, String str2) {
        Intent intentM28662Y1 = m28662Y1(context, verifyReason, str);
        intentM28662Y1.putExtra("showGoogleBtn", z);
        intentM28662Y1.putExtra("currentBindEmail", str2);
        return intentM28662Y1;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public oue generateSignInPresenter() {
        oue oueVar = new oue(this);
        this.f16600d = oueVar;
        return oueVar;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ive generateSignInViewModel() {
        ive iveVar = new ive(this);
        this.f16599c = iveVar;
        return iveVar;
    }

    /* JADX INFO: renamed from: c2 */
    public String m28666c2() {
        return getIntent().getStringExtra("currentBindEmail");
    }

    /* JADX INFO: renamed from: d2 */
    public boolean m28667d2() {
        return getIntent().getBooleanExtra("showGoogleBtn", false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16599c.m138589Y()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16599c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16600d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        this.f16600d.m166059s2(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f16599c.m138589Y()) {
            return;
        }
        hideInput();
        super.onBackPressed();
        if (this.f16600d.m166033R1()) {
            eje.m116824h().m116834m();
            qib0.m174805Z0(false, false);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get(VerifyReason.change_email).equals(verifyReason)) {
            return "p_account_replace_email";
        }
        return NullChecker.m81303a(this.f16599c) ? this.f16599c.m138610u0() : "";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        njm.m159745a(this);
        this.f16600d.m166029N1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), getIntent().getStringExtra("from"), m28667d2(), getIntent().getBooleanExtra("canSkip", true));
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
