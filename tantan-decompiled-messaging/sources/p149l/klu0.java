package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.C2265v0;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class klu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f123714a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f123715b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f123716c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f123717d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f123718e;

    public klu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f123714a = ehx0Var;
        this.f123715b = ehx0Var2;
        this.f123716c = ehx0Var3;
        this.f123717d = ehx0Var4;
        this.f123718e = ehx0Var5;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM110876a = ((dct0) this.f123714a).m110876a();
        final String strZzb = ((cuu0) this.f123715b).zzb();
        zzcei zzceiVarM168371a = ((pct0) this.f123716c).m168371a();
        final zzbbz zzbbzVar = (zzbbz) this.f123717d.zzb();
        final String str = (String) this.f123718e.zzb();
        z2s0 z2s0Var = new z2s0(new f3s0(contextM110876a));
        v5s0 v5s0VarM13370L = C2265v0.m13370L();
        v5s0VarM13370L.m197178q(zzceiVarM168371a.zzb);
        v5s0VarM13370L.m197180s(zzceiVarM168371a.zzc);
        v5s0VarM13370L.m197179r(true != zzceiVarM168371a.zzd ? 2 : 0);
        final C2265v0 c2265v0 = (C2265v0) v5s0VarM13370L.m153521m();
        z2s0Var.m216993b(new y2s0() { // from class: l.jlu0
            @Override // p149l.y2s0
            /* JADX INFO: renamed from: a */
            public final void mo12818a(s4s0 s4s0Var) {
                s3s0 s3s0Var = (s3s0) s4s0Var.m182306q().m13187k();
                s3s0Var.m182202q(zzbbzVar);
                s4s0Var.m182310u(s3s0Var);
                e4s0 e4s0Var = (e4s0) s4s0Var.m182307r().m13187k();
                e4s0Var.m114702q(strZzb);
                e4s0Var.m114703r(c2265v0);
                s4s0Var.m182312w(e4s0Var);
                s4s0Var.m182313x(str);
            }
        });
        return z2s0Var;
    }
}
