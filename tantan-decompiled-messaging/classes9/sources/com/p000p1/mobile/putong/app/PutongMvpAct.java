package com.p000p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jq2;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class PutongMvpAct<p extends jq2, v extends s7m<p>> extends PutongAct {

    /* JADX INFO: renamed from: c */
    public p f1161c;

    /* JADX INFO: renamed from: d */
    public v f1162d;

    /* JADX INFO: renamed from: V1 */
    public abstract p mo571V1();

    /* JADX INFO: renamed from: X1 */
    public abstract v mo572X1();

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1162d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1161c = (p) mo571V1();
        v v = (v) mo572X1();
        this.f1162d = v;
        this.f1161c.C(v);
        this.f1161c.Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f1161c.a0();
    }
}
