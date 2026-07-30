package com.p046p1.mobile.putong.live.external.intl.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.is10;
import p149l.ur10;

/* JADX INFO: loaded from: classes13.dex */
public class MusicPlaylistPageFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public is10 f45704A;

    /* JADX INFO: renamed from: z */
    public ur10 f45705z;

    /* JADX INFO: renamed from: M4 */
    public static LiveBaseFrag m70236M4() {
        return new MusicPlaylistPageFrag();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45705z = new ur10(this);
        is10 is10Var = new is10(act());
        this.f45704A = is10Var;
        this.f45705z.mo51532C(is10Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45705z.m195031s2();
        ((PutongAct) act()).setTransparentStatusBar();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45704A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f45705z.m195034w2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_local_music_play_main";
    }
}
