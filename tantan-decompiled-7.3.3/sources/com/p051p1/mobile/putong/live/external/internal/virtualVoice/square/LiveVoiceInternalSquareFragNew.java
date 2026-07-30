package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantan.library.svga.SVGALoader;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.k9v;
import p153l.nus;
import p153l.o8v;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalSquareFragNew extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public o8v f46354A;

    /* JADX INFO: renamed from: z */
    public k9v f46355z;

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        super.mo70115Y4();
        this.f46354A.m166629P2();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo70233b5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: c5 */
    public boolean mo70234c5() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46354A = new o8v(new nus(new LiveHomeEventBus(), this));
        k9v k9vVar = new k9v();
        this.f46355z = k9vVar;
        this.f46354A.m166633y2(k9vVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f46354A.m166632T2(arguments.getString("source"));
            this.f46354A.m166631S2(arguments.getString("tab_id", null));
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: d5 */
    public boolean mo70235d5() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        o8v o8vVar = this.f46354A;
        if (o8vVar != null) {
            o8vVar.m166622E2();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        o8v o8vVar = this.f46354A;
        if (o8vVar != null) {
            o8vVar.m166623F2(this.tabInfo);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        k9v k9vVar = this.f46355z;
        if (k9vVar != null) {
            return k9vVar.inflateView(layoutInflater, viewGroup);
        }
        return null;
    }

    /* JADX INFO: renamed from: k5 */
    public nus m71056k5() {
        o8v o8vVar = this.f46354A;
        if (o8vVar != null) {
            return o8vVar.m166620B2();
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
