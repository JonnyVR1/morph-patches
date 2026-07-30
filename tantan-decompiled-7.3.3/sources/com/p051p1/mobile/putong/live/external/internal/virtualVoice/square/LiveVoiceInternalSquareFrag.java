package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.h8v;
import p153l.i9v;
import p153l.mqr;
import p153l.nus;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalSquareFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public h8v f46352A;

    /* JADX INFO: renamed from: z */
    public i9v f46353z;

    /* JADX INFO: renamed from: N4 */
    public static LiveBaseFrag m71053N4(Bundle bundle) {
        if (mqr.m159593m()) {
            LiveVoiceInternalSquareFragNew liveVoiceInternalSquareFragNew = new LiveVoiceInternalSquareFragNew();
            liveVoiceInternalSquareFragNew.setArguments(bundle);
            return liveVoiceInternalSquareFragNew;
        }
        LiveVoiceInternalSquareFrag liveVoiceInternalSquareFrag = new LiveVoiceInternalSquareFrag();
        liveVoiceInternalSquareFrag.setArguments(bundle);
        return liveVoiceInternalSquareFrag;
    }

    /* JADX INFO: renamed from: M4 */
    public nus m71054M4() {
        h8v h8vVar = this.f46352A;
        if (h8vVar != null) {
            return h8vVar.m133972K2();
        }
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    public void m71055O4(String str) {
        h8v h8vVar = this.f46352A;
        if (h8vVar != null) {
            h8vVar.m133987a3(str);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46352A = new h8v(new nus(new LiveHomeEventBus(), this));
        i9v i9vVar = new i9v();
        this.f46353z = i9vVar;
        this.f46352A.m133970F2(i9vVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f46352A.m133988b3(arguments.getString("source"));
            this.f46352A.m133987a3(arguments.getString("tab_id", null));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        h8v h8vVar = this.f46352A;
        if (h8vVar != null) {
            h8vVar.m133975N2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        h8v h8vVar = this.f46352A;
        if (h8vVar != null) {
            h8vVar.m133990r();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        i9v i9vVar = this.f46353z;
        if (i9vVar != null) {
            return i9vVar.inflateView(layoutInflater, viewGroup);
        }
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LiveVoiceInternalSquareApi.notifyLeaveVoiceSquare();
        SVGALoader.clear();
        System.gc();
    }
}
