package p153l;

import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class g7m0<D extends rwn0> extends y8s<D, i7m0> {

    /* JADX INFO: renamed from: j */
    public User f102591j;

    public g7m0(dum dumVar) {
        super(dumVar);
        mo52715C(new i7m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m129339V3(vxj0 vxj0Var) {
        ((i7m0) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: X3 */
    private void m129340X3() {
        duringCreated(itv.m142078B(this.f102591j.f56859id, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.f7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97574a.m129342W3((List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m129341Y3(User user) {
        this.f102591j = user;
        ((i7m0) this.viewModel).m73017E();
        m129340X3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().VirtualUserDressUpDlgEvent.openDressUpDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.d7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85535a.m129341Y3((User) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VirtualUserDressUpDlgEvent.closeDressUpDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.e7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92448a.m129339V3((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m129342W3(List list) {
        ((i7m0) this.viewModel).m138972L(list, this.f102591j);
    }
}
