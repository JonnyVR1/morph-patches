package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class ybu extends x6s<ho2, wbu> {
    public ybu(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new wbu(this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().LiveTipEvent.showTip().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xbu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191965a.m213979T3((ubu) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final void m213979T3(ubu ubuVar) {
        int i = ubuVar.f175753a;
        if (i == 0) {
            ((wbu) this.viewModel).m202585I(m206027E2().m132146l0().m60124fp().url, m206027E2().m132146l0().name, ubuVar.f175756d, ubuVar.f175757e);
        } else if (i == 1) {
            ((wbu) this.viewModel).m202585I(ubuVar.f175754b, ubuVar.f175755c, ubuVar.f175756d, ubuVar.f175757e);
        }
    }
}
