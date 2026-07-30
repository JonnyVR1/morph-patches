package p002l;

import l.bwr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z8g extends mag {
    public z8g(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p002l.mag
    /* JADX INFO: renamed from: C4 */
    public void mo10218C4() {
        super.mo10218C4();
        z2(new x8g(this.f22036e, this));
        ((r6g) ((bwr) this).viewModel).f18392y.f5073c.m6406k();
        z2(new jgg(this.f22036e));
        z2(new mfg(this.f22036e));
    }

    @Override // p002l.mag
    /* JADX INFO: renamed from: F4 */
    public void mo17781F4() {
        if (this.f15299j.f13607b != null) {
            m25548F2().FansClubMedalEvent.showDialog().j(Boolean.TRUE);
        }
    }

    @Override // p002l.mag, p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        m25548F2().FansRecallEvent.hideFansRecallSelectPanel().j(Boolean.TRUE);
        super.mo9256O3();
    }

    @Override // p002l.mag
    /* JADX INFO: renamed from: t */
    public void mo17783t() {
        super.mo17783t();
    }
}
