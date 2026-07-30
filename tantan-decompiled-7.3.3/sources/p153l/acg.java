package p153l;

import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public abstract class acg extends tk2<f8g> {

    /* JADX INFO: renamed from: j */
    public final x7g f69704j;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    public acg(dum dumVar) {
        super(dumVar);
        this.f69704j = m213810E2().f148254B;
        mo52715C(new f8g(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m96819A4(Boolean bool) {
        ((f8g) this.viewModel).m124525L();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m96821j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m96824m4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m96830y4(vxj0 vxj0Var) {
        m96838s4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: B4 */
    public void m96831B4() {
        m214779N3(m213810E2().m168519h0()).filter(new qcj() { // from class: l.pbg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.rbg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162020a.m96840u4((User) obj);
            }
        }, new y20() { // from class: l.sbg
            @Override // p153l.y20
            public final void call(Object obj) {
                acg.m96821j4((Throwable) obj);
            }
        }));
        m214779N3(this.f69704j.m209624S()).doOnSubscribe(new x20() { // from class: l.tbg
            @Override // p153l.x20
            public final void call() {
                this.f172921a.m96841v4();
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ubg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178306a.m96842w4((v9g) obj);
            }
        }, new y20() { // from class: l.vbg
            @Override // p153l.y20
            public final void call(Object obj) {
                acg.m96824m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m96833D4(Boolean bool) {
        if (m96839t4()) {
            ((f8g) this.viewModel).m73017E();
            return true;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        m213811F2().FansClubEntryEvent.openEntry().mo199273j(Boolean.TRUE);
        return false;
    }

    /* JADX INFO: renamed from: E4 */
    public void m96834E4() {
        ((f8g) this.viewModel).f97724m.post(new Runnable() { // from class: l.qbg
            @Override // java.lang.Runnable
            public final void run() {
                this.f156474a.m96843x4();
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((f8g) this.viewModel).mo73024w();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m96831B4();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        x7g x7gVar = this.f69704j;
        if (x7gVar != null) {
            x7gVar.m209630Y();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m96838s4() {
        ((f8g) this.viewModel).m73022q(null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        this.f69704j.m209609D(m213815L2(), this, m213810E2().m168532l0().f56859id);
        super.mo73648t();
        duringCreated(m213811F2().FansClubEvent.showFansClubDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wbg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188247a.m96833D4((Boolean) obj);
            }
        }));
        duringCreated(m213811F2().FansClubEvent.hideFansClubDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xbg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193160a.m96830y4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().FansRecallEvent.showFansRecallSelectPanel().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ybg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198306a.m96844z4((yhg) obj);
            }
        }));
        duringCreated(m213811F2().FansRecallEvent.hideFansRecallSelectPanel().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zbg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203668a.m96819A4((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: t4 */
    public final boolean m96839t4() {
        if (m213815L2()) {
            return true;
        }
        return (m213810E2().m168532l0() == null || m213810E2().m168546r0() == null || !m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId())) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m96840u4(User user) {
        ((f8g) this.viewModel).m124533T(user);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m96841v4() {
        ((f8g) this.viewModel).m124526M(m213815L2());
        ((f8g) this.viewModel).f97725n.m74089l0(false);
        ((f8g) this.viewModel).m124530Q();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m96842w4(v9g v9gVar) {
        ((f8g) this.viewModel).m124531R(v9gVar);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m96843x4() {
        seg.m185538f(this, ((f8g) this.viewModel).f97724m.getHeight() + qa00.m175859d(20.0f));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m96844z4(yhg yhgVar) {
        ((f8g) this.viewModel).m124532S(yhgVar);
    }

    /* JADX INFO: renamed from: C4 */
    public void mo96832C4() {
    }

    /* JADX INFO: renamed from: F4 */
    public void mo96835F4() {
    }
}
