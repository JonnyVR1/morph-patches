package com.p046p1.mobile.putong.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PutongMvpFrag<p extends jq2, v extends s7m<p>> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public v f17174A;

    /* JADX INFO: renamed from: z */
    public p f17175z;

    /* JADX INFO: renamed from: M4 */
    public abstract p mo29641M4();

    /* JADX INFO: renamed from: N4 */
    public abstract v mo29642N4();

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f17175z = (p) mo29641M4();
        v v2 = (v) mo29642N4();
        this.f17174A = v2;
        this.f17175z.mo51532C(v2);
        this.f17175z.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f17175z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17174A.inflateView(layoutInflater, viewGroup);
    }
}
