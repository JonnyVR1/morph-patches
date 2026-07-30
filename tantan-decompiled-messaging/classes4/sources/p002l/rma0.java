package p002l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rma0 extends jq2<uma0> {

    /* JADX INFO: renamed from: a */
    public LoopInputType f18607a;

    public rma0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m22076g0(Bundle bundle) {
        m22079f0();
    }

    /* JADX INFO: renamed from: Z */
    public void m22077Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m22078a0() {
        super.a0();
        creates(new e30() { // from class: l.qma0
            public final void call(Object obj) {
                this.f18093a.m22076g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m22079f0() {
        LoopInputType loopInputType = (LoopInputType) ((uma0) ((jq2) this).viewModel).m23549k().getSerializable("loop_input_type");
        this.f18607a = loopInputType;
        ((uma0) ((jq2) this).viewModel).m23552p(loopInputType);
        ((uma0) ((jq2) this).viewModel).f20714e.m2093f5();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m22080h0(int i, int i2, Intent intent) {
    }
}
