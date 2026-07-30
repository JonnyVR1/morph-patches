package com.p046p1.mobile.putong.live.external.page.rights.niceNumber;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.i4d0;
import p149l.l4d0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveUserRightNiceNumberFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public l4d0 f46132A;

    /* JADX INFO: renamed from: z */
    public i4d0 f46133z;

    /* JADX INFO: renamed from: M4 */
    public static LiveUserRightNiceNumberFrag m70660M4(Bundle bundle) {
        LiveUserRightNiceNumberFrag liveUserRightNiceNumberFrag = new LiveUserRightNiceNumberFrag();
        liveUserRightNiceNumberFrag.setArguments(bundle);
        return liveUserRightNiceNumberFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f46132A = new l4d0(act());
        i4d0 i4d0Var = new i4d0(this);
        this.f46133z = i4d0Var;
        i4d0Var.mo51532C(this.f46132A);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f46133z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f46133z.m134338r0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46132A.inflateView(layoutInflater, viewGroup);
    }
}
