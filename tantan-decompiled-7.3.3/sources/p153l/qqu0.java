package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class qqu0 extends p6s0 implements atu0 {
    public qqu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p153l.atu0
    /* JADX INFO: renamed from: S */
    public final void mo100274S(boolean z) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        ClassLoader classLoader = r6s0.f161495a;
        parcelM171038O.writeInt(z ? 1 : 0);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.atu0
    public final void zze() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.atu0
    public final void zzg() throws RemoteException {
        m171041Y2(3, m171038O());
    }

    @Override // p153l.atu0
    public final void zzh() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.atu0
    public final void zzi() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
