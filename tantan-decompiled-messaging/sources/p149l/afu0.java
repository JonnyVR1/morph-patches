package p149l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class afu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f69221a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f69222b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f69223c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f69224d;

    public afu0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f69221a = ehx0Var;
        this.f69222b = ehx0Var2;
        this.f69223c = ehx0Var3;
        this.f69224d = ehx0Var4;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ocu0 ocu0VarM130614a = ((hdu0) this.f69221a).m130614a();
        tcu0 tcu0VarZzb = ((jbu0) this.f69222b).zzb();
        Executor executor = (Executor) this.f69223c.zzb();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new teu0(ocu0VarM130614a, tcu0VarZzb, executor, rmw0Var);
    }
}
