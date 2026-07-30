package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class ykt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f198836a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f198837b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f198838c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f198839d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f198840e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f198841f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f198842g;

    public ykt0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6, ehx0 ehx0Var7) {
        this.f198836a = ehx0Var;
        this.f198837b = ehx0Var2;
        this.f198838c = ehx0Var3;
        this.f198839d = ehx0Var4;
        this.f198840e = ehx0Var5;
        this.f198841f = ehx0Var6;
        this.f198842g = ehx0Var7;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM110876a = ((dct0) this.f198836a).m110876a();
        aiw0 aiw0VarZzb = ((bct0) this.f198837b).zzb();
        f3v0 f3v0Var = (f3v0) this.f198838c.zzb();
        jku0 jku0Var = (jku0) this.f198839d.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new xkt0(contextM110876a, aiw0VarZzb, f3v0Var, jku0Var, rmw0Var, (rmw0) this.f198841f.zzb(), (ScheduledExecutorService) this.f198842g.zzb());
    }
}
