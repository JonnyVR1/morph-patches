package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gqa0 extends ar2<iqa0> {
    public gqa0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m131368i0(List list) {
        ((iqa0) this.viewModel).m141668i();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        final LoopInputType loopInputType = (LoopInputType) ((iqa0) this.viewModel).m141666d().getSerializable("loop_input_type");
        creates(new y20() { // from class: l.dqa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90192a.m131369h0(loopInputType, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.eqa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).profile.extensions.basic.mbti;
            }
        }).distinctUntilChanged().skip(1)).subscribe(psd0.m173596G(new y20() { // from class: l.fqa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100260a.m131368i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m131369h0(LoopInputType loopInputType, Bundle bundle) {
        ((iqa0) this.viewModel).m141667e(loopInputType);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
