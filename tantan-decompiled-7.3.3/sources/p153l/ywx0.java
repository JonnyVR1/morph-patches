package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ywx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f201890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iux0 f201891b;

    public ywx0(iux0 iux0Var, zzo zzoVar) {
        this.f201890a = zzoVar;
        this.f201891b = iux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f201891b.f116991a.m15364u0();
        C2484j c2484j = this.f201891b.f116991a;
        zzo zzoVar = this.f201890a;
        c2484j.zzl().mo15146h();
        c2484j.m15366v0();
        Preconditions.checkNotEmpty(zzoVar.zza);
        c2484j.m15348j0(zzoVar);
        c2484j.m15345h0(zzoVar);
    }
}
