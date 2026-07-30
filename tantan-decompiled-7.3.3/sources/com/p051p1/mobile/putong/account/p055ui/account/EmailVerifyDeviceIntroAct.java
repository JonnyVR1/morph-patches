package com.p051p1.mobile.putong.account.p055ui.account;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.SignInData;
import p153l.xxe;
import p153l.zxe;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public xxe f17068c;

    /* JADX INFO: renamed from: d */
    public zxe f17069d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29383X1(Act act, SignInData signInData) {
        Intent intent = new Intent(act, (Class<?>) EmailVerifyDeviceIntroAct.class);
        intent.putExtra(SignInData.TYPE, signInData);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17069d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17068c = new xxe(this);
        zxe zxeVar = new zxe(this);
        this.f17069d = zxeVar;
        this.f17068c.mo52715C(zxeVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17068c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f17069d.m221990f();
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
