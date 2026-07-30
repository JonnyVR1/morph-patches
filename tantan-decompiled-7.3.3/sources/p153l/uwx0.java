package p153l;

import com.google.android.gms.measurement.internal.zzae;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class uwx0 implements Callable<List<zzae>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f181325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f181326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f181327c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ iux0 f181328d;

    public uwx0(iux0 iux0Var, String str, String str2, String str3) {
        this.f181325a = str;
        this.f181326b = str2;
        this.f181327c = str3;
        this.f181328d = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        this.f181328d.f116991a.m15364u0();
        return this.f181328d.f116991a.m15344g0().m168709I(this.f181325a, this.f181326b, this.f181327c);
    }
}
