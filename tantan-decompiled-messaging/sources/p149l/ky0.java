package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class ky0 extends jq2<my0> {
    public ky0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m147814f0(Bundle bundle) {
        ((my0) this.viewModel).m156950r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.jy0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120273a.m147814f0((Bundle) obj);
            }
        });
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
