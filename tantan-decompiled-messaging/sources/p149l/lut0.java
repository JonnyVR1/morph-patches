package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class lut0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f130089a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f130090b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f130091c;

    public lut0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3) {
        this.f130089a = ehx0Var;
        this.f130090b = ehx0Var2;
        this.f130091c = ehx0Var3;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f130089a.zzb();
        final zzcei zzceiVarM168371a = ((pct0) this.f130090b).m168371a();
        final iyv0 iyv0VarM190906a = ((twt0) this.f130091c).m190906a();
        return new yew0() { // from class: l.kut0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                kxv0 kxv0Var = (kxv0) obj;
                wrr0 wrr0Var = new wrr0(context);
                wrr0Var.m205293p(kxv0Var.f125159C);
                wrr0Var.m205294q(kxv0Var.f125160D.toString());
                wrr0Var.m205292o(zzceiVarM168371a.zza);
                wrr0Var.m205291n(iyv0VarM190906a.f115496f);
                return wrr0Var;
            }
        };
    }
}
