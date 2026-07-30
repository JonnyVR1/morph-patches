package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class frs0 extends q6s0 implements grs0 {
    public frs0() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static grs0 m126980o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof grs0 ? (grs0) iInterfaceQueryLocalInterface : new ers0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        r6s0.m180041c(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }
}
