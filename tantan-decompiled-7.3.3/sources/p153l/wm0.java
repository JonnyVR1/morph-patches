package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;

/* JADX INFO: loaded from: classes5.dex */
public class wm0 extends y8s<jlm0, cn0> {

    /* JADX INFO: renamed from: j */
    public dm0 f189756j;

    public wm0(dum<? extends jlm0> dumVar, dm0 dm0Var) {
        super(dumVar);
        mo52715C(new cn0(this));
        this.f189756j = dm0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m207082T3(vxj0 vxj0Var) {
        ((cn0) this.viewModel).m73017E();
    }

    /* JADX INFO: renamed from: U3 */
    public void m207083U3(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        this.f189756j.m163762N3(bLiveVoiceGrabHatGame);
        m213811F2().VoiceGrabHatEvent.openHatCpDialog().mo199273j(Boolean.FALSE);
        ((cn0) this.viewModel).mo73021p();
        ain0.m98000f().m98006i(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m207084V3() {
        i4g0.m138523u("e_audio_hat_game_start_confirm", "p_anchor_audio_room", jyb.m147494Y("live_id", ((jlm0) m213810E2()).m202191k()), jyb.m147494Y("anchor_id", ((jlm0) m213810E2()).m168532l0().f56859id));
        duringCreated(eln0.m121251i(((jlm0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.vm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184656a.m207083U3((BLiveVoiceGrabHatGame) obj);
            }
        }, new r5k()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceGrabHatEvent.openStartGameDialog(), new y20() { // from class: l.um0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179591a.m207082T3((vxj0) obj);
            }
        });
    }
}
