package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import p153l.i170;
import p153l.l170;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberVerifyAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public l170 f17156c;

    /* JADX INFO: renamed from: d */
    public i170 f17157d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29493X1(Context context, int i, String str) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberVerifyAct.class);
        intent.putExtra("c_code_extra", i);
        intent.putExtra("number_extra", str);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17156c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17156c = new l170(this);
        i170 i170Var = new i170(this);
        this.f17157d = i170Var;
        i170Var.mo52715C(this.f17156c);
        this.f17157d.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17157d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_reset_password_verify_number_view";
    }
}
