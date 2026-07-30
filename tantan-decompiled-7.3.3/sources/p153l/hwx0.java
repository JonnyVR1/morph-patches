package p153l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hwx0 implements Callable<List<ymy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f111940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f111941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f111942c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ iux0 f111943d;

    public hwx0(iux0 iux0Var, String str, String str2, String str3) {
        this.f111940a = str;
        this.f111941b = str2;
        this.f111942c = str3;
        this.f111943d = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ymy0> call() throws Exception {
        this.f111943d.f116991a.m15364u0();
        return this.f111943d.f116991a.m15344g0().m168770x0(this.f111940a, this.f111941b, this.f111942c);
    }
}
