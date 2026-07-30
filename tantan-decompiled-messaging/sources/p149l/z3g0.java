package p149l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z3g0<T> implements m250<T>, c4g0 {

    /* JADX INFO: renamed from: a */
    public final g4g0 f201370a;

    /* JADX INFO: renamed from: b */
    public final z3g0<?> f201371b;

    /* JADX INFO: renamed from: c */
    public rc90 f201372c;

    /* JADX INFO: renamed from: d */
    public long f201373d;

    public z3g0(z3g0<?> z3g0Var, boolean z) {
        this.f201373d = Long.MIN_VALUE;
        this.f201371b = z3g0Var;
        this.f201370a = (!z || z3g0Var == null) ? new g4g0() : z3g0Var.f201370a;
    }

    /* JADX INFO: renamed from: b */
    public final void m217046b(c4g0 c4g0Var) {
        this.f201370a.m124367a(c4g0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m217047c(long j) {
        long j2 = this.f201373d;
        if (j2 == Long.MIN_VALUE) {
            this.f201373d = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.f201373d = Long.MAX_VALUE;
        } else {
            this.f201373d = j3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m217048e(long j) {
        if (j < 0) {
            y3g0.m212802a("number requested cannot be negative: ", j);
            return;
        }
        synchronized (this) {
            rc90 rc90Var = this.f201372c;
            if (rc90Var != null) {
                rc90Var.request(j);
            } else {
                m217047c(j);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo106696f(rc90 rc90Var) {
        long j;
        z3g0<?> z3g0Var;
        boolean z;
        synchronized (this) {
            j = this.f201373d;
            this.f201372c = rc90Var;
            z3g0Var = this.f201371b;
            z = z3g0Var != null && j == Long.MIN_VALUE;
        }
        if (z) {
            z3g0Var.mo106696f(rc90Var);
        } else if (j == Long.MIN_VALUE) {
            rc90Var.request(Long.MAX_VALUE);
        } else {
            rc90Var.request(j);
        }
    }

    @Override // p149l.c4g0
    public final boolean isUnsubscribed() {
        return this.f201370a.isUnsubscribed();
    }

    @Override // p149l.c4g0
    public final void unsubscribe() {
        this.f201370a.unsubscribe();
    }

    /* JADX INFO: renamed from: d */
    public void mo99382d() {
    }

    public z3g0(z3g0<?> z3g0Var) {
        this(z3g0Var, true);
    }

    public z3g0() {
        this(null, false);
    }
}
