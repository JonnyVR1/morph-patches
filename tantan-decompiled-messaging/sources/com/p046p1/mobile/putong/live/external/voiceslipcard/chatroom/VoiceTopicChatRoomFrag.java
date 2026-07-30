package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTopicChatRoomFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.d30;
import p149l.e30;
import p149l.lss;
import p149l.mkd0;
import p149l.mss;
import p149l.pgn0;
import p149l.s7m;
import p149l.s9s;
import p149l.uvp;
import p149l.vgn0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceTopicChatRoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public s7m f46531A;

    /* JADX INFO: renamed from: z */
    public lss f46532z;

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m71143O4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: P4 */
    public static VoiceTopicChatRoomFrag m71144P4(String str, String str2) {
        VoiceTopicChatRoomFrag voiceTopicChatRoomFragM71145Q4 = m71145Q4();
        Bundle bundle = new Bundle();
        bundle.putString("frag_from", str);
        bundle.putString("default_select_tab", str2);
        voiceTopicChatRoomFragM71145Q4.setArguments(bundle);
        return voiceTopicChatRoomFragM71145Q4;
    }

    /* JADX INFO: renamed from: Q4 */
    public static VoiceTopicChatRoomFrag m71145Q4() {
        return new VoiceTopicChatRoomFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f46532z.mo69117n();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m71146R4() {
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.wvo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188271a.m71147S4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m71147S4(Boolean bool) {
        s9s.f163232f.m134389v(!bool.booleanValue());
        m71148T4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: T4 */
    public final void m71148T4(boolean z) {
        if (z) {
            mo29638J4().m109036l();
        } else {
            mo29638J4().m109035k();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f46532z = new pgn0(this, new mss(new LiveHomeEventBus(), this));
        vgn0 vgn0Var = new vgn0(act());
        this.f46531A = vgn0Var;
        this.f46532z.mo51532C(vgn0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f46532z.mo69101I2();
        m71146R4();
        creates(new e30() { // from class: l.uvo0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceTopicChatRoomFrag.m71143O4((Bundle) obj);
            }
        }, new d30() { // from class: l.vvo0
            @Override // p149l.d30
            public final void call() {
                this.f183246a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        uvp.INSTANCE.m196085a(this.f46532z);
        this.f46532z.mo70198T();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46531A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f46532z.mo151645L2(z);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
