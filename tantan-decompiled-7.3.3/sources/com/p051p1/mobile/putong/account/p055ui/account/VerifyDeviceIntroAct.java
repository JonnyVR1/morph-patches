package com.p051p1.mobile.putong.account.p055ui.account;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.SignInData;
import p153l.b9l0;
import p153l.z8l0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public z8l0 f17072c;

    /* JADX INFO: renamed from: d */
    public b9l0 f17073d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29393X1(Act act, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) VerifyDeviceIntroAct.class);
        intent.putExtra(SignInData.TYPE, signInData);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17073d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17072c = new z8l0(this);
        b9l0 b9l0Var = new b9l0(this);
        this.f17073d = b9l0Var;
        this.f17072c.mo52715C(b9l0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17072c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f17073d.m103114f();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_new_device_passwordlogin_verify_view";
    }
}
