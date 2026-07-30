package p149l;

/* JADX INFO: loaded from: classes6.dex */
public class u6r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final long f174879a;

    /* JADX INFO: renamed from: b */
    public final t6r0 f174880b;

    public u6r0(long j, long j2) {
        this.f174879a = j;
        w6r0 w6r0Var = j2 == 0 ? w6r0.f184989c : new w6r0(0L, j2);
        this.f174880b = new t6r0(w6r0Var, w6r0Var);
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        return this.f174880b;
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f174879a;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return false;
    }
}
