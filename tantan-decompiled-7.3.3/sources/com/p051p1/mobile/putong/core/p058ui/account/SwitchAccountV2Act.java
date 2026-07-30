package com.p051p1.mobile.putong.core.p058ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.mnh0;
import p153l.tnh0;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchAccountV2Act extends PutongAct {

    /* JADX INFO: renamed from: c */
    public tnh0 f29108c;

    /* JADX INFO: renamed from: d */
    public mnh0 f29109d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29108c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29109d = new mnh0(this);
        tnh0 tnh0Var = new tnh0(this);
        this.f29108c = tnh0Var;
        this.f29109d.mo52715C(tnh0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29109d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (CoreModule.m30929H().signedIn_()) {
            super.onBackPressed();
        } else {
            moveTaskToBack(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_switch_account_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f29109d.m159187y0(getIntent().getStringExtra(SwitchAccountAct.f29105e));
    }
}
