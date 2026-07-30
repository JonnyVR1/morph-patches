package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ky0 extends jq2<my0> {
    public ky0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m17614f0(Bundle bundle) {
        ((my0) ((jq2) this).viewModel).m18678r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m17615a0() {
        super.a0();
        creates(new e30() { // from class: l.jy0
            public final void call(Object obj) {
                this.f15359a.m17614f0((Bundle) obj);
            }
        });
        CoreModule.c.e0.W9(CoreModule.H().userId());
    }

    public void destroy() {
    }
}
