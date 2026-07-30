package com.p000p1.mobile.putong.core.p004ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import p006l.efh0;
import p006l.lfh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SwitchAccountV2Act extends PutongAct {

    /* JADX INFO: renamed from: c */
    public lfh0 f4327c;

    /* JADX INFO: renamed from: d */
    public efh0 f4328d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4327c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f4328d = new efh0(this);
        lfh0 lfh0Var = new lfh0(this);
        this.f4327c = lfh0Var;
        this.f4328d.C(lfh0Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f4328d.m14529a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (CoreModule.m1850H().signedIn_()) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            moveTaskToBack(true);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_switch_account_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f4328d.m14537y0(getIntent().getStringExtra(SwitchAccountAct.e));
    }
}
