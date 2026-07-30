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
import p006l.twe;
import p006l.vwe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailVerifyDeviceIntroAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public twe f338c;

    /* JADX INFO: renamed from: d */
    public vwe f339d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m280V1(Act act, SignInData signInData) {
        Intent intent = new Intent((Context) act, (Class<?>) EmailVerifyDeviceIntroAct.class);
        intent.putExtra("signindata", (Serializable) signInData);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f339d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f338c = new twe(this);
        vwe vweVar = new vwe(this);
        this.f339d = vweVar;
        this.f338c.C(vweVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f338c.m24841a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        this.f339d.m25955f();
    }

    public void onHomePressed() {
        onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_new_device_passwordlogin_verify_view";
    }
}
