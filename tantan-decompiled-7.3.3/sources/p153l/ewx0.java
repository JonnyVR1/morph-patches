package p153l;

import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ewx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzae f96217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f96218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iux0 f96219c;

    public ewx0(iux0 iux0Var, zzae zzaeVar, zzo zzoVar) {
        this.f96217a = zzaeVar;
        this.f96218b = zzoVar;
        this.f96219c = iux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f96219c.f116991a.m15364u0();
        Object objM15413F = this.f96217a.zzc.m15413F();
        iux0 iux0Var = this.f96219c;
        if (objM15413F == null) {
            iux0Var.f116991a.m15354p(this.f96217a, this.f96218b);
        } else {
            iux0Var.f116991a.m15324S(this.f96217a, this.f96218b);
        }
    }
}
