package com.p046p1.mobile.putong.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongCoreMvpAct<p extends jq2, v extends s7m<p>> extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public p f17564d;

    /* JADX INFO: renamed from: e */
    public v f17565e;

    /* JADX INFO: renamed from: X1 */
    public abstract p mo29951X1();

    /* JADX INFO: renamed from: Y1 */
    public abstract v mo29952Y1();

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17565e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17564d = (p) mo29951X1();
        v v2 = (v) mo29952Y1();
        this.f17565e = v2;
        this.f17564d.mo51532C(v2);
        this.f17564d.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17564d.mo39470a0();
    }
}
