package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jor0 extends ggr0 implements yer0 {

    /* JADX INFO: renamed from: c */
    public final List<String> f119006c;

    /* JADX INFO: renamed from: d */
    public final List<ymr0> f119007d;

    /* JADX INFO: renamed from: e */
    public a9x0 f119008e;

    public jor0(String str, List<ymr0> list, List<ymr0> list2, a9x0 a9x0Var) {
        super(str);
        this.f119006c = new ArrayList();
        this.f119008e = a9x0Var;
        if (!list.isEmpty()) {
            Iterator<ymr0> it = list.iterator();
            while (it.hasNext()) {
                this.f119006c.add(it.next().zzf());
            }
        }
        this.f119007d = new ArrayList(list2);
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        a9x0 a9x0VarM95463d = this.f119008e.m95463d();
        for (int i = 0; i < this.f119006c.size(); i++) {
            int size = list.size();
            List<String> list2 = this.f119006c;
            if (i < size) {
                a9x0VarM95463d.m95464e(list2.get(i), a9x0Var.m95462c(list.get(i)));
            } else {
                a9x0VarM95463d.m95464e(list2.get(i), ymr0.f199051w0);
            }
        }
        for (ymr0 ymr0Var : this.f119007d) {
            ymr0 ymr0VarM95462c = a9x0VarM95463d.m95462c(ymr0Var);
            if (ymr0VarM95462c instanceof rqr0) {
                ymr0VarM95462c = a9x0VarM95463d.m95462c(ymr0Var);
            }
            if (ymr0VarM95462c instanceof ldr0) {
                return ((ldr0) ymr0VarM95462c).m149470a();
            }
        }
        return ymr0.f199051w0;
    }

    @Override // p149l.ggr0, p149l.ymr0
    public final ymr0 zzc() {
        return new jor0(this);
    }

    public jor0(jor0 jor0Var) {
        super(jor0Var.f102530a);
        ArrayList arrayList = new ArrayList(jor0Var.f119006c.size());
        this.f119006c = arrayList;
        arrayList.addAll(jor0Var.f119006c);
        ArrayList arrayList2 = new ArrayList(jor0Var.f119007d.size());
        this.f119007d = arrayList2;
        arrayList2.addAll(jor0Var.f119007d);
        this.f119008e = jor0Var.f119008e;
    }
}
