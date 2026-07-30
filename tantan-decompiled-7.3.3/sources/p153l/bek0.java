package p153l;

import com.google.android.exoplayer2.C1894k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bek0 {

    /* JADX INFO: renamed from: a */
    public final List<C1894k> f76385a;

    /* JADX INFO: renamed from: b */
    public final qfj0[] f76386b;

    public bek0(List<C1894k> list) {
        this.f76385a = list;
        this.f76386b = new qfj0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m103710a(long j, ig60 ig60Var) {
        if (ig60Var.m139811a() < 9) {
            return;
        }
        int iM139827q = ig60Var.m139827q();
        int iM139827q2 = ig60Var.m139827q();
        int iM139795H = ig60Var.m139795H();
        if (iM139827q == 434 && iM139827q2 == 1195456820 && iM139795H == 3) {
            mo4.m159234b(j, ig60Var, this.f76386b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m103711b(bsf bsfVar, jkj0.C17969d c17969d) {
        for (int i = 0; i < this.f76386b.length; i++) {
            c17969d.m145854a();
            qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 3);
            C1894k c1894k = this.f76385a.get(i);
            String str = c1894k.f7785l;
            w11.m204366b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            qfj0VarMo11416b.mo11164b(new C1894k.b().m10388U(c17969d.m145855b()).m10400g0(str).m10402i0(c1894k.f7777d).m10391X(c1894k.f7776c).m10375H(c1894k.f7769D).m10389V(c1894k.f7787n).m10374G());
            this.f76386b[i] = qfj0VarMo11416b;
        }
    }
}
