package p153l;

import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzo;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class lxx0 implements Callable<zzaj> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f134017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iux0 f134018b;

    public lxx0(iux0 iux0Var, zzo zzoVar) {
        this.f134017a = zzoVar;
        this.f134018b = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaj call() throws Exception {
        this.f134018b.f116991a.m15364u0();
        return new zzaj(this.f134018b.f116991a.m15336c(this.f134017a.zza));
    }
}
