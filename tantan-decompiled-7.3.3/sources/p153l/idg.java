package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class idg extends tk2<cdg> {

    /* JADX INFO: renamed from: j */
    public String f114504j;

    public idg(dum dumVar) {
        super(dumVar);
        mo52715C(new cdg(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m139524q4(vxj0 vxj0Var) {
        m139525m4();
    }

    /* JADX INFO: renamed from: m4 */
    public void m139525m4() {
        ((cdg) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m139527o4() {
        seg.m185539g(this, ((cdg) this.viewModel).f81208m.getHeight());
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m139528p4(o6g o6gVar) {
        if (o6gVar.m166226a() != null) {
            this.f114504j = "fanbase_page";
            m139526n4(o6gVar.m166227b(), o6gVar.m166226a(), true);
        } else {
            this.f114504j = "other";
            m139529r4(o6gVar.m166227b(), false);
        }
        seg.m185540h(this, mo78457R2(), this.f114504j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public final void m139529r4(final boolean z, final boolean z2) {
        duringCreated(m213810E2().f148254B.m209625T()).subscribe(dhw.m115829h(new y20() { // from class: l.hdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108987a.m139526n4(z, z2, (aeg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m139530s4() {
        dum<? extends T> dumVar = this.f196918e;
        V v2 = this.viewModel;
        m153103z2(new n6g(dumVar, this, ((cdg) v2).f81212q, ((cdg) v2).f81194B, ((cdg) v2).f81195C));
        dum<? extends T> dumVar2 = this.f196918e;
        V v3 = this.viewModel;
        m153103z2(new v6g(dumVar2, this, ((cdg) v3).f81202J, ((cdg) v3).f81203K, ((cdg) v3).f81205M));
        dum<? extends T> dumVar3 = this.f196918e;
        V v4 = this.viewModel;
        m153103z2(new q6g(dumVar3, ((cdg) v4).f81218w, ((cdg) v4).f81220y, ((cdg) v4).f81221z, ((cdg) v4).f81193A, true));
        dum<? extends T> dumVar4 = this.f196918e;
        V v5 = this.viewModel;
        m153103z2(new x6g(dumVar4, this, ((cdg) v5).f81198F, ((cdg) v5).f81199G, ((cdg) v5).f81200H, ((cdg) v5).f81201I, this.f114504j));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansClubEvent.showFansClubCompanyDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.edg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93509a.m139528p4((o6g) obj);
            }
        }));
        duringCreated(m213811F2().FansClubEvent.hideFansClubCompanyDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fdg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98473a.m139524q4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m139526n4(boolean z, aeg aegVar, boolean z2) {
        ((cdg) this.viewModel).m73017E();
        ((cdg) this.viewModel).m109200N(z, z2);
        m191485f4(aegVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m139532u4() {
        ((cdg) this.viewModel).f81208m.post(new Runnable() { // from class: l.gdg
            @Override // java.lang.Runnable
            public final void run() {
                this.f103710a.m139527o4();
            }
        });
    }
}
