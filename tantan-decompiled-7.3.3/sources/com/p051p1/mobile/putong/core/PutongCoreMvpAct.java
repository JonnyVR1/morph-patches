package com.p051p1.mobile.putong.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongCoreMvpAct<p extends ar2, v extends iam<p>> extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public p f18283d;

    /* JADX INFO: renamed from: e */
    public v f18284e;

    /* JADX INFO: renamed from: Y1 */
    public abstract p mo30949Y1();

    /* JADX INFO: renamed from: Z1 */
    public abstract v mo30950Z1();

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f18284e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f18283d = (p) mo30949Y1();
        v v2 = (v) mo30950Z1();
        this.f18284e = v2;
        this.f18283d.mo52715C(v2);
        this.f18283d.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f18283d.mo40473a0();
    }
}
