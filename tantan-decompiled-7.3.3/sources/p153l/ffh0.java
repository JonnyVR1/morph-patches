package p153l;

/* JADX INFO: loaded from: classes.dex */
public class ffh0<T> implements wk90<Void> {

    /* JADX INFO: renamed from: a */
    public final wk90<T> f98772a;

    /* JADX INFO: renamed from: l.ffh0$a */
    public class C16966a extends pud<T, Void> {
        public C16966a(z06 z06Var) {
            super(z06Var);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: h */
        public void mo8577h(T t, int i) {
            if (ji2.m144947d(i)) {
                m173861o().mo144954b(null, i);
            }
        }
    }

    public ffh0(wk90<T> wk90Var) {
        this.f98772a = wk90Var;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<Void> z06Var, yk90 yk90Var) {
        this.f98772a.mo8539b(new C16966a(z06Var), yk90Var);
    }
}
