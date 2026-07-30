package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import p006l.ct60;
import p006l.ft60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PhoneNumberVerifyAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public ft60 f426c;

    /* JADX INFO: renamed from: d */
    public ct60 f427d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m390V1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberVerifyAct.class);
        intent.putExtra("c_code_extra", i);
        intent.putExtra("number_extra", str);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f426c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f426c = new ft60(this);
        ct60 ct60Var = new ct60(this);
        this.f427d = ct60Var;
        ct60Var.C(this.f426c);
        this.f427d.m13634Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f427d.m13635a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_reset_password_verify_number_view";
    }
}
