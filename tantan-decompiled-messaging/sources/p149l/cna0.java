package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class cna0 extends jq2<ana0> {
    public cna0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m107744g0(Bundle bundle) {
        m107745f0();
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
        creates(new e30() { // from class: l.bna0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76383a.m107744g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m107745f0() {
        ((ana0) this.viewModel).m97744f(((LoopInputType) ((ana0) this.viewModel).m97742c().getSerializable("loop_input_type")).url);
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m107746h0(int i, int i2, Intent intent) {
    }
}
