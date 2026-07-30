package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import p153l.plm;
import p153l.u6f0;
import p153l.z6f0;

/* JADX INFO: loaded from: classes9.dex */
public class ShortCutLoginOptActivity extends AccountBaseAct {

    /* JADX INFO: renamed from: e */
    public static String f17324e = "phone_number";

    /* JADX INFO: renamed from: c */
    public z6f0 f17325c;

    /* JADX INFO: renamed from: d */
    public u6f0 f17326d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17325c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17326d = new u6f0(this);
        z6f0 z6f0Var = new z6f0(this);
        this.f17325c = z6f0Var;
        this.f17326d.mo52715C(z6f0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17326d.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17326d.m194692z1(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_quick_sign_in_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        plm.m172838a(this);
        super.preCreateView(bundle);
        this.f17326d.m194690u1(getIntent().getStringExtra(f17324e));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
