package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class xzn0<D extends ho2> extends dyn0<D, eyn0> {

    /* JADX INFO: renamed from: j */
    public int f195213j;

    public xzn0(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new eyn0(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m212002X3(List list, gul gulVar) {
        if (gulVar instanceof dyn0) {
            list.add(((dyn0) gulVar).mo114083S3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m212003Y3(int i, gul gulVar) {
        if (gulVar instanceof dyn0) {
            dyn0 dyn0Var = (dyn0) gulVar;
            if (dyn0Var.mo114084T3() == i) {
                dyn0Var.mo114086V3();
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m212005a4(qzn0 qzn0Var, qzn0 qzn0Var2) {
        return qzn0Var2.m177274a() - qzn0Var.m177274a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m212006c4(soj0 soj0Var) {
        ((eyn0) this.viewModel).mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m212007d4(soj0 soj0Var) {
        m212008e4(this.f195213j);
    }

    /* JADX INFO: renamed from: e4 */
    private void m212008e4(final int i) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.rzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                xzn0.m212003Y3(i, (gul) obj);
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        m144512z2(new hzn0(this.f188512e));
        m144512z2(new vyn0(this.f188512e));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().MemberEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.szn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167069a.m212006c4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MemberEvent.refresh().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172743a.m212007d4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().MemberEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.uzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179007a.m212010f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<qzn0> m212009b4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.vzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                xzn0.m212002X3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.wzn0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xzn0.m212005a4((qzn0) obj, (qzn0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f4 */
    public void m212010f4(int i) {
        ((eyn0) this.viewModel).m118786J(i);
        m212011g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m212011g4(int i) {
        this.f195213j = i;
        m212008e4(i);
        zvf0.m220402x(this.f195213j == 1 ? "e_live_online_list" : "e_live_expense_list", mo77274R2());
    }
}
