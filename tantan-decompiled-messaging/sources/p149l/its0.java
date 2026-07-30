package p149l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class its0 extends kxr0 implements jts0 {
    public its0() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static jts0 m138250o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof jts0 ? (jts0) iInterfaceQueryLocalInterface : new hts0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            lxr0.m152086c(parcel);
            mo132941h0(arrayListCreateTypedArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo132940c(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
