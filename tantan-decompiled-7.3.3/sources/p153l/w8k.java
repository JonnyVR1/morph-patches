package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;

/* JADX INFO: loaded from: classes5.dex */
public class w8k extends i6t<rwn0, VoiceGrabHatFloatViewMode> {
    public w8k(dum<? extends rwn0> dumVar, VoiceGrabHatFloatViewMode voiceGrabHatFloatViewMode) {
        super(dumVar);
        mo52715C(voiceGrabHatFloatViewMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m205409L3(Boolean bool) {
        ((VoiceGrabHatFloatViewMode) this.viewModel).setVisible(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m205410K3() {
        i4g0.m138523u("e_audio_hat_game_display", ((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id));
        m213811F2().VoiceGrabHatEvent.openHatCpDialog().mo199273j(Boolean.FALSE);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceGrabHatEvent.openGrabHatGame(), new y20() { // from class: l.v8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182879a.m205409L3((Boolean) obj);
            }
        });
    }
}
