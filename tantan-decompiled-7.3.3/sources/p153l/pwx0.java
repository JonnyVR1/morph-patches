package p153l;

import com.google.android.gms.measurement.internal.zzae;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class pwx0 implements Callable<List<zzae>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f154447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f154448b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f154449c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ iux0 f154450d;

    public pwx0(iux0 iux0Var, String str, String str2, String str3) {
        this.f154447a = str;
        this.f154448b = str2;
        this.f154449c = str3;
        this.f154450d = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        this.f154450d.f116991a.m15364u0();
        return this.f154450d.f116991a.m15344g0().m168709I(this.f154447a, this.f154448b, this.f154449c);
    }
}
