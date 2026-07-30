package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class vuu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f183124a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f183125b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f183126c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f183127d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f183128e;

    /* JADX INFO: renamed from: f */
    public final ehx0 f183129f;

    /* JADX INFO: renamed from: g */
    public final ehx0 f183130g;

    public vuu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5, ehx0 ehx0Var6, ehx0 ehx0Var7) {
        this.f183124a = ehx0Var;
        this.f183125b = ehx0Var2;
        this.f183126c = ehx0Var3;
        this.f183127d = ehx0Var4;
        this.f183128e = ehx0Var5;
        this.f183129f = ehx0Var6;
        this.f183130g = ehx0Var7;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM110876a = ((dct0) this.f183124a).m110876a();
        iyv0 iyv0VarM190906a = ((twt0) this.f183125b).m190906a();
        ptu0 ptu0VarZzb = ((qtu0) this.f183126c).zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new uuu0(contextM110876a, iyv0VarM190906a, ptu0VarZzb, rmw0Var, (ScheduledExecutorService) this.f183128e.zzb(), (o0v0) this.f183129f.zzb(), (w4w0) this.f183130g.zzb());
    }
}
