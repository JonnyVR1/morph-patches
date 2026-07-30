package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class txs0 extends kxr0 implements sys0 {
    public txs0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static sys0 m190975o8(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof sys0 ? (sys0) iInterfaceQueryLocalInterface : new gvs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        lxr0.m152086c(parcel);
        mo128293d0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
