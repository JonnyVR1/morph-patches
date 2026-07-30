package p149l;

import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: renamed from: l.cb */
/* JADX INFO: loaded from: classes11.dex */
public class C16098cb extends hlp0<C17514ib> {
    public C16098cb(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: m0 */
    public void m105956m0() {
        duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.ab
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68613a.m105957n0((AuthData) obj);
            }
        }, new e30() { // from class: l.bb
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74751a.m105958o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m105957n0(AuthData authData) {
        ((C17514ib) this.viewModel).m135228c0(authData);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m105958o0(Throwable th) {
        ((C17514ib) this.viewModel).m135227b0(th);
    }
}
