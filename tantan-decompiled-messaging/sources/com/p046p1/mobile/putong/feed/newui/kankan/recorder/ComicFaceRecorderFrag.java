package com.p046p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p149l.sf5;
import p149l.ye5;

/* JADX INFO: loaded from: classes12.dex */
public class ComicFaceRecorderFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public sf5 f40134A;

    /* JADX INFO: renamed from: z */
    public ye5 f40135z;

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40134A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        if (NullChecker.m81303a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m62064o() {
        this.f40134A.m183849b0();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            this.f40134A.m183844J0((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40135z = new ye5(this);
        sf5 sf5Var = new sf5(this);
        this.f40134A = sf5Var;
        this.f40135z.mo51532C(sf5Var);
        this.f40135z.mo39469Z();
    }
}
