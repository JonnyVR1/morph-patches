package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bjs0 extends kxr0 implements cjs0 {
    public bjs0() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static cjs0 m102228o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof cjs0 ? (cjs0) iInterfaceQueryLocalInterface : new ajs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzf();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo97009c(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
