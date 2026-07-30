package p149l;

import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class cyl0<D extends nnn0> extends x6s<D, eyl0> {

    /* JADX INFO: renamed from: j */
    public User f82996j;

    public cyl0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new eyl0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m109329V3(soj0 soj0Var) {
        ((eyl0) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: X3 */
    private void m109330X3() {
        duringCreated(hrv.m132719B(this.f82996j.f56011id, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.byl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77943a.m109332W3((List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m109331Y3(User user) {
        this.f82996j = user;
        ((eyl0) this.viewModel).m71834E();
        m109330X3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().VirtualUserDressUpDlgEvent.openDressUpDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.zxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205464a.m109331Y3((User) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VirtualUserDressUpDlgEvent.closeDressUpDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ayl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72297a.m109329V3((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m109332W3(List list) {
        ((eyl0) this.viewModel).m118778L(list, this.f82996j);
    }
}
