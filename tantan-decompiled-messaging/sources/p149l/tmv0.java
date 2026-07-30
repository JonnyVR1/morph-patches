package p149l;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class tmv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f171178a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f171179b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f171180c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f171181d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f171182e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f171183f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f171184g;

    public tmv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6, ehx0 ehx0Var7) {
        this.f171178a = ehx0Var;
        this.f171179b = ehx0Var2;
        this.f171180c = ehx0Var3;
        this.f171181d = ehx0Var4;
        this.f171182e = ehx0Var5;
        this.f171183f = ehx0Var6;
        this.f171184g = ehx0Var7;
    }

    /* JADX INFO: renamed from: a */
    public static rmv0 m189721a(p1t0 p1t0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new rmv0(p1t0Var, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        p1t0 p1t0Var = new p1t0();
        Context contextM110876a = ((dct0) this.f171179b).m110876a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f171180c.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new rmv0(p1t0Var, contextM110876a, scheduledExecutorService, rmw0Var, ((nqv0) this.f171182e).zzb().intValue(), ((oqv0) this.f171183f).zzb().booleanValue(), ((qqv0) this.f171184g).zzb().booleanValue());
    }
}
