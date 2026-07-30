package p002l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cna0 extends jq2<ana0> {
    public cna0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m11111g0(Bundle bundle) {
        m11114f0();
    }

    /* JADX INFO: renamed from: Z */
    public void m11112Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11113a0() {
        super.a0();
        creates(new e30() { // from class: l.bna0
            public final void call(Object obj) {
                this.f8276a.m11111g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m11114f0() {
        ((ana0) ((jq2) this).viewModel).m9920f(((LoopInputType) ((ana0) ((jq2) this).viewModel).m9918c().getSerializable("loop_input_type")).url);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public void m11115h0(int i, int i2, Intent intent) {
    }
}
