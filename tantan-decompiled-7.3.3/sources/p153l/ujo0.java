package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class ujo0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public boolean f179305i;

    /* JADX INFO: renamed from: j */
    public kcg0 f179306j;

    public ujo0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m196415J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public boolean m196418M3() {
        return guk0.m132329h(((rwn0) m213810E2()).m183423Y2()) || m213815L2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m196419N3(Boolean bool) {
        this.f179305i = bool.booleanValue();
        m196420O3();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m196420O3() {
        ((xzl) m138856F3(new r410(9000))).mo170540p(this.f179305i);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f179305i = false;
        zrv.f205799a.m207698v().mo136899c(null);
        zrv.f205799a.m207698v().mo136900d(false);
        psd0.m173633z(this.f179306j);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f179306j = zrv.f205799a.m207698v().mo136901e().subscribe(dhw.m115826e(new y20() { // from class: l.rjo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163495a.m196419N3((Boolean) obj);
            }
        }, new y20() { // from class: l.sjo0
            @Override // p153l.y20
            public final void call(Object obj) {
                ujo0.m196415J3((Throwable) obj);
            }
        }));
        zrv.f205799a.m207698v().mo136899c(new pcj() { // from class: l.tjo0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f174600a.m196418M3());
            }
        });
        zrv.f205799a.m207698v().mo136900d(true);
    }
}
