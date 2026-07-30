package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class njx0 extends pjx0 {
    public /* synthetic */ njx0(mjx0 mjx0Var) {
        super(null);
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: a */
    public final List mo154593a(Object obj, long j) {
        fjx0 fjx0Var = (fjx0) xlx0.m211703p(obj, j);
        if (fjx0Var.zzc()) {
            return fjx0Var;
        }
        int size = fjx0Var.size();
        fjx0 fjx0VarZzd = fjx0Var.zzd(size == 0 ? 10 : size + size);
        xlx0.m211683D(obj, j, fjx0VarZzd);
        return fjx0VarZzd;
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: b */
    public final void mo154594b(Object obj, long j) {
        ((fjx0) xlx0.m211703p(obj, j)).zzb();
    }

    @Override // p153l.pjx0
    /* JADX INFO: renamed from: c */
    public final void mo154595c(Object obj, Object obj2, long j) {
        fjx0 fjx0VarZzd = (fjx0) xlx0.m211703p(obj, j);
        fjx0 fjx0Var = (fjx0) xlx0.m211703p(obj2, j);
        int size = fjx0VarZzd.size();
        int size2 = fjx0Var.size();
        if (size > 0 && size2 > 0) {
            if (!fjx0VarZzd.zzc()) {
                fjx0VarZzd = fjx0VarZzd.zzd(size2 + size);
            }
            fjx0VarZzd.addAll(fjx0Var);
        }
        if (size > 0) {
            fjx0Var = fjx0VarZzd;
        }
        xlx0.m211683D(obj, j, fjx0Var);
    }
}
