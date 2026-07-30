package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class b9o0<D extends oo2> extends h7o0<D, i7o0> {

    /* JADX INFO: renamed from: j */
    public int f75601j;

    public b9o0(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new i7o0(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m103117X3(List list, uwl uwlVar) {
        if (uwlVar instanceof h7o0) {
            list.add(((h7o0) uwlVar).mo133831S3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m103118Y3(int i, uwl uwlVar) {
        if (uwlVar instanceof h7o0) {
            h7o0 h7o0Var = (h7o0) uwlVar;
            if (h7o0Var.mo133832T3() == i) {
                h7o0Var.mo133834V3();
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m103120a4(u8o0 u8o0Var, u8o0 u8o0Var2) {
        return u8o0Var2.m195066a() - u8o0Var.m195066a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m103121c4(vxj0 vxj0Var) {
        ((i7o0) this.viewModel).mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m103122d4(vxj0 vxj0Var) {
        m103123e4(this.f75601j);
    }

    /* JADX INFO: renamed from: e4 */
    private void m103123e4(final int i) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.v8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                b9o0.m103118Y3(i, (uwl) obj);
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        m153103z2(new l8o0(this.f196918e));
        m153103z2(new z7o0(this.f196918e));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().MemberEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.w8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187887a.m103121c4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MemberEvent.refresh().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.x8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192859a.m103122d4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MemberEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.y8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198019a.m103126f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<u8o0> m103125b4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.z8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                b9o0.m103117X3(arrayList, (uwl) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.a9o0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b9o0.m103120a4((u8o0) obj, (u8o0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: f4 */
    public void m103126f4(int i) {
        ((i7o0) this.viewModel).m138980J(i);
        m103127g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m103127g4(int i) {
        this.f75601j = i;
        m103123e4(i);
        i4g0.m138526x(this.f75601j == 1 ? "e_live_online_list" : "e_live_expense_list", mo78457R2());
    }
}
