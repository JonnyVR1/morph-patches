package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class oua0 extends ar2<sua0> {
    public oua0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m169282f0(Bundle bundle) {
        V v2 = this.viewModel;
        ((sua0) v2).m188022p((LoopInputType) ((sua0) v2).m188017j().getSerializable("loop_input_type"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.nua0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143687a.m169282f0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
