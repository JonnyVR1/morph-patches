package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class gva0 extends ar2<eva0> {
    public gva0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m132523g0(Bundle bundle) {
        m132524f0();
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
        creates(new y20() { // from class: l.fva0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100997a.m132523g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m132524f0() {
        ((eva0) this.viewModel).m122775f(((LoopInputType) ((eva0) this.viewModel).m122773c().getSerializable("loop_input_type")).url);
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m132525h0(int i, int i2, Intent intent) {
    }
}
