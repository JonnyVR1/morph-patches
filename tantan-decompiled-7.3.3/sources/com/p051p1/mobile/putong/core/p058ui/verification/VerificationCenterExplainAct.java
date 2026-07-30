package com.p051p1.mobile.putong.core.p058ui.verification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.m2l0;
import p153l.n2l0;

/* JADX INFO: loaded from: classes12.dex */
public class VerificationCenterExplainAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public m2l0 f37491c;

    /* JADX INFO: renamed from: d */
    public n2l0 f37492d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37492d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37491c = new m2l0(this);
        n2l0 n2l0Var = new n2l0(this);
        this.f37492d = n2l0Var;
        this.f37491c.mo52715C(n2l0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37491c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_verification_center_directions";
    }
}
