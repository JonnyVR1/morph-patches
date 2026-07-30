package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;

/* JADX INFO: loaded from: classes5.dex */
public class zsr extends x6s<ho2, wsr> {
    public zsr(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new wsr(act(), this));
    }

    /* JADX INFO: renamed from: T3 */
    public void m220077T3(String str) {
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(1501).m122563g(vwb.m200299M(-1)));
        ((wsr) this.viewModel).mo71838p();
        pul0.m171445c(this);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m220078U3(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        ((wsr) this.viewModel).m205529K(voiceAnchorGrowthMessage);
        pul0.m171446d(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().f170515y1).subscribe(ffw.m121197h(new e30() { // from class: l.ysr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199807a.m220078U3((LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage) obj);
            }
        }));
    }
}
