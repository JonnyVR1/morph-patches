package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.pc */
/* JADX INFO: loaded from: classes5.dex */
public class C19338pc extends C16943fc<C17193gc> {

    /* JADX INFO: renamed from: k */
    public String f151457k;

    /* JADX INFO: renamed from: l */
    public int f151458l;

    public C19338pc(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new C17193gc(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m171542X3(List list, uwl uwlVar) {
        if (uwlVar instanceof C16943fc) {
            list.add(((C16943fc) uwlVar).mo124967S3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ int m171543Y3(ely elyVar, ely elyVar2) {
        return elyVar.m121308a() - elyVar2.m121308a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m171544a4(vxj0 vxj0Var) {
        ((C17193gc) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: c4 */
    private void m171545c4(final int i) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.kc
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125006a.m171547b4(i, (uwl) obj);
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        m153103z2(new C17920jc(this.f196918e));
        m153103z2(new fjg(this.f196918e));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VirtualCompanionEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nc
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141299a.m171544a4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().VirtualCompanionEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.oc
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146639a.m171548d4((yn5) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public List<ely> m171546Z3() {
        final ArrayList arrayList = new ArrayList();
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return arrayList;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.lc
            @Override // p153l.y20
            public final void call(Object obj) {
                C19338pc.m171542X3(arrayList, (uwl) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.mc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C19338pc.m171543Y3((ely) obj, (ely) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m171547b4(int i, uwl uwlVar) {
        if (uwlVar instanceof C16943fc) {
            C16943fc c16943fc = (C16943fc) uwlVar;
            if (c16943fc.mo124968T3() == i) {
                c16943fc.mo124969U3(this.f151457k);
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m171548d4(yn5 yn5Var) {
        this.f151457k = yn5Var.f200774b;
        int i = yn5Var.f200773a;
        this.f151458l = i;
        ((C17193gc) this.viewModel).m129819J(i);
        m171549e4(this.f151458l);
    }

    /* JADX INFO: renamed from: e4 */
    public void m171549e4(int i) {
        this.f151458l = i;
        m171545c4(i);
        if (this.f151458l == 1) {
            t3m0.m189101o(this);
        }
    }
}
