package p153l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class x8v0 implements afu0 {

    /* JADX INFO: renamed from: c */
    public final String f192881c;

    /* JADX INFO: renamed from: d */
    public final vcw0 f192882d;

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public boolean f192879a = false;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public boolean f192880b = false;

    /* JADX INFO: renamed from: e */
    public final grw0 f192883e = bxy0.m106933q().m120264i();

    public x8v0(String str, vcw0 vcw0Var) {
        this.f192881c = str;
        this.f192882d = vcw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ucw0 m209755a(String str) {
        String str2 = this.f192883e.mo131896f() ? "" : this.f192881c;
        ucw0 ucw0VarM195443b = ucw0.m195443b(str);
        ucw0VarM195443b.m195445a("tms", Long.toString(bxy0.m106918b().elapsedRealtime(), 10));
        ucw0VarM195443b.m195445a("tid", str2);
        return ucw0VarM195443b;
    }

    @Override // p153l.afu0
    /* JADX INFO: renamed from: b */
    public final void mo97568b(String str, String str2) {
        ucw0 ucw0VarM209755a = m209755a("adapter_init_finished");
        ucw0VarM209755a.m195445a("ancn", str);
        ucw0VarM209755a.m195445a("rqe", str2);
        this.f192882d.mo125151a(ucw0VarM209755a);
    }

    @Override // p153l.afu0
    /* JADX INFO: renamed from: z */
    public final void mo97569z(String str) {
        ucw0 ucw0VarM209755a = m209755a("adapter_init_finished");
        ucw0VarM209755a.m195445a("ancn", str);
        this.f192882d.mo125151a(ucw0VarM209755a);
    }

    @Override // p153l.afu0
    public final void zza(String str) {
        ucw0 ucw0VarM209755a = m209755a("aaia");
        ucw0VarM209755a.m195445a("aair", "MalformedJson");
        this.f192882d.mo125151a(ucw0VarM209755a);
    }

    @Override // p153l.afu0
    public final void zzc(String str) {
        ucw0 ucw0VarM209755a = m209755a("adapter_init_started");
        ucw0VarM209755a.m195445a("ancn", str);
        this.f192882d.mo125151a(ucw0VarM209755a);
    }

    @Override // p153l.afu0
    public final synchronized void zze() {
        if (this.f192880b) {
            return;
        }
        this.f192882d.mo125151a(m209755a("init_finished"));
        this.f192880b = true;
    }

    @Override // p153l.afu0
    public final synchronized void zzf() {
        if (this.f192879a) {
            return;
        }
        this.f192882d.mo125151a(m209755a("init_started"));
        this.f192879a = true;
    }
}
