package com.p046p1.mobile.putong.live.external.page.rights.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.q3d0;
import p149l.s3d0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveUserRightListFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public s3d0 f46008A;

    /* JADX INFO: renamed from: z */
    public q3d0 f46009z;

    /* JADX INFO: renamed from: M4 */
    public static LiveUserRightListFrag m70562M4(Bundle bundle) {
        LiveUserRightListFrag liveUserRightListFrag = new LiveUserRightListFrag();
        liveUserRightListFrag.setArguments(bundle);
        return liveUserRightListFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f46008A = new s3d0(act());
        q3d0 q3d0Var = new q3d0(this);
        this.f46009z = q3d0Var;
        q3d0Var.mo51532C(this.f46008A);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f46009z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46009z.m172793Q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46008A.inflateView(layoutInflater, viewGroup);
    }
}
