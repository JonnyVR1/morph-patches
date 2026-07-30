package com.p051p1.mobile.putong.live.external.intl.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.b120;
import p153l.i120;

/* JADX INFO: loaded from: classes9.dex */
public class MusicScanningPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public i120 f46560A;

    /* JADX INFO: renamed from: z */
    public b120 f46561z;

    /* JADX INFO: renamed from: M4 */
    public static LiveBaseFrag m71421M4() {
        return new MusicScanningPageFrag();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46561z = new b120(this);
        i120 i120Var = new i120(act());
        this.f46560A = i120Var;
        this.f46561z.mo52715C(i120Var);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((PutongAct) act()).setTransparentStatusBar();
        this.f46561z.m101388v2();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46560A.inflateView(layoutInflater, viewGroup);
    }
}
