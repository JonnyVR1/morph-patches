package p153l;

import com.google.android.exoplayer2.C1894k;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vke0 {

    /* JADX INFO: renamed from: a */
    public final List<C1894k> f184479a;

    /* JADX INFO: renamed from: b */
    public final qfj0[] f184480b;

    public vke0(List<C1894k> list) {
        this.f184479a = list;
        this.f184480b = new qfj0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public void m201568a(long j, ig60 ig60Var) {
        mo4.m159233a(j, ig60Var, this.f184480b);
    }

    /* JADX INFO: renamed from: b */
    public void m201569b(bsf bsfVar, jkj0.C17969d c17969d) {
        for (int i = 0; i < this.f184480b.length; i++) {
            c17969d.m145854a();
            qfj0 qfj0VarMo11416b = bsfVar.mo11416b(c17969d.m145856c(), 3);
            C1894k c1894k = this.f184479a.get(i);
            String str = c1894k.f7785l;
            w11.m204366b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strM145855b = c1894k.f7774a;
            if (strM145855b == null) {
                strM145855b = c17969d.m145855b();
            }
            qfj0VarMo11416b.mo11164b(new C1894k.b().m10388U(strM145855b).m10400g0(str).m10402i0(c1894k.f7777d).m10391X(c1894k.f7776c).m10375H(c1894k.f7769D).m10389V(c1894k.f7787n).m10374G());
            this.f184480b[i] = qfj0VarMo11416b;
        }
    }
}
