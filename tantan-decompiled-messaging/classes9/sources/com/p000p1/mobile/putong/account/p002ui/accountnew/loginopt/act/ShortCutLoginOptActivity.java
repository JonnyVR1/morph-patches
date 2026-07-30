package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import p006l.njm;
import p006l.nye0;
import p006l.sye0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ShortCutLoginOptActivity extends AccountBaseAct {

    /* JADX INFO: renamed from: e */
    public static String f594e = "phone_number";

    /* JADX INFO: renamed from: c */
    public sye0 f595c;

    /* JADX INFO: renamed from: d */
    public nye0 f596d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f595c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f596d = new nye0(this);
        sye0 sye0Var = new sye0(this);
        this.f595c = sye0Var;
        this.f596d.C(sye0Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f596d.mo12401a0();
    }

    public void onStartLifecycle() {
        this.f596d.m20264z1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_quick_sign_in_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        njm.m20153a(this);
        super.preCreateView(bundle);
        this.f596d.m20262u1(getIntent().getStringExtra(f594e));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
