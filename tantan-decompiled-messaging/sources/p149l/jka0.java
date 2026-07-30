package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;

/* JADX INFO: loaded from: classes4.dex */
public class jka0 extends jq2<mka0> {
    public jka0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m141829g0(Bundle bundle) {
        m141830f0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ika0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113649a.m141829g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m141830f0() {
        LoopInputType loopInputType = (LoopInputType) ((mka0) this.viewModel).m154939n().getSerializable("loop_input_type");
        ((mka0) this.viewModel).m154935A3(loopInputType.title);
        ((mka0) this.viewModel).m154943v(loopInputType);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
