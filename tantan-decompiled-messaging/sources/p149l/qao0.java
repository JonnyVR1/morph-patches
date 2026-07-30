package p149l;

/* JADX INFO: loaded from: classes5.dex */
public class qao0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public boolean f153548i;

    /* JADX INFO: renamed from: j */
    public c4g0 f153549j;

    public qao0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m173740J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public boolean m173743M3() {
        return alk0.m97309h(((nnn0) m206027E2()).m160261Y2()) || m206032L2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m173744N3(Boolean bool) {
        this.f153548i = bool.booleanValue();
        m173745O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m173745O3() {
        ((exl) m129297F3(new jw00(9000))).mo118681p(this.f153548i);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f153548i = false;
        ypv.f199493a.m199376v().mo111892c(null);
        ypv.f199493a.m199376v().mo111893d(false);
        mkd0.m154992z(this.f153549j);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f153549j = ypv.f199493a.m199376v().mo111894e().subscribe(ffw.m121194e(new e30() { // from class: l.nao0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137925a.m173744N3((Boolean) obj);
            }
        }, new e30() { // from class: l.oao0
            @Override // p149l.e30
            public final void call(Object obj) {
                qao0.m173740J3((Throwable) obj);
            }
        }));
        ypv.f199493a.m199376v().mo111892c(new v9j() { // from class: l.pao0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f147994a.m173743M3());
            }
        });
        ypv.f199493a.m199376v().mo111893d(true);
    }
}
