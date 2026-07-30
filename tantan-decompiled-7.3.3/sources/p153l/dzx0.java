package p153l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class dzx0 implements Callable<List<ymy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f91389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iux0 f91390b;

    public dzx0(iux0 iux0Var, String str) {
        this.f91389a = str;
        this.f91390b = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ymy0> call() throws Exception {
        this.f91390b.f116991a.m15364u0();
        return this.f91390b.f116991a.m15344g0().m168728S0(this.f91389a);
    }
}
