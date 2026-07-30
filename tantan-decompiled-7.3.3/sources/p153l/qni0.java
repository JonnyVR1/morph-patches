package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.C8393a;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qni0 extends ar2<C8393a> {

    /* JADX INFO: renamed from: a */
    public TaskCenterAct f158492a;

    public qni0(ner nerVar) {
        super(nerVar);
        this.f158492a = (TaskCenterAct) nerVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m177217g0(uxj0 uxj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m177218i0(List list) {
        ((C8393a) this.viewModel).m44626c(list);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        duringCreated(CoreModule.f18264c.f20381e0.m116440A7()).subscribe(psd0.m173597H(new y20() { // from class: l.nni0
            @Override // p153l.y20
            public final void call(Object obj) {
                qni0.m177217g0((uxj0) obj);
            }
        }, new y20() { // from class: l.oni0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148093a.m177219h0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20381e0.f89253i7).subscribe(psd0.m173596G(new y20() { // from class: l.pni0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153310a.m177218i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m177219h0(Throwable th) {
        ((C8393a) this.viewModel).m44628e(true);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
