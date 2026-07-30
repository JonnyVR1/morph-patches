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
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.io.Serializable;
import java.util.List;
import p153l.hz60;
import p153l.oy60;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberInputAct extends SignInBaseActMVP<oy60, hz60> {

    /* JADX INFO: renamed from: c */
    public hz60 f17154c;

    /* JADX INFO: renamed from: d */
    public oy60 f17155d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29489Z1(Context context, VerifyReason verifyReason) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("signData", (Serializable) null);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m29490a2(Act act, VerifyReason verifyReason, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("signData", signInData);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public oy60 generateSignInPresenter() {
        return this.f17155d;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public hz60 generateSignInViewModel() {
        return this.f17154c;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17154c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f17154c = new hz60(this);
        oy60 oy60Var = new oy60(this);
        this.f17155d = oy60Var;
        oy60Var.mo52715C(this.f17154c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17155d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f17155d.m169803R1(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f17155d.m169804S1();
        hideInput();
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f17155d.m169805T1(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f17155d.m169806U1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17155d.m169807V1(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return this.f17155d.pageId();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        this.f17155d.m169823p1(verifyReason, (SignInData) getIntent().getSerializableExtra("signData"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            setSwipeBackEnable(false);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f17155d.m169816e2();
    }
}
