package p009l;

import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task.C0394a;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task.TaskCenterAct;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qei0 extends jq2<C0394a> {

    /* JADX INFO: renamed from: a */
    public TaskCenterAct f19191a;

    public qei0(mcr mcrVar) {
        super(mcrVar);
        this.f19191a = (TaskCenterAct) mcrVar;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m20903g0(roj0 roj0Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m20904i0(List list) {
        ((C0394a) ((jq2) this).viewModel).m7682c(list);
    }

    /* JADX INFO: renamed from: Z */
    public void m20905Z() {
        super.Z();
        duringCreated(CoreModule.c.e0.A7()).subscribe(mkd0.H(new e30() { // from class: l.nei0
            public final void call(Object obj) {
                qei0.m20903g0((roj0) obj);
            }
        }, new e30() { // from class: l.oei0
            public final void call(Object obj) {
                this.f17936a.m20907h0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m20906a0() {
        super.a0();
        duringCreated(CoreModule.c.e0.i7).subscribe(mkd0.G(new e30() { // from class: l.pei0
            public final void call(Object obj) {
                this.f18509a.m20904i0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m20907h0(Throwable th) {
        ((C0394a) ((jq2) this).viewModel).m7684e(true);
    }

    public void destroy() {
    }
}
