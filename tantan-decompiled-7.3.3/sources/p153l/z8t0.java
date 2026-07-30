package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class z8t0 {

    /* JADX INFO: renamed from: a */
    public final Clock f203416a;

    /* JADX INFO: renamed from: b */
    public final grw0 f203417b;

    /* JADX INFO: renamed from: c */
    public final s9t0 f203418c;

    public z8t0(Clock clock, grw0 grw0Var, s9t0 s9t0Var) {
        this.f203416a = clock;
        this.f203417b = grw0Var;
        this.f203418c = s9t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m219030a(int i, long j) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168423p0)).booleanValue()) {
            return;
        }
        if (j - this.f203417b.zzf() < 0) {
            d2v0.m113737k("Receiving npa decision in the past, ignoring.");
            return;
        }
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168436q0)).booleanValue();
        grw0 grw0Var = this.f203417b;
        if (zBooleanValue) {
            grw0Var.mo131895e(i);
            this.f203417b.mo131902l(j);
        } else {
            grw0Var.mo131895e(-1);
            this.f203417b.mo131902l(j);
        }
    }
}
