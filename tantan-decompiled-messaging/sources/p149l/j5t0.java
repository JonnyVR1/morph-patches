package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class j5t0 extends jxr0 implements s7t0 {
    public j5t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // p149l.s7t0
    /* JADX INFO: renamed from: i0 */
    public final void mo139872i0(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.s7t0
    public final void zzb() throws RemoteException {
        m143825Y2(5, m143822O());
    }

    @Override // p149l.s7t0
    public final void zzc() throws RemoteException {
        m143825Y2(3, m143822O());
    }

    @Override // p149l.s7t0
    public final void zze() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.s7t0
    public final void zzf() throws RemoteException {
        m143825Y2(2, m143822O());
    }
}
