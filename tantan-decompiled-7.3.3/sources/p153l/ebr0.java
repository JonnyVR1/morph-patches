package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ebr0 {

    /* JADX INFO: renamed from: c */
    public boolean f92957c;

    /* JADX INFO: renamed from: e */
    public int f92959e;

    /* JADX INFO: renamed from: a */
    public dbr0 f92955a = new dbr0();

    /* JADX INFO: renamed from: b */
    public dbr0 f92956b = new dbr0();

    /* JADX INFO: renamed from: d */
    public long f92958d = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final float m120209a() {
        if (this.f92955a.m115168f()) {
            return (float) (1.0E9d / this.f92955a.m115163a());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final int m120210b() {
        return this.f92959e;
    }

    /* JADX INFO: renamed from: c */
    public final long m120211c() {
        if (this.f92955a.m115168f()) {
            return this.f92955a.m115163a();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final long m120212d() {
        if (this.f92955a.m115168f()) {
            return this.f92955a.m115164b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: e */
    public final void m120213e(long j) {
        this.f92955a.m115165c(j);
        if (this.f92955a.m115168f()) {
            this.f92957c = false;
        } else if (this.f92958d != -9223372036854775807L) {
            if (!this.f92957c || this.f92956b.m115167e()) {
                this.f92956b.m115166d();
                this.f92956b.m115165c(this.f92958d);
            }
            this.f92957c = true;
            this.f92956b.m115165c(j);
        }
        if (this.f92957c && this.f92956b.m115168f()) {
            dbr0 dbr0Var = this.f92955a;
            this.f92955a = this.f92956b;
            this.f92956b = dbr0Var;
            this.f92957c = false;
        }
        this.f92958d = j;
        this.f92959e = this.f92955a.m115168f() ? 0 : this.f92959e + 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m120214f() {
        this.f92955a.m115166d();
        this.f92956b.m115166d();
        this.f92957c = false;
        this.f92958d = -9223372036854775807L;
        this.f92959e = 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m120215g() {
        return this.f92955a.m115168f();
    }
}
