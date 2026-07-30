package p153l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class gou0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f105390a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f105391b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f105392c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f105393d;

    public gou0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f105390a = kqx0Var;
        this.f105391b = kqx0Var2;
        this.f105392c = kqx0Var3;
        this.f105393d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        ulu0 ulu0VarM163840a = ((nmu0) this.f105390a).m163840a();
        zlu0 zlu0VarZzb = ((pku0) this.f105391b).zzb();
        Executor executor = (Executor) this.f105392c.zzb();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        return new znu0(ulu0VarM163840a, zlu0VarZzb, executor, xvw0Var);
    }
}
