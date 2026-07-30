package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w3t0 extends q6s0 implements x3t0 {
    public w3t0() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        a4t0 y3t0Var = null;
        if (i == 1) {
            zzbyi zzbyiVar = (zzbyi) r6s0.m180039a(parcel, zzbyi.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                y3t0Var = iInterfaceQueryLocalInterface instanceof a4t0 ? (a4t0) iInterfaceQueryLocalInterface : new y3t0(strongBinder);
            }
            r6s0.m180041c(parcel);
            mo119835p5(zzbyiVar, y3t0Var);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof a4t0) {
                }
            }
            r6s0.m180041c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbym zzbymVar = (zzbym) r6s0.m180039a(parcel, zzbym.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                y3t0Var = iInterfaceQueryLocalInterface3 instanceof a4t0 ? (a4t0) iInterfaceQueryLocalInterface3 : new y3t0(strongBinder3);
            }
            r6s0.m180041c(parcel);
            mo119833k2(zzbymVar, y3t0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
