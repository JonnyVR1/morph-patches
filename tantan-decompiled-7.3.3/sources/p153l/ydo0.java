package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;

/* JADX INFO: loaded from: classes5.dex */
public class ydo0 extends i6t<rwn0, ceo0> {
    public ydo0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new ceo0());
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m215266K3(BLiveVoiceCall bLiveVoiceCall) {
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf((i == 0 || i == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public void m215267L3() {
        if (((rwn0) m213810E2()).m183411P2().m136873l(zrv.f205799a.m207631D0()) == null) {
            bzm0 bzm0Var = new bzm0();
            bzm0Var.m107186g(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION);
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(bzm0Var);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public void m215268M3() {
        ydn0.m215261n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m215269N3() {
        ((ceo0) this.viewModel).m109447l(((rwn0) m213810E2()).m183411P2().m136872k(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) != null, jyb.m147522n(((rwn0) m213810E2()).m183411P2().m136877p(), new qcj() { // from class: l.xdo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ydo0.m215266K3((BLiveVoiceCall) obj);
            }
        }).size() == 7);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138862g3(m213811F2().VoiceCallEvent.nineMicApplyCallChooseEvent(), new x20() { // from class: l.wdo0
            @Override // p153l.x20
            public final void call() {
                this.f188625a.m215269N3();
            }
        });
    }
}
