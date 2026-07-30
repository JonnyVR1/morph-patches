package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.e30;
import l.jq2;
import l.mcr;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kma0 extends jq2<oma0> {
    public kma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m16696f0(Bundle bundle) {
        s7m s7mVar = ((jq2) this).viewModel;
        ((oma0) s7mVar).m19638p((LoopInputType) ((oma0) s7mVar).m19633j().getSerializable("loop_input_type"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m16697a0() {
        super.a0();
        creates(new e30() { // from class: l.jma0
            public final void call(Object obj) {
                this.f13870a.m16696f0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
