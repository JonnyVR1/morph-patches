package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class uyy0 implements h2z0 {

    /* JADX INFO: renamed from: a */
    public final h2z0[] f181692a;

    public uyy0(h2z0[] h2z0VarArr) {
        this.f181692a = h2z0VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        boolean zMo101542a;
        boolean z;
        boolean z2 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                return z2;
            }
            h2z0[] h2z0VarArr = this.f181692a;
            int length = h2z0VarArr.length;
            int i = 0;
            zMo101542a = false;
            while (i < length) {
                h2z0 h2z0Var = h2z0VarArr[i];
                long jZzc2 = h2z0Var.zzc();
                if (jZzc2 != Long.MIN_VALUE) {
                    z = z2;
                    boolean z3 = jZzc2 <= gay0Var.f103033a;
                    if (jZzc2 != jZzc || z3) {
                        zMo101542a |= h2z0Var.mo101542a(gay0Var);
                    }
                    i++;
                    z2 = z;
                } else {
                    z = z2;
                }
                if (jZzc2 != jZzc) {
                    zMo101542a |= h2z0Var.mo101542a(gay0Var);
                } else {
                    zMo101542a |= h2z0Var.mo101542a(gay0Var);
                }
                i++;
                z2 = z;
            }
            z2 |= zMo101542a;
        } while (zMo101542a);
        return z2;
    }

    @Override // p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
        for (h2z0 h2z0Var : this.f181692a) {
            h2z0Var.mo101543b(j);
        }
    }

    @Override // p153l.h2z0
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (h2z0 h2z0Var : this.f181692a) {
            long jZzb = h2z0Var.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p153l.h2z0
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (h2z0 h2z0Var : this.f181692a) {
            long jZzc = h2z0Var.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p153l.h2z0
    public final boolean zzp() {
        for (h2z0 h2z0Var : this.f181692a) {
            if (h2z0Var.zzp()) {
                return true;
            }
        }
        return false;
    }
}
