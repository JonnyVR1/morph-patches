package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vdr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final ydr0 f183649a;

    /* JADX INFO: renamed from: b */
    public final long f183650b;

    /* JADX INFO: renamed from: c */
    public final long f183651c;

    /* JADX INFO: renamed from: d */
    public final long f183652d;

    /* JADX INFO: renamed from: e */
    public final long f183653e;

    /* JADX INFO: renamed from: f */
    public final long f183654f;

    public vdr0(ydr0 ydr0Var, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f183649a = ydr0Var;
        this.f183650b = j;
        this.f183651c = j3;
        this.f183652d = j4;
        this.f183653e = j5;
        this.f183654f = j6;
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        cgr0 cgr0Var = new cgr0(j, xdr0.m210484f(this.f183649a.zza(j), 0L, this.f183651c, this.f183652d, this.f183653e, this.f183654f));
        return new zfr0(cgr0Var, cgr0Var);
    }

    /* JADX INFO: renamed from: g */
    public final long m200996g(long j) {
        return this.f183649a.zza(j);
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f183650b;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
