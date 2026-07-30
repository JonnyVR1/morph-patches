package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mbs0 {

    /* JADX INFO: renamed from: a */
    public Map<String, g6s0> f135746a = new HashMap();

    /* JADX INFO: renamed from: b */
    public fts0 f135747b = new fts0();

    public mbs0() {
        m157885b(new o3s0());
        m157885b(new fas0());
        m157885b(new tcs0());
        m157885b(new mgs0());
        m157885b(new cjs0());
        m157885b(new zqs0());
        m157885b(new dxs0());
    }

    /* JADX INFO: renamed from: a */
    public final ewr0 m157884a(gix0 gix0Var, ewr0 ewr0Var) {
        tqw0.m192368b(gix0Var);
        if (!(ewr0Var instanceof xzr0)) {
            return ewr0Var;
        }
        xzr0 xzr0Var = (xzr0) ewr0Var;
        ArrayList<ewr0> arrayListM213808b = xzr0Var.m213808b();
        String strM213807a = xzr0Var.m213807a();
        return (this.f135746a.containsKey(strM213807a) ? this.f135746a.get(strM213807a) : this.f135747b).mo110282b(strM213807a, gix0Var, arrayListM213808b);
    }

    /* JADX INFO: renamed from: b */
    public final void m157885b(g6s0 g6s0Var) {
        Iterator<zzbv> it = g6s0Var.f102479a.iterator();
        while (it.hasNext()) {
            this.f135746a.put(it.next().toString(), g6s0Var);
        }
    }
}
