package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class pby0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rly0 f148122a;

    public pby0(rly0 rly0Var) {
        this.f148122a = rly0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        rly0 rly0Var = this.f148122a;
        return new ptr0(otr0.m165968x(rly0Var.f160039a.zza, rly0Var.f160042d, false));
    }
}
