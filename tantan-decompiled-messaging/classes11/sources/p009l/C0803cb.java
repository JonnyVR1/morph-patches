package p009l;

import com.p1.mobile.putong.data.AuthData;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;

/* JADX INFO: renamed from: l.cb */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0803cb extends hlp0<C0952ib> {
    public C0803cb(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: m0 */
    public void m12469m0() {
        duringCreated(qib0.c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.ab
            public final void call(Object obj) {
                this.f9359a.m12470n0((AuthData) obj);
            }
        }, new e30() { // from class: l.bb
            public final void call(Object obj) {
                this.f9988a.m12471o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m12470n0(AuthData authData) {
        ((C0952ib) ((jq2) this).viewModel).m16302c0(authData);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m12471o0(Throwable th) {
        ((C0952ib) ((jq2) this).viewModel).m16301b0(th);
    }
}
