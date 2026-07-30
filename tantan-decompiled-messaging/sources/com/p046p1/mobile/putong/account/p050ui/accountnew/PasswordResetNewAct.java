package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.VerifyData;
import p149l.s960;
import p149l.w960;

/* JADX INFO: loaded from: classes9.dex */
public class PasswordResetNewAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public s960 f16433c;

    /* JADX INFO: renamed from: d */
    public w960 f16434d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28489V1(Act act, VerifyData verifyData) {
        Intent intent = new Intent(act, (Class<?>) PasswordResetNewAct.class);
        intent.putExtra("verify_data", verifyData);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16434d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16433c = new s960(this);
        w960 w960Var = new w960(this);
        this.f16434d = w960Var;
        this.f16433c.mo51532C(w960Var);
        this.f16433c.m182713l0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16433c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_reset_password_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
