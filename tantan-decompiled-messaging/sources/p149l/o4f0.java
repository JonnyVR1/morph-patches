package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;

/* JADX INFO: loaded from: classes9.dex */
public class o4f0 extends b3f0<c5f0> {
    public o4f0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m162565S0(Bundle bundle) {
        ((c5f0) this.viewModel).m105317r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m162566A0(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            ((c5f0) this.viewModel).m105324z();
        }
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.x3f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190890a.m162565S0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.f4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94818a.m162566A0((C4319c) obj);
            }
        }));
    }
}
