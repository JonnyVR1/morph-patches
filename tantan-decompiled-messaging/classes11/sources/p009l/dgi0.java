package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dgi0 extends jq2<igi0> {
    public dgi0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13338f0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m13340h0(Bundle bundle) {
        ((igi0) ((jq2) this).viewModel).m16517r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m13341i0(q860 q860Var) {
        if (q860Var != null) {
            ((igi0) ((jq2) this).viewModel).m16516j(q860Var.f19068a);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13342a0() {
        super.a0();
        creates(new e30() { // from class: l.agi0
            public final void call(Object obj) {
                this.f9492a.m13340h0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.c.f0.df()).subscribe(mkd0.H(new e30() { // from class: l.bgi0
            public final void call(Object obj) {
                this.f10065a.m13341i0((q860) obj);
            }
        }, new e30() { // from class: l.cgi0
            public final void call(Object obj) {
                dgi0.m13338f0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
