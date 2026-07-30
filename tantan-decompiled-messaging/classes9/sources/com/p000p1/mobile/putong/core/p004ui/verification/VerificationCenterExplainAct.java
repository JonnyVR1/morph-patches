package com.p000p1.mobile.putong.core.p004ui.verification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.gtk0;
import p006l.htk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerificationCenterExplainAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public gtk0 f6424c;

    /* JADX INFO: renamed from: d */
    public htk0 f6425d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6425d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6424c = new gtk0(this);
        htk0 htk0Var = new htk0(this);
        this.f6425d = htk0Var;
        this.f6424c.C(htk0Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6424c.m15992a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_verification_center_directions";
    }
}
