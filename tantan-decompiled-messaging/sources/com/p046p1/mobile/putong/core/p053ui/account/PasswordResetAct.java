package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.VerifyData;
import p149l.da60;
import p149l.ga60;

/* JADX INFO: loaded from: classes8.dex */
public class PasswordResetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public da60 f28255c;

    /* JADX INFO: renamed from: d */
    public ga60 f28256d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m44195V1(Act act, VerifyData verifyData) {
        Intent intent = new Intent(act, (Class<?>) PasswordResetAct.class);
        intent.putExtra("verify_data", verifyData);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28256d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28255c = new da60(this);
        ga60 ga60Var = new ga60(this);
        this.f28256d = ga60Var;
        this.f28255c.mo51532C(ga60Var);
        this.f28255c.m110573j0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28255c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
