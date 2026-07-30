package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class tfv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f170025a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f170026b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f170027c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f170028d;

    public tfv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f170025a = ehx0Var;
        this.f170026b = ehx0Var2;
        this.f170027c = ehx0Var3;
        this.f170028d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM110876a = ((dct0) this.f170025a).m110876a();
        y1t0 y1t0Var = (y1t0) this.f170026b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f170027c.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new rfv0(contextM110876a, y1t0Var, scheduledExecutorService, rmw0Var);
    }
}
