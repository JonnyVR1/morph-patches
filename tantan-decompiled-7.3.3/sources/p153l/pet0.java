package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class pet0 extends p6s0 implements ygt0 {
    public pet0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // p153l.ygt0
    /* JADX INFO: renamed from: i0 */
    public final void mo172061i0(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.ygt0
    public final void zzb() throws RemoteException {
        m171041Y2(5, m171038O());
    }

    @Override // p153l.ygt0
    public final void zzc() throws RemoteException {
        m171041Y2(3, m171038O());
    }

    @Override // p153l.ygt0
    public final void zze() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.ygt0
    public final void zzf() throws RemoteException {
        m171041Y2(2, m171038O());
    }
}
