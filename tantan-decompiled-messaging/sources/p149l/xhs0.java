package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjb;

/* JADX INFO: loaded from: classes6.dex */
public final class xhs0 extends jxr0 implements ujs0 {
    public xhs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: B2 */
    public final void mo131151B2(String str, ids0 ids0Var, fds0 fds0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ids0Var);
        lxr0.m152089f(parcelM143822O, fds0Var);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: T3 */
    public final void mo131152T3(r8s0 r8s0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, r8s0Var);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: X0 */
    public final void mo131154X0(zzbjb zzbjbVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbjbVar);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: h4 */
    public final void mo131157h4(zds0 zds0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, zds0Var);
        m143825Y2(10, parcelM143822O);
    }

    @Override // p149l.ujs0
    public final fgs0 zze() throws RemoteException {
        fgs0 pds0Var;
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            pds0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            pds0Var = iInterfaceQueryLocalInterface instanceof fgs0 ? (fgs0) iInterfaceQueryLocalInterface : new pds0(strongBinder);
        }
        parcelM143823P2.recycle();
        return pds0Var;
    }
}
