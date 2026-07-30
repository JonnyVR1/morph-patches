package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes12.dex */
public class iai extends jq2<mai> {
    public iai(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m135156k0(Bundle bundle) {
        ((mai) this.viewModel).m153818x();
        ((mai) this.viewModel).m153803J();
        ((mai) this.viewModel).m153820z(null);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.fai
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96603a.m135156k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m135157h0() {
        duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.gai
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101677a.m135158i0((AuthData) obj);
            }
        }, new e30() { // from class: l.hai
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106744a.m135159j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m135158i0(AuthData authData) {
        ((mai) this.viewModel).m153802I(authData);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m135159j0(Throwable th) {
        ((mai) this.viewModel).m153801H(th);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
