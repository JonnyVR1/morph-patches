package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class lly<D extends oo2> extends bhy<D, mhy> {

    /* JADX INFO: renamed from: j */
    public int f132617j;

    public lly(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new mhy(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m154813W3(int i, uwl uwlVar) {
        if (uwlVar instanceof bhy) {
            bhy bhyVar = (bhy) uwlVar;
            if (bhyVar.mo104381T3() == i) {
                bhyVar.mo104382V3();
            }
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m154816Z3(List list, uwl uwlVar) {
        if (uwlVar instanceof bhy) {
            list.add(((bhy) uwlVar).mo104380S3());
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ int m154817a4(ely elyVar, ely elyVar2) {
        return elyVar.m121308a() - elyVar2.m121308a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m154818c4(vxj0 vxj0Var) {
        ((mhy) this.viewModel).mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m154819d4(vxj0 vxj0Var) {
        m154821e4(this.f132617j);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().MemberEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110559a.m154818c4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MemberEvent.refresh().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ily
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115637a.m154819d4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().MemberEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121625a.m154822f4(((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public List<ely> m154820b4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.fly
            @Override // p153l.y20
            public final void call(Object obj) {
                lly.m154816Z3(arrayList, (uwl) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.gly
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return lly.m154817a4((ely) obj, (ely) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m154821e4(final int i) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.kly
            @Override // p153l.y20
            public final void call(Object obj) {
                lly.m154813W3(i, (uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m154822f4(int i) {
        ((mhy) this.viewModel).m158450N(i);
        m154823g4(i);
    }

    /* JADX INFO: renamed from: g4 */
    public void m154823g4(int i) {
        this.f132617j = i;
        m154821e4(i);
        i4g0.m138526x(bhy.m104379U3(i), mo78457R2());
    }
}
