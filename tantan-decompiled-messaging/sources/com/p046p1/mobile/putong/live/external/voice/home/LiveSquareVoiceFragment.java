package com.p046p1.mobile.putong.live.external.voice.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p149l.d30;
import p149l.e30;
import p149l.l3f;
import p149l.mss;
import p149l.pgn0;
import p149l.vgn0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareVoiceFragment extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public vgn0 f46422A;

    /* JADX INFO: renamed from: z */
    public pgn0 f46423z;

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m70972l5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public void m70973m5() {
        if (NullChecker.m81303a(this.f46423z)) {
            this.f46423z.mo69117n();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (i == 2) {
            this.f46423z.mo151645L2(!z);
        }
        this.f46423z.m168804N3(z);
        if (z) {
            m70974n5();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f46423z = new pgn0(this, new mss(new LiveHomeEventBus(), this));
        vgn0 vgn0Var = new vgn0(act());
        this.f46422A = vgn0Var;
        this.f46423z.mo51532C(vgn0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.e5u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareVoiceFragment.m70972l5((Bundle) obj);
            }
        }, new d30() { // from class: l.f5u
            @Override // p149l.d30
            public final void call() {
                this.f95201a.m70973m5();
            }
        });
        this.f46423z.mo69101I2();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46422A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n5 */
    public void m70974n5() {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_audio_explore_recommend";
        zvf0.m220393o(l3fVar, vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("audioroom_entertainment", "entertainment_version"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
