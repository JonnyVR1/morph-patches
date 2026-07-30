package p002l;

import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import l.bwr;
import l.e30;
import l.ffw;
import l.qib0;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kbg extends lk2<gbg> {

    /* JADX INFO: renamed from: j */
    public BLiveAccommpanyTasks f14271j;

    /* JADX INFO: renamed from: k */
    public String f14272k;

    /* JADX INFO: renamed from: l */
    public int f14273l;

    /* JADX INFO: renamed from: m */
    public String f14274m;

    /* JADX INFO: renamed from: n */
    public nk2 f14275n;

    public kbg(bsm bsmVar) {
        super(bsmVar);
        this.f14275n = (nk2) wq4.m25288a(vwb.f0(new wq4[]{new z9g(), new c8g(), new j8g(), new g8g()}));
        C(new gbg(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m16591k4(Boolean bool) {
        if (bool.booleanValue()) {
            ((gbg) ((bwr) this).viewModel).mo5216p();
            m25548F2().FansClubEvent.hideFansClubCompanyDialog().p();
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m16592l4(ep50 ep50Var) {
        if (ep50Var.m12643c() != null) {
            this.f14271j = ep50Var.m12643c();
            this.f14272k = ep50Var.m12642b();
            this.f14273l = ep50Var.m12641a();
            ((gbg) ((bwr) this).viewModel).m5211E();
            ((gbg) ((bwr) this).viewModel).m13713O(ep50Var.m12644d(), ep50Var.m12643c());
            this.f14275n.m18829j(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m4 */
    public void m16593m4() {
        this.f14274m = m25547E2().m14597r0().c(qib0.b0.a.userId()) ? "fanbase_accompany" : "fanbase_accompany_and_join_fanbase";
        this.f14275n.mo18825b(vwb.Y(this, new e30() { // from class: l.jbg
            public final void call(Object obj) {
                this.f13675a.m16591k4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m16594t() {
        super.t();
        duringCreated((c) m25548F2().FansClubEvent.showFansClubSendGiftDialog().g()).subscribe(ffw.d(new e30() { // from class: l.ibg
            public final void call(Object obj) {
                this.f13131a.m16592l4((ep50) obj);
            }
        }));
    }
}
