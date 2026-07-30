package p153l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ifg0 {

    /* JADX INFO: renamed from: a */
    public volatile ozg0 f114662a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f114663b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final zrg0 f114664c;

    public ifg0(zrg0 zrg0Var) {
        this.f114664c = zrg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ozg0 m139728a(aug0 aug0Var) {
        ozg0 ozg0Var;
        int i = aug0Var.f73493b;
        synchronized (this) {
            try {
                ozg0Var = (this.f114662a == null || ((wkg0) this.f114662a).f189547a != i) ? null : this.f114662a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ozg0Var == null ? (ozg0) this.f114663b.get(i) : ozg0Var;
    }

    /* JADX INFO: renamed from: b */
    public final ozg0 m139729b(aug0 aug0Var, bog0 bog0Var) {
        ozg0 ozg0Var;
        int i = aug0Var.f73493b;
        synchronized (this) {
            try {
                if (this.f114662a == null || ((wkg0) this.f114662a).f189547a != i) {
                    ozg0Var = (ozg0) this.f114663b.get(i);
                    this.f114663b.remove(i);
                } else {
                    ozg0Var = this.f114662a;
                    this.f114662a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ozg0Var != null) {
            return ozg0Var;
        }
        this.f114664c.getClass();
        sug0 sug0Var = new sug0(i);
        if (bog0Var != null) {
            sug0Var.m188025a(bog0Var);
        }
        return sug0Var;
    }
}
