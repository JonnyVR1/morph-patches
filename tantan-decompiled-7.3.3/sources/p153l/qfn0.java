package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qfn0 {

    /* JADX INFO: renamed from: a */
    public static final List<sfn0> f157317a = new ArrayList(10);

    /* JADX INFO: renamed from: c */
    public static void m176374c() {
        m176377f();
        f157317a.clear();
    }

    /* JADX INFO: renamed from: d */
    public static sfn0 m176375d() {
        List<sfn0> list = f157317a;
        sfn0 sfn0Var = (sfn0) jyb.m147529r(list, new qcj() { // from class: l.pfn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((sfn0) obj).m185651p());
            }
        });
        if (sfn0Var != null) {
            sfn0Var.m185656u(true);
            return sfn0Var;
        }
        if (list.size() >= 10) {
            return null;
        }
        sfn0 sfn0Var2 = new sfn0();
        sfn0Var2.m185656u(true);
        list.add(sfn0Var2);
        return sfn0Var2;
    }

    /* JADX INFO: renamed from: e */
    public static void m176376e(sfn0 sfn0Var) {
        sfn0Var.m185656u(false);
    }

    /* JADX INFO: renamed from: f */
    public static void m176377f() {
        jyb.m147537z(f157317a, new y20() { // from class: l.ofn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((sfn0) obj).m185655t();
            }
        });
    }
}
