package com.p046p1.mobile.putong.live.external.page.rights.manage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.r8k0;
import p149l.v8k0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveRightFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public v8k0 f46126A;

    /* JADX INFO: renamed from: z */
    public r8k0 f46127z;

    /* JADX INFO: renamed from: M4 */
    public static LiveRightFrag m70654M4(Bundle bundle) {
        LiveRightFrag liveRightFrag = new LiveRightFrag();
        liveRightFrag.setArguments(bundle);
        return liveRightFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f46126A = new v8k0(act());
        r8k0 r8k0Var = new r8k0(act());
        this.f46127z = r8k0Var;
        r8k0Var.mo51532C(this.f46126A);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46126A.m197471r();
        this.f46127z.m178279e0(getArguments());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46126A.inflateView(layoutInflater, viewGroup);
    }
}
