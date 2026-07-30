package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class vky0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xuy0 f184529a;

    public vky0(xuy0 xuy0Var) {
        this.f184529a = xuy0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        xuy0 xuy0Var = this.f184529a;
        return new v2s0(u2s0.m194300x(xuy0Var.f196334a.zza, xuy0Var.f196337d, false));
    }
}
