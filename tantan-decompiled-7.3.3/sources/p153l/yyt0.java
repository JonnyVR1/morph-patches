package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class yyt0 extends zzq {

    /* JADX INFO: renamed from: a */
    public final utt0 f202130a;

    public yyt0(utt0 utt0Var) {
        this.f202130a = utt0Var;
    }

    /* JADX INFO: renamed from: P2 */
    public final yyt0 m218007P2(ListenerHolder listenerHolder) {
        this.f202130a.mo176883a(listenerHolder);
        return this;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        this.f202130a.zza().notifyListener(new jwt0(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) throws RemoteException {
        this.f202130a.zza().notifyListener(new bvt0(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() {
        this.f202130a.zza().notifyListener(new sxt0(this));
    }

    public final void zzh() {
        this.f202130a.zza().clear();
    }
}
