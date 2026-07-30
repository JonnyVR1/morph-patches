package p149l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class teu0 implements dyt0 {

    /* JADX INFO: renamed from: a */
    public final ocu0 f169913a;

    /* JADX INFO: renamed from: b */
    public final tcu0 f169914b;

    /* JADX INFO: renamed from: c */
    public final Executor f169915c;

    /* JADX INFO: renamed from: d */
    public final Executor f169916d;

    public teu0(ocu0 ocu0Var, tcu0 tcu0Var, Executor executor, Executor executor2) {
        this.f169913a = ocu0Var;
        this.f169914b = tcu0Var;
        this.f169915c = executor;
        this.f169916d = executor2;
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        if (this.f169914b.mo183426d()) {
            ocu0 ocu0Var = this.f169913a;
            b6w0 b6w0VarM163598h0 = ocu0Var.m163598h0();
            if (b6w0VarM163598h0 == null && ocu0Var.m163602j0() != null && ((Boolean) d1s0.m109677c().m144697a(m7s0.f132162a5)).booleanValue()) {
                ocu0 ocu0Var2 = this.f169913a;
                gnr gnrVarM163602j0 = ocu0Var2.m163602j0();
                n3t0 n3t0VarM163589c0 = ocu0Var2.m163589c0();
                if (gnrVarM163602j0 == null || n3t0VarM163589c0 == null) {
                    return;
                }
                jmw0.m142245r(jmw0.m142239l(gnrVarM163602j0, n3t0VarM163589c0), new seu0(this), this.f169916d);
                return;
            }
            if (b6w0VarM163598h0 != null) {
                ocu0 ocu0Var3 = this.f169913a;
                q9t0 q9t0VarM163593e0 = ocu0Var3.m163593e0();
                q9t0 q9t0VarM163595f0 = ocu0Var3.m163595f0();
                if (q9t0VarM163593e0 == null) {
                    q9t0VarM163593e0 = q9t0VarM163595f0 != null ? q9t0VarM163595f0 : null;
                }
                if (q9t0VarM163593e0 != null) {
                    m188624c(q9t0VarM163593e0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m188624c(final q9t0 q9t0Var) {
        this.f169915c.execute(new Runnable() { // from class: l.reu0
            @Override // java.lang.Runnable
            public final void run() {
                q9t0Var.mo13674Z("onSdkImpression", new e01());
            }
        });
    }
}
