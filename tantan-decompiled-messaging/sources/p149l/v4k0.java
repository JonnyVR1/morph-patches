package p149l;

import com.google.android.exoplayer2.C1871k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v4k0 {

    /* JADX INFO: renamed from: a */
    public final List<C1871k> f179936a;

    /* JADX INFO: renamed from: b */
    public final m6j0[] f179937b;

    public v4k0(List<C1871k> list) {
        this.f179936a = list;
        this.f179937b = new m6j0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m196997a(long j, d860 d860Var) {
        if (d860Var.m110295a() < 9) {
            return;
        }
        int iM110311q = d860Var.m110311q();
        int iM110311q2 = d860Var.m110311q();
        int iM110279H = d860Var.m110279H();
        if (iM110311q == 434 && iM110311q2 == 1195456820 && iM110279H == 3) {
            nn4.m160190b(j, d860Var, this.f179937b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m196998b(uqf uqfVar, fbj0.C16793d c16793d) {
        for (int i = 0; i < this.f179937b.length; i++) {
            c16793d.m120357a();
            m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 3);
            C1871k c1871k = this.f179936a.get(i);
            String str = c1871k.f7748l;
            p11.m167008b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            m6j0VarMo11362b.mo11110b(new C1871k.b().m10334U(c16793d.m120358b()).m10346g0(str).m10348i0(c1871k.f7740d).m10337X(c1871k.f7739c).m10321H(c1871k.f7732D).m10335V(c1871k.f7750n).m10320G());
            this.f179937b[i] = m6j0VarMo11362b;
        }
    }
}
