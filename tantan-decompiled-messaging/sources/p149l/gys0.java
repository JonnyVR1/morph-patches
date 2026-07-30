package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class gys0 extends jxr0 implements iys0 {
    public gys0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p149l.iys0
    /* JADX INFO: renamed from: a6 */
    public final void mo119018a6(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.iys0
    /* JADX INFO: renamed from: u6 */
    public final void mo119021u6(cys0 cys0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, cys0Var);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.iys0
    public final void zze() throws RemoteException {
        m143825Y2(7, m143822O());
    }

    @Override // p149l.iys0
    public final void zzf() throws RemoteException {
        m143825Y2(6, m143822O());
    }

    @Override // p149l.iys0
    public final void zzg() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.iys0
    public final void zzh(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(4, parcelM143822O);
    }

    @Override // p149l.iys0
    public final void zzj() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
