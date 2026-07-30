package com.p051p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p153l.sg5;
import p153l.yf5;

/* JADX INFO: loaded from: classes13.dex */
public class ComicFaceRecorderFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public sg5 f40982A;

    /* JADX INFO: renamed from: z */
    public yf5 f40983z;

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40982A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        if (NullChecker.m82486a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m63247o() {
        this.f40982A.m185746b0();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            this.f40982A.m185741J0((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40983z = new yf5(this);
        sg5 sg5Var = new sg5(this);
        this.f40982A = sg5Var;
        this.f40983z.mo52715C(sg5Var);
        this.f40983z.mo40472Z();
    }
}
