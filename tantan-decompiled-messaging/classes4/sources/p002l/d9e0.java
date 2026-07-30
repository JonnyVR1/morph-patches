package p002l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.q860;
import l.y8e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d9e0 extends jq2<y8e0> {
    public d9e0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m11652e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m11655h0(Bundle bundle) {
        ((jq2) this).viewModel.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m11656i0(q860 q860Var) {
        ((jq2) this).viewModel.d(q860Var.a);
    }

    /* JADX INFO: renamed from: a0 */
    public void m11657a0() {
        creates(new e30() { // from class: l.a9e0
            public final void call(Object obj) {
                this.f7454a.m11655h0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.f0.Ap()).subscribe(mkd0.H(new e30() { // from class: l.b9e0
            public final void call(Object obj) {
                this.f8040a.m11656i0((q860) obj);
            }
        }, new e30() { // from class: l.c9e0
            public final void call(Object obj) {
                d9e0.m11652e0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
