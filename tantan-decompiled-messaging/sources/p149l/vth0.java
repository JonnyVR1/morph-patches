package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;

/* JADX INFO: loaded from: classes4.dex */
public class vth0 extends jq2<duh0> {

    /* JADX INFO: renamed from: a */
    public TagGuidePicAct f182946a;

    public vth0(mcr mcrVar) {
        super(mcrVar);
        this.f182946a = (TagGuidePicAct) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m200001g0(Bundle bundle) {
        ((duh0) this.viewModel).m113706r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m200002h0(roj0 roj0Var) {
        ((duh0) this.viewModel).m113699A();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        if (sth0.m185950b().m185952c() == null) {
            sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na());
        }
        creates(new e30() { // from class: l.tth0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172028a.m200001g0((Bundle) obj);
            }
        });
        if ((upa.m194840x2() || upa.m194845y2()) && this.f182946a.m50777d2()) {
            duringCreated(CoreModule.f17545c.f19639e0.f149177G1).subscribe(mkd0.m154955G(new e30() { // from class: l.uth0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178269a.m200002h0((roj0) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
