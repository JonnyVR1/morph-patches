package p153l;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o2t0 extends q6s0 implements p2t0 {
    public o2t0() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* JADX INFO: renamed from: o8 */
    public static p2t0 m165767o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof p2t0 ? (p2t0) iInterfaceQueryLocalInterface : new n2t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            r6s0.m180041c(parcel);
            mo161255h0(arrayListCreateTypedArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo161254c(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
