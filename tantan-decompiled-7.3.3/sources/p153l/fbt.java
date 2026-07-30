package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class fbt implements kwl {

    /* JADX INFO: renamed from: a */
    public ebt f98144a;

    /* JADX INFO: renamed from: a */
    public static boolean m124926a() {
        return zrv.f205799a.m207645P(zrv.f205803e) && zrv.m221193k().m203501Q6();
    }

    @Override // p153l.kwl
    public void dismiss() {
        ebt ebtVar = this.f98144a;
        if (ebtVar != null) {
            ebtVar.m120238r();
        }
    }

    @Override // p153l.kwl
    /* JADX INFO: renamed from: p */
    public boolean mo124927p(hti htiVar) {
        if (!m124926a() || !zrv.f205799a.m207699v0() || !nti.m164730d().m164732b(zrv.f205803e)) {
            return false;
        }
        this.f98144a = new ebt();
        hbt hbtVar = new hbt();
        this.f98144a.m120234n(hbtVar);
        hbtVar.mo22064i1(this.f98144a);
        return this.f98144a.m120236p(htiVar);
    }

    @Override // p153l.kwl
    /* JADX INFO: renamed from: q */
    public void mo124928q() {
        ebt ebtVar = this.f98144a;
        if (ebtVar != null) {
            ebtVar.m120237q();
        }
    }
}
