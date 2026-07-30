package com.p000p1.mobile.putong.account.p002ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.j760;
import p006l.fu60;
import p006l.qu60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PhoneVerificationAct extends SignInBaseActMVP<fu60, qu60> {

    /* JADX INFO: renamed from: c */
    public fu60 f340c;

    /* JADX INFO: renamed from: d */
    public qu60 f341d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m281Y1(Context context, VerifyReason verifyReason) {
        return m282Z1(context, verifyReason, null, null, true, false, false, false, null);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m282Z1(Context context, VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneVerificationAct.class);
        intent.putExtra("reason", (Serializable) verifyReason);
        intent.putExtra("hasbackbtn", z);
        intent.putExtra("frome_dlg", z2);
        intent.putExtra("from_oneclick", z3);
        intent.putExtra("show_award", z4);
        intent.putExtra("from", str);
        if (NullChecker.a(signInData)) {
            intent.putExtra("signindata", (Serializable) signInData);
        }
        if (NullChecker.a(signUpData)) {
            intent.putExtra("signupdata", (Serializable) signUpData);
        }
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m283a2(Context context, VerifyReason verifyReason, String str) {
        return m282Z1(context, verifyReason, null, null, true, false, false, false, str);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fu60 generateSignInPresenter() {
        return this.f340c;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public qu60 generateSignInViewModel() {
        return this.f341d;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    public void finish() {
        super.finish();
        this.f340c.m15497r1();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f341d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        this.f341d = new qu60(this);
        fu60 fu60Var = new fu60(this);
        this.f340c = fu60Var;
        fu60Var.C(this.f341d);
        super.initDataOnCreate();
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f340c.mo12401a0();
    }

    public void onBackPressed() {
        if (this.f340c.m15483b1()) {
            hideInput();
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f340c.m15495p1(menu)) {
            return true;
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.f341d.m22404L(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_edit_new_phone_number_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        this.f340c.m15486e1(getIntent().getSerializableExtra("reason"), getIntent().getSerializableExtra("signindata"), getIntent().getSerializableExtra("signupdata"), getIntent().getBooleanExtra("hasbackbtn", true), getIntent().getBooleanExtra("frome_dlg", false), getIntent().getBooleanExtra("from_oneclick", false), getIntent().getBooleanExtra("show_award", false), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f340c.m15498s1();
    }
}
