package p149l;

import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mag extends lk2<r6g> {

    /* JADX INFO: renamed from: j */
    public final j6g f132849j;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    public mag(bsm bsmVar) {
        super(bsmVar);
        this.f132849j = m206027E2().f108741B;
        mo51532C(new r6g(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m153639A4(Boolean bool) {
        ((r6g) this.viewModel).m178054L();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m153641j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m153644m4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m153650y4(soj0 soj0Var) {
        m153655s4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: B4 */
    public void m153651B4() {
        m207199N3(m206027E2().m132133h0()).filter(new w9j() { // from class: l.bag
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.dag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85233a.m153657u4((User) obj);
            }
        }, new e30() { // from class: l.eag
            @Override // p149l.e30
            public final void call(Object obj) {
                mag.m153641j4((Throwable) obj);
            }
        }));
        m207199N3(this.f132849j.m140019S()).doOnSubscribe(new d30() { // from class: l.fag
            @Override // p149l.d30
            public final void call() {
                this.f96597a.m153658v4();
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.gag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101668a.m153659w4((h8g) obj);
            }
        }, new e30() { // from class: l.hag
            @Override // p149l.e30
            public final void call(Object obj) {
                mag.m153644m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m153652D4(Boolean bool) {
        if (m153656t4()) {
            ((r6g) this.viewModel).m71834E();
            return true;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        m206028F2().FansClubEntryEvent.openEntry().mo172463j(Boolean.TRUE);
        return false;
    }

    /* JADX INFO: renamed from: E4 */
    public void m153653E4() {
        ((r6g) this.viewModel).f157920m.post(new Runnable() { // from class: l.cag
            @Override // java.lang.Runnable
            public final void run() {
                this.f80031a.m153660x4();
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((r6g) this.viewModel).mo71841w();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m153651B4();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        j6g j6gVar = this.f132849j;
        if (j6gVar != null) {
            j6gVar.m140025Y();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m153655s4() {
        ((r6g) this.viewModel).m71839q(null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        this.f132849j.m140004D(m206032L2(), this, m206027E2().m132146l0().f56011id);
        super.mo72465t();
        duringCreated(m206028F2().FansClubEvent.showFansClubDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.iag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112301a.m153652D4((Boolean) obj);
            }
        }));
        duringCreated(m206028F2().FansClubEvent.hideFansClubDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117082a.m153650y4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().FansRecallEvent.showFansRecallSelectPanel().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122112a.m153661z4((kgg) obj);
            }
        }));
        duringCreated(m206028F2().FansRecallEvent.hideFansRecallSelectPanel().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127194a.m153639A4((Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public final boolean m153656t4() {
        if (m206032L2()) {
            return true;
        }
        return (m206027E2().m132146l0() == null || m206027E2().m132161r0() == null || !m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId())) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m153657u4(User user) {
        ((r6g) this.viewModel).m178062T(user);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m153658v4() {
        ((r6g) this.viewModel).m178055M(m206032L2());
        ((r6g) this.viewModel).f157921n.m72906l0(false);
        ((r6g) this.viewModel).m178059Q();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m153659w4(h8g h8gVar) {
        ((r6g) this.viewModel).m178060R(h8gVar);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m153660x4() {
        edg.m115801f(this, ((r6g) this.viewModel).f157920m.getHeight() + t100.m186890d(20.0f));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m153661z4(kgg kggVar) {
        ((r6g) this.viewModel).m178061S(kggVar);
    }

    /* JADX INFO: renamed from: C4 */
    public void mo100956C4() {
    }

    /* JADX INFO: renamed from: F4 */
    public void mo153654F4() {
    }
}
