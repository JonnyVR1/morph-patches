package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.j7v;
import p149l.mss;
import p149l.n6v;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareFragNew extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public n6v f45506A;

    /* JADX INFO: renamed from: z */
    public j7v f45507z;

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        super.mo68932Y4();
        this.f45506A.m158091P2();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo69050b5() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: c5 */
    public boolean mo69051c5() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45506A = new n6v(new mss(new LiveHomeEventBus(), this));
        j7v j7vVar = new j7v();
        this.f45507z = j7vVar;
        this.f45506A.m158095y2(j7vVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f45506A.m158094T2(arguments.getString("source"));
            this.f45506A.m158093S2(arguments.getString("tab_id", null));
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: d5 */
    public boolean mo69052d5() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        n6v n6vVar = this.f45506A;
        if (n6vVar != null) {
            n6vVar.m158084E2();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        n6v n6vVar = this.f45506A;
        if (n6vVar != null) {
            n6vVar.m158085F2(this.tabInfo);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        j7v j7vVar = this.f45507z;
        if (j7vVar != null) {
            return j7vVar.inflateView(layoutInflater, viewGroup);
        }
        return null;
    }

    /* JADX INFO: renamed from: k5 */
    public mss m69873k5() {
        n6v n6vVar = this.f45506A;
        if (n6vVar != null) {
            return n6vVar.m158082B2();
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
