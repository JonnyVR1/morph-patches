package com.p051p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongMvpFrag<p extends ar2, v extends iam<p>> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public v f17893A;

    /* JADX INFO: renamed from: z */
    public p f17894z;

    /* JADX INFO: renamed from: M4 */
    public abstract p mo30639M4();

    /* JADX INFO: renamed from: N4 */
    public abstract v mo30640N4();

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f17894z = (p) mo30639M4();
        v v2 = (v) mo30640N4();
        this.f17893A = v2;
        this.f17894z.mo52715C(v2);
        this.f17894z.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f17894z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17893A.inflateView(layoutInflater, viewGroup);
    }
}
