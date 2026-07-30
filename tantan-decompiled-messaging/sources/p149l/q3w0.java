package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class q3w0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f152521a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f152522b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f152523c;

    public q3w0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f152521a = ehx0Var;
        this.f152522b = ehx0Var2;
        this.f152523c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        egx0 egx0VarM159363a = ngx0.m159363a(zgx0.m218724a(this.f152521a));
        egx0 egx0VarM159363a2 = ngx0.m159363a(zgx0.m218724a(this.f152522b));
        Object s3w0Var = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131853A8)).booleanValue() ? new s3w0((p3w0) egx0VarM159363a.zzb(), (ScheduledExecutorService) this.f152523c.zzb()) : (p3w0) egx0VarM159363a2.zzb();
        wgx0.m203089b(s3w0Var);
        return s3w0Var;
    }
}
