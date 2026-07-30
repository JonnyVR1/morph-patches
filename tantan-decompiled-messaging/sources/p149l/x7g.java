package p149l;

import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class x7g extends lk2<t7g> {
    public x7g(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new t7g(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m207295m4(Boolean bool) {
        ((t7g) this.viewModel).m187455M(bool.booleanValue());
        ((t7g) this.viewModel).m71834E();
    }

    /* JADX INFO: renamed from: k4 */
    public void m207296k4() {
        ((t7g) this.viewModel).m71839q(null);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m207297l4() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7001).m142598B(ddv.f85660j).m142597A(xdl0.m208412y0(), ((t7g) this.viewModel).f168712k.getHeight() + t100.m186890d(10.0f)).m142602s(t100.m186890d(10.0f)).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142603t(80).m142600q());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m207298n4() {
        ((t7g) this.viewModel).m187454J();
        m144512z2(new x8g(this.f188512e, this));
    }

    /* JADX INFO: renamed from: o4 */
    public void m207299o4() {
        ((t7g) this.viewModel).f168712k.post(new Runnable() { // from class: l.w7g
            @Override // java.lang.Runnable
            public final void run() {
                this.f185049a.m207297l4();
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansClubEvent.showFansClubBigEventDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.v7g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180385a.m207295m4((Boolean) obj);
            }
        }));
    }
}
