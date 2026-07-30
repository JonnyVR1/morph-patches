package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mus0 extends kxr0 implements nus0 {
    public mus0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        hvs0 vus0Var = null;
        if (i == 1) {
            lxr0.m152086c(parcel);
            parcel2.writeNoException();
            lxr0.m152088e(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof ous0) {
                }
            }
            lxr0.m152086c(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbze zzbzeVar = (zzbze) lxr0.m152084a(parcel, zzbze.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                vus0Var = iInterfaceQueryLocalInterface2 instanceof hvs0 ? (hvs0) iInterfaceQueryLocalInterface2 : new vus0(strongBinder2);
            }
            lxr0.m152086c(parcel);
            mo151818L3(zzbzeVar, vus0Var);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbze zzbzeVar2 = (zzbze) lxr0.m152084a(parcel, zzbze.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                vus0Var = iInterfaceQueryLocalInterface3 instanceof hvs0 ? (hvs0) iInterfaceQueryLocalInterface3 : new vus0(strongBinder3);
            }
            lxr0.m152086c(parcel);
            mo151819c3(zzbzeVar2, vus0Var);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbze zzbzeVar3 = (zzbze) lxr0.m152084a(parcel, zzbze.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                vus0Var = iInterfaceQueryLocalInterface4 instanceof hvs0 ? (hvs0) iInterfaceQueryLocalInterface4 : new vus0(strongBinder4);
            }
            lxr0.m152086c(parcel);
            mo151820q3(zzbzeVar3, vus0Var);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                vus0Var = iInterfaceQueryLocalInterface5 instanceof hvs0 ? (hvs0) iInterfaceQueryLocalInterface5 : new vus0(strongBinder5);
            }
            lxr0.m152086c(parcel);
            mo151821r1(string, vus0Var);
            parcel2.writeNoException();
        }
        return true;
    }
}
