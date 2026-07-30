package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class yas0 extends p6s0 implements abs0 {
    public yas0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // p153l.abs0
    /* JADX INFO: renamed from: i0 */
    public final void mo96779i0(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.abs0
    public final void zzb() throws RemoteException {
        m171041Y2(5, m171038O());
    }

    @Override // p153l.abs0
    public final void zzc() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.abs0
    public final void zze() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.abs0
    public final void zzf() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
