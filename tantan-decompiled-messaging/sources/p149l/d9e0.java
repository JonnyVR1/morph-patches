package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes4.dex */
public class d9e0 extends jq2<y8e0> {
    public d9e0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m110450e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m110453h0(Bundle bundle) {
        ((y8e0) this.viewModel).m213368r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m110454i0(q860 q860Var) {
        ((y8e0) this.viewModel).m213367d(q860Var.f153135a);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.a9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68151a.m110453h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19642f0.m32586Ap()).subscribe(mkd0.m154956H(new e30() { // from class: l.b9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74570a.m110454i0((q860) obj);
            }
        }, new e30() { // from class: l.c9e0
            @Override // p149l.e30
            public final void call(Object obj) {
                d9e0.m110450e0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
