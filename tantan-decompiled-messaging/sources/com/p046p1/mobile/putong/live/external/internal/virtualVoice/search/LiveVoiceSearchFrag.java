package com.p046p1.mobile.putong.live.external.internal.virtualVoice.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.d30;
import p149l.e30;
import p149l.hav;
import p149l.z9v;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceSearchFrag extends LiveBaseFrag {
    private z9v presenter;
    private hav viewModel;

    /* JADX INFO: renamed from: O4 */
    public static LiveBaseFrag m69863O4() {
        return new LiveVoiceSearchFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m69864P4(Bundle bundle) {
        this.presenter.m217699C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.viewModel = new hav(this);
        z9v z9vVar = new z9v(this);
        this.presenter = z9vVar;
        z9vVar.mo51532C(this.viewModel);
        creates(new e30() { // from class: l.q9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153484a.m69864P4((Bundle) obj);
            }
        }, new d30() { // from class: l.r9v
            @Override // p149l.d30
            public final void call() {
                this.f158451a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.viewModel.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_audio_search";
    }
}
