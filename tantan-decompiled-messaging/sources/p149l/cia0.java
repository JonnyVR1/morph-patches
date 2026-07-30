package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cia0 extends jq2<eia0> {
    public cia0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m107063i0(List list) {
        ((eia0) this.viewModel).m116667i();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        final LoopInputType loopInputType = (LoopInputType) ((eia0) this.viewModel).m116665d().getSerializable("loop_input_type");
        creates(new e30() { // from class: l.zha0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203155a.m107064h0(loopInputType, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.aia0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).profile.extensions.basic.mbti;
            }
        }).distinctUntilChanged().skip(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.bia0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75715a.m107063i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m107064h0(LoopInputType loopInputType, Bundle bundle) {
        ((eia0) this.viewModel).m116666e(loopInputType);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
