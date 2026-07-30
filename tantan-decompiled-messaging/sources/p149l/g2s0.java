package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class g2s0 {

    /* JADX INFO: renamed from: a */
    public Map<String, axr0> f100284a = new HashMap();

    /* JADX INFO: renamed from: b */
    public zjs0 f100285b = new zjs0();

    public g2s0() {
        m124175b(new iur0());
        m124175b(new z0s0());
        m124175b(new n3s0());
        m124175b(new g7s0());
        m124175b(new w9s0());
        m124175b(new ths0());
        m124175b(new xns0());
    }

    /* JADX INFO: renamed from: a */
    public final ymr0 m124174a(a9x0 a9x0Var, ymr0 ymr0Var) {
        nhw0.m159465b(a9x0Var);
        if (!(ymr0Var instanceof rqr0)) {
            return ymr0Var;
        }
        rqr0 rqr0Var = (rqr0) ymr0Var;
        ArrayList<ymr0> arrayListM180492b = rqr0Var.m180492b();
        String strM180491a = rqr0Var.m180491a();
        return (this.f100284a.containsKey(strM180491a) ? this.f100284a.get(strM180491a) : this.f100285b).mo99519b(strM180491a, a9x0Var, arrayListM180492b);
    }

    /* JADX INFO: renamed from: b */
    public final void m124175b(axr0 axr0Var) {
        Iterator<zzbv> it = axr0Var.f72232a.iterator();
        while (it.hasNext()) {
            this.f100284a.put(it.next().toString(), axr0Var);
        }
    }
}
