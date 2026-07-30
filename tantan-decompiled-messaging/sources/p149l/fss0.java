package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class fss0 extends jxr0 implements hss0 {
    public fss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // p149l.hss0
    /* JADX INFO: renamed from: s0 */
    public final ess0 mo122956s0(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        ess0 css0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            css0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            css0Var = iInterfaceQueryLocalInterface instanceof ess0 ? (ess0) iInterfaceQueryLocalInterface : new css0(strongBinder);
        }
        parcelM143823P2.recycle();
        return css0Var;
    }
}
