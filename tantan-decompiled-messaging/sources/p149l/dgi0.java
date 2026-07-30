package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class dgi0 extends jq2<igi0> {
    public dgi0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m111665f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m111667h0(Bundle bundle) {
        ((igi0) this.viewModel).m135993r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m111668i0(q860 q860Var) {
        if (q860Var != null) {
            ((igi0) this.viewModel).m135992j(q860Var.f153135a);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.agi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69374a.m111667h0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.f17545c.f19642f0.m32928df()).subscribe(mkd0.m154956H(new e30() { // from class: l.bgi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75459a.m111668i0((q860) obj);
            }
        }, new e30() { // from class: l.cgi0
            @Override // p149l.e30
            public final void call(Object obj) {
                dgi0.m111665f0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
