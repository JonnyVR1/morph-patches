package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public class wld0 extends jq2<zld0> {
    public wld0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m203806f0(Bundle bundle) {
        ((zld0) this.viewModel).m219281r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.vld0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181942a.m203806f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
