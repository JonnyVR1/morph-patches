package com.p046p1.mobile.putong.live.external.intl.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.at10;
import p149l.ts10;

/* JADX INFO: loaded from: classes13.dex */
public class MusicScanningPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public at10 f45712A;

    /* JADX INFO: renamed from: z */
    public ts10 f45713z;

    /* JADX INFO: renamed from: M4 */
    public static LiveBaseFrag m70238M4() {
        return new MusicScanningPageFrag();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45713z = new ts10(this);
        at10 at10Var = new at10(act());
        this.f45712A = at10Var;
        this.f45713z.mo51532C(at10Var);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((PutongAct) act()).setTransparentStatusBar();
        this.f45713z.m190508v2();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45712A.inflateView(layoutInflater, viewGroup);
    }
}
