package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zmu0 extends p6s0 implements lpu0 {
    public zmu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: s1 */
    public final void mo155297s1(atu0 atu0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, atu0Var);
        m171041Y2(8, parcelM171038O);
    }

    @Override // p153l.lpu0
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // p153l.lpu0
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // p153l.lpu0
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // p153l.lpu0
    public final atu0 zzi() throws RemoteException {
        atu0 qqu0Var;
        Parcel parcelM171039P2 = m171039P2(11, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            qqu0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            qqu0Var = iInterfaceQueryLocalInterface instanceof atu0 ? (atu0) iInterfaceQueryLocalInterface : new qqu0(strongBinder);
        }
        parcelM171039P2.recycle();
        return qqu0Var;
    }
}
