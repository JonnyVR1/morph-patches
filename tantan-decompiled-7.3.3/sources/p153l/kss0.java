package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kss0 extends q6s0 implements lss0 {
    public kss0() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static lss0 m151281o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof lss0 ? (lss0) iInterfaceQueryLocalInterface : new jss0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbpd.CREATOR);
        r6s0.m180041c(parcel);
        mo115302m0(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
