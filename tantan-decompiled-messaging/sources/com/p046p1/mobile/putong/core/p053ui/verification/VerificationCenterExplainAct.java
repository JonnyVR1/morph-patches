package com.p046p1.mobile.putong.core.p053ui.verification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.gtk0;
import p149l.htk0;

/* JADX INFO: loaded from: classes9.dex */
public class VerificationCenterExplainAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public gtk0 f36643c;

    /* JADX INFO: renamed from: d */
    public htk0 f36644d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36644d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36643c = new gtk0(this);
        htk0 htk0Var = new htk0(this);
        this.f36644d = htk0Var;
        this.f36643c.mo51532C(htk0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36643c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_verification_center_directions";
    }
}
