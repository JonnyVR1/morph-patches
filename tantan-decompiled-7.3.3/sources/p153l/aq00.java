package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.settings.MomentMutedAct;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class aq00 extends ar2<cq00> {
    public aq00(MomentMutedAct momentMutedAct) {
        super(momentMutedAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m99407g0(Bundle bundle) {
        ((cq00) this.viewModel).m111863r();
        CoreModule.m30932N().coreMomentMutedUsers().mo173495b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m99408h0(List list) {
        ((cq00) this.viewModel).m111862f(list);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.yp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201031a.m99407g0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.m30932N().coreMomentMutedUsers().mo173494a()).subscribe(psd0.m173596G(new y20() { // from class: l.zp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205416a.m99408h0((List) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
