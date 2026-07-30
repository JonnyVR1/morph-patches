package p149l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class bnx0 implements Callable<List<sdy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f76454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f76455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f76456c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ clx0 f76457d;

    public bnx0(clx0 clx0Var, String str, String str2, String str3) {
        this.f76454a = str;
        this.f76455b = str2;
        this.f76456c = str3;
        this.f76457d = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<sdy0> call() throws Exception {
        this.f76457d.f81477a.m15310u0();
        return this.f76457d.f81477a.m15290g0().m136171x0(this.f76454a, this.f76455b, this.f76456c);
    }
}
