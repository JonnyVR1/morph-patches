package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.C8230a;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qei0 extends jq2<C8230a> {

    /* JADX INFO: renamed from: a */
    public TaskCenterAct f154038a;

    public qei0(mcr mcrVar) {
        super(mcrVar);
        this.f154038a = (TaskCenterAct) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m174212g0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m174213i0(List list) {
        ((C8230a) this.viewModel).m43440c(list);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        duringCreated(CoreModule.f17545c.f19639e0.m169367A7()).subscribe(mkd0.m154956H(new e30() { // from class: l.nei0
            @Override // p149l.e30
            public final void call(Object obj) {
                qei0.m174212g0((roj0) obj);
            }
        }, new e30() { // from class: l.oei0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143317a.m174214h0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19639e0.f149396i7).subscribe(mkd0.m154955G(new e30() { // from class: l.pei0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148446a.m174213i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m174214h0(Throwable th) {
        ((C8230a) this.viewModel).m43442e(true);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
