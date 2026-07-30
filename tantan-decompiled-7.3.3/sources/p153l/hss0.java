package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hss0 extends q6s0 implements iss0 {
    public hss0() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static iss0 m137037o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof iss0 ? (iss0) iInterfaceQueryLocalInterface : new gss0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzf();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo132149c(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
