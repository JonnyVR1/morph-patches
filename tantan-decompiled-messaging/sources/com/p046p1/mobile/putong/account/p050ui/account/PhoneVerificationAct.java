package com.p046p1.mobile.putong.account.p050ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.fu60;
import p149l.j760;
import p149l.qu60;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneVerificationAct extends SignInBaseActMVP<fu60, qu60> {

    /* JADX INFO: renamed from: c */
    public fu60 f16351c;

    /* JADX INFO: renamed from: d */
    public qu60 f16352d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28385Y1(Context context, VerifyReason verifyReason) {
        return m28386Z1(context, verifyReason, null, null, true, false, false, false, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m28386Z1(Context context, VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneVerificationAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("hasbackbtn", z);
        intent.putExtra("frome_dlg", z2);
        intent.putExtra("from_oneclick", z3);
        intent.putExtra("show_award", z4);
        intent.putExtra("from", str);
        if (NullChecker.m81303a(signInData)) {
            intent.putExtra(SignInData.TYPE, signInData);
        }
        if (NullChecker.m81303a(signUpData)) {
            intent.putExtra("signupdata", signUpData);
        }
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m28387a2(Context context, VerifyReason verifyReason, String str) {
        return m28386Z1(context, verifyReason, null, null, true, false, false, false, str);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fu60 generateSignInPresenter() {
        return this.f16351c;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public qu60 generateSignInViewModel() {
        return this.f16352d;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        this.f16351c.m123161r1();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16352d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f16352d = new qu60(this);
        fu60 fu60Var = new fu60(this);
        this.f16351c = fu60Var;
        fu60Var.mo51532C(this.f16352d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16351c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f16351c.m123147b1()) {
            hideInput();
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f16351c.m123159p1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f16352d.m176563L(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_new_phone_number_view";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f16351c.m123150e1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), (SignInData) getIntent().getSerializableExtra(SignInData.TYPE), (SignUpData) getIntent().getSerializableExtra("signupdata"), getIntent().getBooleanExtra("hasbackbtn", true), getIntent().getBooleanExtra("frome_dlg", false), getIntent().getBooleanExtra("from_oneclick", false), getIntent().getBooleanExtra("show_award", false), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f16351c.m123162s1();
    }
}
