package p153l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class lwx0 implements Callable<List<ymy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f133869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f133870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f133871c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ iux0 f133872d;

    public lwx0(iux0 iux0Var, String str, String str2, String str3) {
        this.f133869a = str;
        this.f133870b = str2;
        this.f133871c = str3;
        this.f133872d = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ymy0> call() throws Exception {
        this.f133872d.f116991a.m15364u0();
        return this.f133872d.f116991a.m15344g0().m168770x0(this.f133869a, this.f133870b, this.f133871c);
    }
}
