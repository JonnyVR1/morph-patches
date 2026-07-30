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
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.io.Serializable;
import java.util.List;
import p149l.br60;
import p149l.iq60;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberInputAct extends SignInBaseActMVP<iq60, br60> {

    /* JADX INFO: renamed from: c */
    public br60 f16435c;

    /* JADX INFO: renamed from: d */
    public iq60 f16436d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28490Y1(Context context, VerifyReason verifyReason) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("signData", (Serializable) null);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m28491Z1(Act act, VerifyReason verifyReason, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("signData", signInData);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public iq60 generateSignInPresenter() {
        return this.f16436d;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public br60 generateSignInViewModel() {
        return this.f16435c;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16435c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f16435c = new br60(this);
        iq60 iq60Var = new iq60(this);
        this.f16436d = iq60Var;
        iq60Var.mo51532C(this.f16435c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16436d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f16436d.m137664R1(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f16436d.m137665S1();
        hideInput();
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f16436d.m137666T1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f16436d.m137667U1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16436d.m137668V1(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return this.f16436d.pageId();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        this.f16436d.m137684p1(verifyReason, (SignInData) getIntent().getSerializableExtra("signData"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            setSwipeBackEnable(false);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f16436d.m137677e2();
    }
}
