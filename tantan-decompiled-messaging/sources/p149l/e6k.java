package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;

/* JADX INFO: loaded from: classes5.dex */
public class e6k extends h4t<nnn0, VoiceGrabHatFloatViewMode> {
    public e6k(bsm<? extends nnn0> bsmVar, VoiceGrabHatFloatViewMode voiceGrabHatFloatViewMode) {
        super(bsmVar);
        mo51532C(voiceGrabHatFloatViewMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m115066L3(Boolean bool) {
        ((VoiceGrabHatFloatViewMode) this.viewModel).setVisible(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public void m115067K3() {
        zvf0.m220399u("e_audio_hat_game_display", ((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("live_id", ((nnn0) m206027E2()).m149814k()), vwb.m200311Y("anchor_id", ((nnn0) m206027E2()).m132146l0().f56011id));
        m206028F2().VoiceGrabHatEvent.openHatCpDialog().mo172463j(Boolean.FALSE);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceGrabHatEvent.openGrabHatGame(), new e30() { // from class: l.d6k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84631a.m115066L3((Boolean) obj);
            }
        });
    }
}
