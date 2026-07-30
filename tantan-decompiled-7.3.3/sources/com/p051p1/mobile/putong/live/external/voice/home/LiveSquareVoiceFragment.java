package com.p051p1.mobile.putong.live.external.voice.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import p153l.i4g0;
import p153l.jyb;
import p153l.nus;
import p153l.q4f;
import p153l.tpn0;
import p153l.x20;
import p153l.y20;
import p153l.zpn0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareVoiceFragment extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public zpn0 f47270A;

    /* JADX INFO: renamed from: z */
    public tpn0 f47271z;

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m72155l5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public void m72156m5() {
        if (NullChecker.m82486a(this.f47271z)) {
            this.f47271z.mo70300n();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (i == 2) {
            this.f47271z.mo160241L2(!z);
        }
        this.f47271z.m192181N3(z);
        if (z) {
            m72157n5();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f47271z = new tpn0(this, new nus(new LiveHomeEventBus(), this));
        zpn0 zpn0Var = new zpn0(act());
        this.f47270A = zpn0Var;
        this.f47271z.mo52715C(zpn0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.f7u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareVoiceFragment.m72155l5((Bundle) obj);
            }
        }, new x20() { // from class: l.g7u
            @Override // p153l.x20
            public final void call() {
                this.f102622a.m72156m5();
            }
        });
        this.f47271z.mo70284I2();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47270A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n5 */
    public void m72157n5() {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_audio_explore_recommend";
        i4g0.m138517o(q4fVar, jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("audioroom_entertainment", "entertainment_version"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
