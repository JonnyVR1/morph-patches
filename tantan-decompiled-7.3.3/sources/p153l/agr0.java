package p153l;

/* JADX INFO: loaded from: classes6.dex */
public class agr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final long f71276a;

    /* JADX INFO: renamed from: b */
    public final zfr0 f71277b;

    public agr0(long j, long j2) {
        this.f71276a = j;
        cgr0 cgr0Var = j2 == 0 ? cgr0.f81725c : new cgr0(0L, j2);
        this.f71277b = new zfr0(cgr0Var, cgr0Var);
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        return this.f71277b;
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f71276a;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return false;
    }
}
