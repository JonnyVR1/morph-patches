package p149l;

import com.google.android.exoplayer2.C1871k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qce0 {

    /* JADX INFO: renamed from: a */
    public final List<C1871k> f153747a;

    /* JADX INFO: renamed from: b */
    public final m6j0[] f153748b;

    public qce0(List<C1871k> list) {
        this.f153747a = list;
        this.f153748b = new m6j0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m173866a(long j, d860 d860Var) {
        nn4.m160189a(j, d860Var, this.f153748b);
    }

    /* JADX INFO: renamed from: b */
    public void m173867b(uqf uqfVar, fbj0.C16793d c16793d) {
        for (int i = 0; i < this.f153748b.length; i++) {
            c16793d.m120357a();
            m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 3);
            C1871k c1871k = this.f153747a.get(i);
            String str = c1871k.f7748l;
            p11.m167008b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strM120358b = c1871k.f7737a;
            if (strM120358b == null) {
                strM120358b = c16793d.m120358b();
            }
            m6j0VarMo11362b.mo11110b(new C1871k.b().m10334U(strM120358b).m10346g0(str).m10348i0(c1871k.f7740d).m10337X(c1871k.f7739c).m10321H(c1871k.f7732D).m10335V(c1871k.f7750n).m10320G());
            this.f153748b[i] = m6j0VarMo11362b;
        }
    }
}
