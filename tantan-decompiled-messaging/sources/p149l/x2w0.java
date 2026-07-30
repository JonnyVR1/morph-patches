package p149l;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class x2w0 {

    /* JADX INFO: renamed from: a */
    public final Object f190837a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f190838b;

    /* JADX INFO: renamed from: c */
    public final gnr f190839c;

    /* JADX INFO: renamed from: d */
    public final List f190840d;

    /* JADX INFO: renamed from: e */
    public final gnr f190841e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ y2w0 f190842f;

    public x2w0(y2w0 y2w0Var, Object obj, String str, gnr gnrVar, List list, gnr gnrVar2) {
        this.f190842f = y2w0Var;
        this.f190837a = obj;
        this.f190838b = str;
        this.f190839c = gnrVar;
        this.f190840d = list;
        this.f190841e = gnrVar2;
    }

    /* JADX INFO: renamed from: a */
    public final g2w0 m206873a() {
        Object obj = this.f190837a;
        String strMo119267f = this.f190838b;
        if (strMo119267f == null) {
            strMo119267f = this.f190842f.mo119267f(obj);
        }
        final g2w0 g2w0Var = new g2w0(obj, strMo119267f, this.f190841e);
        this.f190842f.f195719c.mo114633S(g2w0Var);
        gnr gnrVar = this.f190839c;
        Runnable runnable = new Runnable() { // from class: l.u2w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f173527a.f190842f.f195719c.mo114632P(g2w0Var);
            }
        };
        rmw0 rmw0Var = i3t0.f111377f;
        gnrVar.addListener(runnable, rmw0Var);
        jmw0.m142245r(g2w0Var, new v2w0(this, g2w0Var), rmw0Var);
        return g2w0Var;
    }

    /* JADX INFO: renamed from: b */
    public final x2w0 m206874b(Object obj) {
        return this.f190842f.m212753b(obj, m206873a());
    }

    /* JADX INFO: renamed from: c */
    public final x2w0 m206875c(Class cls, rlw0 rlw0Var) {
        return new x2w0(this.f190842f, this.f190837a, this.f190838b, this.f190839c, this.f190840d, jmw0.m142233f(this.f190841e, cls, rlw0Var, this.f190842f.f195717a));
    }

    /* JADX INFO: renamed from: d */
    public final x2w0 m206876d(final gnr gnrVar) {
        return m206879g(new rlw0() { // from class: l.o2w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return gnrVar;
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: e */
    public final x2w0 m206877e(final e2w0 e2w0Var) {
        return m206878f(new rlw0() { // from class: l.n2w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(e2w0Var.zza(obj));
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final x2w0 m206878f(rlw0 rlw0Var) {
        return m206879g(rlw0Var, this.f190842f.f195717a);
    }

    /* JADX INFO: renamed from: g */
    public final x2w0 m206879g(rlw0 rlw0Var, Executor executor) {
        return new x2w0(this.f190842f, this.f190837a, this.f190838b, this.f190839c, this.f190840d, jmw0.m142241n(this.f190841e, rlw0Var, executor));
    }

    /* JADX INFO: renamed from: h */
    public final x2w0 m206880h(String str) {
        return new x2w0(this.f190842f, this.f190837a, str, this.f190839c, this.f190840d, this.f190841e);
    }

    /* JADX INFO: renamed from: i */
    public final x2w0 m206881i(long j, TimeUnit timeUnit) {
        return new x2w0(this.f190842f, this.f190837a, this.f190838b, this.f190839c, this.f190840d, jmw0.m142242o(this.f190841e, j, timeUnit, this.f190842f.f195718b));
    }
}
