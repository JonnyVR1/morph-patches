package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.VerifyData;
import p153l.bi60;
import p153l.xh60;

/* JADX INFO: loaded from: classes9.dex */
public class PasswordResetNewAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public xh60 f17152c;

    /* JADX INFO: renamed from: d */
    public bi60 f17153d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29488X1(Act act, VerifyData verifyData) {
        Intent intent = new Intent(act, (Class<?>) PasswordResetNewAct.class);
        intent.putExtra("verify_data", verifyData);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17153d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17152c = new xh60(this);
        bi60 bi60Var = new bi60(this);
        this.f17153d = bi60Var;
        this.f17152c.mo52715C(bi60Var);
        this.f17152c.m211015l0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17152c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_reset_password_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
