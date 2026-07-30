package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class nsa0 extends ar2<qsa0> {
    public nsa0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m164561g0(Bundle bundle) {
        m164562f0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.msa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138468a.m164561g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m164562f0() {
        LoopInputType loopInputType = (LoopInputType) ((qsa0) this.viewModel).m177747n().getSerializable("loop_input_type");
        ((qsa0) this.viewModel).m177743A3(loopInputType.title);
        ((qsa0) this.viewModel).m177751v(loopInputType);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
