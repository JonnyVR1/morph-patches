package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class o5v0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f141935a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f141936b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f141937c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f141938d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f141939e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f141940f;

    public o5v0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6) {
        this.f141935a = ehx0Var;
        this.f141936b = ehx0Var2;
        this.f141937c = ehx0Var3;
        this.f141938d = ehx0Var4;
        this.f141939e = ehx0Var5;
        this.f141940f = ehx0Var6;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n5v0 zzb() {
        tot0 tot0Var = (tot0) this.f141935a.zzb();
        p4v0 p4v0VarZzb = ((q4v0) this.f141936b).zzb();
        ext0 ext0Var = (ext0) this.f141937c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f141938d.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new n5v0(tot0Var, p4v0VarZzb, ext0Var, scheduledExecutorService, rmw0Var, (mnu0) this.f141940f.zzb());
    }
}
