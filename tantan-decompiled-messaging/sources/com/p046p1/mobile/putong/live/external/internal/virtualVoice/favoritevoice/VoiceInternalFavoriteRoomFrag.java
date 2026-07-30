package com.p046p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.hen0;
import p149l.ken0;
import p149l.ycu;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceInternalFavoriteRoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public hen0 f45496A;

    /* JADX INFO: renamed from: z */
    public ken0 f45497z;

    /* JADX INFO: renamed from: M4 */
    public static VoiceInternalFavoriteRoomFrag m69859M4() {
        return new VoiceInternalFavoriteRoomFrag();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f45497z = new ken0();
        hen0 hen0Var = new hen0(act());
        this.f45496A = hen0Var;
        hen0Var.mo51532C(this.f45497z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f45496A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45497z.m145800f();
        this.f45496A.m130662h0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45497z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return ycu.f197489g;
    }
}
