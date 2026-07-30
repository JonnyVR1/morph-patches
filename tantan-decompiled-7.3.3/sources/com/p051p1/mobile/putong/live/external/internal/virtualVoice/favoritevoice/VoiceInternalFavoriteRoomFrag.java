package com.p051p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.lnn0;
import p153l.onn0;
import p153l.zeu;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceInternalFavoriteRoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public lnn0 f46344A;

    /* JADX INFO: renamed from: z */
    public onn0 f46345z;

    /* JADX INFO: renamed from: M4 */
    public static VoiceInternalFavoriteRoomFrag m71042M4() {
        return new VoiceInternalFavoriteRoomFrag();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f46345z = new onn0();
        lnn0 lnn0Var = new lnn0(act());
        this.f46344A = lnn0Var;
        lnn0Var.mo52715C(this.f46345z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f46344A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46345z.m168341f();
        this.f46344A.m154991h0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46345z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return zeu.f204080g;
    }
}
