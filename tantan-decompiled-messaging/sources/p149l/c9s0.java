package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class c9s0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f79964a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f79965b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f79966c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f79967d;

    public c9s0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f79964a = ehx0Var;
        this.f79965b = ehx0Var2;
        this.f79966c = ehx0Var3;
        this.f79967d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* synthetic */ Object zzb() {
        return new b9s0(((dct0) this.f79964a).m110876a(), (ScheduledExecutorService) this.f79965b.zzb(), new d9s0(), (w4w0) this.f79967d.zzb());
    }
}
