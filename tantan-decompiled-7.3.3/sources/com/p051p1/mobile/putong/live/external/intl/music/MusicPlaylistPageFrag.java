package com.p051p1.mobile.putong.live.external.intl.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.c020;
import p153l.q020;

/* JADX INFO: loaded from: classes9.dex */
public class MusicPlaylistPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public q020 f46552A;

    /* JADX INFO: renamed from: z */
    public c020 f46553z;

    /* JADX INFO: renamed from: M4 */
    public static LiveBaseFrag m71419M4() {
        return new MusicPlaylistPageFrag();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46553z = new c020(this);
        q020 q020Var = new q020(act());
        this.f46552A = q020Var;
        this.f46553z.mo52715C(q020Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46553z.m107311s2();
        ((PutongAct) act()).setTransparentStatusBar();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46552A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f46553z.m107315w2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_local_music_play_main";
    }
}
