package com.p046p1.mobile.putong.account.p050ui.account;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.SignInData;
import p149l.twe;
import p149l.vwe;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public twe f16349c;

    /* JADX INFO: renamed from: d */
    public vwe f16350d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28384V1(Act act, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) EmailVerifyDeviceIntroAct.class);
        intent.putExtra(SignInData.TYPE, signInData);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16350d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16349c = new twe(this);
        vwe vweVar = new vwe(this);
        this.f16350d = vweVar;
        this.f16349c.mo51532C(vweVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16349c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f16350d.m200365f();
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
