package p153l;

/* JADX INFO: loaded from: classes.dex */
public class t80 implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final wk90<n0f> f172484a;

    /* JADX INFO: renamed from: l.t80$a */
    public static class C20255a extends pud<n0f, n0f> {
        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            if (n0fVar == null) {
                m173861o().mo144954b(null, i);
                return;
            }
            if (!n0f.m160956Z(n0fVar)) {
                n0fVar.m160972e0();
            }
            m173861o().mo144954b(n0fVar, i);
        }

        public C20255a(z06<n0f> z06Var) {
            super(z06Var);
        }
    }

    public t80(wk90<n0f> wk90Var) {
        this.f172484a = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        this.f172484a.mo8539b(new C20255a(z06Var), yk90Var);
    }
}
