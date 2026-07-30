package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;

/* JADX INFO: loaded from: classes4.dex */
public class ycg extends tk2<ucg> {

    /* JADX INFO: renamed from: j */
    public BLiveAccommpanyTasks f198504j;

    /* JADX INFO: renamed from: k */
    public String f198505k;

    /* JADX INFO: renamed from: l */
    public int f198506l;

    /* JADX INFO: renamed from: m */
    public String f198507m;

    /* JADX INFO: renamed from: n */
    public vk2 f198508n;

    public ycg(dum dumVar) {
        super(dumVar);
        this.f198508n = (vk2) vr4.m202472a(jyb.m147507f0(new nbg(), new q9g(), new x9g(), new u9g()));
        mo52715C(new ucg(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m215149k4(Boolean bool) {
        if (bool.booleanValue()) {
            ((ucg) this.viewModel).mo73021p();
            m213811F2().FansClubEvent.hideFansClubCompanyDialog().m199277p();
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m215150l4(kx50 kx50Var) {
        if (kx50Var.m151807c() != null) {
            this.f198504j = kx50Var.m151807c();
            this.f198505k = kx50Var.m151806b();
            this.f198506l = kx50Var.m151805a();
            ((ucg) this.viewModel).m73017E();
            ((ucg) this.viewModel).m195397O(kx50Var.m151808d(), kx50Var.m151807c());
            this.f198508n.m201565j(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: m4 */
    public void m215151m4() {
        this.f198507m = m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId()) ? "fanbase_accompany" : "fanbase_accompany_and_join_fanbase";
        this.f198508n.mo168854b(jyb.m147494Y(this, new y20() { // from class: l.xcg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193309a.m215149k4((Boolean) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansClubEvent.showFansClubSendGiftDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wcg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188473a.m215150l4((kx50) obj);
            }
        }));
    }
}
