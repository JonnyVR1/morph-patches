package com.p051p1.mobile.putong.live.external.internal.virtualVoice.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.acv;
import p153l.icv;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceSearchFrag extends LiveBaseFrag {
    private acv presenter;
    private icv viewModel;

    /* JADX INFO: renamed from: O4 */
    public static LiveBaseFrag m71046O4() {
        return new LiveVoiceSearchFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m71047P4(Bundle bundle) {
        this.presenter.m96984C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.viewModel = new icv(this);
        acv acvVar = new acv(this);
        this.presenter = acvVar;
        acvVar.mo52715C(this.viewModel);
        creates(new y20() { // from class: l.rbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162042a.m71047P4((Bundle) obj);
            }
        }, new x20() { // from class: l.sbv
            @Override // p153l.x20
            public final void call() {
                this.f167180a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.viewModel.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_audio_search";
    }
}
