package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.g6v;
import p149l.h7v;
import p149l.lor;
import p149l.mss;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public g6v f45504A;

    /* JADX INFO: renamed from: z */
    public h7v f45505z;

    /* JADX INFO: renamed from: N4 */
    public static LiveBaseFrag m69870N4(Bundle bundle) {
        if (lor.m150808m()) {
            LiveVoiceInternalSquareFragNew liveVoiceInternalSquareFragNew = new LiveVoiceInternalSquareFragNew();
            liveVoiceInternalSquareFragNew.setArguments(bundle);
            return liveVoiceInternalSquareFragNew;
        }
        LiveVoiceInternalSquareFrag liveVoiceInternalSquareFrag = new LiveVoiceInternalSquareFrag();
        liveVoiceInternalSquareFrag.setArguments(bundle);
        return liveVoiceInternalSquareFrag;
    }

    /* JADX INFO: renamed from: M4 */
    public mss m69871M4() {
        g6v g6vVar = this.f45504A;
        if (g6vVar != null) {
            return g6vVar.m124647K2();
        }
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    public void m69872O4(String str) {
        g6v g6vVar = this.f45504A;
        if (g6vVar != null) {
            g6vVar.m124662a3(str);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45504A = new g6v(new mss(new LiveHomeEventBus(), this));
        h7v h7vVar = new h7v();
        this.f45505z = h7vVar;
        this.f45504A.m124645F2(h7vVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f45504A.m124663b3(arguments.getString("source"));
            this.f45504A.m124662a3(arguments.getString("tab_id", null));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        g6v g6vVar = this.f45504A;
        if (g6vVar != null) {
            g6vVar.m124650N2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        g6v g6vVar = this.f45504A;
        if (g6vVar != null) {
            g6vVar.m124665r();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h7v h7vVar = this.f45505z;
        if (h7vVar != null) {
            return h7vVar.inflateView(layoutInflater, viewGroup);
        }
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LiveVoiceInternalSquareApi.notifyLeaveVoiceSquare();
        SVGALoader.clear();
        System.gc();
    }
}
