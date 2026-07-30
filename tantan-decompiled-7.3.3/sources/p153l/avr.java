package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;

/* JADX INFO: loaded from: classes5.dex */
public class avr extends y8s<oo2, xur> {
    public avr(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new xur(act(), this));
    }

    /* JADX INFO: renamed from: T3 */
    public void m100510T3(String str) {
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(1501).m156157g(jyb.m147482M(-1)));
        ((xur) this.viewModel).mo73021p();
        t3m0.m189089c(this);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m100511U3(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        ((xur) this.viewModel).m213192K(voiceAnchorGrowthMessage);
        t3m0.m189090d(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().f71782y1).subscribe(dhw.m115829h(new y20() { // from class: l.zur
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206150a.m100511U3((LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage) obj);
            }
        }));
    }
}
