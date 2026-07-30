package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ejs0 extends kxr0 implements fjs0 {
    public ejs0() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static fjs0 m116899o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof fjs0 ? (fjs0) iInterfaceQueryLocalInterface : new djs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbpd.CREATOR);
        lxr0.m152086c(parcel);
        mo112111m0(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
