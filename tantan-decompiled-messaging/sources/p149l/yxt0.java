package p149l;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class yxt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f200660a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f200661b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f200662c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f200663d;

    public yxt0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f200660a = ehx0Var;
        this.f200661b = ehx0Var2;
        this.f200662c = ehx0Var3;
        this.f200663d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        vxt0 vxt0VarZzb = ((xxt0) this.f200660a).zzb();
        Set setZzb = ((chx0) this.f200661b).zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new wxt0(vxt0VarZzb, setZzb, rmw0Var, (ScheduledExecutorService) this.f200663d.zzb());
    }
}
