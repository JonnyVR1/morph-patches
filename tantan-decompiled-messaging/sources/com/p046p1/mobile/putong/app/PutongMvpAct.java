package com.p046p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongMvpAct<p extends jq2, v extends s7m<p>> extends PutongAct {

    /* JADX INFO: renamed from: c */
    public p f17172c;

    /* JADX INFO: renamed from: d */
    public v f17173d;

    /* JADX INFO: renamed from: V1 */
    public abstract p mo28672V1();

    /* JADX INFO: renamed from: X1 */
    public abstract v mo28673X1();

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17173d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17172c = (p) mo28672V1();
        v v2 = (v) mo28673X1();
        this.f17173d = v2;
        this.f17172c.mo51532C(v2);
        this.f17172c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17172c.mo39470a0();
    }
}
