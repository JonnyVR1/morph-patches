package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class m7t0 extends p6s0 implements o7t0 {
    public m7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p153l.o7t0
    /* JADX INFO: renamed from: a6 */
    public final void mo148748a6(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.o7t0
    /* JADX INFO: renamed from: u6 */
    public final void mo148751u6(i7t0 i7t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, i7t0Var);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.o7t0
    public final void zze() throws RemoteException {
        m171041Y2(7, m171038O());
    }

    @Override // p153l.o7t0
    public final void zzf() throws RemoteException {
        m171041Y2(6, m171038O());
    }

    @Override // p153l.o7t0
    public final void zzg() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.o7t0
    public final void zzh(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(4, parcelM171038O);
    }

    @Override // p153l.o7t0
    public final void zzj() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
