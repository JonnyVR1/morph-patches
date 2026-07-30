package com.p051p1.mobile.putong.live.external.page.rights.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.tbd0;
import p153l.vbd0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveUserRightListFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public vbd0 f46856A;

    /* JADX INFO: renamed from: z */
    public tbd0 f46857z;

    /* JADX INFO: renamed from: M4 */
    public static LiveUserRightListFrag m71745M4(Bundle bundle) {
        LiveUserRightListFrag liveUserRightListFrag = new LiveUserRightListFrag();
        liveUserRightListFrag.setArguments(bundle);
        return liveUserRightListFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46856A = new vbd0(act());
        tbd0 tbd0Var = new tbd0(this);
        this.f46857z = tbd0Var;
        tbd0Var.mo52715C(this.f46856A);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f46857z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46857z.m189994Q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46856A.inflateView(layoutInflater, viewGroup);
    }
}
