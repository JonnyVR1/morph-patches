package p149l;

import com.cosmos.photon.push.service.PushService;
import com.p046p1.mobile.putong.data.SchemeKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class t1r0 {

    /* JADX INFO: renamed from: a */
    public final TreeMap<Integer, jor0> f167367a = new TreeMap<>();

    /* JADX INFO: renamed from: b */
    public final TreeMap<Integer, jor0> f167368b = new TreeMap<>();

    /* JADX INFO: renamed from: a */
    public static int m186917a(a9x0 a9x0Var, jor0 jor0Var, ymr0 ymr0Var) {
        ymr0 ymr0VarMo108642d = jor0Var.mo108642d(a9x0Var, Collections.singletonList(ymr0Var));
        if (ymr0VarMo108642d instanceof acr0) {
            return nhw0.m159472i(ymr0VarMo108642d.zze().doubleValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m186918b(String str, int i, jor0 jor0Var, String str2) {
        TreeMap<Integer, jor0> treeMap;
        if (PushService.COMMAND_CREATE.equals(str2)) {
            treeMap = this.f167368b;
        } else {
            if (!SchemeKey.edit.equals(str2)) {
                rkq0.m179764a("Unknown callback type: ", str2);
                return;
            }
            treeMap = this.f167367a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), jor0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m186919c(a9x0 a9x0Var, m4r0 m4r0Var) {
        s7y0 s7y0Var = new s7y0(m4r0Var);
        for (Integer num : this.f167367a.keySet()) {
            y5r0 y5r0Var = (y5r0) m4r0Var.m153094d().clone();
            int iM186917a = m186917a(a9x0Var, this.f167367a.get(num), s7y0Var);
            if (iM186917a == 2 || iM186917a == -1) {
                m4r0Var.m153095e(y5r0Var);
            }
        }
        Iterator<Integer> it = this.f167368b.keySet().iterator();
        while (it.hasNext()) {
            m186917a(a9x0Var, this.f167368b.get(it.next()), s7y0Var);
        }
    }
}
