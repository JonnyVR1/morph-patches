package p153l;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class f7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f97680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2481g f97681b;

    public f7y0(C2481g c2481g, wmu0 wmu0Var) {
        this.f97680a = wmu0Var;
        this.f97681b = c2481g;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        thy0 thy0VarMo15153o = this.f97681b.mo15153o();
        if (thy0VarMo15153o.mo15142d().m98510G().m15412z()) {
            if (!thy0VarMo15153o.mo15142d().m98525t(thy0VarMo15153o.zzb().currentTimeMillis()) && thy0VarMo15153o.mo15142d().f71912s.m219990a() != 0) {
                lValueOf = Long.valueOf(thy0VarMo15153o.mo15142d().f71912s.m219990a());
            }
            if (lValueOf != null) {
                this.f97681b.f202159a.m100286G().m136335L(this.f97680a, lValueOf.longValue());
            }
            try {
                this.f97680a.zza(null);
            } catch (RemoteException e) {
                this.f97681b.f202159a.zzj().m114558A().m153301b("getSessionId failed with exception", e);
                return;
            }
        }
        thy0VarMo15153o.zzj().m114564G().m153300a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf != null) {
            this.f97681b.f202159a.m100286G().m136335L(this.f97680a, lValueOf.longValue());
        } else {
            this.f97680a.zza(null);
        }
    }
}
