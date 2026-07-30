package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class opy0 implements bty0 {

    /* JADX INFO: renamed from: a */
    public final bty0[] f145069a;

    public opy0(bty0[] bty0VarArr) {
        this.f145069a = bty0VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        boolean zMo103896a;
        boolean z;
        boolean z2 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                return z2;
            }
            bty0[] bty0VarArr = this.f145069a;
            int length = bty0VarArr.length;
            int i = 0;
            zMo103896a = false;
            while (i < length) {
                bty0 bty0Var = bty0VarArr[i];
                long jZzc2 = bty0Var.zzc();
                if (jZzc2 != Long.MIN_VALUE) {
                    z = z2;
                    boolean z3 = jZzc2 <= a1y0Var.f67207a;
                    if (jZzc2 != jZzc || z3) {
                        zMo103896a |= bty0Var.mo103896a(a1y0Var);
                    }
                    i++;
                    z2 = z;
                } else {
                    z = z2;
                }
                if (jZzc2 != jZzc) {
                    zMo103896a |= bty0Var.mo103896a(a1y0Var);
                } else {
                    zMo103896a |= bty0Var.mo103896a(a1y0Var);
                }
                i++;
                z2 = z;
            }
            z2 |= zMo103896a;
        } while (zMo103896a);
        return z2;
    }

    @Override // p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
        for (bty0 bty0Var : this.f145069a) {
            bty0Var.mo103897b(j);
        }
    }

    @Override // p149l.bty0
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (bty0 bty0Var : this.f145069a) {
            long jZzb = bty0Var.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p149l.bty0
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (bty0 bty0Var : this.f145069a) {
            long jZzc = bty0Var.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p149l.bty0
    public final boolean zzp() {
        for (bty0 bty0Var : this.f145069a) {
            if (bty0Var.zzp()) {
                return true;
            }
        }
        return false;
    }
}
