package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class q7t0 extends p6s0 implements s7t0 {
    public q7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // p153l.s7t0
    /* JADX INFO: renamed from: f */
    public final void mo133955f(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.s7t0
    public final void zze(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.s7t0
    public final void zzg() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
