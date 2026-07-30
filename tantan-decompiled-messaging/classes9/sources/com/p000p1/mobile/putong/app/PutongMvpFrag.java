package com.p000p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.jq2;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class PutongMvpFrag<p extends jq2, v extends s7m<p>> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public v f1163A;

    /* JADX INFO: renamed from: z */
    public p f1164z;

    /* JADX INFO: renamed from: M4 */
    public abstract p mo1551M4();

    /* JADX INFO: renamed from: N4 */
    public abstract v mo1552N4();

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        this.f1164z = (p) mo1551M4();
        v v = (v) mo1552N4();
        this.f1163A = v;
        this.f1164z.C(v);
        this.f1164z.Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.f1164z.a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1163A.inflateView(layoutInflater, viewGroup);
    }
}
