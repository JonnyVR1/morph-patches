package com.p000p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import p007l.sf5;
import p007l.ye5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ComicFaceRecorderFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public sf5 f1595A;

    /* JADX INFO: renamed from: z */
    public ye5 f1596z;

    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1595A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m3045n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        if (NullChecker.a(getActivity().getSupportActionBar())) {
            getActivity().getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3046o() {
        this.f1595A.m14201b0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            this.f1595A.m14196J0((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        this.f1596z = new ye5(this);
        sf5 sf5Var = new sf5(this);
        this.f1595A = sf5Var;
        this.f1596z.C(sf5Var);
        this.f1596z.m17123Z();
    }
}
