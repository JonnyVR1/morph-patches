package com.p000p1.mobile.putong.account.p002ui.account;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignInData;
import java.io.Serializable;
import p006l.tzk0;
import p006l.vzk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public tzk0 f342c;

    /* JADX INFO: renamed from: d */
    public vzk0 f343d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m290V1(Act act, SignInData signInData) {
        Intent intent = new Intent((Context) act, (Class<?>) VerifyDeviceIntroAct.class);
        intent.putExtra("signindata", (Serializable) signInData);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f343d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f342c = new tzk0(this);
        vzk0 vzk0Var = new vzk0(this);
        this.f343d = vzk0Var;
        this.f342c.C(vzk0Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f342c.m24870a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f343d.m26081f();
    }

    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_new_device_passwordlogin_verify_view";
    }
}
