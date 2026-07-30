package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class m6n0 {

    /* JADX INFO: renamed from: a */
    public static final List<o6n0> f131709a = new ArrayList(10);

    /* JADX INFO: renamed from: c */
    public static void m153248c() {
        m153251f();
        f131709a.clear();
    }

    /* JADX INFO: renamed from: d */
    public static o6n0 m153249d() {
        List<o6n0> list = f131709a;
        o6n0 o6n0Var = (o6n0) vwb.m200346r(list, new w9j() { // from class: l.l6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((o6n0) obj).m162932p());
            }
        });
        if (o6n0Var != null) {
            o6n0Var.m162937u(true);
            return o6n0Var;
        }
        if (list.size() >= 10) {
            return null;
        }
        o6n0 o6n0Var2 = new o6n0();
        o6n0Var2.m162937u(true);
        list.add(o6n0Var2);
        return o6n0Var2;
    }

    /* JADX INFO: renamed from: e */
    public static void m153250e(o6n0 o6n0Var) {
        o6n0Var.m162937u(false);
    }

    /* JADX INFO: renamed from: f */
    public static void m153251f() {
        vwb.m200354z(f131709a, new e30() { // from class: l.k6n0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((o6n0) obj).m162936t();
            }
        });
    }
}
