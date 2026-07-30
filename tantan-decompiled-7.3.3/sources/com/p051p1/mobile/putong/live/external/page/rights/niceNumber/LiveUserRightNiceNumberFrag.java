package com.p051p1.mobile.putong.live.external.page.rights.niceNumber;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.lcd0;
import p153l.ocd0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveUserRightNiceNumberFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public ocd0 f46980A;

    /* JADX INFO: renamed from: z */
    public lcd0 f46981z;

    /* JADX INFO: renamed from: M4 */
    public static LiveUserRightNiceNumberFrag m71843M4(Bundle bundle) {
        LiveUserRightNiceNumberFrag liveUserRightNiceNumberFrag = new LiveUserRightNiceNumberFrag();
        liveUserRightNiceNumberFrag.setArguments(bundle);
        return liveUserRightNiceNumberFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46980A = new ocd0(act());
        lcd0 lcd0Var = new lcd0(this);
        this.f46981z = lcd0Var;
        lcd0Var.mo52715C(this.f46980A);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f46981z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46981z.m153677r0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46980A.inflateView(layoutInflater, viewGroup);
    }
}
