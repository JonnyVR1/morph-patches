package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e3c implements c3c {

    /* JADX INFO: renamed from: a */
    public final q35 f89003a;

    /* JADX INFO: renamed from: b */
    public final long f89004b;

    public e3c(q35 q35Var, long j) {
        this.f89003a = q35Var;
        this.f89004b = j;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: c */
    public long mo104993c(long j) {
        return this.f89003a.f152379e[(int) j] - this.f89004b;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: d */
    public long mo104994d(long j, long j2) {
        return this.f89003a.f152378d[(int) j];
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: e */
    public long mo104995e(long j, long j2) {
        return 0L;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: f */
    public long mo104996f(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: g */
    public long mo104997g(long j, long j2) {
        return this.f89003a.m172741a(j + this.f89004b);
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: h */
    public long mo104998h(long j) {
        return this.f89003a.f152375a;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: i */
    public long mo104999i() {
        return 0L;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: j */
    public fcc0 mo105000j(long j) {
        q35 q35Var = this.f89003a;
        int i = (int) j;
        return new fcc0(null, q35Var.f152377c[i], q35Var.f152376b[i]);
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: k */
    public boolean mo105001k() {
        return true;
    }

    @Override // p149l.c3c
    /* JADX INFO: renamed from: l */
    public long mo105002l(long j, long j2) {
        return this.f89003a.f152375a;
    }
}
