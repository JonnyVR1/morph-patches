package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class u4o0 extends h4t<nnn0, y4o0> {
    public u4o0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new y4o0());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m191761K3(BLiveVoiceCall bLiveVoiceCall) {
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf((i == 0 || i == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public void m191762L3() {
        if (((nnn0) m206027E2()).m160249P2().m102063l(ypv.f199493a.m199309D0()) == null) {
            xpm0 xpm0Var = new xpm0();
            xpm0Var.m210513g(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION);
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(xpm0Var);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public void m191763M3() {
        u4n0.m191755n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m191764N3() {
        ((y4o0) this.viewModel).m212941l(((nnn0) m206027E2()).m160249P2().m102062k(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) != null, vwb.m200339n(((nnn0) m206027E2()).m160249P2().m102067p(), new w9j() { // from class: l.t4o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u4o0.m191761K3((BLiveVoiceCall) obj);
            }
        }).size() == 7);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129303g3(m206028F2().VoiceCallEvent.nineMicApplyCallChooseEvent(), new d30() { // from class: l.s4o0
            @Override // p149l.d30
            public final void call() {
                this.f162457a.m191764N3();
            }
        });
    }
}
