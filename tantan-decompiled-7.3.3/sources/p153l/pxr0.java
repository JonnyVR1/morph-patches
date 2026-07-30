package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pxr0 extends mpr0 implements eor0 {

    /* JADX INFO: renamed from: c */
    public final List<String> f154589c;

    /* JADX INFO: renamed from: d */
    public final List<ewr0> f154590d;

    /* JADX INFO: renamed from: e */
    public gix0 f154591e;

    public pxr0(String str, List<ewr0> list, List<ewr0> list2, gix0 gix0Var) {
        super(str);
        this.f154589c = new ArrayList();
        this.f154591e = gix0Var;
        if (!list.isEmpty()) {
            Iterator<ewr0> it = list.iterator();
            while (it.hasNext()) {
                this.f154589c.add(it.next().zzf());
            }
        }
        this.f154590d = new ArrayList(list2);
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        gix0 gix0VarM130396d = this.f154591e.m130396d();
        for (int i = 0; i < this.f154589c.size(); i++) {
            int size = list.size();
            List<String> list2 = this.f154589c;
            if (i < size) {
                gix0VarM130396d.m130397e(list2.get(i), gix0Var.m130395c(list.get(i)));
            } else {
                gix0VarM130396d.m130397e(list2.get(i), ewr0.f96187w0);
            }
        }
        for (ewr0 ewr0Var : this.f154590d) {
            ewr0 ewr0VarM130395c = gix0VarM130396d.m130395c(ewr0Var);
            if (ewr0VarM130395c instanceof xzr0) {
                ewr0VarM130395c = gix0VarM130396d.m130395c(ewr0Var);
            }
            if (ewr0VarM130395c instanceof rmr0) {
                return ((rmr0) ewr0VarM130395c).m182105a();
            }
        }
        return ewr0.f96187w0;
    }

    @Override // p153l.mpr0, p153l.ewr0
    public final ewr0 zzc() {
        return new pxr0(this);
    }

    public pxr0(pxr0 pxr0Var) {
        super(pxr0Var.f137945a);
        ArrayList arrayList = new ArrayList(pxr0Var.f154589c.size());
        this.f154589c = arrayList;
        arrayList.addAll(pxr0Var.f154589c);
        ArrayList arrayList2 = new ArrayList(pxr0Var.f154590d.size());
        this.f154590d = arrayList2;
        arrayList2.addAll(pxr0Var.f154590d);
        this.f154591e = pxr0Var.f154591e;
    }
}
