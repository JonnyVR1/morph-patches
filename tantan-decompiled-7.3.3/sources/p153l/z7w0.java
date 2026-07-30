package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z7w0 {

    /* JADX INFO: renamed from: a */
    public final q6w0 f203272a;

    /* JADX INFO: renamed from: b */
    public final t6w0 f203273b;

    /* JADX INFO: renamed from: c */
    public final fbv0 f203274c;

    /* JADX INFO: renamed from: d */
    public final yew0 f203275d;

    /* JADX INFO: renamed from: e */
    public final cew0 f203276e;

    /* JADX INFO: renamed from: f */
    public final dut0 f203277f;

    @VisibleForTesting
    public z7w0(fbv0 fbv0Var, yew0 yew0Var, q6w0 q6w0Var, t6w0 t6w0Var, dut0 dut0Var, cew0 cew0Var) {
        this.f203272a = q6w0Var;
        this.f203273b = t6w0Var;
        this.f203274c = fbv0Var;
        this.f203275d = yew0Var;
        this.f203277f = dut0Var;
        this.f203276e = cew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m218921a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m218922b((String) it.next(), 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m218922b(String str, int i) {
        if (!this.f203272a.f155892j0) {
            this.f203275d.m215479c(str, this.f203276e);
        } else {
            this.f203274c.m124959g(new hbv0(bxy0.m106918b().currentTimeMillis(), this.f203273b.f172368b, str, i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m218923c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            pvw0.m173991r((((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue() && dut0.m118172h(str)) ? this.f203277f.m118173b(str, k6s0.m148572e()) : pvw0.m173981h(str), new y7w0(this, i), oct0.f146733a);
        }
    }
}
