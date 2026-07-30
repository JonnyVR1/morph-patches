package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.VerifyData;
import java.io.Serializable;
import p007l.da60;
import p007l.ga60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PasswordResetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public da60 f1826c;

    /* JADX INFO: renamed from: d */
    public ga60 f1827d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V1 */
    public static Intent m8545V1(Act act, VerifyData verifyData) {
        Intent intent = new Intent((Context) act, (Class<?>) PasswordResetAct.class);
        intent.putExtra("verify_data", (Serializable) verifyData);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.lambda$debugItems$19();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1827d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1826c = new da60(this);
        ga60 ga60Var = new ga60(this);
        this.f1827d = ga60Var;
        this.f1826c.mo8556C(ga60Var);
        this.f1826c.m8873j0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1826c.mo8872a0();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
