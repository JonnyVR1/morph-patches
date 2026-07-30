package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTopicChatRoomFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.iam;
import p153l.mus;
import p153l.nus;
import p153l.psd0;
import p153l.tbs;
import p153l.tpn0;
import p153l.uxp;
import p153l.x20;
import p153l.y20;
import p153l.zpn0;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceTopicChatRoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public iam f47379A;

    /* JADX INFO: renamed from: z */
    public mus f47380z;

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m72326O4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: P4 */
    public static VoiceTopicChatRoomFrag m72327P4(String str, String str2) {
        VoiceTopicChatRoomFrag voiceTopicChatRoomFragM72328Q4 = m72328Q4();
        Bundle bundle = new Bundle();
        bundle.putString("frag_from", str);
        bundle.putString("default_select_tab", str2);
        voiceTopicChatRoomFragM72328Q4.setArguments(bundle);
        return voiceTopicChatRoomFragM72328Q4;
    }

    /* JADX INFO: renamed from: Q4 */
    public static VoiceTopicChatRoomFrag m72328Q4() {
        return new VoiceTopicChatRoomFrag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f47380z.mo70300n();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m72329R4() {
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.a5p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68631a.m72330S4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m72330S4(Boolean bool) {
        tbs.f172993f.m143720v(!bool.booleanValue());
        m72331T4(bool.booleanValue());
    }

    /* JADX INFO: renamed from: T4 */
    public final void m72331T4(boolean z) {
        if (z) {
            mo30636J4().m152777l();
        } else {
            mo30636J4().m152776k();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f47380z = new tpn0(this, new nus(new LiveHomeEventBus(), this));
        zpn0 zpn0Var = new zpn0(act());
        this.f47379A = zpn0Var;
        this.f47380z.mo52715C(zpn0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f47380z.mo70284I2();
        m72329R4();
        creates(new y20() { // from class: l.y4p0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceTopicChatRoomFrag.m72326O4((Bundle) obj);
            }
        }, new x20() { // from class: l.z4p0
            @Override // p153l.x20
            public final void call() {
                this.f202971a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        uxp.INSTANCE.m198508a(this.f47380z);
        this.f47380z.mo71381T();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f47379A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f47380z.mo160241L2(z);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_audio_explore_recommend";
    }
}
