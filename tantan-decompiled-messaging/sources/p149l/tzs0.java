package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class tzs0 {

    /* JADX INFO: renamed from: a */
    public final Clock f172752a;

    /* JADX INFO: renamed from: b */
    public final aiw0 f172753b;

    /* JADX INFO: renamed from: c */
    public final m0t0 f172754c;

    public tzs0(Clock clock, aiw0 aiw0Var, m0t0 m0t0Var) {
        this.f172752a = clock;
        this.f172753b = aiw0Var;
        this.f172754c = m0t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m191215a(int i, long j) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132352p0)).booleanValue()) {
            return;
        }
        if (j - this.f172753b.zzf() < 0) {
            xsu0.m210834k("Receiving npa decision in the past, ignoring.");
            return;
        }
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132365q0)).booleanValue();
        aiw0 aiw0Var = this.f172753b;
        if (zBooleanValue) {
            aiw0Var.mo96946e(i);
            this.f172753b.mo96953l(j);
        } else {
            aiw0Var.mo96946e(-1);
            this.f172753b.mo96953l(j);
        }
    }
}
