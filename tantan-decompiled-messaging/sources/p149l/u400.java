package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import p149l.a500;

/* JADX INFO: loaded from: classes11.dex */
public class u400<T extends a500> extends jq2<T> {
    public u400(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m191667h0(Bundle bundle) {
        m191669g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m191668i0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((a500) this.viewModel).m94988T();
        } else if (c4319c == C4319c.f15549j) {
            ((a500) this.viewModel).m94987S();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.s400
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162209a.m191667h0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.t400
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167680a.m191668i0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g0 */
    public void m191669g0() {
        ((a500) this.viewModel).mo94978E();
        ((a500) this.viewModel).mo94979F();
        ((a500) this.viewModel).m94992X();
        ((a500) this.viewModel).mo94981J();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
