package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.uc */
/* JADX INFO: loaded from: classes5.dex */
public class C20404uc extends C17980kc<C18186lc> {

    /* JADX INFO: renamed from: k */
    public String f175778k;

    /* JADX INFO: renamed from: l */
    public int f175779l;

    public C20404uc(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new C18186lc(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m192979X3(List list, gul gulVar) {
        if (gulVar instanceof C17980kc) {
            list.add(((C17980kc) gulVar).mo145332S3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ int m192980Y3(hcy hcyVar, hcy hcyVar2) {
        return hcyVar.m130524a() - hcyVar2.m130524a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m192981a4(soj0 soj0Var) {
        ((C18186lc) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: c4 */
    private void m192982c4(final int i) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.pc
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148124a.m192984b4(i, (gul) obj);
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        m144512z2(new C18890oc(this.f188512e));
        m144512z2(new rhg(this.f188512e));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VirtualCompanionEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.sc
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163689a.m192981a4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().VirtualCompanionEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tc
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169372a.m192985d4((um5) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public List<hcy> m192983Z3() {
        final ArrayList arrayList = new ArrayList();
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return arrayList;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.qc
            @Override // p149l.e30
            public final void call(Object obj) {
                C20404uc.m192979X3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.rc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C20404uc.m192980Y3((hcy) obj, (hcy) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m192984b4(int i, gul gulVar) {
        if (gulVar instanceof C17980kc) {
            C17980kc c17980kc = (C17980kc) gulVar;
            if (c17980kc.mo145333T3() == i) {
                c17980kc.mo145334U3(this.f175778k);
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m192985d4(um5 um5Var) {
        this.f175778k = um5Var.f177195b;
        int i = um5Var.f177194a;
        this.f175779l = i;
        ((C18186lc) this.viewModel).m149277J(i);
        m192986e4(this.f175779l);
    }

    /* JADX INFO: renamed from: e4 */
    public void m192986e4(int i) {
        this.f175779l = i;
        m192982c4(i);
        if (this.f175779l == 1) {
            pul0.m171457o(this);
        }
    }
}
