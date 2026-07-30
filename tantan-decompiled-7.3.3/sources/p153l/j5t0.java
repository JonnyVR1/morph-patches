package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class j5t0 extends p6s0 implements a7t0 {
    public j5t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // p153l.a7t0
    /* JADX INFO: renamed from: e5 */
    public final void mo96382e5(f5t0 f5t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, f5t0Var);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.a7t0
    public final void zzf() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.a7t0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(7, parcelM171038O);
    }

    @Override // p153l.a7t0
    public final void zzh() throws RemoteException {
        m171041Y2(6, m171038O());
    }

    @Override // p153l.a7t0
    public final void zzi() throws RemoteException {
        m171041Y2(1, m171038O());
    }

    @Override // p153l.a7t0
    public final void zzj() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.a7t0
    public final void zzk() throws RemoteException {
        m171041Y2(8, m171038O());
    }

    @Override // p153l.a7t0
    public final void zzl() throws RemoteException {
        m171041Y2(3, m171038O());
    }
}
