package p006l;

import android.os.Bundle;
import com.p1.mobile.android.app.c;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o4f0 extends b3f0<c5f0> {
    public o4f0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m20304S0(Bundle bundle) {
        ((c5f0) ((jq2) this).viewModel).m13193r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m20305A0(c cVar) {
        if (cVar == c.j) {
            ((c5f0) ((jq2) this).viewModel).m13200z();
        }
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.x3f0
            public final void call(Object obj) {
                this.f27337a.m20304S0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.f4f0
            public final void call(Object obj) {
                this.f11610a.m20305A0((c) obj);
            }
        }));
    }
}
