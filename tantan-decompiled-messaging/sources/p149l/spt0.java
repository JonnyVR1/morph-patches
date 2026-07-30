package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class spt0 extends zzq {

    /* JADX INFO: renamed from: a */
    public final okt0 f165880a;

    public spt0(okt0 okt0Var) {
        this.f165880a = okt0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public final spt0 m185389P2(ListenerHolder listenerHolder) {
        this.f165880a.mo145180a(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        this.f165880a.zza().notifyListener(new dnt0(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) throws RemoteException {
        this.f165880a.zza().notifyListener(new vlt0(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() {
        this.f165880a.zza().notifyListener(new mot0(this));
    }

    public final void zzh() {
        this.f165880a.zza().clear();
    }
}
