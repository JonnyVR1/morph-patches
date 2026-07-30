package p149l;

import com.google.android.exoplayer2.C1871k;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class t860 implements t6e0 {

    /* JADX INFO: renamed from: a */
    public C1871k f168803a;

    /* JADX INFO: renamed from: b */
    public eri0 f168804b;

    /* JADX INFO: renamed from: c */
    public m6j0 f168805c;

    public t860(String str) {
        this.f168803a = new C1871k.b().m10346g0(str).m10320G();
    }

    @Override // p149l.t6e0
    /* JADX INFO: renamed from: a */
    public void mo115502a(d860 d860Var) {
        m187520b();
        long jM117839d = this.f168804b.m117839d();
        long jM117840e = this.f168804b.m117840e();
        if (jM117839d == -9223372036854775807L || jM117840e == -9223372036854775807L) {
            return;
        }
        C1871k c1871k = this.f168803a;
        if (jM117840e != c1871k.f7752p) {
            C1871k c1871kM10320G = c1871k.m10282b().m10350k0(jM117840e).m10320G();
            this.f168803a = c1871kM10320G;
            this.f168805c.mo11110b(c1871kM10320G);
        }
        int iM110295a = d860Var.m110295a();
        this.f168805c.m153238d(d860Var, iM110295a);
        this.f168805c.mo11109a(jM117839d, 1, iM110295a, 0, null);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    /* JADX INFO: renamed from: b */
    public final void m187520b() {
        p11.m167015i(this.f168804b);
        vck0.m197866j(this.f168805c);
    }

    @Override // p149l.t6e0
    /* JADX INFO: renamed from: c */
    public void mo115503c(eri0 eri0Var, uqf uqfVar, fbj0.C16793d c16793d) {
        this.f168804b = eri0Var;
        c16793d.m120357a();
        m6j0 m6j0VarMo11362b = uqfVar.mo11362b(c16793d.m120359c(), 5);
        this.f168805c = m6j0VarMo11362b;
        m6j0VarMo11362b.mo11110b(this.f168803a);
    }
}
