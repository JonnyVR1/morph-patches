package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class qzs implements kwl {

    /* JADX INFO: renamed from: a */
    public pzs f160295a;

    /* JADX INFO: renamed from: b */
    public tzs f160296b;

    /* JADX INFO: renamed from: a */
    public void m178827a(hti htiVar) {
        if (!zrv.f205799a.m207699v0()) {
            htiVar.m137083h(false);
            return;
        }
        this.f160295a = new pzs();
        tzs tzsVar = new tzs();
        this.f160296b = tzsVar;
        this.f160295a.m174605n(tzsVar);
        this.f160296b.mo22064i1(this.f160295a);
        this.f160295a.m174614x(htiVar);
        htiVar.m137083h(true);
        this.f160295a.m174603G1();
    }

    @Override // p153l.kwl
    public void dismiss() {
        if (NullChecker.m82486a(this.f160295a)) {
            this.f160295a.m174604K0(true, true);
            this.f160295a = null;
            this.f160296b = null;
        }
    }

    @Override // p153l.kwl
    /* JADX INFO: renamed from: p */
    public boolean mo124927p(hti htiVar) {
        if (htiVar == null || htiVar.m137080e() == null || htiVar.m137080e().mo183435j() == null) {
            return false;
        }
        m178827a(htiVar);
        return true;
    }

    @Override // p153l.kwl
    /* JADX INFO: renamed from: q */
    public void mo124928q() {
        pzs pzsVar = this.f160295a;
        if (pzsVar != null) {
            pzsVar.m174607q();
            this.f160295a = null;
            this.f160296b = null;
        }
    }
}
