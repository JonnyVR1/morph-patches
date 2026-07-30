package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zhs0 extends kxr0 implements ais0 {
    public zhs0() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static ais0 m218865o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof ais0 ? (ais0) iInterfaceQueryLocalInterface : new yhs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        lxr0.m152086c(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }
}
