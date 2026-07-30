package p149l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class xpx0 implements Callable<List<sdy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f193965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ clx0 f193966b;

    public xpx0(clx0 clx0Var, String str) {
        this.f193965a = str;
        this.f193966b = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<sdy0> call() throws Exception {
        this.f193966b.f81477a.m15310u0();
        return this.f193966b.f81477a.m15290g0().m136129S0(this.f193965a);
    }
}
