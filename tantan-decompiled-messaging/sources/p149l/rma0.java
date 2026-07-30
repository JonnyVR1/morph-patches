package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class rma0 extends jq2<uma0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f160077a;

    public rma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m179972g0(Bundle bundle) {
        m179973f0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.qma0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155292a.m179972g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m179973f0() {
        LoopInputType loopInputType = (LoopInputType) ((uma0) this.viewModel).m194336k().getSerializable("loop_input_type");
        this.f160077a = loopInputType;
        ((uma0) this.viewModel).m194339p(loopInputType);
        ((uma0) this.viewModel).f177215e.m51607f5();
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m179974h0(int i, int i2, Intent intent) {
    }
}
