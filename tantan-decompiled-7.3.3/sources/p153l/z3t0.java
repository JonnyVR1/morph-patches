package p153l;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z3t0 extends q6s0 implements a4t0 {
    public z3t0() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) r6s0.m180039a(parcel, ParcelFileDescriptor.CREATOR);
            r6s0.m180041c(parcel);
            mo95990a0(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) r6s0.m180039a(parcel, zzbb.CREATOR);
            r6s0.m180041c(parcel);
            mo95989W(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
