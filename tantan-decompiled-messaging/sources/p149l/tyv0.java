package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tyv0 {

    /* JADX INFO: renamed from: a */
    public final kxv0 f172661a;

    /* JADX INFO: renamed from: b */
    public final nxv0 f172662b;

    /* JADX INFO: renamed from: c */
    public final z1v0 f172663c;

    /* JADX INFO: renamed from: d */
    public final s5w0 f172664d;

    /* JADX INFO: renamed from: e */
    public final w4w0 f172665e;

    /* JADX INFO: renamed from: f */
    public final xkt0 f172666f;

    @VisibleForTesting
    public tyv0(z1v0 z1v0Var, s5w0 s5w0Var, kxv0 kxv0Var, nxv0 nxv0Var, xkt0 xkt0Var, w4w0 w4w0Var) {
        this.f172661a = kxv0Var;
        this.f172662b = nxv0Var;
        this.f172663c = z1v0Var;
        this.f172664d = s5w0Var;
        this.f172666f = xkt0Var;
        this.f172665e = w4w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m191108a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m191109b((String) it.next(), 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m191109b(String str, int i) {
        if (!this.f172661a.f125202j0) {
            this.f172664d.m182382c(str, this.f172665e);
        } else {
            this.f172663c.m216820g(new b2v0(vny0.m199064b().currentTimeMillis(), this.f172662b.f141055b, str, i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m191110c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            jmw0.m142245r((((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue() && xkt0.m209826h(str)) ? this.f172666f.m209827b(str, exr0.m118706e()) : jmw0.m142235h(str), new syv0(this, i), i3t0.f111372a);
        }
    }
}
