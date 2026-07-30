package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class fov0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f98634a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f98635b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f98636c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f98637d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f98638e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f98639f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f98640g;

    public fov0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6, ehx0 ehx0Var7) {
        this.f98634a = ehx0Var;
        this.f98635b = ehx0Var2;
        this.f98636c = ehx0Var3;
        this.f98637d = ehx0Var4;
        this.f98638e = ehx0Var5;
        this.f98639f = ehx0Var6;
        this.f98640g = ehx0Var7;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        p1t0 p1t0Var = new p1t0();
        int iIntValue = ((nqv0) this.f98635b).zzb().intValue();
        Context contextM110876a = ((dct0) this.f98636c).m110876a();
        y1t0 y1t0Var = (y1t0) this.f98637d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f98638e.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new dov0(p1t0Var, iIntValue, contextM110876a, y1t0Var, scheduledExecutorService, rmw0Var, ((mqv0) this.f98640g).m156007a());
    }
}
