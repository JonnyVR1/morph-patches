package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class z3g0<T> implements m250<T>, c4g0 {

    /* JADX INFO: renamed from: a */
    public final g4g0 f9188a;

    /* JADX INFO: renamed from: b */
    public final z3g0<?> f9189b;

    /* JADX INFO: renamed from: c */
    public rc90 f9190c;

    /* JADX INFO: renamed from: d */
    public long f9191d;

    public z3g0(z3g0<?> z3g0Var, boolean z) {
        this.f9191d = Long.MIN_VALUE;
        this.f9189b = z3g0Var;
        this.f9188a = (!z || z3g0Var == null) ? new g4g0() : z3g0Var.f9188a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9240b(c4g0 c4g0Var) {
        this.f9188a.m4517a(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m9241c(long j) {
        long j2 = this.f9191d;
        if (j2 == Long.MIN_VALUE) {
            this.f9191d = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.f9191d = Long.MAX_VALUE;
        } else {
            this.f9191d = j3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9242e(long j) {
        if (j < 0) {
            y3g0.m8887a("number requested cannot be negative: ", j);
            return;
        }
        synchronized (this) {
            rc90 rc90Var = this.f9190c;
            if (rc90Var != null) {
                rc90Var.request(j);
            } else {
                m9241c(j);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo3257f(rc90 rc90Var) {
        long j;
        z3g0<?> z3g0Var;
        boolean z;
        synchronized (this) {
            j = this.f9191d;
            this.f9190c = rc90Var;
            z3g0Var = this.f9189b;
            z = z3g0Var != null && j == Long.MIN_VALUE;
        }
        if (z) {
            z3g0Var.mo3257f(rc90Var);
        } else if (j == Long.MIN_VALUE) {
            rc90Var.request(Long.MAX_VALUE);
        } else {
            rc90Var.request(j);
        }
    }

    @Override // p003l.c4g0
    public final boolean isUnsubscribed() {
        return this.f9188a.isUnsubscribed();
    }

    @Override // p003l.c4g0
    public final void unsubscribe() {
        this.f9188a.unsubscribe();
    }

    /* JADX INFO: renamed from: d */
    public void mo2918d() {
    }

    public z3g0(z3g0<?> z3g0Var) {
        this(z3g0Var, true);
    }

    public z3g0() {
        this(null, false);
    }
}
