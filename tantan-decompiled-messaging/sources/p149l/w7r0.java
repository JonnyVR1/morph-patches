package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class w7r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final long f185093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z7r0 f185094b;

    public w7r0(z7r0 z7r0Var, long j) {
        this.f185094b = z7r0Var;
        this.f185093a = j;
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        t6r0 t6r0VarM105802a = this.f185094b.f202062g[0].m105802a(j);
        int i = 1;
        while (true) {
            z7r0 z7r0Var = this.f185094b;
            if (i >= z7r0Var.f202062g.length) {
                return t6r0VarM105802a;
            }
            t6r0 t6r0VarM105802a2 = z7r0Var.f202062g[i].m105802a(j);
            if (t6r0VarM105802a2.f168638a.f184991b < t6r0VarM105802a.f168638a.f184991b) {
                t6r0VarM105802a = t6r0VarM105802a2;
            }
            i++;
        }
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f185093a;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
