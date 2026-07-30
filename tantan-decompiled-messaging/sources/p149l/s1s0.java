package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class s1s0 extends jxr0 implements u1s0 {
    public s1s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // p149l.u1s0
    /* JADX INFO: renamed from: i0 */
    public final void mo144231i0(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.u1s0
    public final void zzb() throws RemoteException {
        m143825Y2(5, m143822O());
    }

    @Override // p149l.u1s0
    public final void zzc() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.u1s0
    public final void zze() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.u1s0
    public final void zzf() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
