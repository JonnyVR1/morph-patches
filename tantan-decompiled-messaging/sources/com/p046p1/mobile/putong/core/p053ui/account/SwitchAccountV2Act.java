package com.p046p1.mobile.putong.core.p053ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.efh0;
import p149l.lfh0;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchAccountV2Act extends PutongAct {

    /* JADX INFO: renamed from: c */
    public lfh0 f28260c;

    /* JADX INFO: renamed from: d */
    public efh0 f28261d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28260c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28261d = new efh0(this);
        lfh0 lfh0Var = new lfh0(this);
        this.f28260c = lfh0Var;
        this.f28261d.mo51532C(lfh0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28261d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (CoreModule.m29931H().signedIn_()) {
            super.onBackPressed();
        } else {
            moveTaskToBack(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_switch_account_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f28261d.m116069y0(getIntent().getStringExtra(SwitchAccountAct.f28257e));
    }
}
