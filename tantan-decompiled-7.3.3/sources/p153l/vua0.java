package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class vua0 extends ar2<yua0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f185772a;

    public vua0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m202782g0(Bundle bundle) {
        m202783f0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.uua0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181050a.m202782g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m202783f0() {
        LoopInputType loopInputType = (LoopInputType) ((yua0) this.viewModel).m217370k().getSerializable("loop_input_type");
        this.f185772a = loopInputType;
        ((yua0) this.viewModel).m217373p(loopInputType);
        ((yua0) this.viewModel).f201603e.m52790f5();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m202784h0(int i, int i2, Intent intent) {
    }
}
