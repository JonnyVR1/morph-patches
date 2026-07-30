package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class nfu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f138819a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f138820b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f138821c;

    public nfu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f138819a = ehx0Var;
        this.f138820b = ehx0Var2;
        this.f138821c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        vjs0 vjs0Var = (vjs0) this.f138819a.zzb();
        Clock clock = (Clock) this.f138820b.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new mfu0(vjs0Var, clock, rmw0Var);
    }
}
