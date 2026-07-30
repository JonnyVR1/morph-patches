package com.p051p1.mobile.putong.account.p055ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.l270;
import p153l.pf60;
import p153l.w270;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneVerificationAct extends SignInBaseActMVP<l270, w270> {

    /* JADX INFO: renamed from: c */
    public l270 f17070c;

    /* JADX INFO: renamed from: d */
    public w270 f17071d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29384Z1(Context context, VerifyReason verifyReason) {
        return m29385a2(context, verifyReason, null, null, true, false, false, false, null);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m29385a2(Context context, VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneVerificationAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("hasbackbtn", z);
        intent.putExtra("frome_dlg", z2);
        intent.putExtra("from_oneclick", z3);
        intent.putExtra("show_award", z4);
        intent.putExtra("from", str);
        if (NullChecker.m82486a(signInData)) {
            intent.putExtra(SignInData.TYPE, signInData);
        }
        if (NullChecker.m82486a(signUpData)) {
            intent.putExtra("signupdata", signUpData);
        }
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m29386b2(Context context, VerifyReason verifyReason, String str) {
        return m29385a2(context, verifyReason, null, null, true, false, false, false, str);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public l270 generateSignInPresenter() {
        return this.f17070c;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public w270 generateSignInViewModel() {
        return this.f17071d;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        this.f17070c.m152595r1();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17071d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17071d = new w270(this);
        l270 l270Var = new l270(this);
        this.f17070c = l270Var;
        l270Var.mo52715C(this.f17071d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17070c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17070c.m152581b1()) {
            hideInput();
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f17070c.m152593p1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f17071d.m204562L(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_new_phone_number_view";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f17070c.m152584e1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), (SignInData) getIntent().getSerializableExtra(SignInData.TYPE), (SignUpData) getIntent().getSerializableExtra("signupdata"), getIntent().getBooleanExtra("hasbackbtn", true), getIntent().getBooleanExtra("frome_dlg", false), getIntent().getBooleanExtra("from_oneclick", false), getIntent().getBooleanExtra("show_award", false), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f17070c.m152596s1();
    }
}
