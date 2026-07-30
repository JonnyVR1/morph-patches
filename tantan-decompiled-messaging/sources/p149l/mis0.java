package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mis0 extends dnr0 {

    /* JADX INFO: renamed from: m */
    public final n3t0 f134034m;

    /* JADX INFO: renamed from: n */
    public final w2t0 f134035n;

    public mis0(String str, Map map, n3t0 n3t0Var) {
        super(0, str, new phs0(n3t0Var));
        this.f134034m = n3t0Var;
        w2t0 w2t0Var = new w2t0(null);
        this.f134035n = w2t0Var;
        w2t0Var.m201225d(str, "GET", null, null);
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: j */
    public final jnr0 mo112662j(pmr0 pmr0Var) {
        return jnr0.m142387b(pmr0Var, xnr0.m210207b(pmr0Var));
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ void mo112668s(Object obj) {
        pmr0 pmr0Var = (pmr0) obj;
        this.f134035n.m201227f(pmr0Var.f150286c, pmr0Var.f150284a);
        byte[] bArr = pmr0Var.f150285b;
        if (w2t0.m201220k() && bArr != null) {
            this.f134035n.m201229h(bArr);
        }
        this.f134034m.m157774b(pmr0Var);
    }
}
