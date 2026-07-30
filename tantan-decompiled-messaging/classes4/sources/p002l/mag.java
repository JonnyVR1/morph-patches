package p002l;

import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.qib0;
import l.soj0;
import l.t100;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class mag extends lk2<r6g> {

    /* JADX INFO: renamed from: j */
    public final j6g f15299j;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    public mag(bsm bsmVar) {
        super(bsmVar);
        this.f15299j = m25547E2().f12141B;
        C(new r6g(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m17766A4(Boolean bool) {
        ((r6g) ((bwr) this).viewModel).m21787L();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m17768j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m17771m4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m17777y4(soj0 soj0Var) {
        m17782s4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public void m17778B4() {
        m25707N3(m25547E2().m14569h0()).filter(new w9j() { // from class: l.bag
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.dag
            public final void call(Object obj) {
                this.f9146a.m17785u4((User) obj);
            }
        }, new e30() { // from class: l.eag
            public final void call(Object obj) {
                mag.m17768j4((Throwable) obj);
            }
        }));
        m25707N3(this.f15299j.m15710S()).doOnSubscribe(new d30() { // from class: l.fag
            public final void call() {
                this.f10206a.m17786v4();
            }
        }).subscribe(ffw.e(new e30() { // from class: l.gag
            public final void call(Object obj) {
                this.f11320a.m17787w4((h8g) obj);
            }
        }, new e30() { // from class: l.hag
            public final void call(Object obj) {
                mag.m17771m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m17779D4(Boolean bool) {
        if (m17784t4()) {
            ((r6g) ((bwr) this).viewModel).m5211E();
            return true;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        m25548F2().FansClubEntryEvent.openEntry().j(Boolean.TRUE);
        return false;
    }

    /* JADX INFO: renamed from: E4 */
    public void m17780E4() {
        ((r6g) ((bwr) this).viewModel).f18380m.post(new Runnable() { // from class: l.cag
            @Override // java.lang.Runnable
            public final void run() {
                this.f8570a.m17788x4();
            }
        });
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((r6g) ((bwr) this).viewModel).mo5219w();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        m17778B4();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        j6g j6gVar = this.f15299j;
        if (j6gVar != null) {
            j6gVar.m15716Y();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m17782s4() {
        ((r6g) ((bwr) this).viewModel).m5217q(null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void mo17783t() {
        this.f15299j.m15695D(m25552L2(), this, ((DbObject) m25547E2().m14582l0()).id);
        super.t();
        duringCreated((c) m25548F2().FansClubEvent.showFansClubDialog().g()).subscribe(ffw.d(new e30() { // from class: l.iag
            public final void call(Object obj) {
                this.f13125a.m17779D4((Boolean) obj);
            }
        }));
        duringCreated((c) m25548F2().FansClubEvent.hideFansClubDialog().g()).subscribe(ffw.d(new e30() { // from class: l.jag
            public final void call(Object obj) {
                this.f13654a.m17777y4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().FansRecallEvent.showFansRecallSelectPanel().g()).subscribe(ffw.d(new e30() { // from class: l.kag
            public final void call(Object obj) {
                this.f14264a.m17789z4((kgg) obj);
            }
        }));
        duringCreated((c) m25548F2().FansRecallEvent.hideFansRecallSelectPanel().g()).subscribe(ffw.d(new e30() { // from class: l.lag
            public final void call(Object obj) {
                this.f14747a.m17766A4((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public final boolean m17784t4() {
        if (m25552L2()) {
            return true;
        }
        return (m25547E2().m14582l0() == null || m25547E2().m14597r0() == null || !m25547E2().m14597r0().c(qib0.b0.a.userId())) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m17785u4(User user) {
        ((r6g) ((bwr) this).viewModel).m21795T(user);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m17786v4() {
        ((r6g) ((bwr) this).viewModel).m21788M(m25552L2());
        ((r6g) ((bwr) this).viewModel).f18381n.m6425l0(false);
        ((r6g) ((bwr) this).viewModel).m21792Q();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m17787w4(h8g h8gVar) {
        ((r6g) ((bwr) this).viewModel).m21793R(h8gVar);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m17788x4() {
        edg.m12322f(this, ((r6g) ((bwr) this).viewModel).f18380m.getHeight() + t100.d(20.0f));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m17789z4(kgg kggVar) {
        ((r6g) ((bwr) this).viewModel).m21794S(kggVar);
    }

    /* JADX INFO: renamed from: C4 */
    public void mo10218C4() {
    }

    /* JADX INFO: renamed from: F4 */
    public void mo17781F4() {
    }
}
