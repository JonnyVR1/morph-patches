package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qus0 extends kxr0 implements rus0 {
    public qus0() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        uus0 sus0Var = null;
        if (i == 1) {
            zzbyi zzbyiVar = (zzbyi) lxr0.m152084a(parcel, zzbyi.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                sus0Var = iInterfaceQueryLocalInterface instanceof uus0 ? (uus0) iInterfaceQueryLocalInterface : new sus0(strongBinder);
            }
            lxr0.m152086c(parcel);
            mo171479p5(zzbyiVar, sus0Var);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof uus0) {
                }
            }
            lxr0.m152086c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbym zzbymVar = (zzbym) lxr0.m152084a(parcel, zzbym.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                sus0Var = iInterfaceQueryLocalInterface3 instanceof uus0 ? (uus0) iInterfaceQueryLocalInterface3 : new sus0(strongBinder3);
            }
            lxr0.m152086c(parcel);
            mo171478k2(zzbymVar, sus0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
