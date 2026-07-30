package p149l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class rzu0 implements u5u0 {

    /* JADX INFO: renamed from: c */
    public final String f161688c;

    /* JADX INFO: renamed from: d */
    public final p3w0 f161689d;

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public boolean f161686a = false;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public boolean f161687b = false;

    /* JADX INFO: renamed from: e */
    public final aiw0 f161690e = vny0.m199079q().m212279i();

    public rzu0(String str, p3w0 p3w0Var) {
        this.f161688c = str;
        this.f161689d = p3w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final o3w0 m181770a(String str) {
        String str2 = this.f161690e.mo96947f() ? "" : this.f161688c;
        o3w0 o3w0VarM162489b = o3w0.m162489b(str);
        o3w0VarM162489b.m162491a("tms", Long.toString(vny0.m199064b().elapsedRealtime(), 10));
        o3w0VarM162489b.m162491a("tid", str2);
        return o3w0VarM162489b;
    }

    @Override // p149l.u5u0
    /* JADX INFO: renamed from: b */
    public final void mo132586b(String str, String str2) {
        o3w0 o3w0VarM181770a = m181770a("adapter_init_finished");
        o3w0VarM181770a.m162491a("ancn", str);
        o3w0VarM181770a.m162491a("rqe", str2);
        this.f161689d.mo124429a(o3w0VarM181770a);
    }

    @Override // p149l.u5u0
    /* JADX INFO: renamed from: z */
    public final void mo132587z(String str) {
        o3w0 o3w0VarM181770a = m181770a("adapter_init_finished");
        o3w0VarM181770a.m162491a("ancn", str);
        this.f161689d.mo124429a(o3w0VarM181770a);
    }

    @Override // p149l.u5u0
    public final void zza(String str) {
        o3w0 o3w0VarM181770a = m181770a("aaia");
        o3w0VarM181770a.m162491a("aair", "MalformedJson");
        this.f161689d.mo124429a(o3w0VarM181770a);
    }

    @Override // p149l.u5u0
    public final void zzc(String str) {
        o3w0 o3w0VarM181770a = m181770a("adapter_init_started");
        o3w0VarM181770a.m162491a("ancn", str);
        this.f161689d.mo124429a(o3w0VarM181770a);
    }

    @Override // p149l.u5u0
    public final synchronized void zze() {
        if (this.f161687b) {
            return;
        }
        this.f161689d.mo124429a(m181770a("init_finished"));
        this.f161687b = true;
    }

    @Override // p149l.u5u0
    public final synchronized void zzf() {
        if (this.f161686a) {
            return;
        }
        this.f161689d.mo124429a(m181770a("init_started"));
        this.f161686a = true;
    }
}
