package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class khu0 extends jxr0 implements uju0 {
    public khu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p149l.uju0
    /* JADX INFO: renamed from: S */
    public final void mo144125S(boolean z) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        ClassLoader classLoader = lxr0.f130430a;
        parcelM143822O.writeInt(z ? 1 : 0);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.uju0
    public final void zze() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.uju0
    public final void zzg() throws RemoteException {
        m143825Y2(3, m143822O());
    }

    @Override // p149l.uju0
    public final void zzh() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.uju0
    public final void zzi() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
