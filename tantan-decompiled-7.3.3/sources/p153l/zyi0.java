package p153l;

/* JADX INFO: loaded from: classes.dex */
public class zyi0 implements wk90<n0f> {

    /* JADX INFO: renamed from: a */
    public final azi0<n0f>[] f206604a;

    /* JADX INFO: renamed from: l.zyi0$a */
    public class C21931a extends pud<n0f, n0f> {

        /* JADX INFO: renamed from: c */
        public final yk90 f206605c;

        /* JADX INFO: renamed from: d */
        public final int f206606d;

        /* JADX INFO: renamed from: e */
        public final q3d0 f206607e;

        public C21931a(z06<n0f> z06Var, yk90 yk90Var, int i) {
            super(z06Var);
            this.f206605c = yk90Var;
            this.f206606d = i;
            this.f206607e = yk90Var.mo117678t().m8635s();
        }

        @Override // p153l.pud, p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable th) {
            if (zyi0.this.m222125e(this.f206606d + 1, m173861o(), this.f206605c)) {
                return;
            }
            m173861o().onFailure(th);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(n0f n0fVar, int i) {
            if (n0fVar != null && (ji2.m144948e(i) || czi0.m113343c(n0fVar, this.f206607e))) {
                m173861o().mo144954b(n0fVar, i);
            } else if (ji2.m144947d(i)) {
                n0f.m160959n(n0fVar);
                if (zyi0.this.m222125e(this.f206606d + 1, m173861o(), this.f206605c)) {
                    return;
                }
                m173861o().mo144954b(null, 1);
            }
        }
    }

    public zyi0(azi0<n0f>... azi0VarArr) {
        azi0<n0f>[] azi0VarArr2 = (azi0[]) wn80.m207182g(azi0VarArr);
        this.f206604a = azi0VarArr2;
        wn80.m207180e(0, azi0VarArr2.length);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        if (yk90Var.mo117678t().m8635s() == null) {
            z06Var.mo144954b(null, 1);
        } else {
            if (m222125e(0, z06Var, yk90Var)) {
                return;
            }
            z06Var.mo144954b(null, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m222124d(int i, q3d0 q3d0Var) {
        while (true) {
            azi0<n0f>[] azi0VarArr = this.f206604a;
            if (i >= azi0VarArr.length) {
                return -1;
            }
            if (azi0VarArr[i].mo8538a(q3d0Var)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m222125e(int i, z06<n0f> z06Var, yk90 yk90Var) {
        int iM222124d = m222124d(i, yk90Var.mo117678t().m8635s());
        if (iM222124d == -1) {
            return false;
        }
        this.f206604a[iM222124d].mo8539b(new C21931a(z06Var, yk90Var, iM222124d), yk90Var);
        return true;
    }
}
