package p009l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.gul;
import l.ho2;
import l.k4t;
import l.soj0;
import l.vwb;
import l.wxs;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xzn0<D extends ho2> extends dyn0<D, eyn0> {

    /* JADX INFO: renamed from: j */
    public int f22819j;

    public xzn0(bsm<D> bsmVar) {
        super(bsmVar);
        C(new eyn0(bsmVar.a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m25088X3(List list, gul gulVar) {
        if (gulVar instanceof dyn0) {
            list.add(((dyn0) gulVar).mo13523S3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m25089Y3(int i, gul gulVar) {
        if (gulVar instanceof dyn0) {
            dyn0 dyn0Var = (dyn0) gulVar;
            if (dyn0Var.mo13524T3() == i) {
                dyn0Var.mo13526V3();
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m25091a4(qzn0 qzn0Var, qzn0 qzn0Var2) {
        return qzn0Var2.m21349a() - qzn0Var.m21349a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m25092c4(soj0 soj0Var) {
        ((bwr) this).viewModel.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m25093d4(soj0 soj0Var) {
        m25094e4(this.f22819j);
    }

    /* JADX INFO: renamed from: e4 */
    private void m25094e4(final int i) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.rzn0
            public final void call(Object obj) {
                xzn0.m25089Y3(i, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public void m25095R3() {
        super.R3();
        z2(new hzn0(((wxs) this).e));
        z2(new vyn0(((wxs) this).e));
    }

    /* JADX INFO: renamed from: T */
    public void m25096T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().MemberEvent.dismiss().g()).subscribe(ffw.d(new e30() { // from class: l.szn0
            public final void call(Object obj) {
                this.f20504a.m25092c4((soj0) obj);
            }
        }));
        duringCreated((c) F2().MemberEvent.refresh().g()).subscribe(ffw.d(new e30() { // from class: l.tzn0
            public final void call(Object obj) {
                this.f20936a.m25093d4((soj0) obj);
            }
        }));
        duringCreated((c) F2().MemberEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.uzn0
            public final void call(Object obj) {
                this.f21401a.m25098f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<qzn0> m25097b4() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(((k4t) this).b.values(), new e30() { // from class: l.vzn0
            public final void call(Object obj) {
                xzn0.m25088X3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.wzn0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return xzn0.m25091a4((qzn0) obj, (qzn0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f4 */
    public void m25098f4(int i) {
        ((bwr) this).viewModel.m14175J(i);
        m25099g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m25099g4(int i) {
        this.f22819j = i;
        m25094e4(i);
        zvf0.x(this.f22819j == 1 ? "e_live_online_list" : "e_live_expense_list", R2());
    }
}
