package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.e30;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jka0 extends jq2<mka0> {
    public jka0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m15977g0(Bundle bundle) {
        m15979f0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m15978a0() {
        super.a0();
        creates(new e30() { // from class: l.ika0
            public final void call(Object obj) {
                this.f13284a.m15977g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m15979f0() {
        LoopInputType loopInputType = (LoopInputType) ((mka0) ((jq2) this).viewModel).m17989n().getSerializable("loop_input_type");
        ((mka0) ((jq2) this).viewModel).m17983A3(loopInputType.title);
        ((mka0) ((jq2) this).viewModel).m17993v(loopInputType);
    }

    public void destroy() {
    }
}
