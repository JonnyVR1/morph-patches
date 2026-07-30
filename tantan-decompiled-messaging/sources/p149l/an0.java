package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;

/* JADX INFO: loaded from: classes5.dex */
public class an0 extends x6s<fcm0, gn0> {

    /* JADX INFO: renamed from: j */
    public hm0 f70696j;

    public an0(bsm<? extends fcm0> bsmVar, hm0 hm0Var) {
        super(bsmVar);
        mo51532C(new gn0(this));
        this.f70696j = hm0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m97698T3(soj0 soj0Var) {
        ((gn0) this.viewModel).m71834E();
    }

    /* JADX INFO: renamed from: U3 */
    public void m97699U3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        this.f70696j.m140987N3(bLiveVoiceGrabHatGame);
        m206028F2().VoiceGrabHatEvent.openHatCpDialog().mo172463j(Boolean.FALSE);
        ((gn0) this.viewModel).mo71838p();
        w8n0.m202192f().m202198i(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m97700V3() {
        zvf0.m220399u("e_audio_hat_game_start_confirm", "p_anchor_audio_room", vwb.m200311Y("live_id", ((fcm0) m206027E2()).m149814k()), vwb.m200311Y("anchor_id", ((fcm0) m206027E2()).m132146l0().f56011id));
        duringCreated(acn0.m95827i(((fcm0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.zm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203684a.m97699U3((BLiveVoiceGrabHatGame) obj);
            }
        }, new z2k()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceGrabHatEvent.openStartGameDialog(), new e30() { // from class: l.ym0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198953a.m97698T3((soj0) obj);
            }
        });
    }
}
