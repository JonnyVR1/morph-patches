package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.leh0;
import p149l.seh0;

/* JADX INFO: loaded from: classes8.dex */
public class SwitchAccountAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f28257e = "switch_account";

    /* JADX INFO: renamed from: c */
    public seh0 f28258c;

    /* JADX INFO: renamed from: d */
    public leh0 f28259d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m44196V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SwitchAccountAct.class);
        intent.putExtra(f28257e, str);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28258c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28259d = new leh0(this);
        seh0 seh0Var = new seh0(this);
        this.f28258c = seh0Var;
        this.f28259d.mo51532C(seh0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28259d.mo39470a0();
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
        this.f28259d.m149545y0(getIntent().getStringExtra(f28257e));
    }
}
