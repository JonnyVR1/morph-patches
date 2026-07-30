package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import p149l.njm;
import p149l.nye0;
import p149l.sye0;

/* JADX INFO: loaded from: classes9.dex */
public class ShortCutLoginOptActivity extends AccountBaseAct {

    /* JADX INFO: renamed from: e */
    public static String f16605e = "phone_number";

    /* JADX INFO: renamed from: c */
    public sye0 f16606c;

    /* JADX INFO: renamed from: d */
    public nye0 f16607d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16606c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16607d = new nye0(this);
        sye0 sye0Var = new sye0(this);
        this.f16606c = sye0Var;
        this.f16607d.mo51532C(sye0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16607d.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16607d.m161999z1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_quick_sign_in_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        njm.m159745a(this);
        super.preCreateView(bundle);
        this.f16607d.m161997u1(getIntent().getStringExtra(f16605e));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
