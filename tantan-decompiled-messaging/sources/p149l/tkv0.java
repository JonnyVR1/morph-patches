package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class tkv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f170917a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f170918b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f170919c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f170920d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f170921e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f170922f;

    public tkv0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6) {
        this.f170917a = ehx0Var;
        this.f170918b = ehx0Var2;
        this.f170919c = ehx0Var3;
        this.f170920d = ehx0Var4;
        this.f170921e = ehx0Var5;
        this.f170922f = ehx0Var6;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new rkv0(rmw0Var, (ScheduledExecutorService) this.f170918b.zzb(), (String) this.f170919c.zzb(), (Context) this.f170920d.zzb(), ((twt0) this.f170921e).m190906a(), (xbt0) this.f170922f.zzb());
    }
}
