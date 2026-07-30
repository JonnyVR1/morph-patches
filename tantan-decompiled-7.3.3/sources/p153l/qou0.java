package p153l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class qou0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final jou0 f158759a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f158760b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f158761c;

    public qou0(jou0 jou0Var, kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f158759a = jou0Var;
        this.f158760b = kqx0Var;
        this.f158761c = kqx0Var2;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yfu0(((gsu0) this.f158760b).zzb(), (Executor) this.f158761c.zzb());
    }
}
