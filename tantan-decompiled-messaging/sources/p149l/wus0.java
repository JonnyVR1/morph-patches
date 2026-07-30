package p149l;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wus0 extends kxr0 implements hvs0 {
    public wus0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) lxr0.m152084a(parcel, ParcelFileDescriptor.CREATOR);
            lxr0.m152086c(parcel);
            mo113819a0(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) lxr0.m152084a(parcel, zzbb.CREATOR);
            lxr0.m152086c(parcel);
            mo113818W(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
