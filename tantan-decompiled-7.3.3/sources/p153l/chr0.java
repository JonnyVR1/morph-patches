package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class chr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final long f81859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fhr0 f81860b;

    public chr0(fhr0 fhr0Var, long j) {
        this.f81860b = fhr0Var;
        this.f81859a = j;
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        zfr0 zfr0VarM140022a = this.f81860b.f99111g[0].m140022a(j);
        int i = 1;
        while (true) {
            fhr0 fhr0Var = this.f81860b;
            if (i >= fhr0Var.f99111g.length) {
                return zfr0VarM140022a;
            }
            zfr0 zfr0VarM140022a2 = fhr0Var.f99111g[i].m140022a(j);
            if (zfr0VarM140022a2.f204191a.f81727b < zfr0VarM140022a.f204191a.f81727b) {
                zfr0VarM140022a = zfr0VarM140022a2;
            }
            i++;
        }
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f81859a;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
