package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class tdu0 extends jxr0 implements fgu0 {
    public tdu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: s1 */
    public final void mo121269s1(uju0 uju0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uju0Var);
        m143825Y2(8, parcelM143822O);
    }

    @Override // p149l.fgu0
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // p149l.fgu0
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // p149l.fgu0
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // p149l.fgu0
    public final uju0 zzi() throws RemoteException {
        uju0 khu0Var;
        Parcel parcelM143823P2 = m143823P2(11, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            khu0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            khu0Var = iInterfaceQueryLocalInterface instanceof uju0 ? (uju0) iInterfaceQueryLocalInterface : new khu0(strongBinder);
        }
        parcelM143823P2.recycle();
        return khu0Var;
    }
}
