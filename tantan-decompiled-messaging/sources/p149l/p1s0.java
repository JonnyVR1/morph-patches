package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p1s0 extends kxr0 implements q1s0 {
    public p1s0() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static q1s0 m167115o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof q1s0 ? (q1s0) iInterfaceQueryLocalInterface : new o1s0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        n1s0 l1s0Var;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                l1s0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                l1s0Var = iInterfaceQueryLocalInterface instanceof n1s0 ? (n1s0) iInterfaceQueryLocalInterface : new l1s0(strongBinder);
            }
            lxr0.m152086c(parcel);
            mo134006K3(l1s0Var);
        } else if (i == 2) {
            parcel.readInt();
            lxr0.m152086c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo134007K7(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
