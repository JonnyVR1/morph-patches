package p153l;

import com.google.android.gms.measurement.internal.zzae;

/* JADX INFO: loaded from: classes6.dex */
public final class zvx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzae f206300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iux0 f206301b;

    public zvx0(iux0 iux0Var, zzae zzaeVar) {
        this.f206300a = zzaeVar;
        this.f206301b = iux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f206301b.f116991a.m15364u0();
        Object objM15413F = this.f206300a.zzc.m15413F();
        iux0 iux0Var = this.f206301b;
        if (objM15413F == null) {
            iux0Var.f116991a.m15352o(this.f206300a);
        } else {
            iux0Var.f116991a.m15323R(this.f206300a);
        }
    }
}
