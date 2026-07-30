package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;

/* JADX INFO: loaded from: classes4.dex */
public class kbg extends lk2<gbg> {

    /* JADX INFO: renamed from: j */
    public BLiveAccommpanyTasks f122235j;

    /* JADX INFO: renamed from: k */
    public String f122236k;

    /* JADX INFO: renamed from: l */
    public int f122237l;

    /* JADX INFO: renamed from: m */
    public String f122238m;

    /* JADX INFO: renamed from: n */
    public nk2 f122239n;

    public kbg(bsm bsmVar) {
        super(bsmVar);
        this.f122239n = (nk2) wq4.m205013a(vwb.m200324f0(new z9g(), new c8g(), new j8g(), new g8g()));
        mo51532C(new gbg(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m145298k4(Boolean bool) {
        if (bool.booleanValue()) {
            ((gbg) this.viewModel).mo71838p();
            m206028F2().FansClubEvent.hideFansClubCompanyDialog().m172467p();
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m145299l4(ep50 ep50Var) {
        if (ep50Var.m117603c() != null) {
            this.f122235j = ep50Var.m117603c();
            this.f122236k = ep50Var.m117602b();
            this.f122237l = ep50Var.m117601a();
            ((gbg) this.viewModel).m71834E();
            ((gbg) this.viewModel).m125141O(ep50Var.m117604d(), ep50Var.m117603c());
            this.f122239n.m159824j(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public void m145300m4() {
        this.f122238m = m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId()) ? "fanbase_accompany" : "fanbase_accompany_and_join_fanbase";
        this.f122239n.mo159820b(vwb.m200311Y(this, new e30() { // from class: l.jbg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117190a.m145298k4((Boolean) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansClubEvent.showFansClubSendGiftDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ibg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112363a.m145299l4((ep50) obj);
            }
        }));
    }
}
