package p149l;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class gqu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f103983a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f103984b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f103985c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f103986d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f103987e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f103988f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f103989g;

    /* JADX INFO: renamed from: h */
    public final ehx0 f103990h;

    /* JADX INFO: renamed from: i */
    public final ehx0 f103991i;

    /* JADX INFO: renamed from: j */
    public final ehx0 f103992j;

    public gqu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6, ehx0 ehx0Var7, ehx0 ehx0Var8, ehx0 ehx0Var9, ehx0 ehx0Var10) {
        this.f103983a = ehx0Var;
        this.f103984b = ehx0Var2;
        this.f103985c = ehx0Var3;
        this.f103986d = ehx0Var4;
        this.f103987e = ehx0Var5;
        this.f103988f = ehx0Var6;
        this.f103989g = ehx0Var7;
        this.f103990h = ehx0Var8;
        this.f103991i = ehx0Var9;
        this.f103992j = ehx0Var10;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.f103983a.zzb();
        Context contextM110876a = ((dct0) this.f103984b).m110876a();
        WeakReference weakReferenceM115752a = ((ect0) this.f103985c).m115752a();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new fqu0(executor, contextM110876a, weakReferenceM115752a, rmw0Var, (blu0) this.f103987e.zzb(), (ScheduledExecutorService) this.f103988f.zzb(), (bou0) this.f103989g.zzb(), ((pct0) this.f103990h).m168371a(), ((t5u0) this.f103991i).zzb(), (b5w0) this.f103992j.zzb());
    }
}
