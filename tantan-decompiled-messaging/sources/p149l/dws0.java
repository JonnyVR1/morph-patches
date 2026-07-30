package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class dws0 extends jxr0 implements uxs0 {
    public dws0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // p149l.uxs0
    /* JADX INFO: renamed from: e5 */
    public final void mo113942e5(zvs0 zvs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, zvs0Var);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.uxs0
    public final void zzf() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.uxs0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(7, parcelM143822O);
    }

    @Override // p149l.uxs0
    public final void zzh() throws RemoteException {
        m143825Y2(6, m143822O());
    }

    @Override // p149l.uxs0
    public final void zzi() throws RemoteException {
        m143825Y2(1, m143822O());
    }

    @Override // p149l.uxs0
    public final void zzj() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.uxs0
    public final void zzk() throws RemoteException {
        m143825Y2(8, m143822O());
    }

    @Override // p149l.uxs0
    public final void zzl() throws RemoteException {
        m143825Y2(3, m143822O());
    }
}
