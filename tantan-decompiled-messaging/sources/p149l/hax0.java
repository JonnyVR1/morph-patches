package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hax0 extends jax0 {
    public /* synthetic */ hax0(gax0 gax0Var) {
        super(null);
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: a */
    public final List mo120319a(Object obj, long j) {
        z9x0 z9x0Var = (z9x0) rcx0.m178838p(obj, j);
        if (z9x0Var.zzc()) {
            return z9x0Var;
        }
        int size = z9x0Var.size();
        z9x0 z9x0VarZzd = z9x0Var.zzd(size == 0 ? 10 : size + size);
        rcx0.m178818D(obj, j, z9x0VarZzd);
        return z9x0VarZzd;
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: b */
    public final void mo120320b(Object obj, long j) {
        ((z9x0) rcx0.m178838p(obj, j)).zzb();
    }

    @Override // p149l.jax0
    /* JADX INFO: renamed from: c */
    public final void mo120321c(Object obj, Object obj2, long j) {
        z9x0 z9x0VarZzd = (z9x0) rcx0.m178838p(obj, j);
        z9x0 z9x0Var = (z9x0) rcx0.m178838p(obj2, j);
        int size = z9x0VarZzd.size();
        int size2 = z9x0Var.size();
        if (size > 0 && size2 > 0) {
            if (!z9x0VarZzd.zzc()) {
                z9x0VarZzd = z9x0VarZzd.zzd(size2 + size);
            }
            z9x0VarZzd.addAll(z9x0Var);
        }
        if (size > 0) {
            z9x0Var = z9x0VarZzd;
        }
        rcx0.m178818D(obj, j, z9x0Var);
    }
}
