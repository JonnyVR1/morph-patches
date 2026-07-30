package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vas0 extends q6s0 implements was0 {
    public vas0() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static was0 m200591o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof was0 ? (was0) iInterfaceQueryLocalInterface : new uas0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        tas0 ras0Var;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                ras0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                ras0Var = iInterfaceQueryLocalInterface instanceof tas0 ? (tas0) iInterfaceQueryLocalInterface : new ras0(strongBinder);
            }
            r6s0.m180041c(parcel);
            mo166850K3(ras0Var);
        } else if (i == 2) {
            parcel.readInt();
            r6s0.m180041c(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo166851K7(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
