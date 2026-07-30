package com.p051p1.mobile.putong.live.external.page.rights.manage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.bik0;
import p153l.xhk0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveRightFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public bik0 f46974A;

    /* JADX INFO: renamed from: z */
    public xhk0 f46975z;

    /* JADX INFO: renamed from: M4 */
    public static LiveRightFrag m71837M4(Bundle bundle) {
        LiveRightFrag liveRightFrag = new LiveRightFrag();
        liveRightFrag.setArguments(bundle);
        return liveRightFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46974A = new bik0(act());
        xhk0 xhk0Var = new xhk0(act());
        this.f46975z = xhk0Var;
        xhk0Var.mo52715C(this.f46974A);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46974A.m104487r();
        this.f46975z.m211050e0(getArguments());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46974A.inflateView(layoutInflater, viewGroup);
    }
}
