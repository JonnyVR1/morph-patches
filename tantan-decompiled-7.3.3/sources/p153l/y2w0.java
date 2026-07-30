package p153l;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.C2127b0;
import com.google.android.gms.internal.ads.C2311y;
import com.google.android.gms.internal.ads.C2319z;
import com.google.android.gms.internal.ads.zzead;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class y2w0 implements y3w0 {

    /* JADX INFO: renamed from: a */
    public final y3w0 f197282a;

    /* JADX INFO: renamed from: b */
    public final y3w0 f197283b;

    /* JADX INFO: renamed from: c */
    public final haw0 f197284c;

    /* JADX INFO: renamed from: d */
    public final String f197285d;

    /* JADX INFO: renamed from: e */
    public p5u0 f197286e;

    /* JADX INFO: renamed from: f */
    public final Executor f197287f;

    public y2w0(y3w0 y3w0Var, y3w0 y3w0Var2, haw0 haw0Var, String str, Executor executor) {
        this.f197282a = y3w0Var;
        this.f197283b = y3w0Var2;
        this.f197284c = haw0Var;
        this.f197285d = str;
        this.f197287f = executor;
    }

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ hpr mo119326a(z3w0 z3w0Var, x3w0 x3w0Var, Object obj) {
        return m214111e(z3w0Var, x3w0Var, null);
    }

    @Override // p153l.y3w0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized p5u0 zzd() {
        return this.f197286e;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m214109c(z3w0 z3w0Var, x2w0 x2w0Var, x3w0 x3w0Var, p5u0 p5u0Var, d3w0 d3w0Var) throws Exception {
        if (d3w0Var != null) {
            x2w0 x2w0Var2 = new x2w0(x2w0Var.f192200a, x2w0Var.f192201b, x2w0Var.f192202c, x2w0Var.f192203d, x2w0Var.f192204e, x2w0Var.f192205f, d3w0Var.f84951a);
            if (d3w0Var.f84953c != null) {
                this.f197286e = null;
                this.f197284c.m134326e(x2w0Var2);
                return m214112f(d3w0Var.f84953c, z3w0Var);
            }
            hpr hprVarM134325a = this.f197284c.m134325a(x2w0Var2);
            if (hprVarM134325a != null) {
                this.f197286e = null;
                return pvw0.m173987n(hprVarM134325a, new xuw0() { // from class: l.u2w0
                    @Override // p153l.xuw0
                    public final hpr zza(Object obj) {
                        return this.f177249a.m214110d((eaw0) obj);
                    }
                }, this.f197287f);
            }
            this.f197284c.m134326e(x2w0Var2);
            z3w0Var = new z3w0(z3w0Var.f202868b, d3w0Var.f84952b);
        }
        hpr hprVarM138346c = ((i3w0) this.f197282a).m138346c(z3w0Var, x3w0Var, p5u0Var);
        this.f197286e = p5u0Var;
        return hprVarM138346c;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m214110d(eaw0 eaw0Var) throws Exception {
        gaw0 gaw0Var;
        if (eaw0Var == null || eaw0Var.f92815a == null || (gaw0Var = eaw0Var.f92816b) == null) {
            throw new zzead(1, "Empty prefetch");
        }
        ads0 ads0VarM12581L = C2127b0.m12581L();
        zcs0 zcs0VarM13533L = C2311y.m13533L();
        zcs0VarM13533L.m219262t(2);
        zcs0VarM13533L.m219260r(C2319z.m13562N());
        ads0VarM12581L.m97137q(zcs0VarM13533L);
        eaw0Var.f92815a.f178157a.zzb().m218167c().mo103634B((C2127b0) ads0VarM12581L.m185950m());
        return m214112f(eaw0Var.f92815a, ((x2w0) gaw0Var).f192201b);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized hpr m214111e(final z3w0 z3w0Var, final x3w0 x3w0Var, p5u0 p5u0Var) {
        o5u0 o5u0VarMo184819a = x3w0Var.mo184819a(z3w0Var.f202868b);
        o5u0VarMo184819a.mo111696k(new z2w0(this.f197285d));
        final p5u0 p5u0Var2 = (p5u0) o5u0VarMo184819a.zzh();
        p5u0Var2.zzg();
        p5u0Var2.zzg();
        zzl zzlVar = p5u0Var2.zzg().f145318d;
        if (zzlVar.zzs != null || zzlVar.zzx != null) {
            this.f197286e = p5u0Var2;
            return ((i3w0) this.f197282a).m138346c(z3w0Var, x3w0Var, p5u0Var2);
        }
        o7w0 o7w0VarZzg = p5u0Var2.zzg();
        final x2w0 x2w0Var = new x2w0(x3w0Var, z3w0Var, o7w0VarZzg.f145318d, o7w0VarZzg.f145320f, this.f197287f, o7w0VarZzg.f145324j, null);
        return pvw0.m173987n(gvw0.m132580C(((e3w0) this.f197283b).m119328c(z3w0Var, x3w0Var, p5u0Var2)), new xuw0() { // from class: l.v2w0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f182123a.m214109c(z3w0Var, x2w0Var, x3w0Var, p5u0Var2, (d3w0) obj);
            }
        }, this.f197287f);
    }

    /* JADX INFO: renamed from: f */
    public final hpr m214112f(u9w0 u9w0Var, z3w0 z3w0Var) {
        p5u0 p5u0Var = u9w0Var.f178157a;
        this.f197286e = p5u0Var;
        if (u9w0Var.f178159c != null) {
            if (p5u0Var.zzf() != null) {
                u9w0Var.f178159c.m152231g().mo166178q(u9w0Var.f178157a.zzf());
            }
            return pvw0.m173981h(u9w0Var.f178159c);
        }
        p5u0Var.zzb().m218176l(u9w0Var.f178158b);
        return ((i3w0) this.f197282a).m138346c(z3w0Var, null, u9w0Var.f178157a);
    }
}
