package p149l;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class a7g0 {

    /* JADX INFO: renamed from: a */
    public volatile grg0 f67922a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f67923b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final rjg0 f67924c;

    public a7g0(rjg0 rjg0Var) {
        this.f67924c = rjg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final grg0 m95288a(slg0 slg0Var) {
        grg0 grg0Var;
        int i = slg0Var.f165190b;
        synchronized (this) {
            try {
                grg0Var = (this.f67922a == null || ((ocg0) this.f67922a).f143036a != i) ? null : this.f67922a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return grg0Var == null ? (grg0) this.f67923b.get(i) : grg0Var;
    }

    /* JADX INFO: renamed from: b */
    public final grg0 m95289b(slg0 slg0Var, tfg0 tfg0Var) {
        grg0 grg0Var;
        int i = slg0Var.f165190b;
        synchronized (this) {
            try {
                if (this.f67922a == null || ((ocg0) this.f67922a).f143036a != i) {
                    grg0Var = (grg0) this.f67923b.get(i);
                    this.f67923b.remove(i);
                } else {
                    grg0Var = this.f67922a;
                    this.f67922a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (grg0Var != null) {
            return grg0Var;
        }
        this.f67924c.getClass();
        kmg0 kmg0Var = new kmg0(i);
        if (tfg0Var != null) {
            kmg0Var.m146532a(tfg0Var);
        }
        return kmg0Var;
    }
}
