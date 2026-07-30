package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z6t0 extends q6s0 implements y7t0 {
    public z6t0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static y7t0 m218810o8(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof y7t0 ? (y7t0) iInterfaceQueryLocalInterface : new m4t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        r6s0.m180041c(parcel);
        mo157062d0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
