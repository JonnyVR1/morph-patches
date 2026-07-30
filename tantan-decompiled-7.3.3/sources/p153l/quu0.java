package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2288v0;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class quu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f159645a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f159646b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f159647c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f159648d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f159649e;

    public quu0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4, kqx0 kqx0Var5) {
        this.f159645a = kqx0Var;
        this.f159646b = kqx0Var2;
        this.f159647c = kqx0Var3;
        this.f159648d = kqx0Var4;
        this.f159649e = kqx0Var5;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM146114a = ((jlt0) this.f159645a).m146114a();
        final String strZzb = ((i3v0) this.f159646b).zzb();
        zzcei zzceiVarM201659a = ((vlt0) this.f159647c).m201659a();
        final zzbbz zzbbzVar = (zzbbz) this.f159648d.zzb();
        final String str = (String) this.f159649e.zzb();
        fcs0 fcs0Var = new fcs0(new lcs0(contextM146114a));
        bfs0 bfs0VarM13424L = C2288v0.m13424L();
        bfs0VarM13424L.m103981q(zzceiVarM201659a.zzb);
        bfs0VarM13424L.m103983s(zzceiVarM201659a.zzc);
        bfs0VarM13424L.m103982r(true != zzceiVarM201659a.zzd ? 2 : 0);
        final C2288v0 c2288v0 = (C2288v0) bfs0VarM13424L.m185950m();
        fcs0Var.m125046b(new ecs0() { // from class: l.puu0
            @Override // p153l.ecs0
            /* JADX INFO: renamed from: a */
            public final void mo12872a(yds0 yds0Var) {
                ycs0 ycs0Var = (ycs0) yds0Var.m215280q().m13241k();
                ycs0Var.m215174q(zzbbzVar);
                yds0Var.m215284u(ycs0Var);
                kds0 kds0Var = (kds0) yds0Var.m215281r().m13241k();
                kds0Var.m149263q(strZzb);
                kds0Var.m149264r(c2288v0);
                yds0Var.m215286w(kds0Var);
                yds0Var.m215287x(str);
            }
        });
        return fcs0Var;
    }
}
