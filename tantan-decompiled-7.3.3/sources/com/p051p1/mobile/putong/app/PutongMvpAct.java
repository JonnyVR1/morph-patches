package com.p051p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongMvpAct<p extends ar2, v extends iam<p>> extends PutongAct {

    /* JADX INFO: renamed from: c */
    public p f17891c;

    /* JADX INFO: renamed from: d */
    public v f17892d;

    /* JADX INFO: renamed from: X1 */
    public abstract p mo29671X1();

    /* JADX INFO: renamed from: Y1 */
    public abstract v mo29672Y1();

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17892d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17891c = (p) mo29671X1();
        v v2 = (v) mo29672Y1();
        this.f17892d = v2;
        this.f17891c.mo52715C(v2);
        this.f17891c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17891c.mo40473a0();
    }
}
