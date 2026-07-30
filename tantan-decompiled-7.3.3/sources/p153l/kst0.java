package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kst0 extends q6s0 implements ytt0 {
    public kst0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static ytt0 m151282o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof ytt0 ? (ytt0) iInterfaceQueryLocalInterface : new crt0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }
}
