package com.p046p1.mobile.putong.account.p050ui.account;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.SignInData;
import p149l.tzk0;
import p149l.vzk0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public tzk0 f16353c;

    /* JADX INFO: renamed from: d */
    public vzk0 f16354d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28394V1(Act act, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) VerifyDeviceIntroAct.class);
        intent.putExtra(SignInData.TYPE, signInData);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16354d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16353c = new tzk0(this);
        vzk0 vzk0Var = new vzk0(this);
        this.f16354d = vzk0Var;
        this.f16353c.mo51532C(vzk0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16353c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f16354d.m200771f();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_new_device_passwordlogin_verify_view";
    }
}
