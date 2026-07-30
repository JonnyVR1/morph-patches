package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class kma0 extends jq2<oma0> {
    public kma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m146488f0(Bundle bundle) {
        V v2 = this.viewModel;
        ((oma0) v2).m165025p((LoopInputType) ((oma0) v2).m165020j().getSerializable("loop_input_type"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.jma0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118623a.m146488f0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
