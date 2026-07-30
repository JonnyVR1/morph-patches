package com.p000p1.mobile.putong.core;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jq2;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class PutongCoreMvpAct<p extends jq2, v extends s7m<p>> extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public p f1553d;

    /* JADX INFO: renamed from: e */
    public v f1554e;

    /* JADX INFO: renamed from: X1 */
    public abstract p mo1879X1();

    /* JADX INFO: renamed from: Y1 */
    public abstract v mo1880Y1();

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1554e.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1553d = (p) mo1879X1();
        v v = (v) mo1880Y1();
        this.f1554e = v;
        this.f1553d.C(v);
        this.f1553d.Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f1553d.a0();
    }
}
