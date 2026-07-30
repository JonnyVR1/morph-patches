package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import p149l.ct60;
import p149l.ft60;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberVerifyAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public ft60 f16437c;

    /* JADX INFO: renamed from: d */
    public ct60 f16438d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28494V1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberVerifyAct.class);
        intent.putExtra("c_code_extra", i);
        intent.putExtra("number_extra", str);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16437c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16437c = new ft60(this);
        ct60 ct60Var = new ct60(this);
        this.f16438d = ct60Var;
        ct60Var.mo51532C(this.f16437c);
        this.f16438d.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16438d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_reset_password_verify_number_view";
    }
}
